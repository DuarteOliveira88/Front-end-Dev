import { useEffect, useState } from 'react';
import Planetas from '../components/Planetas';
export default function PlanetasStarWars() {
    const[availablePlanets, setAvailablePlanets] = useState([])
    useEffect(() => {
      fetch("http://swapi.dev/api/planets/")
        .then((response) => {
          return response.json();
        })
        .then((resData) => {
          setAvailablePlanets(resData.results);
        });
    },[]);
    const[availableFilms, setAvailableFilms] = useState([])
    useEffect(() => {
      fetch("http://swapi.dev/api/films/")
        .then((response) => {
          return response.json();
        })
        .then((resData) => {
          setAvailableFilms(resData.results);
        });
    },[]);

    
    return (

      <div>
        <Planetas
          title="Available Planetes"
          planetas={availablePlanets}
        />
        <Planetas
          title="Available Films"
          planetas={availableFilms}
        />
        <h1>ola</h1>
        </div>
      );
}