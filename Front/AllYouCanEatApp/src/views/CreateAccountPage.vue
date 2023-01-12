<template>
<h3>Crea un perfil nuevo</h3>

      
     
        <form @submit.prevent="handleSubmit">
          <div class="form-group">
            <label for="allergens">¿A qué eres alérgico(a)?</label>
            <select class="form-control" v-model="allergen" name="allergens" id="allergens" required>
                <option disabled>¿A qué eres alérgico(a)?</option>
                <option value="gluten">Gluten</option>
                <option value="lactose">Lactosa</option>
                <option value="seafood">Crustáceos y moluscos</option>
                <option value="nuts">Frutos secos</option>
                <option value="eggs">Huevo</option>
             </select>
             <br>
            </div>
    
          <div class="form-group"> 
          <label>Nombre de usuario:</label>
          <input class="form-control" v-model="name" type="text" name="name" id="name" required/>
          <br>
          </div>
     
          <div class="form-group">
          <label>Contraseña:</label>
          <input class="form-control" v-model="password" type="password" name="password" id="password" required/>
          <br>
          </div>
     
          <button class="btn btn-primary" type="submit">Crear perfil</button>
        </form>
      
    </template>
    
    <script>
    import { mapState, mapActions } from "pinia";
    import { useProfilesStore } from "../stores/profiles.js";
    import HeaderComponent from "../components/HeaderComponent.vue";
    import router from '../router'
    
    
    export default {
      components: {
        HeaderComponent
      },
      data() {
        return {
          allergen: "",
          name: "",
          password: ""
        }
      },
          computed: {    
         // gives read access to this.profiles and this.anotherVar
            ...mapState(useProfilesStore, ['profiles', 'anotherVar'])
         },
          methods: {    
         // gives access to this.createProfile()
            ...mapActions(useProfilesStore, ['createProfile']),
            handleSubmit(){
                console.log("El botón ha sido pulsado")
                this.createProfile(this.allergen, this.name, this.password)
                router.push("/home")
            }
         },
          async mounted() {
         // Use pinia store method    
         //this.createProfile(this.allergen, this.name, this.password);
        
          console.log(this.anotherVar);
        
          }
    }
    </script>
    
    <style>
    </style>