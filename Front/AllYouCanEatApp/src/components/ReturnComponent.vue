<template>
  <nav>
    <ul class="nav-list">
      <li>AllYouCanEat</li>
      <li>
        <RouterLink class="router" to="/">
          <p>Atrás</p>
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
}
</style>