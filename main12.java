import java.util.Scanner;
public class main12 {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.print("please enter a number");
        int n=scn.nextInt();
        
        int count=0;
        for(int i=2;i*i<=n;i++){
            if (n%i==0){
                count++;
                break;
            }
        }
        if(n<-1){
            System.out.println("not prime");
        }else if (count==0){
              System.out.println(" prime");
        }else{
              System.out.println("not prime");
        }
    }
}



