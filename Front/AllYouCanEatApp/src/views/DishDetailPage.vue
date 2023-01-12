<template>
<h2>All You Can Eat</h2>
<div v-if="dish" :key="dish.id">

    <h3>{{ dish.name }}</h3>
    <p>Estos son los ingredientes:</p>
    <p>{{ dish.recipe }}</p>
    <p v-if="dish.restaurant">Y lo preparan en este restaurant:</p>
    <p>{{ dish.restaurant }}</p>

</div>
</template>

<script>

import { mapState, mapStores, mapActions } from "pinia";
  import { useDishesStore } from "../stores/dishes.js";

  export default {
    data() {
      return {
        dishFetch: {},
      };
    },
    computed: {
      ...mapStores(useDishesStore),
      ...mapState(useDishesStore, ['dish', 'anotherVar']),
    },
    methods: {
      ...mapActions(useDishesStore, ["fetchOne"]),
    },
    watch: {
      "$route.params.id": {
        async handler() {
          if (this.$route.params.id) {
            this.fetchOne(this.$route.params.id);

          }
        },
        immediate: true,
      },
    },
    
  };

</script>

<style>
</style>