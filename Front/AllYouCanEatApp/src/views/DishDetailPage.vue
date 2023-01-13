<template>
  <HeaderComponent></HeaderComponent>
  <div class="img-center">
    <img src="../assets/images/GLUTEN-COLOR.png" alt="nuts icon" class="icons">
    <img src="../assets/images/LACTICS-COLOR.png" alt="nuts icon" class="icons">
    <img src="../assets/images/CRUSTACIS-COLOR.png" alt="nuts icon" class="icons">
    <img src="../assets/images/MOLUSCS-COLOR.png" alt="nuts icon" class="icons">
    <img src="../assets/images/FRUITSSECS-COLOR.png" alt="nuts icon" class="icons">
    <img src="../assets/images/OUS-COLOR.png" alt="nuts icon" class="icons">
  </div>

  <div class="container">
    <div class="row">
      <div class="col align-self-center">
        <div v-if="dish" :key="dish.id">

          <h2 class="text-center">{{ dish.name }}</h2>
          <div class="img-center">
          <h3>Estos son los ingredientes:</h3>
          <p>{{ dish.recipe }}</p>
          <h3 v-if="dish.restaurant">Y lo preparan en este restaurant:</h3>
          <p>{{ dish.restaurant }}</p>
         </div>

        </div>
        <div class="text-center">
        <RouterLink class="router" to="/dishes/dish/updated">
          <p>Editar este plato</p>
        </RouterLink>

        <RouterLink class="router" to="/dishes/dish/deleted">
          <p>Eliminar este plato</p>
        </RouterLink>
      </div>

      </div>
    </div>
  </div>


</template>

<script>

import { mapState, mapStores, mapActions } from "pinia";
import { useDishesStore } from "../stores/dishes.js";
import HeaderComponent from "../components/HeaderComponent.vue";

export default {
  components: {
    HeaderComponent
  },
  data() {
    return {
      dishFetch: {},
    };
  },
  computed: {
    ...mapStores(useDishesStore),
    ...mapState(useDishesStore, ['dish', 'anotherVar']),
  },
  methods: {
    ...mapActions(useDishesStore, ["fetchOne"]),
  },
  watch: {
    "$route.params.id": {
      async handler() {
        if (this.$route.params.id) {
          this.fetchOne(this.$route.params.id);

        }
      },
      immediate: true,
    },
  },

};

</script>

<style>

</style>