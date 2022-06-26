import { RegisterComponent } from './Components/register/register.component';
import { GamesComponent } from './Components/games/games.component';
import { SearchbarComponent } from './Components/searchbar/searchbar.component';
import { LoginComponent } from './Components/login/login.component';
import { FrontpageComponent } from './Components/frontpage/frontpage.component';
import { CheckoutComponent } from './Components/checkout/checkout.component';
import { CartComponent } from './Components/cart/cart.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
{ path: 'cart', component: CartComponent },
{ path: 'checkout', component: CheckoutComponent },
{ path: 'frontpage', component: FrontpageComponent },
{ path: 'login', component: LoginComponent },
{ path: 'searchbar', component: SearchbarComponent},
{ path: 'games', component: GamesComponent},
{ path: 'register', component: RegisterComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
