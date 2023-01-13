<template>
  <nav class="nav-color">
    <ul class="nav-list">
      <li>AllYouCanEat</li>
      <li>
        <RouterLink class="router" to="/home">
          <p><span class="glyphicon glyphicon-home"></span> Inicio </p>
        </RouterLink>
      </li>
    </ul>

  </nav>
</template>

<script>
</script>

<style>
.nav-list{
  list-style: none;
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  font-size:medium;
  padding-right: 20px;
  background-color: rgb(146, 127, 103);
}
</style>