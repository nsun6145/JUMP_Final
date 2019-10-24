import { Game } from "./game.model"

export class Rating{
    constructor(
        public ratingId?: number,
        public stars?: number,
        public gameId?: number){ }
}