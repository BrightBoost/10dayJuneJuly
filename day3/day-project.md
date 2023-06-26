# Project: Color Picker App

## Objective
Recreate your color picker app using React. The app should include three color pickers, where changing the color in a color input updates the background color of the corresponding display div. The selected color should also be displayed as text.

If you can do this without smaller steps, that's amazing! Just in case, here are the steps you could take. 

**Steps:**

1. **Create a new React app.**
   Start by setting up a new React project. You can use Create React App for this.

2. **Create the `ColorDisplay` Component.**
   This component will display the color. It should accept a color as a prop and set it as the background color of the div. 

3. **Create the `ColorPicker` Component.**
   This component will include an HTML color input element and should use the `ColorDisplay` component. 

4. **Use State in `ColorPicker`.**
   Inside the `ColorPicker` component, use React's `useState` hook to create a state variable for the color. This will be initialized to a default color (e.g., white or black). 

5. **Connect the Color Input to State.**
   Make the color input a controlled component, meaning its value is controlled by the color state variable. Also, add an `onChange` handler to the color input that updates the color state variable whenever the input's value changes.

6. **Pass Color State to `ColorDisplay`.**
   The `ColorDisplay` component should reflect the current color state of the `ColorPicker` component. Pass the color state variable as a prop to `ColorDisplay`.

7. **Display the Color Text.**
   Underneath the `ColorDisplay` component, display the current color value as text. 

8. **Create Multiple `ColorPicker` Components.**
   In your main App component, render three `ColorPicker` components.

**Tips:**

- Remember to import the `React`, `useState`, and `ReactDOM` at the start of your script.
- Use `document.querySelector` to select your root DOM node and `ReactDOM.createRoot` to create your root React node.
- When setting inline styles in JSX, you need to use a JavaScript object where the properties are camelCased.

