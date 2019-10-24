import { Game } from './models/game.model'
import { Developer } from "./models/developer.model"
import { Rating } from "./models/rating.model"
import { NULL_EXPR } from '@angular/compiler/src/output/output_ast';

/*
        public gameId? : number,
        public category1?: string,
        public category2?: string,
        public description?: string,
        public image?: string,
        public price?: number,
        public title?: string,
        public developed?: Developer
        //public ratings?: Rating[]
*/


export const GAMES: Game[] = [
    
    {gameId: 1, category1: "Fighting", category2: null, description: "A video game that exists", 
    image: "image", price: 59.99, title: "Street Fighter V", developed:{developerId: 1, developerName: "Capcom"}, 
   },
    
    {gameId: 2, category1: "Fighting", category2: "Party", description: "A video game that also exists", 
    image: "image", price: 59.99, title: "Super Smash Bros Ultimate", developed: {developerId: 1, developerName: "Nintendo"},
    }
    
];