# Introduction to State in React

In React, "state" is a feature that allows components to create and manage their own data. Unlike props, which allow components to pass data to their children, state allows components to manage and update their own data.

## What is state?

State in a React component is an object that holds data. This data influences the output of a component. Each component can maintain its own state, which lives in the component and can be changed over time, usually in response to user actions.

## How to use state

React provides a Hook called `useState` that allows you to add state to your function components.

Here's how you use it:

```jsx
import React, { useState } from 'react';

function Counter() {
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

const container = document.getElementById('root');
const root = ReactDOM.createRoot(container);
root.render(<Counter />);
```

In the example above, `useState(0)` is used to declare a new state variable called `count`. `useState` returns a pair: the current state value (which starts as the first argument passed to `useState`) and a function to update the state (`setCount` in this case).

The `setCount` function is used to update the state. In the button's `onClick` handler, `setCount` is called with `count + 1` to increment the count.

## Multiple state variables

You can use the `useState` Hook more than once in a single component. Here's an example:

```jsx
function Form() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');

  return (
    <div>
      <input
        value={name}
        onChange={e => setName(e.target.value)}
        placeholder="Name"
      />
      <input
        value={email}
        onChange={e => setEmail(e.target.value)}
        placeholder="Email"
      />
    </div>
  );
}

root.render(<Form />);
```

In this example, the `Form` component has two pieces of state: `name` and `email`.

### Exercises

**Exercise 1:**
Create a `Counter` function component that starts at 0 and increments by 1 each time a button is clicked. Display the current count on the screen.

**Exercise 2:**
Create a `Form` function component that has two pieces of state: `name` and `email`. Each piece of state should be connected to a different input field. When you type in the input field, it should update the corresponding piece of state.

