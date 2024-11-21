import listaCompras from "../data/compras"
import ListaCompra from "../components/ListaCompra"
export default function IndexShoppingList() {
    return (
    <div>
        <h1>Lista de Compras</h1>
        {listaCompras.map((item) => <ListaCompra key={item.produto} produto={item.produto} quantidade={item.quantidade} />)}
    </div>
    )
}