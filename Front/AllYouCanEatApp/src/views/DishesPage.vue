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
        <div v-if="dishes" v-for="dish in dishes" :key="dish.id">

          <RouterLink class="router" :to="`/dishes/${dish.id}`">
            <p>{{ dish.name }}</p>
          </RouterLink>

        </div>

      </div>
    </div>
  </div>

</template>

<script>
import { mapState, mapActions } from "pinia";
import { useDishesStore } from "../stores/dishes.js";
import HeaderComponent from "../components/HeaderComponent.vue";


export default {
  components: {
    HeaderComponent
  },
  data() {
    return {
      dishesFetch: [],
    }
  },
  computed: {
    // gives read access to this.dishes and this.anotherVar
    ...mapState(useDishesStore, ['dishes', 'anotherVar'])
  },
  methods: {
    // gives access to this.fetchAll()
    ...mapActions(useDishesStore, ['fetchAll']),
  },
  async mounted() {
    // Use pinia store method    
    this.fetchAll();

    //console.log(this.anotherVar);

  }
}
</script>

<style>

</style>