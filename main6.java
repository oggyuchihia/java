import java.util.Scanner;
public class main6 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks:");
        int marks=sc.nextInt();
        if (marks>90){
            System.out.println("O grade");
        }
        else if (marks>80 && marks<=90){
            System.out.println("A grade");
        }
        else if (marks>70 && marks<=80){
            System.out.println("B grade");
    }
}
}