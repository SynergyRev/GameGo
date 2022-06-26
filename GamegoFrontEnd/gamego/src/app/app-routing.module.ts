import { LoginComponent } from './admin/login/login/login.component';
import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { GamesComponent } from './admin/games/games.component';
import { UsersComponent } from './admin/users/users.component';

const routes: Routes = [
  { path: 'admin/users', component: UsersComponent },
  { path: 'admin/games', component: GamesComponent },
  {path:'admin/login/login', component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
