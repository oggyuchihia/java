public class counter {
    static int number=12;
    void increment(){
        number=number+1;

    }
    public static void main(String[] args){
        counter bj1=new counter();
        counter bj2 = new counter();
        counter bj3 = new counter();

        bj1.increment();
        bj2.increment();
        bj3.increment();

        System.out.println(bj1.number);
        System.out.println(bj2.number);
        System.out.println(bj3.number);

    }
}
