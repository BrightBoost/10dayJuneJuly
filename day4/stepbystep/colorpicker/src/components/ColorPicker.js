import { useState } from 'react';
import ColorDisplay from './ColorDisplay';

function ColorPicker() {
    const [color, setColor] = useState(generateHex());

    const handleColorChange = (event) => {
        setColor(event.target.value);
    };

    return (
        <>
            <input type="color" value={color} onChange={handleColorChange} />
            <ColorDisplay color={color} />
            <p>{color}</p>
        </>
    );
}

function generateHex() {
    const hex = "#" + Math.floor(Math.random() * 16777215).toString(16);
    return hex;
}


export default ColorPicker;