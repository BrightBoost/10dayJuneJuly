# React Hooks

React Hooks are functions that let us hook into the React state and lifecycle features from functional components. They cannot be used inside class components. Hooks were introduced in React 16.8. 

The two most common hooks you'll see are `useState` and `useEffect`.

## useState

`useState` is a hook that allows you to add React state to function components.

Here is a simple counter example:

```jsx
import React, { useState } from 'react';

function Counter() {
  // Declare a new state variable, which we'll call "count"
  const [count, setCount] = useState(0);

  return (
    <div>
      <p>You clicked {count} times</p>
      <button onClick={() => setCount(count + 1)}>
        Click me
      </button>
    </div>
  );
}
```

`useState` returns a pair: the current state value and a function that lets you update it. You can call this function from an event handler or somewhere else.

### Exercise 1

Create a simple counter app using `useState` hook. The app should have two buttons "Increase" and "Decrease" to increment and decrement the counter value, respectively.

## useEffect

The Effect Hook, `useEffect`, adds the ability to perform side effects from a function component. It serves the same purpose as `componentDidMount`, `componentDidUpdate`, and `componentWillUnmount` in React classes.

Here is a simple example:

```jsx
import React, { useState, useEffect } from 'react';

function Example() {
  const [count, setCount] = useState(0);

  // Similar to componentDidMount and componentDidUpdate:
  useEffect(() => {
    // Update the document title using the browser API
    document.title = `You clicked ${count} times`;
  });

  return (
    <div>
      <p>You clicked {count} times</p>
      <button onClick={() => setCount(count + 1)}>
        Click me
      </button>
    </div>
  );
}
```

By using this Hook, you tell React that your component needs to do something after render. React will remember the function you passed (we'll refer to it as our “effect”), and call it later after performing the DOM updates.

### Exercise 2

Create a component that uses `useEffect` to fetch data from a public API like JSONPlaceholder and display the data. 

For a more advanced use of hooks, look into other hooks like `useContext`, `useReducer`, `useRef`, `useMemo`, and `useCallback`.

There are many other hooks provided by React, and the ability to create your own custom hooks. 