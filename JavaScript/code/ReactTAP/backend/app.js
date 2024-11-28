import fs from "node:fs/promises";

import bodyParser from "body-parser";
import express from "express";

const app = express();

app.use(express.static("./images"));
app.use(bodyParser.json());

// CORS

app.use((req, res, next) => {
  res.setHeader("Access-Control-Allow-Origin", "*"); // allow all domains
  res.setHeader("Access-Control-Allow-Methods", "GET, PUT");
  res.setHeader("Access-Control-Allow-Headers", "Content-Type");

  next();
});

app.get("/places", async (req, res) => {
  const fileContent = await fs.readFile("./data/places.json");

  const placesData = JSON.parse(fileContent);

  res.status(200).json({ places: placesData });
});

app.get("/user-places", async (req, res) => {
  const fileContent = await fs.readFile("./data/user-places.json");

  const places = JSON.parse(fileContent);

  res.status(200).json({ places });
});
app.get("/listaPrendas", async (req, res) => {
  const fileContent = await fs.readFile("./data/listaPrendas.json");

  const present = JSON.parse(fileContent);

  res.status(200).json({ present });
});

app.post("/signup",async(req,res )=>{
  const fileContent = await fs.readFile("./data/users.json");
  const users=JSON.parse(fileContent);
  const newUser = req.body;
  users.push(newUser);
  await fs.writeFile("./data/users.json",JSON.stringify(users, null, 2));
  res.status(200).json({ message:"User inserted!" });
})

app.put("/user-places", async (req, res) => {
  const places = req.body.places;

  await fs.writeFile("./data/user-places.json", JSON.stringify(places));

  res.status(200).json({ message: "User places updated!" });
});

app.post("/listaPrendas",async(req,res )=>{
  const fileContent = await fs.readFile("./data/listaPrendas.json");
  const present=JSON.parse(fileContent);
  const newPresent = req.body;
  present.push(newPresent); 
  await fs.writeFile("./data/listaPrendas.json",JSON.stringify(present, null, 2));
  res.status(200).json({ message:"Present inserted!" });
})

// 404
app.use((req, res, next) => {
  if (req.method === "OPTIONS") {
    return next();
  }
  res.status(404).json({ message: "404 - Not Found" });
});

app.listen(3000);
