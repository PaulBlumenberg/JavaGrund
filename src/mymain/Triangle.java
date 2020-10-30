package mymain;
import java.lang.Math;

public class Triangle {

  private double base, height;

  public Triangle(double base, double height){
    this.base = base;
    this.height = height;
  }

  public double getBase(){
    return base;
  }

  public double getHeight(){
    return height;
  }

  public void setBase(double base){
    this.base = base;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public double area(){
    return (base * height)/2;
  }

  public double omkrets(){
    return Math.sqrt(base*base + height*height);
  }
}
