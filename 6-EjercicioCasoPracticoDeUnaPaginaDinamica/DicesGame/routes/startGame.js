const express = require("express");
const router = express.Router();
const gameController = require("../controllers/gameController");

router.get("/startGame", function (req, res, next) {
  res.render("startGame", { title: "Juego de dados" });
});

router.post("/", gameController.startGame);

module.exports = router;
