import { Game } from "./game.model";
import { HttpClient } from '@angular/common/http';
import { Inject, Injectable } from '@angular/core';

@Injectable()
export class Repository{
    public game: Game;
    constructor(http: HttpClient, @Inject('BASE_URL') baseUrl: string){
        http.get<Game>(baseUrl + '/api/games').subscribe(
            result => {
                this.game = result;
            },
            error => console.error(error));
    }
}
//http.get<>().subscribe(r => {---}, error => console.error(error) )
//repo.game <-- JSON