# Calling an API in React

When building a real-world React application, you'll often need to fetch data from APIs. In JavaScript, we have a built-in browser function called `fetch()` that we can use to make HTTP requests to retrieve data from APIs. 

The `fetch()` function returns a `Promise` that resolves to the `Response` to that request, whether it is successful or not.

Here's an example of how to use `fetch()` to retrieve data from an API:

```jsx
fetch('https://api.example.com/items')
  .then(response => response.json()) // this parses the response as JSON
  .then(data => console.log(data)) // this logs the data to the console
  .catch(error => console.error('Error:', error)); // this logs any error to the console
```

## Using `fetch()` in a React Component with useEffect

Since calling an API can be considered a side-effect, you should make API calls inside the `useEffect` hook. Here is an example of how you can use `fetch` within a React functional component to retrieve data from an API:

```jsx
import React, { useState, useEffect } from 'react';

function App() {
  const [data, setData] = useState([]);

  useEffect(() => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => setData(data));
  }, []); // The empty array means that the effect will run once, when the component mounts

  return (
    <div>
      {data.map(item => (
        <p key={item.id}>{item.title}</p>
      ))}
    </div>
  );
}

export default App;
```

In this example, we're calling the `fetch()` function inside `useEffect`. The data we get from the API is then stored in our state variable using `setData()`, and we map through the data to display it.

Remember, `useEffect` runs after every render, but by passing an empty array `[]` as the second argument, we're telling React to only run the effect once after the initial render, mimicking the `componentDidMount` lifecycle method in class components.

When using fetch (or other async operations), you might encounter errors. It's always good to handle these errors appropriately in your code to ensure your application can manage and report errors correctly. A common practice is to include a `.catch()` block after your `.then()` blocks to catch any errors that occurred during the fetch and handle them.

More info (and alternatives): https://react.dev/reference/react/useEffect#fetching-data-with-effects

## Exercises


1. **Display a list of posts**
   Using the JSON Placeholder API, create a React app that displays a list of posts.

   API Endpoint: `https://jsonplaceholder.typicode.com/posts`

   Each post has a `title` and `body`. Display these in a list (an unordered list would work). Remember to give each list item a `key` prop, which can be the `id` of each post.

2. **Display a single post**
   Modify the above exercise to display a single post based on an `id`. You can hard-code the `id` for now.

   API Endpoint: `https://jsonplaceholder.typicode.com/posts/1`

   This will display the post with the `id` of 1. Display the `title` and `body` of the post in your component.

3. **Display comments for a post**
   Extend exercise 2 by adding comments for the post. Each post has multiple comments, which can be fetched using another API endpoint.

   API Endpoint: `https://jsonplaceholder.typicode.com/posts/1/comments`

   This will fetch the comments for the post with `id` of 1. Each comment has a `name`, `email`, and `body`. Display these details for each comment.
