import java.util.*;
class Main {
    public static void main(String[] args) {
     int []a=new int[5];
     int sum=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the values into array");
     for(int i=0;i<a.length;i++)
     {
         a[i]=sc.nextInt();
     }
     for(int i=0;i<a.length;i++)
     {
         sum=sum+a[i];
     }
     
         System.out.println(" "+sum);
    }
}