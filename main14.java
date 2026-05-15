class employee{
    int emplo;
    String name;
    float sal;

    employee(){
        emplo=98;
        name="Bhishm";
        sal=55000f;
    }
    void display_details(){
        System.out.println(emplo+" / "+ name+" / "+sal);
    }
}
class main14{
    public static void main(String[] args){
        employee emp1=new employee();
        employee emp2 = new employee();
        employee emp3 = new employee();

        emp1.display_details();
        emp2.display_details();
        emp3.display_details();
    }
}