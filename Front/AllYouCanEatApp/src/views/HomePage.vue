<template>
    <HeaderComponent></HeaderComponent>

    <div class="img-center">
        <img src="../assets/images/GLUTEN-COLOR.png" alt="nuts icon" class="icons">
        <img src="../assets/images/LACTICS-COLOR.png" alt="nuts icon" class="icons">
        <img src="../assets/images/CRUSTACIS-COLOR.png" alt="nuts icon" class="icons">
        <img src="../assets/images/MOLUSCS-COLOR.png" alt="nuts icon" class="icons">
        <img src="../assets/images/FRUITSSECS-COLOR.png" alt="nuts icon" class="icons">
        <img src="../assets/images/OUS-COLOR.png" alt="nuts icon" class="icons">
    </div>

    <div class="container">
        <div class="row">
            <div class="col align-self-center">
                <div class="form-signin">
                <h2>¿Qué quieres hacer?</h2>
                <div>
                    <ul class="list">
                        <li>
                            <RouterLink class="router" to="/dishes">
                                <p>Ver todos los platos</p>
                            </RouterLink>
                        </li>
                        <li>
                            <RouterLink class="router" to="/allergen">
                                <p>Ver los platos por alérgenos</p>
                            </RouterLink>
                        </li>
                        <li>
                            <RouterLink class="router" to="/dishes/dish/created">
                                <p>Compartir un plato nuevo</p>
                            </RouterLink>
                        </li>

                        <li>
                            <a ref="#">¿Qué hacer en caso de intoxicación?</a>
                        </li>
                    </ul>
                
                </div>
            </div>
            </div>
        </div>
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