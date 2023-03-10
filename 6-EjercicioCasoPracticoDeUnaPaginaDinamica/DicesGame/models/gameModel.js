const mongoose = require("mongoose");
const Schema = mongoose.Schema;
/**
 * Creación de la base de datos
 */
const gameSchema = new Schema(
  {
    id: {
      type: String,
    },
    type: {
      type: String,
      trim: true,
    },
    gamers: [
      {
        name: {
          type: String,
          trim: true,
        },
        bet: {
          type: String,
        },
      },
    ],
    inProgress: {
      type: Boolean,
      default: false,
    },
    winner: [
      {
        id: {
          type: String,
          default: "",
        },
        name: {
          type: String,
          trim: true,
          default: "",
        },
      },
    ],
  },
  { timestamps: true }
);

module.exports = player = mongoose.model("game", gameSchema);
