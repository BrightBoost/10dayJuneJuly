# Introduction to Props in React

When creating a React application, you'll often want to pass data from one component to another. This is done using a feature of React called "props".

## What are props?

Props (short for properties) are how components talk to each other. You can think of props as attributes you add to a JavaScript function. They allow you to customize the component and pass in different values.

## How to use props

To pass props to a component, you include them as attributes when you render the component. Here's an example:

```jsx
function Greeting(props) {
  return <h1>Hello, {props.name}!</h1>;
}

const container = document.getElementById('root');
const root = ReactDOM.createRoot(container);
root.render(<Greeting name="World" />);
```

In the example above, we define a `Greeting` component that takes a single prop: `name`. When we render `Greeting`, we pass a `name` prop to it. The value of `name` is then used inside the `Greeting` component.

## Multiple props

You can pass as many props to a component as you want. Here's an example with two props:

```jsx
function Welcome(props) {
  return (
    <h1>
      Hello, {props.name}! You are {props.age} years old.
    </h1>
  );
}

root.render(<Welcome name="World" age={2023} />);
```

In this example, we pass two props (`name` and `age`) to the `Welcome` component.

Note that the `age` prop is passed with curly braces `{}`. This is because the `age` prop is a number, not a string. In JSX, you can embed any JavaScript expression in curly braces.

### Exercises

**Exercise 1:**
Create a `Person` function component that takes `name` and `age` props and renders the text "Hello, [name]! You are [age] years old.". Use the `root.render()` function to display your component with your own name and age.

**Exercise 2:**
Create an `App` function component that renders the `Person` component three times, each time with a different name and age. Display the `App` component using `root.render()`.

