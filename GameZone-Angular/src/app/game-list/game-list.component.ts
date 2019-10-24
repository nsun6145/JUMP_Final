import { Component, OnInit } from '@angular/core';
import { GAMES } from "../mock-games";
import { Game } from "../models/game.model";
import { GameService } from '../game.service';


@Component({
  selector: 'game-list',
  templateUrl: './game-list.component.html',
  styleUrls: ['./game-list.component.css']
})
export class GameListComponent implements OnInit {

  //games = GAMES;
  

  games: Game[];

  constructor( private gameService: GameService) {

   }

  ngOnInit() {
    this.getGames();
  }

  getGames(): void{
    this.gameService.getGames().subscribe(games => this.games = games);
  }

}
