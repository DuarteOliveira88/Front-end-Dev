import { useState, useEffect } from "react";
import "./Cozinha.css";

export default function Cozinha() {
  const [pedidos, setPedidos] = useState([]);

  const fetchPedidos = async () => {
    try {
      const response = await fetch("http://localhost:3000/pratosConsumidor");
      const data = await response.json();
      setPedidos(data.pratos);
    } catch (error) {
      console.error("Erro ao buscar pedidos:", error);
    }
  };

  const atualizarStatus = async (id, novoStatus) => {
    const pedidosAtualizados = pedidos.map((pedido) =>
      pedido.id === id ? { ...pedido, status: novoStatus } : pedido
    );

    try {
      await fetch("http://localhost:3000/pratosConsumidor", {
        method: "PUT",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ pratos: pedidosAtualizados }),
      });

      setPedidos(pedidosAtualizados);
    } catch (error) {
      console.error("Erro ao atualizar o status:", error);
    }
  };

  useEffect(() => {
    fetchPedidos();
  }, []);

  return (
    <div className="cozinha-container">
      <h1 className="cozinha-title">Pedidos da Cozinha</h1>
      {pedidos.length === 0 ? (
        <p className="cozinha-empty">Sem pedidos no momento.</p>
      ) : (
        <table className="cozinha-table">
          <thead>
            <tr>
              <th>Prato</th>
              <th>Status</th>
              <th>Ações</th>
            </tr>
          </thead>
          <tbody>
            {pedidos.map((pedido) => (
              <tr key={pedido.id}>
                <td>{pedido.nomePrato}</td>
                <td>{pedido.status || "Pendente"}</td>
                <td>
                  <button
                    onClick={() => atualizarStatus(pedido.id, "Em Confecção")}
                    className="btn btn-warning"
                  >
                    Em Confecção
                  </button>
                  <button
                    onClick={() => atualizarStatus(pedido.id, "Entregue")}
                    className="btn btn-success"
                  >
                    Entregue
                  </button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
}
