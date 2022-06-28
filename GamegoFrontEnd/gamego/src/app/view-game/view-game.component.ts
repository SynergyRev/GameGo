import { Component, Input, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Product } from '../model/Product';
import { HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'app-view-game',
  templateUrl: './view-game.component.html',
  styleUrls: ['./view-game.component.css']
})
export class ViewGameComponent implements OnInit {
@Input()
  game!: Product;

  games!: Array<Product>;
  selectedGame!: Product;
  action!: string;

  checkoutTotal = 0;
  i = 0;
  itemsInCart = [0];

  

  constructor(private httpClientService: HttpClientService,
    private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    this.refreshData();
  }

  refreshData() {
    this.httpClientService.getGames().subscribe(
      response => this.handleSuccessfulResponse(response),
    );

    this.activatedRoute.queryParams.subscribe(
      (params) => {
        this.action = params['action'];
        const selectedUserId = params['id'];
        if (selectedUserId) {
        }
      }
    );
  }
  
  viewUser(id: number) {
    this.router.navigate(['admin','view-game'], {queryParams : {id, action: 'view'}});
  }

  handleSuccessfulResponse(response: Product[]) {
    this.games = response;
    console.log(this.games);
  }

  addGame() {
    this.selectedGame = new Product();
    this.router.navigate(['admin', 'view-games'], { queryParams: { action: 'add' } });
  }

  checkout() {
    for ( this.i = 0; this.i< this.itemsInCart.length; this.i++){
      this.checkoutTotal += this.itemsInCart[this.i];
    }
    alert(this.checkoutTotal);
  }
 something(){
  alert("Item Added to cart!");
  
  this.itemsInCart.push(60);
  console.log(this.itemsInCart);
 }



}
