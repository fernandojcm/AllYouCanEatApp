<template>
  <RouterView />
</template>

<script>
import { RouterLink, RouterView } from 'vue-router'


export default {
  components: {

  }
}

</script>



<style>
.list{
  list-style: none;
}

.router{
  text-decoration: none;
  color: black;
}

.router:hover{
  color: blueviolet;
}

.form-signin {
    width: 100%;
    max-width: 330px;
    padding: 15px;
    margin: 0 auto;
}

.img-center{
  text-align: center !important;
  margin-top: 20px;
  margin-bottom: 40px;

}
</style>
