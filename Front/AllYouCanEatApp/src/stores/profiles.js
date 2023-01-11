import { defineStore } from 'pinia';

export const useProfilesStore = defineStore("profiles", {
  state: () => ({
    profiles: [],
    profile: {}, 
    anotherVar: { id: "1", name: "Test"}  
  }),

  actions: {

    async createProfile(allergen, name, password){
      try{
        const requestOptions = {
          method: "POST",
          headers: {
            "Content-Type": "application/json",
          },
          body: JSON.stringify({ allergen, name, password }),
        };

        await fetch("http://localhost:8080/profiles/profile/created", requestOptions);
      } catch (error){
        console.log(error);
      }
    }
    
  }
});