import java.util.Scanner;
import java.sql.SQLOutput;


public class Bai2 {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        float a,b,c;
        System.out.print("Nhap a: ");
        a = sc.nextFloat();
        System.out.print("Nhap b: ");
        b = sc.nextFloat();
        System.out.print("Nhap c: ");
        c = sc.nextFloat();

        if( (a+b>c) || (a+c>b) || (b+c>a)) {
            System.out.printf("La Tam Giac\n");
            
            if ((a == b) && (b == c) && ( a == c)) {
                System.out.printf("Tam giac deu");
            } else if ((a == b) && (b == c)) {
                System.out.println("Tam giac can ");
            } else if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) {
                System.out.println("Tam giac vuong");
            } else if (((a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a)) && ((a == b) || (b == c) || (a == c))) {
                System.out.println("Tam giac vuong can");
            }
            else if(((a != b) && (b != c) && (c != a)) && ((a * a + b * b != c * c) || (a * a + c * c != b * b) || (b * b + c * c != a * a))
             && ((a != b) && (b != c) && (a == c)) && ((a != b) && (b != c))){
             System.out.println("Tam giac thuong");
            }
        } else{
            System.out.println("Khong phai tam giac");
        }
            
    }
    
}

