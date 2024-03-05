package Shapes;
import java.io.*;
import java.util.Scanner;

public class Structure {
    private Scanner scanner;
    
    public Structure(){
        this.scanner = new Scanner(System.in);
        
    }

    public void displayMenu() {
        int Number;
        do {

            System.out.println("<---------------------->");
            System.out.println("<------ Menu ------>");
            System.out.println("1. Calculate Two-Dimensional Shapes");
            System.out.println("2. Calculate Three-Dimensional Shapes");
            System.out.println("3. Display data from file");
            System.out.println("4. Exit");
            System.out.println("<---------------------->");
            
            System.out.print("Enter your choice: ");
            Number = scanner.nextInt();

            switch (Number) {
                case 1:
                    displayTwoDimensionalShapes();
                    break;
                case 2:
                    displayThreeDimensionalShapes();
                    break;
                case 3:
                    displayData();
                break;    
                case 4:
                    System.out.println("Au revoir..<3");
                    break;
                default:
                    System.out.println("Enter number between 1 and 4");
            }

        } while (Number != 4);

        scanner.close();
    }

    private void displayTwoDimensionalShapes() {
        System.out.println("<------ Two-Dimensional Shapes ------>");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.println("4. Square");
        System.out.println("5. Rhombus");
        System.out.print("Choose a shape: ");
        int shapeNum = scanner.nextInt();

        try {
            File file = new File("shape.txt");
            FileOutputStream myObj = new FileOutputStream(file, true);
            PrintStream printStream = new PrintStream(myObj);

            

            switch (shapeNum) {
                case 1:
                    Rectangle r1 = new Rectangle();
                    System.out.println("Enter Length= ");
                    double len1 = scanner.nextDouble();
                    System.out.println("Enter Width= ");
                    double wid1 = scanner.nextDouble();
                    r1.setlength(len1);
                    r1.setwidth(wid1);

                    printStream.println("Rectangle Area= " + r1.Area()+" Cm^2");
                    printStream.println("Rectangle Perimeter= " + r1.Perimeter()+" Cm");
                    break;

                case 2:
                    Triangle tr1 = new Triangle();
                    System.out.println("Enter Side 1= ");
                    double s1 = scanner.nextDouble();
                    System.out.println("Enter Side 2= ");
                    double s2 = scanner.nextDouble();
                    System.out.println("Enter Side 3= ");
                    double s3 = scanner.nextDouble();

                    tr1.setSide1(s1);
                    tr1.setSide2(s2);
                    tr1.setSide3(s3);

                    printStream.println("Triangle Area= " + tr1.Area()+" Cm^2");
                    printStream.println("Triangle Perimeter= " + tr1.Perimeter()+" Cm");
                    break;

                case 3:
                    Circle cr1 = new Circle();
                    System.out.println("Enter radius= ");
                    double r = scanner.nextDouble();

                    cr1.setRadius(r);

                    printStream.println("Circle Area= " + cr1.Area()+" Cm^2");
                    printStream.println("Circle Perimeter= " + cr1.Perimeter()+" Cm");
                    break;

                case 4:
                    Square sq1 = new Square();
                    System.out.println("Enter length= ");
                    double len = scanner.nextDouble();

                    sq1.setlength(len);

                    printStream.println("Square Area= " + sq1.Area()+" Cm^2");
                    printStream.println("Square Perimeter= " + sq1.Perimeter()+" Cm");
                    break;

                case 5:
                    Rhombus rho = new Rhombus();
                    System.out.println("Enter diagonal 1: ");
                    double diag1 = scanner.nextDouble();
                    System.out.println("Enter diagonal 2: ");
                    double diag2 = scanner.nextDouble();
                    System.out.println("Enter Side: ");
                    double side = scanner.nextDouble();

                    rho.setdiagonal1(diag1);
                    rho.setdigonal2(diag2);
                    rho.setside(side);

                    printStream.println("Rhombus Area= " + rho.Area()+" Cm^2");
                    printStream.println("Rhombus Perimeter= " + rho.Perimeter()+" Cm");
                    break;

                default:
                    System.out.println("You entered wrong number");
            }

            printStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


}


    private void displayThreeDimensionalShapes() {
        System.out.println("<------ Three-Dimensional Shapes ------>");
        System.out.println("1. Cuboid");
        System.out.println("2. Sphere");
        System.out.println("3. Pyramid");
        System.out.println("4. Cube");
        System.out.print("Choose a shape: ");
        int shapeChoice = scanner.nextInt();

        
       try {
            File file = new File("shape.txt");
            FileOutputStream myObj = new FileOutputStream(file, true);
            PrintStream printStream = new PrintStream(myObj);

        switch (shapeChoice){
          case 1:
          Cuboid cub1=new Cuboid();
           System.out.println("Enter Length: ");
            double len1 = scanner.nextDouble();
            System.out.println("Enter Base: ");
            double base1= scanner.nextDouble();
            System.out.println("Enter Height: ");
            double height1= scanner.nextDouble();
            cub1.setBase(base1);
            cub1.setHeight(height1);
            cub1.setLength(len1);
            printStream.println("Cuboid Volume= " + cub1.Volume()+" Cm^3");
            printStream.println("Cuboid SurfaceArea= " + cub1.SurfaceArea()+" Cm");
            break;

            case 2:
            Sphere sph=new Sphere();
            System.out.println("Enter Radius: ");
            double radius1= scanner.nextDouble();
            sph.setRadius(radius1);
            printStream.println("Sphere Volume= " +sph.Volume()+" Cm^3");
            printStream.println("Sphere SurfaceArea= " +sph.SurfaceArea()+" Cm");
            break;

            case 3:
            Pyramid p1=new Pyramid();
            System.out.println("Enter BaseLength: ");
            double baseLen= scanner.nextDouble();
            System.out.println("Enter Height: ");
            double height2= scanner.nextDouble();
            p1.setHeight(height2);
            p1.setBaseLength(baseLen);
            printStream.println("Pyramid Volume= " +p1.Volume()+" Cm^3");
            printStream.println("Pyramid SurfaceArea= " +p1.SurfaceArea()+" Cm");
            break;

            case 4:
            Cube cu1=new Cube();
            System.out.println("Enter Length:");
            double len2= scanner.nextDouble(); 
            printStream.println("Cube Volume= " +cu1.Volume()+" Cm^3");
            printStream.println("Cube SurfaceArea= " +cu1.SurfaceArea()+" Cm");
            break;
            default:
            System.out.println("You entered wrong number");
            break;
        }
          printStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
    private void displayData(){
            try {
    File file = new File("shape.txt");
    Scanner fileScanner = new Scanner(file);
    while (fileScanner.hasNextLine()) {
        String data = fileScanner.nextLine();
        System.out.println(data);
    }

    fileScanner.close();
    }   
    catch (FileNotFoundException e) {
    System.out.println("File not found: " +e.getMessage());
}
}
 }  