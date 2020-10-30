package mymain;





public class Rectangle {

private double base;
private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    
    public double area() {
        double area = base*height;
        
        return area;
    }
    
    public double omkrets() {
     Double omkrets = 2*(base+height);
        return omkrets;
    }
    

    

        

 }
