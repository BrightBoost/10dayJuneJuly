import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ProductMockitoTest {

    @Test
    public void testRestockFromSupplier() {
        // Create a mock object for the Product.ProductSupplier class
        Product.ProductSupplier supplierMock = Mockito.mock(Product.ProductSupplier.class);

        // Create a spy object for the Product class
        Product productSpy = Mockito.spy(new Product(1, "Product Name", 100, supplierMock));

        // Set up the necessary conditions for the test
        when(productSpy.getSupplier()).thenReturn(supplierMock);
        when(supplierMock.getAdditionalQuantity(1)).thenReturn(10);

        // Call the method under test
        productSpy.restockFromSupplier();

        // Verify the interactions with the mock objects
        verify(productSpy, times(2)).getProductId(); // Verify that getProductId() is called twice
        verify(productSpy).addStock(10);
        verify(productSpy).getSupplier(); // Verify that getSupplier() is called once
        verify(supplierMock).getAdditionalQuantity(1);
    }
}