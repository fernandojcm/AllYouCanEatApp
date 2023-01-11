import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

export const useDishesStore = defineStore("dishes", {
  state: () => ({
    dishes: [],
    dish: {},
    anotherVar: { id: "1", name: "Test"}  
  }),

  actions: {
    async fetchAll() {
      const response = await fetch("http://localhost:8080/dishes")
      const dishesFetch = await response.json()
      this.dishes = dishesFetch
    },

    async fetchOne(id) {
      const response = await fetch(`http://localhost:8080/dishes/${id}`);
      const dishFetch = await response.json();
      this.dish = dishFetch;        
    },
  },
});




