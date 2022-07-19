import java.util.Scanner;
public class Bai3 {
    public static void main (String[] args){
    Scanner sc =  new Scanner(System.in);
    int n;
    System.out.print("Nhap n : ");
    n = sc.nextInt();
    int  sum = 1 + n;
    for ( int i = 2; i<n ;i++){
        if (n % i ==0){
            sum += i;
        }
    }
    System.out.println("Tong uoc cua "+ n + " = " + sum);

    }
}