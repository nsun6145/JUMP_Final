import { Component, OnInit } from '@angular/core';
import { GAMES } from "../mock-games";
import { Game } from "../models/game.model";

@Component({
  selector: 'nav-menu',
  templateUrl: './nav-menu.component.html',
  styleUrls: ['./nav-menu.component.css']
})
export class NavMenuComponent implements OnInit {



  constructor() { }

  ngOnInit() {
  }

}
