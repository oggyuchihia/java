abstract class objects {
    abstract void showshape();
    public void shape (){
        System.out.println("i am from abstract class");
    }
}
class sphere extends objects{
    void showshape(){
        System.out.println("object type is sphere");
    }
}

class cuboid extends objects {
    void showshape(){
        System.out.println("object type is cuboid");
    }
}

class prism extends objects {
    void showshape(){
        System.out.println("object type is prism");
    }
}
class abs{
    public static void main(String[] args){
        objects obj = new sphere();
        obj.shape();
        obj.showshape();
         obj = new cuboid();
        obj.shape();
        obj.showshape();
         obj = new prism();
        obj.shape();
        obj.showshape();
    }
}