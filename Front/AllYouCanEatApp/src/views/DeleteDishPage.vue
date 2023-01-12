<template>
<HeaderComponent></HeaderComponent>

<form @submit.prevent="handleSubmit">
    <div class="form-group">
    <label>Indica el ID del plato que quieres eliminar</label>
    <input class="form-control" v-model="id" type="text" name="id" id="id" required/>
    <br>
    </div>

    <button class="btn btn-primary" type="submit">Eliminar</button>
</form>

</template>

<script>
import { mapState, mapActions } from "pinia";
import { useDishesStore } from "../stores/dishes.js";
import router from '../router'
import HeaderComponent from '../components/HeaderComponent.vue';

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
    ...mapActions(useDishesStore, ['deleteDish']),

    handleSubmit(){
            console.log("El botón ha sido pulsado")
            this.deleteDish(this.id)
            router.push("/home")
        }
  },
  async mounted() {
    // Use pinia store method    
    //this.deleteDish();
    //console.log(this.anotherVar);
    
  }
}
</script>

<style>
</style>
