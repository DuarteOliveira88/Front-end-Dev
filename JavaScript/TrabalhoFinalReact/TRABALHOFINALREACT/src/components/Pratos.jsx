import "../components/Pratos.css"

export default function Prato({ title, pratos, fallbackText, onSelectPrato }) {
    return (
      <section className="places-category">
        <h2>{title}</h2>
        {pratos.length === 0 && <p className="fallback-text">{fallbackText}</p>}
        {pratos.length > 0 && (
          <ul className="places">
            {pratos.map((prato) => (
              <li key={prato.id} className="place-item">
                <button onClick={() => onSelectPrato(prato)}>
                  <img src={`http://localhost:3000/${prato.image.src}`} alt={prato.image.alt} />
                  <h3>{prato.nomePrato} {prato.preco}</h3>
                </button>
              </li>
            ))}
          </ul>
        )}
      </section>
    );
  }