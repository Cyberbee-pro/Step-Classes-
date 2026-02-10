/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package stepclass.step1;
import java.util.*;

/**
 *
 * @author Cyberbee
 */


public class Step1 {
    
public static final Scanner sc = new Scanner(System.in);

    public void main(String[] args) {
        int opt;
        System.out.println("Choose an option");
        System.out.println("0> Exit");
        System.out.println("1> Oops 2>Hi");
        opt= sc.nextInt();
        switch(opt){
            case 0 -> System.exit(0);
            case 1 -> Oops(); 
            case 2 -> Hi(); 
            default -> System.out.println("OPTION OUT OF BOUNDS");
        }
            
        }
    
        public void Oops(){
                    System.out.println("OOPs");

        }
        
        public void Hi(){
                    System.out.println("Hello World!");
        }       
    
}

