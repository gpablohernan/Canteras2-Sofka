const express = require("express");
const router = express.Router();
const gameController = require("../controllers/gameController");

router.get("/createGame", function (req, res, next) {
  res.render("createGame", { title: "Juego de dados" });
});

router.post("/", gameController.createGame);

module.exports = router;
