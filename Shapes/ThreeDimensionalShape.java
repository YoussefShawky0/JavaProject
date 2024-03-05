package Shapes;

abstract class ThreeDimensionalShape extends Shapes {
    @Override
    double Area() {
    System.out.println("Not available for three dimensional");
    return 0.0;
    }  
    @Override
    double Perimeter() {
    System.out.println("Not available for three dimensional");
    return 0.0;
    }
};

class Cube extends ThreeDimensionalShape{
    private double length;
    Cube(){
        this.length=0.0;
    }
    Cube(double length){
        this.length=length;
    }
    void setlength(double length){
        this.length=length;
    }
    double getLength(){
        return length;
    }
    @Override
    double Volume(){
        return(length * length * length);
    }
    @Override
    double SurfaceArea(){
        return(6*(length*length));
    }
}

 class Pyramid extends ThreeDimensionalShape {
  private double BaseLength;
  private double height;

   Pyramid(){
    this.BaseLength=0.0;
    this.height=0.0;
   }

   Pyramid(double baseLength, double height) {
    this.BaseLength = baseLength;
    this.height = height;
   }
   public double getBaseLength() {
    return BaseLength;
   }
   public void setBaseLength(double baseLength) {
    this.BaseLength = baseLength;
  }

   public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

    @Override
  double Volume(){
    return((BaseLength*BaseLength)*(height/3)); 
  }
    @Override
  double SurfaceArea(){
    return((BaseLength*BaseLength)+(2*BaseLength*(Math.sqrt(((BaseLength*BaseLength)/4)+(height*height)))));
 }
}

class Sphere extends ThreeDimensionalShape{
    private double radius;
    Sphere(){
        this.radius=0.0;
    }
    Sphere(double radius){
        this.radius = radius;
    }
    void setRadius(double radius){
        this.radius=radius;
    }
    double getRadius(){
        return radius;
    }
        @Override
        double Volume(){
            return(((4/3)*(Math.PI)*(radius*radius*radius)));
        }
        @Override
        double SurfaceArea(){
            return(4*(Math.PI*(radius*radius)));
        }
}
    class Cuboid extends ThreeDimensionalShape{
    private double length;
    private double base;
    private double height;
    Cuboid(){
        this.length=0.0;
        this.height=0.0;
        this.base=0.0;
    }
    Cuboid(double length , double base , double height){
        this.length = length;
        this.base = base;
        this.height = height;
    }

    double getLength(){
        return length;
    }

    double getBase(){
        return base;
    }
    double getHeight(){
        return height;
    }

    void setLength(double length){
        this.length=length;
    }

    void setBase(double base){
        this.base=base;
    }

    void setHeight(double height){
        this.height= height;
    }

    @Override
    double Volume(){
        return(length * base* height);
    }
    
    @Override
    double SurfaceArea(){
        return(2 *( (length*base) + (base*height) + (length*height) ));
    }
}
