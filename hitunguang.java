import java.util.Scanner;
 
public class Main {
 
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Masukkan Nominal Uang Kertas: ");
      int nominal = scanner.nextInt();
 
      int pecahan50 = nominal / 50000;
      int sisaPecahan = nominal % 50000;
 
      int pecahan20 =  sisaPecahan / 20000;
      sisaPecahan = sisaPecahan % 20000;
 
      int pecahan10 = sisaPecahan / 10000;
      sisaPecahan = sisaPecahan % 10000;
 
      int pecahan5 = sisaPecahan / 5000;
      sisaPecahan = sisaPecahan % 5000;
 
      System.out.println("Uang Kertas 50000: " + pecahan50);
      System.out.println("Uang Kertas 20.000: " + pecahan20);
      System.out.println("Uang Kertas 10.000: " + pecahan10);
      System.out.println("Uang Kertas 5.000: " + pecahan5);
      System.out.println("Uang Kertas Sisa: " + sisaPecahan);
   }
}