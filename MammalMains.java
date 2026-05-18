class Mammals{
    void mam(){
        System.out.println("Inside mammals class");
    }
}
class Lion extends Mammals{
    void roar(){
        System.out.println("Inside Lion Class");
    }
}
class Human extends Mammals{
    void hum(){
        System.out.println("Inside Human Class");
    }
}
public class MammalMains{
    public static void main(String[] args){
        Lion obj=new Lion();
        obj.mam();
        obj.roar();
    }
}