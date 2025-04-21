import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter a value");
       int a=sc.nextInt();
       System.out.print("enter b value");
       int b=sc.nextInt();
       System.out.print("enter your choice");
       int ch=sc.nextInt();
       switch(ch)
       {
            case 1:
              sum(a,b);
              break;
            
            case 2:
              sub(a,b);
              break;  
            case 3:
              mul(a,b);
              break; 
            case 4:
              div(a,b);
              break;  
            default:
              System.out.print("invalid choice");
       }
       
       
       
    }
    public static void sum(int a,int b)
    {
        int c=a+b;
        System.out.print(c);
    }
     public static void sub(int a,int b)
    {
        int c=a-b;
        System.out.print(c);
    }
     public static void mul(int a,int b)
    {
        int c=a*b;
        System.out.print(c);
    }
     public static void div(int a,int b)
    {
        int c=a/b;
        System.out.print(c);
    }
}