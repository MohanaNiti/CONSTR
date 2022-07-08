package Construt;

    import java.util.*;
    public class  A{
        int a,b;

        public void setA(int a) {
            this.a = a;
        }

        public void setB(int b) {
            this.b = b;
        }
        public static int sum(int x, int y)
        {
            int z;

            z=x+y;
            return z;


        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a");
            int a=sc.nextInt();
            System.out.println("Enter b");
            int b=sc.nextInt();
            int sum1=sum(a,b);

            System.out.println("the sum of a &b is" +sum1);
        }
    }


