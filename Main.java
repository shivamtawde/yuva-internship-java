class Employee{
    public void calculateSalary(double baseSalary){
        System.out.println("Employee base salary = " + baseSalary);
    }
}
class Manager extends Employee{
    public void calculateSalary(double baseSalary){
        
    System.out.println("Manager salary with bonus: " + managerSalary);  
   }
}
class Developer extends Employee{
    public void calculateSalary(double baseSalary){
        
        System.out.println("Developer salary with incentive: " + developerSalary);
    }
}
public class Main{
    public static void main(String[] args){
        Employee emp = new Employee();
        Manager mgr = new Manager();
        Developer dev = new Developer();
        emp.calculateSalary(5000);
    ;


    }
}