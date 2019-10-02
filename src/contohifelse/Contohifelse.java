
package contohifelse;

import java.util.Scanner;

public class Contohifelse {

   
    public static void main(String[] args) {
String Ulasan;
Scanner input =new Scanner(System.in);
 
 System.out.print("Masukkan nombor Pertama:");
 int nom1=input.nextInt();
 
  System.out.print("Masukkan nombor kedua:");
 int nom2=input.nextInt();
 
 if(nom2 >nom1){
     Ulasan="Nombor Kedua adalah lebih besar";
 }else if(nom1 >nom2){
     Ulasan="Nombor pertama adalah lebih besar";
 }else {
     Ulasan="Nombor kedua dan nombor pertama adalah sama besar";
    }
    System.out.println(Ulasan);
    }
}
