const express = require('express');
const cors = require('cors');

const app = express();
app.use(cors());
app.use(express.json()); // for parsing application/json

// Your "database"
let products = [
    { id: 1, name: 'Mechanical Keyboard', price: 120, description: 'Cherry MX Brown switches, RGB lighting' },
    { id: 2, name: 'Gaming Mouse', price: 60, description: 'High DPI, programmable buttons' },
    { id: 3, name: 'RGB Mouse Pad', price: 30, description: 'Light up your desk with RGB' },
    { id: 4, name: 'Curved Monitor', price: 300, description: 'Ultra-wide, 144Hz refresh rate' },
    { id: 5, name: 'Gaming Chair', price: 350, description: 'Ergonomic, comfortable for long sessions' },
    { id: 6, name: 'RAM Kit', price: 150, description: '16GB, DDR4, 3200MHz' },
    { id: 7, name: 'Graphic Card', price: 1200, description: '8GB GDDR6, Ray Tracing' },
    { id: 8, name: 'CPU', price: 450, description: '8 Cores, 16 Threads, up to 4.9 GHz' },
    { id: 9, name: 'SSD', price: 200, description: '1TB, NVMe' },
    { id: 10, name: 'Wireless Headset', price: 250, description: 'Noise cancelling, surround sound' },
];

// Endpoint to get all products
app.get('/products', (req, res) => {
    res.json(products);
});

// Endpoint to get a single product
app.get('/products/:id', (req, res) => {
    const product = products.find(p => p.id === Number(req.params.id));
    if (!product) {
        res.status(404).json({ message: 'Product not found' });
    } else {
        res.json(product);
    }
});

// Endpoint to add a new product
app.post('/products', (req, res) => {
    const newProduct = { id: products.length + 1, ...req.body };
    products.push(newProduct);
    res.json(newProduct);
});

// Endpoint to update a product
app.put('/products/:id', (req, res) => {
    const id = Number(req.params.id);
    const index = products.findIndex(p => p.id === id);

    if (index === -1) {
        res.status(404).json({ message: 'Product not found' });
    } else {
        const updatedProduct = { ...products[index], ...req.body };
        products[index] = updatedProduct;
        res.json(updatedProduct);
    }
});

const port = process.env.PORT || 5000;
app.listen(port, () => console.log(`Server is running on port ${port}`));
