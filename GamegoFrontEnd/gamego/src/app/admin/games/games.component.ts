

import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Game } from 'src/app/model/Game';
import { HttpClientService } from 'src/app/service/http-client.service';

@Component({
  selector: 'app-games',
  templateUrl: './games.component.html',
  styleUrls: ['./games.component.css']
})
export class GamesComponent implements OnInit {
  @Input()
  game!: Game;

  @Output()
  userAddedEvent = new EventEmitter();
  
  message!: string;
  password!: string;


  constructor(private httpClientService: HttpClientService,
    private router: Router) { }

  ngOnInit(): void {
    
  }
  addGame() {
    this.httpClientService.addGame(this.game).subscribe(
      (user) => {
        this.userAddedEvent.emit();
        this.router.navigate(['admin', 'games']);
      }
    );
  }
  

  

}
