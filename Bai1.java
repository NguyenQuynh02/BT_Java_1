import java.sql.SQLOutput;
import java.util.Scanner;
public class Bai1{
    public static void main (String[] args){
        int Ngay, Thang;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhap ngay sinh: ");
        Ngay = sc.nextInt();
        System.out.print("Nhap thang sinh: ");
        Thang = sc.nextInt();
        
        if(Ngay >= 20 && Ngay <= 31 && Thang ==1 || Ngay >= 18 && Ngay <= 18 && Thang ==2)
            System.out.println(Ngay +"/" + Thang + " cung Bao Binh");
        if(Ngay >= 19 && Ngay <= 29 && Thang ==2 || Ngay >= 1 && Ngay <= 20 && Thang ==3)
            System.out.println(Ngay +"/" + Thang + " cung Song Ngu");
        if(Ngay >= 21 && Ngay <= 31 && Thang ==3 || Ngay >= 1 && Ngay <= 20 && Thang ==4)
            System.out.println(Ngay +"/" + Thang + " cung Bach Duong");    
        if(Ngay >= 21 && Ngay <= 30 && Thang ==4 || Ngay >= 1 && Ngay <= 20 && Thang ==5)
            System.out.println(Ngay +"/" + Thang + " cung Kim Nguu"); 
        if(Ngay >= 21 && Ngay <= 31 && Thang ==5 || Ngay >= 1 && Ngay <= 21 && Thang ==6)
            System.out.println(Ngay +"/" + Thang + " cung Song Tu");  
        if(Ngay >= 22 && Ngay <= 30 && Thang ==6 || Ngay >= 1 && Ngay <= 22 && Thang ==7)
            System.out.println(Ngay +"/" + Thang + " cung Cu Giai"); 
        if(Ngay >= 23 && Ngay <= 31 && Thang ==7 || Ngay >= 1 && Ngay <= 20 && Thang ==8)
            System.out.println(Ngay +"/" + Thang + " cung Su Tu");  
        if(Ngay >= 23 && Ngay <= 31 && Thang ==8 || Ngay >= 1 && Ngay <= 22 && Thang ==9)
            System.out.println(Ngay +"/" + Thang + " cung Xu Nu");  
        if(Ngay >= 23 && Ngay <= 30 && Thang ==9 || Ngay >= 1 && Ngay <= 23 && Thang ==10)
            System.out.println(Ngay +"/" + Thang + " cung Thien Binh");  
        if(Ngay >= 24 && Ngay <= 31 && Thang ==10 || Ngay >= 1 && Ngay <= 22 && Thang ==11)
            System.out.println(Ngay +"/" + Thang + " cung Bo Cap");  
        if(Ngay >= 23 && Ngay <= 30 && Thang ==11 || Ngay >= 1 && Ngay <= 21 && Thang ==12)
            System.out.println(Ngay +"/" + Thang + " cung Nhan Ma"); 
        if(Ngay >= 22 && Ngay <= 31 && Thang ==12 || Ngay >= 1 && Ngay <= 19 && Thang ==1)
            System.out.println(Ngay +"/" + Thang + " cung Ma Ket");                 

    }

}