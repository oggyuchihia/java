class Parent{
    int age, id;
    String name;

    void naming(String name){
        System.out.println("Name"+name);
    }
}
class Child extends Parent{
    void ageN(int age){
        System.out.println("Age of student is:"+ age);
    }
}
public class StudentMain{
    public static void main(String[] args){
        Child s=new Child();
        s.naming("Aisha");
        s.ageN(14);
    }
}