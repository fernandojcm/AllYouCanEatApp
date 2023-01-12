<template>
<HeaderComponent></HeaderComponent>
<h2>All You Can Eat</h2>

<div>
    <div v-if="dishes" v-for="dish in dishes" :key="dish.id">
      
        <RouterLink :to="`/dishes/${dish.id}`">
          <p>{{ dish.name }}</p>
        </RouterLink>

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
     // gives read access to this.countries and this.anotherVar
    ...mapState(useDishesStore, ['dishes', 'anotherVar'])
  },
  methods: {    
    // gives access to this.fetchAll()
    ...mapActions(useDishesStore, ['fetchAll']),
  },
  async mounted() {
    // Use pinia store method    
    this.fetchAll();
    
    console.log(this.anotherVar);
    
  }
}
</script>

<style>
</style>