import "./Cartoes.css"
function Cartoes(props) {
    return (
      <div className="card">
        {/* <button onClick={() => setCount((count) => count + 1)}>
            count is {count}
          </button>
          <p>
            Edit <code>src/App.jsx</code> and save to test HMR
          </p> */}
        <p>{props.name} {props.surname}</p>
        <p>{props.job}</p>
      </div>
    )
}
export default Cartoes
