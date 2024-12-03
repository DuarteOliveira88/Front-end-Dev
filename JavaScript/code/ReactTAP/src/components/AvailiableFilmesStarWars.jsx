export default function AvailiableFimlesStarWars({ title , filmes }) {

    return (
      <section>
        <h2>{title}</h2>
        {filmes.length === 0 && <p>Ups, não temos filmes disponiveis</p>}
        {filmes.length > 0 && (
          <ul>
            {filmes.map((item) => (
              <li key={item.title} >
                  <h3><b>{item.title}</b>:</h3> 
                  <p><b>{item.opening_crawl}</b></p>
                  <p><b>{item.release_date}</b></p>
                  <br />
              </li>
            ))}
          </ul>
        )}
      </section>
    );
  }