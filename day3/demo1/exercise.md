# Exercise ShoppingList
Create a new React component named `ShoppingList` using JSX that renders a list of shopping items. The items should be: "Apples", "Bananas", "Carrots".

Please use the following skeleton as a starting point:

```html
<html>

<head>
    <title>React with JSX</title>
    <script crossorigin src="https://unpkg.com/react@18/umd/react.development.js"></script>
    <script crossorigin src="https://unpkg.com/react-dom@18/umd/react-dom.development.js"></script>
    <script src="https://unpkg.com/babel-standalone@6/babel.min.js"></script>
</head>

<body>
    <div id="app"></div>

    <script type="text/babel">

        //Select DOM element to render on
        const domContainer = document.querySelector('#app')

        // Create root on selected DOM element

        // Create ShoppingList component using JSX
        // Render a list of shopping items: "Apples", "Bananas", "Carrots"
        

        // Render ShoppingList component at root

    </script>
</body>

</html>
```

For students who finish early, you can add a stretch goal: Modify the `ShoppingList` component so that the list of items is passed in as a prop. Create a second list of items and render both lists on the page.