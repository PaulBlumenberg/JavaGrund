package mymain;
import java.util.Scanner;


public class MyMain {
static Scanner sc = new Scanner(System.in); 
static boolean loop = true;
    



    public static void main(String[] args) {
        try {
      while (loop) {  

        menuShape(mainMenu());
                     
        }
        } catch (Exception e) {
            System.out.println("FEL! Du har matat in något konstigt... "); 
        }
    }
    
  // Metoder börjar
    public static int mainMenu() {
     System.out.println("\n1. Circle");
     System.out.println("2. Triangle");
     System.out.println("3. Rectangle"); 
     System.out.println("0. Exit");
     System.out.println("\nMake a choice");
     int choice = sc.nextInt();
     sc.nextLine();
      return choice;
    }
    
 
    public static void menuShape(int val) {
        switch (val) { // sw + tab. 
        case 1:
            System.out.println("1. Circle");
            menuCalcCir();
            break;
                
        case 2:
            System.out.println("2. Triangle");
            menuCalcTri();
            break;
        case 3:
            System.out.println("3. Rectangle");
            menuCalcRec(); 
            break;

             case 0: // Exit
                 System.out.println("System shutting down....");
               loop = false;
                break;

            default:
                 System.out.println("Alternativen är 1, 2 eller 3");     
        }
        //return val;
    }
    
// Meny och uträkning för Rectangle.
           public static int menuCalcRec() {
            System.out.println("Välj funktion för uträkning av en -rektangel- \n");
            System.out.println("1. Omkrets");
            System.out.println("2. Area");
            System.out.println("3. Both"); 
            System.out.println("\nMake a choice");
            int choice = sc.nextInt();
            sc.nextLine(); // Bugg i nextInt. Löses genom att lägga in en nextLine rad efter. 
           
            calcRectangle(choice);
             return choice;
           }
           
           public static void calcRectangle(int val) {
               Rectangle r = new Rectangle(0, 0);
               System.out.println("Ange basen: ");
                Double base= sc.nextDouble();
                 r.setBase(base);      
                System.out.println("Ange höjden : ");
                Double height= sc.nextDouble();
                 r.setHeight(height);
               
               switch (val) {
                   case 1:
                       System.out.println("Omkretsen är: "+ r.omkrets());
                       break;
                       
                   case 2:
                       
                       System.out.println("Arean är: "+ r.area());
                       break;
                       
                   case 3:
                    System.out.println("Area är: "+ r.area() + " Omkrets är: " +r.omkrets());
                           break;
                           
                   
                   default:  System.out.println("Alternativen är 1, 2 eller 3");     
                       
                       
               }
           }
         
                                
           // Meny och uträkning för Circle.
           
               public static int menuCalcCir() {
            System.out.println("Välj funktion för uträkning av en -cirkel- \n");
            System.out.println("1. Omkrets");
            System.out.println("2. Area");
            System.out.println("3. Both"); 
            System.out.println("\nMake a choice");
            int choice = sc.nextInt();
            sc.nextLine(); // Bugg i nextInt. Löses genom att lägga in en nextLine rad efter. 
            calcCircle(choice);
             return choice;
           }

           public static void calcCircle(int val) {
            
               
               Circle  c = new Circle(0);
               
               System.out.println("Ange radien: ");
                Double radie= sc.nextDouble();
                 c.setRadie(radie);      
               
               switch (val) {
                   case 1:
                       System.out.println("Omkretsen är: "+ c.omkrets());
                       break;
                       
                   case 2:
                       
                       System.out.println("Arean är: "+ c.area());
                       break;
                       
                   case 3:
                    System.out.println("Area är: "+ c.area() + " Omkrets är: " +c.omkrets());
                           break;
                           
                   
                   default:  System.out.println("Alternativen är 1, 2 eller 3");     
                }
         }
           public static int menuCalcTri() {
            System.out.println("Välj funktion för uträkning av en -triangle- \n");
            System.out.println("1. Omkrets");
            System.out.println("2. Area");
            System.out.println("3. Both"); 
            System.out.println("\nMake a choice");
            int choice = sc.nextInt();
            sc.nextLine(); // Bugg i nextInt. Löses genom att lägga in en nextLine rad efter. 
           
            calcTriangle(choice);
             return choice;
           }
           
            public static void calcTriangle(int val) {
                Triangle t = new Triangle(0, 0);
               System.out.println("Ange basen: ");
                Double base= sc.nextDouble();
                 t.setBase(base);      
                System.out.println("Ange höjden : ");
                Double height= sc.nextDouble();
                 t.setHeight(height);
              
               
                switch (val) {
                   case 1:
                       System.out.println("Omkretsen är: "+ t.omkrets());
                       break;
                       
                   case 2:
                       
                       System.out.println("Arean är: "+ t.area());
                       break;
                       
                   case 3:
                    System.out.println("Area är: "+ t.area() + " Omkrets är: " +t.omkrets());
                           break;
                           
                   
                   default:  System.out.println("Alternativen är 1, 2 eller 3");     
                       
                       
               }
                             
              
            }
      
    }

