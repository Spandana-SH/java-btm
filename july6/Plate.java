public class Plate {
 
    private String material;
    private String shape;
    private int diameter;
    private String color;
    private boolean isMicrowaveSafe;
    private boolean isDishwasherSafe;
    private boolean isBreakResistant;
    private double price;

   
    public Plate(String material, String shape, int diameter, String color,
                 boolean isMicrowaveSafe, boolean isDishwasherSafe,
                 boolean isBreakResistant, double price) {
        this.material = material;
        this.shape = shape;
        this.diameter = diameter;
        this.color = color;
        this.isMicrowaveSafe = isMicrowaveSafe;
        this.isDishwasherSafe = isDishwasherSafe;
        this.isBreakResistant = isBreakResistant;
        this.price = price;
    }

   
    public void printInstanceVariables() {
        System.out.println("Material: " + material);
        System.out.println("Shape: " + shape);
        System.out.println("Diameter: " + diameter + " inches");
        System.out.println("Color: " + color);
        System.out.println("Microwave Safe: " + isMicrowaveSafe);
        System.out.println("Dishwasher Safe: " + isDishwasherSafe);
        System.out.println("Break Resistant: " + isBreakResistant);
        System.out.println("Price: " + price + " RS");
        System.out.println();
    }

    public static void main(String[] args) {
      
        Plate plate1 = new Plate("Ceramic", "Round", 10, "White", true, true, false, 10.00);
        Plate plate2 = new Plate("Melamine", "Square", 8, "Blue", false, true, true, 16.00);
        Plate plate3 = new Plate("Glass", "Round", 12, "Clear", true, false, true, 12.00);
        Plate plate4 = new Plate("Plastic", "Oval", 9, "Red", true, true, false, 5.00);
        Plate plate5 = new Plate("Porcelain", "Round", 11, "Cream", true, true, true, 20.00);
        Plate plate6 = new Plate("Stainless Steel", "Square", 7, "Silver", false, true, true, 50.00);
        Plate plate7 = new Plate("Bamboo", "Round", 10, "Natural", true, true, true, 11.00);
        Plate plate8 = new Plate("Acrylic", "Oval", 9, "Green", true, false, false, 16.00);


        plate1.printInstanceVariables();
        plate2.printInstanceVariables();
        plate3.printInstanceVariables();
        plate4.printInstanceVariables();
        plate5.printInstanceVariables();
        plate6.printInstanceVariables();
        plate7.printInstanceVariables();
        plate8.printInstanceVariables();
    }
}
