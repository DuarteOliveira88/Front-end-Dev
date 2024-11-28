import { useEffect, useState } from 'react';
import AvailiableFimlesStarWars from '../components/AvailiableFilmesStarWars';

export default function FilmesStarWars() {
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
        <AvailiableFimlesStarWars
          title="Available Filmes"
          filmes={availableFilms}
        />
        </div>
      );
}