import java.util.Scanner;

class application{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter two numbers");
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=x/y;
        }
        catch(ArithmeticException ex){
            System.out.println(ex.toString());
        }
        finally{
            System.out.println("Designed and developed by Bhishm Mori");
        }
        System.out.println("Done");
    }

}