import { Routes } from '@angular/router';

export const routes: Routes = [
    {
        path: '',
        loadComponent: () => import('./components/home/home.component').then(m => m.default)
    },
    {
        path: 'registro',
        loadComponent: () => import('./components/registro/registro.component').then(m => m.RegistroComponent)
    }

];
