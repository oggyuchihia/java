interface myinterface  {
    public void method1();
    public void method2();
}
public class inter implements myinterface{
    public void method1(){
        System.out.println("implementation of method 1");
    }
    
    public void method2() {
        System.out.println("implementation of method 2");
    }
    public static void main(String[] args){
        myinterface obj=new inter();
        obj.method1();
        obj.method2();
    }
}
