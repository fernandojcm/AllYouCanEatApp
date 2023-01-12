import { createRouter, createWebHistory } from 'vue-router'
import WelcomePage from '../views/WelcomePage.vue'
import DishesPage from '../views/DishesPage.vue'
import DishDetailPage from '../views/DishDetailPage.vue'
import CreateDishPage from '../views/CreateDishPage.vue'
import CreateAccountPage from '../views/CreateAccountPage.vue'
import HomePage from '../views/HomePage.vue'
import AllergensPage from '../views/AllergensPage.vue'


  const routes = [
    {
      path: '/',
      name: 'welcome',
      component: WelcomePage
    },
    {
      path: '/home',
      name: 'home',
      component: HomePage
    },
    {
      path: '/dishes',
      name: 'dishes',
      component: DishesPage
    },
    {
      path: '/dishes/:id',
      name: 'dish',
      component: DishDetailPage
    },
    {
      path: '/dishes/dish/created',
      name: 'createDish',
      component: CreateDishPage
    },
    {
      path: '/allergen',
      name: 'allergens',
      component: AllergensPage
    },
    {
      path: '/profiles/profile/created',
      name: 'createProfile',
      component: CreateAccountPage
    }
  ]


const router = createRouter({
  history: createWebHistory('/'),
  routes,
  scrollBehavior() {
    document.getElementById('app').scrollIntoView();
  }
});

export default router
