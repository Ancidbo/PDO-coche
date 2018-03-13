
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
     public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
         
         coche coche1 = new coche("rojo", false, "Ford", "GF-GT-025",6);
         coche coche2 = new coche("negro", false, "Audi", "FD-GDF-258",1);
         coche coche3 = new coche("dorado", true, "Lamborghini", "MNK-YHT-IY",0);
         coche coche4 = new coche("Azul", false, "Bentley", "ISZ-05-36",7);
         coche coche5 = new coche("Verde", false, "Suzuky", "GF-JU-12-89",10);
        
       
         ArrayList<coche> auto = new ArrayList();
         auto.add(coche1);
         auto.add(coche2);
         auto.add(coche3);
         auto.add(coche4);
         auto.add(coche5);
         
         System.out.println("cuantos pasajeros viajan");
         int pasa=sc.nextInt();
         coche1.personas(pasa);
         
         auto.forEach((uno) -> {
             System.out.println(uno);
         });
         
     }
   
   
}
