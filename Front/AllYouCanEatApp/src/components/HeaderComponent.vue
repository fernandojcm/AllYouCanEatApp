<template>
<div>
<ul class="nav">
    <li>
    <RouterLink to="/home">
        <p>Home</p>
    </RouterLink>
    </li>
    <li>
        <a href="#">About</a>
    </li>
    
</ul>
</div>
</template>

<script>
export default {
    name: 'Header'
}
</script>

<style>
.nav{
    list-style: none;
    flex-direction: row;
    justify-content: end;
}
</style>