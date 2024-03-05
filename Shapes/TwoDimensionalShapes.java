package Shapes;

abstract class TwoDimensionalShape extends Shapes {
    @Override
    double Volume() {
    System.out.println("Not available for two dimensional");
    return 0.0;
    }  
    @Override
    double SurfaceArea() {
    System.out.println("Not available for two dimensional");
    return 0.0;
    }
};
 

 class Rectangle extends TwoDimensionalShape {
    private double length;
    private double width;

    Rectangle (double length , double width){
            this.length=length;
            this.width=width;
        }
         Rectangle(){
            this.width=0.0;
            this.length=0.0;
        }

         double getLength() {
            return length;
        }
    
         double getWidth() {
            return width;
        }
        
         void setwidth(double width){
            this.width=width;
        }
    
         void setlength(double length){
            this.length=length;
        }
        
        @Override
         double Area()
         {
            return (length * width);
        }
         @Override
         double Perimeter() {
            return 2 * (length + width);
        }
    
}

class Triangle extends TwoDimensionalShape{
    private double s1;
    private double s2;
    private double s3;
    
    Triangle(){
        this.s1=0.0;
        this.s2=0.0;
        this.s3=0.0;
    }

    Triangle(double side1,double side2,double side3){
        this.s1 = side1;
        this.s2 = side2;
        this.s3 = side3;
    }
    void setSide1(double side1){
        this.s1=side1;
    }
    void setSide2(double side2){
        this.s2=side2;
    }
    void setSide3(double side3){
        this.s3=side3;
    }
    double getSide1(){
        return s1;
    }
    double getSide2(){
        return s2;
    }
    double getSide3(){
        return s3;
    }
    @Override
    double Area(){
        return(s1 * s2 * s3);
    }
    @Override
    double Perimeter(){
        return(s1 + s2 + s3);
    }
}


class Square extends TwoDimensionalShape{
    private double length;
    
    Square(){
        this.length=0.0;
    }
    Square(double length){
        this.length=length;
    }
     
    void setlength(double length){
        this.length=length;
    }
    double getLength(){
        return length;
    }
    @Override
    double Area(){
        return(length*length);
    }
    @Override
    double Perimeter(){
        return(4*length);
    }
}

class Circle extends TwoDimensionalShape{
     double radius;

     double getRadius(){
        return radius;
    }

     void setRadius(double radius){
        this.radius = radius;
    }
    
     double Area(){
        return (Math.PI * (radius * radius));
    }

     double Perimeter(){
        return(2 * Math.PI * radius);
    }
}
class Rhombus extends TwoDimensionalShape{
    private double diagonal1;
    private double diagonal2;
    private double side;
    Rhombus(){
        this.diagonal1=0.0;
        this.diagonal2=0.0;
        this.side=0.0;
    }
    Rhombus(double diagonal1 , double diagonal2 , double side){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.side = side;
    }
    double getDiagonal1(){
        return diagonal1;
    }
    double getDiagonal2(){
        return diagonal2;
    }
    double getSide(){
        return side;
    }    
    void setdiagonal1(double diagonal1){
        this.diagonal1=diagonal1;
    }
    void setdigonal2(double diagonal2){
        this.diagonal2=diagonal2;
    }
    void setside(double side){
        this.side=side;
    }
    @Override
    double Area(){
        return(0.5*diagonal1*diagonal2);
    }
    @Override
    double Perimeter(){
        return(4*side);
    }
}