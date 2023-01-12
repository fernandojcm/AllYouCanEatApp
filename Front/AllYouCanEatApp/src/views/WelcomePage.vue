<template>
<h1>Welcome to All You Can Eat</h1>
<h2>¿Qué deseas hacer?</h2>

<div>
        
     <h3>Inicia sesión</h3>
        <form @submit.prevent="handleSubmit">
    
          <label>Nombre de usuario:</label>
          <input v-model="name" type="text" name="name" id="name" required/>
          <br>
     
          <label>Password:</label>
          <input v-model="password" type="password" name="password" id="password" required/>
          <br>
     
          <button type="submit">Iniciar sesión</button>
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
</style>