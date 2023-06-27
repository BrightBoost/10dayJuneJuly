function ColorDisplay({ color }) {
    const style = { backgroundColor: color, width: '100px', height: '100px' };

    return <div style={style}></div>;
}

export default ColorDisplay;