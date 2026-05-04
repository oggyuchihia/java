import java.util.Scanner;
public class main11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number ;
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;
        do{
            System.out.println("enter the num");
            number=sc.nextInt();
            if (number>max){
                max=number;
            }
            if (number<min){
                min=number;
            }
            System.out.println("do u wnt to continue?");
            choice=sc.next().charAt(0);
        }
        while(choice=='y');
        System.out.println("Largest number ");
    }
}
