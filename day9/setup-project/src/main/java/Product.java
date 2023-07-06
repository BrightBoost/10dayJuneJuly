import java.util.function.Supplier;

public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private ProductSupplier supplier;

    public Product(int productId, String productName, int quantity, ProductSupplier supplier) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }

        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    // Rest of the class...


    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void addStock(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be non-negative");
        }
        this.quantity += quantity;
    }


    public int getQuantity() {
        return quantity;
    }


    public void sellProduct(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            throw new RuntimeException("Insufficient stock");
        }

        if (this.quantity < 0) {
            throw new RuntimeException("Quantity cannot be negative");
        }
    }

    public void restockFromSupplier() {
        int additionalQuantity = supplier.getAdditionalQuantity(getProductId()); // Call getProductId() here
        int productId = getProductId(); // Ensure this line is added

        addStock(additionalQuantity);
    }



    public ProductSupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(ProductSupplier supplier) {
        this.supplier = supplier;
    }

    public interface ProductSupplier {
        int getAdditionalQuantity(int productId);
    }
}
