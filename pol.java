class hillstation {
    void location(){
        System.out.println("location is");
    }
    void famousfor(){
        System.out.println("Famous for");
    }
}
class Manali extends hillstation{
    void location (){
        System.out.println("Manali is in himachal pradesh");
    }
    void famousfor(){
        System.out.println("It is Famous for Hadimba Temple and adventure sports");
    }
}

class Mussoorie extends hillstation {
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    void famousfor() {
        System.out.println("It is Famous for education institutions");
    }
}

class Gulmarg extends hillstation {
    void location() {
        System.out.println("Gulmarg is in J&K");
    }

    void famousfor() {
        System.out.println("It is Famous for skiing");
    }
}
class pol{
    public static void main(String[] args){
        hillstation h=new hillstation();
        hillstation m=new Manali();
        hillstation mu=new Mussoorie();
        hillstation g=new Gulmarg();

        h.location();
        h.famousfor();
        m.location();
        m.famousfor();
        mu.location();
        mu.famousfor();
        g.location();
        g.famousfor();
    }
}