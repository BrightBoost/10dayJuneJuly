# E-commerce application

** Make sure to familiarize yourself with the other topics first **


**Step 1: Set Up the React App**

First, use `npx create-react-app name-app` to initialize a new React project.

**Step 2: Create the Product List Component**

This component should fetch data from the provided API (for instance, `https://my-api.com/products`) in the `useEffect` hook. Display this data as a list of products. Each list item should include the product name and price, and a button or link to view more details.

**Step 3: Create the Product Detail Component**

Create another component that will display more details about a product. This should also fetch data from the API, but this time for a single product (like `https://my-api.com/products/1`). This component should show all available details for the product, such as its description and image. Add an "Add to Cart" button that, when clicked, adds the product to the shopping cart.

**Step 4: Implement Routing**

Use `react-router-dom` to implement routing in your app. Set up routes for the product list (`/`), product detail (`/product/:id`), and shopping cart (`/cart`). 

**Step 5: Create the Shopping Cart Component**

Create a component to display the items in the shopping cart. This could be a simple list that shows the product name, price, and quantity. Additionally, it should display the total cost of all items in the cart.

**Step 6: Manage Shopping Cart with Context**

Set up a `CartContext` that keeps track of the items in the shopping cart. The context should include functions to add items to the cart and remove items from the cart. Use the `useContext` hook in the Product Detail and Shopping Cart components to interact with the cart context.

**Step 7: Styling**

Add some CSS to make your app look nice. You can use plain CSS, a CSS preprocessor, or a CSS-in-JS solution.

**Step 8: Error Handling**

Add some error handling to your app. For instance, display an error message if the product data fails to load.

**Exercise 1: Add Product Quantity Selection**

Modify the Product Detail component to include a quantity selector. The quantity selected should be used when adding the item to the cart.

**Exercise 2: Persist the Shopping Cart**

Use the `localStorage` web API to persist the shopping cart. The cart should not be cleared when the page is refreshed.

**Exercise 3: Improve User Experience**

Consider the user experience of your app. For instance, the "Add to Cart" button could be disabled while the cart is being updated. A message could be displayed when an item is successfully added to the cart.

