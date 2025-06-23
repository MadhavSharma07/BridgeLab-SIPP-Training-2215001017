public class Employee{
    int id;
    String name;
    double salary;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id = 10;
        employee.name = "Madhav";
        employee.salary = 10000000;
        employee.printEmployee(employee.id,employee.name,employee.salary);
    }

    public void printEmployee(int id,String name, double salary){
        System.err.println("The employee's id is:"+id);
        System.err.println("The employee's name is:"+name);
        System.out.println("The employee's salary is:"+salary);
    }
}