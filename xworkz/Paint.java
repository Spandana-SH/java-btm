class Paint{
  static void paint(String area, String color, double width, double height){
    System.out.println("Printing statements");
    
    System.out.println("Paint area " +area);
    System.out.println("Color used in paint " +color);
    System.out.println("Width of the paint is " +width);
    System.out.println("Height of the paint is " +height);
    
    if(area!=null && color!=null && width>10 && height>3){
      System.out.println("Cntinue with the arguements!!!");
    }else{
      System.out.println("Don't continue");
    }
  }
  
  static void paint(String area, String color, double width, double height, String mainPainter){
    System.out.println("Printing statements");
    
    System.out.println("Paint area " +area);
    System.out.println("Color used in paint " +color);
    System.out.println("Width of the paint is " +width);
    System.out.println("Height of the paint is " +height);
    System.out.println("Main Painter name is " +mainPainter);
    
    if (area != null && color != null && width > 10 && height > 3 && mainPainter != null) {
      System.out.println("Cntinue with the arguements!!!");
    }else{
      System.out.println("Don't continue");
    }
    
  }
  static void paint(String area, String color, double width, double height, String mainPainter, int totalPainters){
    System.out.println("Printing statements");
    
    System.out.println("Paint area " +area);
    System.out.println("Color used in paint " +color);
    System.out.println("Width of the paint is " +width);
    System.out.println("Height of the paint is " +height);
    System.out.println("Main Painter name is " +mainPainter);
    System.out.println("Total painters are " +totalPainters);
    
    if (area != null && color != null && width > 10 && height > 3 && mainPainter != null && totalPainters > 0 ) {
      System.out.println("Cntinue with the arguements!!!");
    }
    else
    {
      System.out.println("Don't continue");
    }
    
  }
  static void paint(String area, String color, double width, double height, String mainPainter, int totalPainters, double cost){
    System.out.println("Printing statements");
    
    System.out.println("Paint area " +area);
    System.out.println("Color used in paint " +color);
    System.out.println("Width of the paint is " +width);
    System.out.println("Height of the paint is " +height);
    System.out.println("Main Painter name is " +mainPainter);
    System.out.println("Total painters are " +totalPainters);
    System.out.println("Cost of the paint is " +cost);
    
    if (area != null && color != null && width > 10 && height > 3 && mainPainter != null && totalPainters > 0 && cost > 10000) {
      System.out.println("Cntinue with the arguements!!!");
    }else{
      System.out.println("Don't continue");
    }
  }
  static void paint(String area, String color, double width, double height, String mainPainter, int totalPainters, double cost, int totalDuration){
    System.out.println("Printing statements");
    
    System.out.println("Paint area " +area);
    System.out.println("Color used in paint " +color);
    System.out.println("Width of the paint is " +width);
    System.out.println("Height of the paint is " +height);
    System.out.println("Main Painter name is " +mainPainter);
    System.out.println("Total painters are " +totalPainters);
    System.out.println("Cost of the paint is " +cost);
    System.out.println("Total duration is " +totalDuration +"hour");
    
    if (area != null && color != null && width > 10 && height > 3 && mainPainter != null && totalPainters > 0 && cost > 10000 && totalDuration > 1) {
      System.out.println("Cntinue with the arguements!!!");
    }else{
      System.out.println("Don't continue");
    }
  }
  
}


