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

    async createDish(allergen, name, recipe, restaurant){
      try{
        const requestOptions = {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
          },
          body: JSON.stringify({ allergen, name, recipe, restaurant }),
        };

        await fetch("http://localhost:8080/dishes/dish/created", requestOptions);
      } catch (error){
        console.log(error);
      }
    },

    async updateDish(id, allergen, name, recipe, restaurant){
      try{
        const requestOptions = {
          method: "PUT",
          headers: {
            "Content-Type": "application/json",
          },
          body: JSON.stringify({ id, allergen, name, recipe, restaurant }),
        };

        await fetch(`http://localhost:8080/dishes/${id}`, requestOptions);
      } catch (error){
        console.log(error);
      }
    }
    
  },
});




