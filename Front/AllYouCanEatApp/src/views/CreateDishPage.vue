<template>
<HeaderComponent></HeaderComponent>

    <div>
        <h3>Comparte un nuevo plato</h3>
     
        <form @submit.prevent="handleSubmit">
    
            <select v-model="allergen" name="allergens" id="allergens" placeholder="Alérgenos" required>
                <option disabled>Selecciona un alérgeno</option>
                <option value="gluten">Gluten</option>
                <option value="lactose">Lactosa</option>
                <option value="seafood">Crustáceos y moluscos</option>
                <option value="nuts">Frutos secos</option>
                <option value="eggs">Huevo</option>
             </select>
             <br>
    
          <label>Nombre:</label>
          <input class="form-control" v-model="name" type="text" name="name" id="name" required/>
          <br>

          <label>Ingredientes:</label>
          <textarea class="form-control" v-model="recipe" type="text" name="recipe" id="recipe" required/>
          <br>

          <label>Restaurant:</label>
          <input class="form-control" v-model="restaurant" type="text" name="restaurant" id="restaurant" required/>
          <br>
     
          <button class="btn btn-primary" type="submit">Compartir</button>
        </form>
      </div>
    </template>
    
    <script>
    import { mapState, mapActions } from "pinia";
    import { useDishesStore } from "../stores/dishes.js";
    import router from '../router'
    import HeaderComponent from '../components/HeaderComponent.vue'
    

    export default {
      components: {
        HeaderComponent
      },
      data() {
        return {
          allergen: "",
          name: "",
          recipe: "",
          restaurant: ""
        }
      },
      computed: {    
     // gives read access to this.dishes and this.anotherVar
        ...mapState(useDishesStore, ['dishes', 'anotherVar'])
     },
      methods: {    
     // gives access to this.createDish()
        ...mapActions(useDishesStore, ['createDish']),
        handleSubmit(){
            console.log("El botón ha sido pulsado")
            this.createDish(this.allergen, this.name, this.recipe, this.restaurant)
            router.push("/home")
        }
     },
      async mounted() {
     // Use pinia store method    
      //this.createDish(this.allergen, this.name, this.recipe, this.restaurant);
    
      //console.log(this.anotherVar);
    
      }
    }
    </script>
    
    <style>
    </style>