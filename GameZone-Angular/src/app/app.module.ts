import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
//import { FormsModule } from '@angular/common/http';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { ModelModule } from "./models/model.module";
import { NavMenuComponent } from './nav-menu/nav-menu.component';
import { HomeComponent } from './home/home.component';
import { GameListComponent } from './game-list/game-list.component';


@NgModule({
  declarations: [
    AppComponent,
    NavMenuComponent,
    GameListComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    ModelModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
