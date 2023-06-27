import { useState } from 'react';

function Counter() {
    const [count, setCount] = useState(0);
    return (
        <div>
            <p>You clicked the button {count} nr of times!</p>
            <button onClick={() => setCount(count + 1)}>Click</button>
        </div>
    )
}


export default Counter;