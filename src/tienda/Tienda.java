package tienda;                     
import java.util.Scanner;
public class Tienda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PurchaseItem a1=new PurchaseItem();
        
        WeighedItem p1=new WeighedItem("Piña",3.45,10.25);
        CountedItem c1=new CountedItem("Libretas",10,45);
        
        System.out.println("El total de su compra:");
        System.out.println(p1);
        System.out.println(c1);
    }
}
