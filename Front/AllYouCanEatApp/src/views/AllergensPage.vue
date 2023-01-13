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

        <div class="form-signin">
          <h3>Filtra tu búsqueda </h3>
          <label for="allergens">Selecciona un alérgeno que quieras evitar comer</label>
          <select class="form-control" v-model="selected">
            <option v-for="allergen in allergens" :value="allergen.value">
              {{ allergen.text }}
            </option>
          </select>
          <br>
          <button class="btn btn-primary" @click="showDishes">Mostrar</button>
          <br>
        </div>

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
import HeaderComponent from '../components/HeaderComponent.vue';



export default {
  components: {
    HeaderComponent
  },
  data() {
    return {
      dishesFetch: [],
      gluten: "",
      selected: "",
      allergens: [
        { text: 'Gluten', value: 'gluten' },
        { text: 'Lactosa', value: 'lactose' },
        { text: 'Crustáceos y moluscos', value: 'seafood' },
        { text: 'Frutos secos', value: 'nuts' },
        { text: 'Huevo', value: 'eggs' }

      ]

    }
  },
  computed: {
    // gives read access to this.dishes and this.anotherVar
    ...mapState(useDishesStore, ['dishes', 'anotherVar'])
  },
  methods: {
    // gives access to this.fetchAll()
    ...mapActions(useDishesStore, ['fetchAll', 'fetchAllByAllergen']),

    showDishes() {
      this.fetchAllByAllergen(this.selected)
      console.log(this.selected);
    },

  },
  async mounted() {
    // Use pinia store method    
    //this.fetchAll();

    //console.log(this.anotherVar);

  }
}

</script>

<style>

</style>