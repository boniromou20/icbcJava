class FruitShop { 
    private static final double APPLE_PRICE = 8.0; 
    private static final double STRAWBERRY_PRICE = 13.0; 
    private static final double MANGO_PRICE = 20.0; 

    public double calculateTotalA(int appleWeight, int strawberryWeight) { 
        return appleWeight * APPLE_PRICE + strawberryWeight * STRAWBERRY_PRICE; 
    } 

    public double calculateTotalB(int appleWeight, int strawberryWeight, int mangoWeight) { 
        return appleWeight * APPLE_PRICE + strawberryWeight * STRAWBERRY_PRICE + mangoWeight * MANGO_PRICE; 
    } 

    public double calculateTotalC(int appleWeight, int strawberryWeight, int mangoWeight) { 
        double strawberryDiscountedPrice = STRAWBERRY_PRICE * 0.8; 
        return appleWeight * APPLE_PRICE + strawberryWeight * strawberryDiscountedPrice + mangoWeight * MANGO_PRICE; 
    } 

    public double calculateTotalD(int appleWeight, int strawberryWeight, int mangoWeight) { 
        double strawberryDiscountedPrice = STRAWBERRY_PRICE * 0.8; 
        double total = appleWeight * APPLE_PRICE + strawberryWeight * strawberryDiscountedPrice + mangoWeight * MANGO_PRICE; 
        if (total >= 100) { 
            total -= 10; 
        } 
        return total; 
    } 

    public static void main(String[] args) { 
        FruitShop shop = new FruitShop(); 
        System.out.println("Customer A Total Price: " + shop.calculateTotalA(2, 3)); 
        System.out.println("Customer B Total Price: " + shop.calculateTotalB(2, 3, 1)); 
        System.out.println("Customer C Total Price: " + shop.calculateTotalC(2, 3, 1)); 
        System.out.println("Customer D Total Price: " + shop.calculateTotalD(2, 3, 1)); 
    } 
} 