<template>
<HeaderComponent></HeaderComponent>    
<h1>Bienvenido a All You Can Eat</h1>

<div>
    <ul>
        <li>
            <RouterLink to="/dishes">
                <p>Ver todos los platos</p>
            </RouterLink>
        </li>
        <li>
            <RouterLink to="/allergen">
                <p>Ver los platos por alérgenos</p>
            </RouterLink>
        </li>
        <li>
            <RouterLink to="/dishes/dish/created">
                <p>Compartir un plato nuevo</p>
            </RouterLink> 
        </li>
        
        <li>
            <a ref="#">¿Qué hacer en caso de intoxicación?</a>
        </li>
    </ul>
</div>

</template>

<script>
import HeaderComponent from '../components/HeaderComponent.vue';

export default {
    components: {
        HeaderComponent
    }
}

</script>

<style>
</style>