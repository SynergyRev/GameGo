
import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Product } from 'src/app/model/Product';
import { HttpClientService } from 'src/app/service/http-client.service';

@Component({
  selector: 'app-games',
  templateUrl: './games.component.html',
  styleUrls: ['./games.component.css']
})
export class GamesComponent implements OnInit {
  @Input()
  product!: Product;

  @Output()
  gameAddedEvent = new EventEmitter();
  
  message!: string;
  password!: string;


  constructor(private httpClientService: HttpClientService,
    private router: Router) { }

  ngOnInit(): void {
    
  }
  addGame() {
    this.httpClientService.addGame(this.product).subscribe(
      (game) => {
        this.gameAddedEvent.emit();
        this.router.navigate(['admin', 'games']);
      }
    );
  }
  

  

}
