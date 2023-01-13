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
        <form class="form-signin" @submit.prevent="handleSubmit">
          <h3>Elimina este plato</h3>
          <div class="form-group">
            <label>Indica el ID</label>
            <input class="form-control" v-model="id" type="text" name="id" id="id" required />
            <br>
          </div>

          <button class="btn btn-primary" type="submit">Eliminar</button>
        </form>
      </div>
    </div>
  </div>


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
      id: ""
    }
  },
  computed: {
    // gives read access to this.dishes and this.anotherVar
    ...mapState(useDishesStore, ['dishes', 'anotherVar'])
  },
  methods: {
    // gives access to this.fetchAll()
    ...mapActions(useDishesStore, ['deleteDish']),

    handleSubmit() {
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
