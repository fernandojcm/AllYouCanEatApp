import { createRouter, createWebHistory } from 'vue-router'
import WelcomePage from '../views/WelcomePage.vue'
import DishesPage from '../views/DishesPage.vue'
import DishDetailPage from '../views/DishDetailPage.vue'
import CreateDishPage from '../views/CreateDishPage.vue'
import CreateAccountPage from '../views/CreateAccountPage.vue'


  const routes = [
    {
      path: '/',
      name: 'welcome',
      component: WelcomePage
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
