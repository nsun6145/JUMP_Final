import { Developer } from "./developer.model";
import { Rating } from "./rating.model"

export class Game{

    constructor(
        public gameId? : number,
        public category1?: string,
        public category2?: string,
        public description?: string,
        public image?: string,
        public price?: number,
        public title?: string,
        public developed?: Developer,
    ){}
}