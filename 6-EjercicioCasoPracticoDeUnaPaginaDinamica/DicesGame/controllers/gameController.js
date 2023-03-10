const Game = require("../models/gameModel.js");
/**
 * Crea el juego con los nombres de los jugadores y sus apuestas
 */
exports.createGame = (req, res) => {
  const { gamer } = req.body;
  const game = new Game({
    id: req.body.id,
    type: req.body.type,
    gamers: [
      {
        name: gamer[0],
        bet: "",
      },
      {
        name: gamer[1],
        bet: "",
      },
      {
        name: gamer[2],
        bet: "",
      },
    ],
    inProgress: true,
    winner: {
      id: "",
      name: "",
    },
  });

  game
    .save()
    .then((result) => {
      res.json({
        id: result.id,
        type: result.type,
        gamers: gamer,
      });
    })
    .catch((err) => {
      res.json(err);
    });
};
/**
 * Comienza el juego
 */
exports.startGame = (req, res) => {
  const { id } = req.body;
  const { gamerBet } = req.body;
  Game.findOneAndUpdate(
    { id: id },
    {
      $set: {
        "gamers.0.bet": gamerBet[0],
        "gamers.1.bet": gamerBet[1],
        "gamers.2.bet": gamerBet[2],
        InProgress: true,
      },
    }
  )
    .then((result) => {
      res.json({
        idGame: result.id,
        type: result.type,
        gamers: [
          {
            id: result.gamers[0].id,
            name: result.gamers[0].name,
            bet: gamerBet[0],
          },
          {
            id: result.gamers[1].id,
            name: result.gamers[1].name,
            bet: gamerBet[1],
          },
          {
            id: result.gamers[2].id,
            name: result.gamers[2].name,
            bet: gamerBet[2],
          },
        ],
      });
    })
    .catch((err) => {
      res.json(err);
    });
};
/**
 * Devuelve el estado del juego mostrando los jugadores
 */
exports.gameStatus = (req, res) => {
  const { id } = req.params;
  Game.findOne({ id: id })
    .then((result) =>
      res.json({
        id: result.id,
        gamers: {
          "gamer #1": {
            id: result.gamers[0].id,
            name: result.gamers[0].name,
          },
          "gamer #2": {
            id: result.gamers[1].id,
            name: result.gamers[1].name,
          },
          "gamer #3": {
            id: result.gamers[2].id,
            name: result.gamers[2].name,
          },
        },
        InProgress: false,
        winner: {
          id: result.gamers[0].id,
          name: result.gamers[0].name,
        },
      })
    )
    .catch((err) => {
      res.json(err);
    });
};
/**
 * Escoge el ganador del juego al azar con findOne
 */
exports.winner = (req, res) => {
  const { id } = req.params;
  Game.findOne({ id: id })
    .then((result) => {
      res.json({
        winner: {
          id: result.gamers[0].id,
          name: result.gamers[0].name,
        },
      });
    })
    .catch((err) => {
      res.json(err);
    });
};
