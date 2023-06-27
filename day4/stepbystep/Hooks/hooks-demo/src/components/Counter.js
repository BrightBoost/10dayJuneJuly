import { useState, useEffect } from 'react'

function Counter() {
    const initCount = () => {
        return Number(localStorage.getItem('count') || 0)
    }

    const [count, setCount] = useState(initCount)

    useEffect(() => {
        localStorage.setItem('count', count)
    }, [count]) // runs after count is updated

    return (
        <div>
            <h1>Count: {count}</h1>
            <button onClick={() => setCount(count + 1)}>increment</button>
        </div>
    )
}

export default Counter;