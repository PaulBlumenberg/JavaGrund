
package managementsystem;

public class main {

    public static void main(String[] args) {
       
            run();
                
     
    }
    
    
    public static void run(){
        ManagementSystem ms =new ManagementSystem();
       while(ms.loop)      
            ms.menu1();
    }
    
            
}
