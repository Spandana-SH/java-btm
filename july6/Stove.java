public class Stove {
    
    private String brand;
    private String fuelType;
    private int numberOfBurners;
    private boolean hasOven;
    private boolean hasGrill;
    private boolean isElectric;
    private String color;
    private double price;

    
    public Stove(String brand, String fuelType, int numberOfBurners, boolean hasOven,
                 boolean hasGrill, boolean isElectric, String color, double price) {
        this.brand = brand;
        this.fuelType = fuelType;
        this.numberOfBurners = numberOfBurners;
        this.hasOven = hasOven;
        this.hasGrill = hasGrill;
        this.isElectric = isElectric;
        this.color = color;
        this.price = price;
    }

    
    public void printInstanceVariables() {
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Number of Burners: " + numberOfBurners);
        System.out.println("Has Oven: " + hasOven);
        System.out.println("Has Grill: " + hasGrill);
        System.out.println("Is Electric: " + isElectric);
        System.out.println("Color: " + color);
        System.out.println("Price:" + price +" RS");
        System.out.println();
    }

    public static void main(String[] args) {
        
        Stove stove1 = new Stove("Samsung", "Gas", 4, true, false, false, "Stainless Steel", 0000.00);
        Stove stove2 = new Stove("LG", "Electric", 5, true, true, true, "Black", 12000.00);
        Stove stove3 = new Stove("Whirlpool", "Gas", 6, true, true, false, "White", 8000.00);
        Stove stove4 = new Stove("GE", "Electric", 4, false, false, true, "Silver", 7000.00);
        Stove stove5 = new Stove("Frigidaire", "Gas", 5, true, false, false, "Stainless Steel", 11000.00);
        Stove stove6 = new Stove("Bosch", "Electric", 6, true, true, true, "Black Stainless Steel", 14000.00);
        Stove stove7 = new Stove("KitchenAid", "Gas", 4, true, true, false, "Red", 10000.00);
        Stove stove8 = new Stove("Maytag", "Electric", 5, false, true, true, "White", 9000.00);

       
        stove1.printInstanceVariables();
        stove2.printInstanceVariables();
        stove3.printInstanceVariables();
        stove4.printInstanceVariables();
        stove5.printInstanceVariables();
        stove6.printInstanceVariables();
        stove7.printInstanceVariables();
        stove8.printInstanceVariables();
    }
}
