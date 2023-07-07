public class Sofa {
    
    private int length;
    private int width;
    private int height;
    private String color;
    private String material;
    private boolean isReclining;
    private boolean hasCupHolders;
    private double price;

    
    public Sofa(int length, int width, int height, String color, String material,
                boolean isReclining, boolean hasCupHolders, double price) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.material = material;
        this.isReclining = isReclining;
        this.hasCupHolders = hasCupHolders;
        this.price = price;
    }

    
    public void printInstanceVariables() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Reclining: " + isReclining);
        System.out.println("Cup Holders: " + hasCupHolders);
        System.out.println("Price:" + price + " RS");
        System.out.println();
    }

    public static void main(String[] args) {
        
        Sofa sofa1 = new Sofa(80, 60, 40, "Black", "Leather", true, false, 4999.00);
        Sofa sofa2 = new Sofa(90, 70, 42, "Brown", "Fabric", false, true, 5999.00);
        Sofa sofa3 = new Sofa(85, 65, 38, "Gray", "Microfiber", true, true, 4499.00);
        Sofa sofa4 = new Sofa(75, 55, 36, "Red", "Velvet", false, false, 7999.00);
        Sofa sofa5 = new Sofa(95, 75, 44, "Beige", "Cotton", true, true, 8999.00);
        Sofa sofa6 = new Sofa(82, 62, 39, "Blue", "Polyester", false, false, 10999.00);
        Sofa sofa7 = new Sofa(88, 68, 41, "Green", "Suede", true, true, 12999.00);
        Sofa sofa8 = new Sofa(78, 58, 37, "White", "Linen", false, true, 8999.00);

        // Print instance variables for each sofa object
        sofa1.printInstanceVariables();
        sofa2.printInstanceVariables();
        sofa3.printInstanceVariables();
        sofa4.printInstanceVariables();
        sofa5.printInstanceVariables();
        sofa6.printInstanceVariables();
        sofa7.printInstanceVariables();
        sofa8.printInstanceVariables();
    }
}