import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        float a,b;

        Scanner input = new Scanner(System.in);
        System.out.println("giai phuong trinh ax + b = 0");
        System.out.print("nhap so a = ");
        a=input.nextFloat();
        System.out.print("nhap so b = ");
        b=input.nextFloat();
        System.out.print("Result x = " + (a/b));
    }
}