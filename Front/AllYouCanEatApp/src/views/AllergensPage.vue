<template>
<HeaderComponent></HeaderComponent>
<h2>All You Can Eat</h2>
<p>Selecciona un alérgeno que quieras evitar comer</p>

<div>
    <select v-model="selected">
  <option  v-for="allergen in allergens" :value="allergen.value">
    {{ allergen.text }}
  </option>
</select>
<button class="btn btn-outline-primary" @click="showDishes">Mostrar</button>
</div>

<div v-if="dishes" v-for="dish in dishes" :key="dish.id">      
        <RouterLink :to="`/dishes/${dish.id}`">
              <p>{{ dish.name }}</p>
          </RouterLink>
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

    showDishes(){
        this.fetchAllByAllergen(this.selected)
        console.log(this.selected);
    },

  },
  async mounted() {
    // Use pinia store method    
    //this.fetchAll();
    
    console.log(this.anotherVar);
    
  }
}

</script>

<style>
</style>