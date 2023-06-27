# Introduction to React Function Components

React components are like JavaScript functions that return a user interface (UI). These components are the building blocks of a React application. You can think of your application's UI as a tree of components.

React components can be either class components or function components. Function components are simpler and more common. Let's focus on these.

## Function Components

Here's the simplest way to define a function component:

```jsx
function Welcome() {
  return <h1>Hello, World!</h1>;
}
```

This is a valid React component. It's a JavaScript function that returns a React element.

## Rendering a Component

To render a component, you can create an instance of it and pass it to the `root.render()` function:

```jsx
const welcomeComponent = <Welcome />;
const container = document.getElementById('root');
const root = ReactDOM.createRoot(container);
root.render(welcomeComponent);
```

Here's what happens in this example:

1. We create an instance of our `Welcome` component with `<Welcome />`.
2. We call `root.render()` with our `welcomeComponent`.
3. Our `Welcome` component returns a `<h1>Hello, World!</h1>` element as the result.
4. React updates the DOM to match `<h1>Hello, World!</h1>`.

Components can be reused and rendered multiple times. Let's create an `App` component that renders our `Welcome` component three times:

```jsx
function App() {
  return (
    <div>
      <Welcome />
      <Welcome />
      <Welcome />
    </div>
  );
}

const appComponent = <App />;
root.render(appComponent);
```

You will now see "Hello, World!" displayed three times in your application.

### Exercises

**Exercise 1:**
Create a `HelloWorld` function component that renders the text "Hello, World!". Use the `root.render()` function to display your component.

**Exercise 2:**
Create an `App` function component that renders the `HelloWorld` component three times. Display the `App` component using `root.render()`.

