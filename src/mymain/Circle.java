package mymain;

class Circle {
    
    static final int two = 2;
    private final double PI = 3.14;
    private double radie;
    
    public Circle(double radie) {
        this.radie = radie;
    }
       
    public double getRadie() {
        return radie;
    }
     
    public void setRadie(double radie) {
        this.radie = radie;
    }
    
    public double area() {
        double area = radie * radie * PI;
        return area;
    }
    
    public double omkrets() {
        double omkrets = two * PI * radie;
        return omkrets;
    }
            
}
