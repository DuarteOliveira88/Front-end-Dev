import { useState } from 'react'
import { LISTAPRENDAS } from '../data/listChristmasGifts';
import TabButton from '../components/TabButton';
import LinhaListaNatal from '../components/LinhaListaNatal';

export default function ChristmasGifts() {
    const [content, setContent] = useState();
    function handleSelected2(selectedButton) {
        setContent(LISTAPRENDAS[selectedButton]);
    }
    return (
        <div>
            <h1>Lista de Presentes</h1>
            <TabButton isActive={content == LISTAPRENDAS.DUARTE} onSelect={() => handleSelected2("DUARTE")}>Duarte</TabButton>
            <TabButton isActive={content == LISTAPRENDAS.MAE} onSelect={() => handleSelected2("MAE")}>Mae</TabButton>
            <TabButton isActive={content == LISTAPRENDAS.PAI} onSelect={() => handleSelected2("PAI")}>Pai</TabButton>
            {/* div de cont dinamico */}
            {!content ? (<p>Selecione uma lista</p>) : content.length ? (
                <div>
                    {content.map((item) => (<LinhaListaNatal key={item.remetente} {...item}/>))}
                </div>)
            :(<h4>Nao tem presentes</h4>)}
            {/* .div de cont dinamico */}
        </div>
    )
}