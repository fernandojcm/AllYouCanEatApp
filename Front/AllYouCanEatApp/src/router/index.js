import { createRouter, createWebHistory } from 'vue-router'
import WelcomePage from '../views/WelcomePage.vue'
import DishesPage from '../views/DishesPage.vue'
import DishDetailPage from '../views/DishDetailPage.vue'


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
