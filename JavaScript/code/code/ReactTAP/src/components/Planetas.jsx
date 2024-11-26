export default function Planetas({ title , planetas }) {
console.log(planetas)
    return (
      <section>
        <h2>{title}</h2>
        {planetas.length === 0 && <p>Ups, não temos planetas disponiveis</p>}
        {planetas.length > 0 && (
          <ul>
            {planetas.map((item) => (
              item.name ? 
              <li key={item.name} >
                  <h3><b>{item.name}</b>: <b>{item.climate}</b>, <b>{item.terrain}</b></h3>
              </li>
              :
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