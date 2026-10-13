import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import  org.junit.jupiter.api.Assertions.*;

public class PurchaseCalculatorTest {

    PurchaseCalculator purchaseCalculator  = new PurchaseCalculator();

    @Test
    @DisplayName("Prueba método subtotal")
    void pruebaSubtotal(){
        assertEquals(300,purchaseCalculator.calculateSubtotal(100,3));
        assertEquals(150, purchaseCalculator.calculateSubtotal(150,1));
        assertEquals(0,purchaseCalculator.calculateSubtotal(0,1));
    }//testSubtotal

    @Test
    @DisplayName("Prueba método compra")
    void pruebasCompra(){
        assertEquals(true,purchaseCalculator.isValidPurchase(200,5));
        assertEquals(false,purchaseCalculator.isValidPurchase(0,1));
        assertEquals(false,purchaseCalculator.isValidPurchase(1,0));
        assertEquals(false,purchaseCalculator.isValidPurchase(-100,1));

    }//comprasTest

    @Test
    @DisplayName("Prueba método Descuento")
    void pruebasDescuento(){
        assertEquals(0,purchaseCalculator.calculateDiscount(300));
        assertEquals(100,purchaseCalculator.calculateDiscount(1000));
        assertEquals(120,purchaseCalculator.calculateDiscount(1200));


    }//Descuento

    @Test
    @DisplayName("Prueba método Descuento")
    void pruebasTotal(){
        assertEquals(900,purchaseCalculator.calculateFinalPrice(900));
        assertEquals(900,purchaseCalculator.calculateFinalPrice(1000));
        assertEquals(900,purchaseCalculator.calculateFinalPrice(1000));

    }//test Total



}
