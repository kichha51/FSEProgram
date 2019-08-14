import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateComponent } from './create/create.component';
import { ViewComponent } from './view/view.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/create',
    pathMatch: 'full'
  },
  {
  path: 'create', component: CreateComponent
},
{
  path: 'view', component: ViewComponent
},
{
  path: '**',
  redirectTo: '/create'
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
