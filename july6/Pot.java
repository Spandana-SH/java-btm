public class Pot {
   
    private String material;
    private String shape;
    private int capacity;
    private String color;
    private boolean isLidAvailable;
    private int durability;
    private boolean isDishwasherSafe;
    private double price;

   
    public Pot(String material, String shape, int capacity, String color,
               boolean isLidAvailable, int durability,
               boolean isDishwasherSafe, double price) {
        this.material = material;
        this.shape = shape;
        this.capacity = capacity;
        this.color = color;
        this.isLidAvailable = isLidAvailable;
        this.durability = durability;
        this.isDishwasherSafe = isDishwasherSafe;
        this.price = price;
    }

   
    public void printInstanceVariables() {
        System.out.println("Material: " + material);
        System.out.println("Shape: " + shape);
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Color: " + color);
        System.out.println("Lid Available: " + isLidAvailable);
        System.out.println("Durability: " + durability);
        System.out.println("Dishwasher Safe: " + isDishwasherSafe);
        System.out.println("Price: " + price + " RS");
        System.out.println();
    }

    public static void main(String[] args) {
        
        Pot pot1 = new Pot("Mud", "Round", 5, "Silver", true, 6, true, 100.00);
        Pot pot2 = new Pot(" Clay", "Square", 3, "Black", true, 3, true, 70.00);
        Pot pot3 = new Pot("Cement", "Oval", 8, "Red", false, 8, false, 85.00);
        Pot pot4 = new Pot("Aluminum", "Rectangular", 10, "Gray", true, 5, false, 49.00);
        Pot pot5 = new Pot("Plastic", "Round", 6, "Blue", true, 10, true, 55.00);
        Pot pot6 = new Pot("Glass", "Round", 4, "Clear", true, 4, true, 85.00);
        Pot pot7 = new Pot("Ceramic", "Square", 2, "White", false, 15, false, 64.00);
        Pot pot8 = new Pot("Stainless Steel", "Oval", 7, "Green", true, 20, true, 130.00);

        
        pot1.printInstanceVariables();
        pot2.printInstanceVariables();
        pot3.printInstanceVariables();
        pot4.printInstanceVariables();
        pot5.printInstanceVariables();
        pot6.printInstanceVariables();
        pot7.printInstanceVariables();
        pot8.printInstanceVariables();
    }
}
