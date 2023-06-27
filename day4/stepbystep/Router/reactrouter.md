# React Router Tutorial

React Router is a powerful tool used to manage routing in your React application. It allows us to build a single-page web application with navigation without the page being refreshed as the user navigates. React Router uses component structure to call components, which display the appropriate information.

## Installation

To start using React Router, you first need to install it using either `npm` or `yarn`:

```
npm install react-router-dom
```

or

```
yarn add react-router-dom
```

## Basic Components

React Router provides a few components that we can use to handle routing:

- `BrowserRouter`: A router that uses the HTML5 history API to keep your UI in sync with the URL.
- `Route`: This component will render the UI when a specific route is hit.
- `Link`: It's like anchor tags in HTML, but it works with `BrowserRouter` to navigate without a full page refresh.
- `Switch`: This component is used to render only the first `Route` or `Redirect` that matches the location.

## Basic Example

Here is a simple example of how to use React Router:

```jsx
import React from "react";
import { BrowserRouter as Router, Route, Link } from "react-router-dom";

function Home() {
  return <h2>Home</h2>;
}

function About() {
  return <h2>About</h2>;
}

function AppRouter() {
  return (
    <Router>
      <div>
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/about/">About</Link>
            </li>
          </ul>
        </nav>

        <Route path="/" exact component={Home} />
        <Route path="/about/" component={About} />
      </div>
    </Router>
  );
}

export default AppRouter;
```

In the above example, clicking on the links updates the URL and the view on the page.

## Exercise 1: Basic Routing

Create a basic routing application with three routes: Home, About, and Contact. Each route should render a different component with a heading and a small paragraph of text.

## Exercise 2: Nested Routing

Create a Books route in your application from exercise 1. This route should render a new component, `BooksList`, which displays a list of book titles. When you click on a book title, the application should route to a `/books/:id` route and display a `BookDetail` component which contains details about the clicked book.

**Note:** You need to create mock data for your books.

## Exercise 3: Redirects (Stretch Goal)

Create a Login route. Add a button in the Login component that changes the state of the user's login status and redirects the user to the Home page after they "login".

## Exercise 4: 404 Page (Stretch Goal)

If a user navigates to a path that is not defined in your routes, display a 404 page.

