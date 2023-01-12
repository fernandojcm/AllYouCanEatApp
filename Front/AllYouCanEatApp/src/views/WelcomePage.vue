<template>
<h1>Welcome to All You Can Eat</h1>

<div>
    <img src="../assets/images/GLUTEN-COLOR.png" alt="nuts icon" class="icons">
    <img src="../assets/images/LACTICS-COLOR.png" alt="nuts icon" class="icons">
    <img src="../assets/images/CRUSTACIS-COLOR.png" alt="nuts icon" class="icons">
    <img src="../assets/images/MOLUSCS-COLOR.png" alt="nuts icon" class="icons">
    <img src="../assets/images/FRUITSSECS-COLOR.png" alt="nuts icon" class="icons">
    <img src="../assets/images/OUS-COLOR.png" alt="nuts icon" class="icons">
</div>

<h2>¿Qué deseas hacer?</h2>

<div class="form-group">
        
     <h3>Inicia sesión</h3>
        <form @submit.prevent="handleSubmit">
    
          <label>Nombre de usuario:</label>
          <input class="form-control" v-model="name" type="text" name="name" id="name" required/>
          <br>
     
          <label>Password:</label>
          <input class="form-control" v-model="password" type="password" name="password" id="password" required/>
          <br>
     
          <button class="btn btn-primary" type="submit">Iniciar sesión</button>
          <br>
        </form>
</div>
<div>
    <RouterLink to="/profiles/profile/created">
        <p>¿No tienes cuenta? Aquí puedes crear una nueva</p>
    </RouterLink>
    
</div>
<div>
    <RouterLink to="/dishes">
        <p>Solo quiero echar un vistazo a los platos</p>
    </RouterLink>
    
</div>


</template>

<script>

export default {
 data(){
    return {
        name: "",
        password: ""
    }
 }
}
</script>

<style>
.icons {
    flex-direction: row;
    width: 50px;
}
</style>