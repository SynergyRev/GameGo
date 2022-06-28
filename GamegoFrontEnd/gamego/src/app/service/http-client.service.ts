import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../model/User';
import {Product} from '../model/Product';

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {
  deleteUser: any;

  constructor(private httpClient:HttpClient
    ) { }
    
    getUsers()
    {
      return this.httpClient.get<User[]>('http://localhost:3000/gamego/usercontroller/getallusers');
    }

    addUser(newUser: User) {
      return this.httpClient.post<User>('http://localhost:3000/gamego/authcontroller', newUser);   
    }

    addGame(newGame: Product) {
      console.log("add game");
      return this.httpClient.post<Product>('http://localhost:3000/gamego/productcontroller/insertProductGame', newGame);
    }

    // addGame(newGame: Game){
    //   return this.httpClient.post<Game>('http://localhost:3000/gamego/productcontroller/insertProductGame',newGame );
    // }
    getGames() {
      return this.httpClient.get<Product[]>('http://localhost:3000/gamego/productcontroller/getAllGames');
    }
  


  }
