const express = require("express");
const router = express.Router();
const gameController = require("../controllers/gameController");

router.get("/:id", gameController.gameStatus);

module.exports = router;
