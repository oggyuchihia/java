class Person{
    private String name;
    private int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    String getname(){
        return name;
    }
    int getage(){
        return age;
    }
}
class Student extends Person{
    private String major;
    Student(String name,int age,String major){
        super(name,age);
        this.major=major;
    }
    String getmajor(){
        return major;
    }
}

class Book {
    private String title;
    private String author;
    private int numofpages;

    Book(String t,String a,int np){
        this.title=t;
        this.author=a;
        this.numofpages=np;
    }
    public String gettitle(){
        return title;
    }
    public String getauthor(){
        return author;
    }
    public int getnumofpages(){
        return numofpages;
    }
}

class practice1{
    public static void main(String[] args){
        Student s=new Student("Bhishm",9,"science");
        Book b=new Book("Jurrasic park","Michael Crichton",400);
        System.out.println(s.getname());
        System.out.println(s.getage());
        System.out.println(s.getmajor());

        System.out.println("Book information:");
        System.out.println("Title:"+b.gettitle());
        System.out.println("Author:"+b.getauthor());
        System.out.println("Number of pages:"+b.getnumofpages());
    }
}