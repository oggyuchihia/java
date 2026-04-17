public class main2 {
    public static void main(String[] args){
        int a=7;
        int b=10;
        System.out.println("uninary operator"+(a++));
        System.out.println("uninary operator"+(++b));
        System.out.println("binary operator");
        System.out.println("1+2"+1+2);
        System.out.println("1+2" + (1 + 2));
        System.out.println(1+2 + "1 + 2");
        int result=++a * b++;
        System.out.println(result);
        System.out.println("ternary operator");
        int largest_num=(b>a)?b:a;
        System.out.println(largest_num);
    }
}
