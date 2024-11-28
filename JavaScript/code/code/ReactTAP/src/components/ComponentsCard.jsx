import "./Cartoes.css"
function ComponentsCard(props) {
    return (
      <div className="c-card">
        <h3>{props.title}</h3>
        <p>{props.description}</p>
        <img src={props.image} alt="imageeeeeeeeeeeee" />
      </div>
    )
}
export default ComponentsCard
