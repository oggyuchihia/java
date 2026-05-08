import java.util.Scanner;
public class main13 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("pls enter a number");
        int n=scn.nextInt();
        for (int i=2;i*i <=n;i++){
            while(n%i==0){
                n=n/i;
                System.out.print(i+" ");
            }
        }
        if(n!=1){
            System.out.print(n);
        }
    }
}
