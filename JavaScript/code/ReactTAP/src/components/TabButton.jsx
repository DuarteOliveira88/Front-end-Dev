import "./TabButton.css"

function TabButton({children, onSelect,isActive}){
    return <button className={isActive? 'active':'butao1'} onClick={onSelect}>{children}</button>
}
export default TabButton