class Animal{
    void eat(){
        System.out.println("Eating animal class eat method");
    }
}
class Lion extends Animal{
    void roar(){
        System.out.println("roar lion class roar method");
    }
}
class Babylion extends Lion{
    void weep(){
        System.out.println("weeping baby lion class weep method");
    }
}
public class AnimalMain{
    public static void main(String[] args){
    Babylion obj=new Babylion();
    obj.weep();
    obj.roar();
    obj.eat();
    }
}