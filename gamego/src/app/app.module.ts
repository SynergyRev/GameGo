import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { MatToolbarModule} from '@angular/material/toolbar';
import { MatMenuModule } from '@angular/material/menu';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './Components/navbar/navbar.component';
import { CartComponent } from './Components/cart/cart.component';
import { CheckoutComponent } from './Components/checkout/checkout.component';
import { FooterComponent } from './Components/footer/footer.component';
import { FrontpageComponent } from './Components/frontpage/frontpage.component';
import { LoginComponent } from './Components/login/login.component';
import { RegisterComponent } from './Components/register/register.component';
import { ResetpasswordComponent } from './Components/resetpassword/resetpassword.component';
import { SearchbarComponent } from './Components/searchbar/searchbar.component';
import { UserprofileComponent } from './Components/userprofile/userprofile.component';
import { GamesComponent } from './Components/games/games.component';




@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CartComponent,
    CheckoutComponent,
    FooterComponent,
    FrontpageComponent,
    LoginComponent,
    RegisterComponent,
    ResetpasswordComponent,
    SearchbarComponent,
    UserprofileComponent,
    GamesComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    MatToolbarModule,
    MatMenuModule,
    MatIconModule,
    MatButtonModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
