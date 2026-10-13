public class PurchaseCalculator {

    //Devuelve el precio de un producto multiplicado por la cantidad solicitada.
    public double calculateSubtotal(double price, int quantity) {
        double subTotal = price * quantity;
        return subTotal;

    }//public Double CalculateSubtotal

    //Devuelve true si el precio es mayor que cero y la cantidad es mayor que cero.
    public boolean isValidPurchase(double price, int quantity) {
        if (price > 0 && quantity > 0) {
            return true;
        }
        return false;

    }//Public boolean isValidPurchase

    public double calculateDiscount(double subtotal) {
        //se devuelve el subtotal con descuento si es que aplica
        double totalDiscount = 0;

        //porcentaje a descontar
        double porcetanje = .10;
        if (subtotal >= 1000) {
            totalDiscount= subtotal * porcetanje;
            return totalDiscount;
        }

        return totalDiscount;
    }//public double ScalculateDiscount


    //Devuelve el subtotal menos el descuento correspondiente.
    public double calculateFinalPrice(double subtotal) {
        return subtotal - calculateDiscount(subtotal);
    }//public double calculateFinalPrice


}//Public Class PurchaseCalculator
