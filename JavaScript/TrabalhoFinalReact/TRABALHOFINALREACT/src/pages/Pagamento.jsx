import { useLocation } from "react-router-dom";

export default function Pagamento() {
  const location = useLocation();
  const { pratos } = location.state || { pratos: [] };

  return (
    <div>
      <h1>Pagamento</h1>
      {pratos.length === 0 ? (
        <p>Nenhum prato selecionado.</p>
      ) : (
        <ul>
          {pratos.map((prato) => (
            <li key={prato.id}>
              {prato.nomePrato} - {prato.preco}
            </li>
          ))}
        </ul>
      )}

      <button
      className="btn-pagamento"
        style={{
          backgroundColor: "#28a745"
        }}
        onClick={() => alert("Pagamento realizado com sucesso!")}
      >
        Confirmar Pagamento
      </button>
    </div>
  );
}
