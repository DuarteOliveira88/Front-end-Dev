import fs from "node:fs/promises";

import bodyParser from "body-parser";
import express from "express";
import jwt from "jsonwebtoken";


const app = express();

app.use(express.static("./images"));
app.use(bodyParser.json());

const SECRET_KEY = "your_secret_key";

// Generate a JWT token
const createJSONToken = (email) => {
  return jwt.sign({ email }, SECRET_KEY, { expiresIn: "1h" });
};
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

  await fs.writeFile("./data/listaPrendas.json", JSON.stringify(present));

  res.status(200).json({ message: "Presents updated!" });
});
app.post("/login", async (req, res) => {
  const fileContent = await fs.readFile("./data/users.json");
  const users = JSON.parse(fileContent);

  const email = req.body.email;
  const password = req.body.password;
  console.log(email)
  console.log(password)

  const login = users.find((u) => u.email === email && u.password === password);

  if (!login) {
    return res.status(422).json({
      message: "Invalid credentials.",
      errors: { credentials: "Invalid email or password entered." },
    });
  }

  const token = createJSONToken(email);

  const AuthUser = {
    token: token,
    name: login.name,
    role: login.role,
  };

  res.json(AuthUser);
});
// 404
app.use((req, res, next) => {
  if (req.method === "OPTIONS") {
    return next();
  }
  res.status(404).json({ message: "404 - Not Found" });
});

app.listen(3000);
