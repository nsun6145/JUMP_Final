import { Injectable } from '@angular/core';
import { Game } from './models/game.model';
import { GAMES } from './mock-games';
import { Observable, of } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class GameService {

  private gamesUrl = 'api/games';

  constructor(private http: HttpClient) { 
  }

getGames(): Observable<Game[]>{
  return of(GAMES);
  //return this.http.get<Game[]>(this.gamesUrl);
}
 
}
