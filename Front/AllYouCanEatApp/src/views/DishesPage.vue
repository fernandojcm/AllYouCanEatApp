<template>
<h2>All You Can Eat</h2>

<div>
    <div v-if="dishes" v-for="dish in dishes" :key="dish.id">
      
        <RouterLink :to="`/dishes/${dish.id}`">
        <h3>{{ dish.name }}</h3>
        </RouterLink>

    </div>
</div>

</template>

<script>
import { mapState, mapActions } from "pinia";
import { useDishesStore } from "../stores/counter.js";
 
export default {  
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