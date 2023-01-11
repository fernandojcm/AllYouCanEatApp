<template>
<h2>All You Can Eat</h2>
<div v-if="dish" :key="dish.id">

    <h3>{{ dish.name }}</h3>


</div>
</template>

<script>

import { mapState, mapStores, mapActions } from "pinia";
  import { useDishesStore } from "../stores/counter.js";

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