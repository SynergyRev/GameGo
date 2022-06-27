import { Component, Input, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Game } from '../model/Game';
import { HttpClientService } from '../service/http-client.service';

@Component({
  selector: 'app-view-game',
  templateUrl: './view-game.component.html',
  styleUrls: ['./view-game.component.css']
})
export class ViewGameComponent implements OnInit {
@Input()
game!: Game;
  games!: Array<Game>;
  selectedGame!: Game;
  action!: string;
  

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

  handleSuccessfulResponse(response: Game[]) {
    this.games = response;
    console.log(this.games);
  }

  addGame() {
    this.selectedGame = new Game();
    this.router.navigate(['admin', 'view-games'], { queryParams: { action: 'add' } });
  }


}
