# Introduction to JSX

JSX stands for JavaScript XML. It's a syntax extension for JavaScript, and it is used with React to describe what the user interface should look like. It's very similar to HTML, but it is actually JavaScript.

React components can be written in plain JavaScript, but JSX is much easier and intuitive to work with.

## Why JSX?

JSX makes it easier to write and add HTML in React. Without it, your React code would be filled with `React.createElement` calls and be harder to read.

## Writing JSX

In JSX, you can write what looks like HTML, but you're actually writing JavaScript.

```jsx
const element = <h1>Hello, world!</h1>;
```

## Embedding Expressions in JSX

You can embed any JavaScript expression within curly braces `{}` in JSX. For instance, 2 + 2, user.firstName, or formatName(user) are all valid JavaScript expressions:

```jsx
const name = 'Josh Perez';
const element = <h1>Hello, {name}</h1>;
```

Here, you are declaring a variable called name and then using it inside JSX by wrapping it in curly braces.

## JSX is an Expression Too

After compilation, JSX expressions become regular JavaScript function calls and evaluate to JavaScript objects. This means that you can use JSX inside of `if` statements and `for` loops, assign it to variables, accept it as arguments, and return it from functions:

```jsx
function getGreeting(user) {
  if (user) {
    return <h1>Hello, {formatName(user)}!</h1>;
  }
  return <h1>Hello, Stranger.</h1>;
}
```

## Specifying Attributes with JSX

You may use quotes to specify string literals as attributes:

```jsx
const element = <div tabIndex="0"></div>;
```

You may also use curly braces to embed a JavaScript expression in an attribute:

```jsx
const element = <img src={user.avatarUrl}></img>;
```

Don't put quotes around curly braces when embedding a JavaScript expression in an attribute. You should either use quotes (for string values) or curly braces (for expressions), but not both in the same attribute.

## JSX Represents Objects

Babel compiles JSX down to `React.createElement()` calls.

The following two examples are identical:

```jsx
const element = (
  <h1 className="greeting">
    Hello, world!
  </h1>
);

const element = React.createElement(
  'h1',
  {className: 'greeting'},
  'Hello, world!'
);
```

These two React elements are exactly the same. Both describe a tree of React components that renders to `<h1 class="greeting">Hello, world!</h1>`.

That's it! You now have a basic understanding of what JSX is and how to use it in React. Don't worry if it feels a bit confusing right now. As you continue working with React and JSX, it will become second nature.

### Exercises

**Exercise 1:**
Create a JSX element that represents a `div` with a class of `myDiv` and contains the text "Hello JSX!".

**Exercise 2:**
Create a function called `HelloWorld` that takes a `name` as a prop and returns a JSX element that says "Hello, {name}". Test this by rendering `<HelloWorld name="React"/>` and you should see "Hello, React" on the screen. 

