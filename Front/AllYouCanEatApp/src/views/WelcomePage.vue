<template>
    <h1 class="text-center">All You Can Eat</h1>

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
                <form class="form-signin" @submit.prevent="handleSubmit">

                    <div class="form-group">
                        <label>Nombre de usuario:</label>
                        <input class="form-control" v-model="name" type="text" name="name" id="name" required />
                        <br>
                    </div>

                    <div class="form-group">
                        <label>Contraseña:</label>
                        <input class="form-control" v-model="password" type="password" name="password" id="password"
                            required />
                        <br>
                    </div>

                    <button class="btn btn-primary" type="submit">Iniciar sesión</button>
                    <br>
                </form>
                <div class="img-center">
                    <div>
                        <RouterLink class="router" to="/profiles/profile/created">
                            <p>¿No tienes cuenta? Aquí puedes crear una nueva</p>
                        </RouterLink>

                    </div>
                    <div>
                        <RouterLink class="router" to="/dishes">
                            <p>¡Solo quiero echar un vistazo a los platos!</p>
                        </RouterLink>

                    </div>
                </div>
            </div>
        </div>
    </div>


</template>

<script>

export default {
    data() {
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