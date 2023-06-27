# Mini E-commerce API

This is a simple API for a mini e-commerce application built with Node.js and Express.

## Getting Started

To get started, you first need to clone the repository to your local machine.

Open your terminal and run:

```sh
git clone <url-to-the-repo>
cd <repo-directory>
```

Next, install the required packages using npm:

```sh
npm install
```

Finally, you can start the API server:

```sh
node server.js
```

The server will start on port 5000, or on the port specified in your `PORT` environment variable.

## API Endpoints

The API has the following endpoints:

- `GET /products`: Returns a list of all products.
- `GET /products/:id`: Returns the product with the specified ID.
- `POST /products`: Adds a new product. The request body should be a JSON object with the properties `name`, `price`, and `description`.
- `PUT /products/:id`: Updates the product with the specified ID. The request body should be a JSON object with the properties to be updated.

## Data Model

The data model for a product is:

```json
{
  "id": 1,
  "name": "Mechanical Keyboard",
  "price": 120,
  "description": "Cherry MX Brown switches, RGB lighting"
}
```

The `id` is an integer that is automatically generated and incremented for each new product.

The `name` is a string that represents the name of the product.

The `price` is a number that represents the price of the product.

The `description` is a string that provides a brief description of the product.
