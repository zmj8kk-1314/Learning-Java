public class test03 {
    public static void main(String[] args) {
        Employee [] staff = new Employee[3];
        staff[0] = new Employee("小王",6000);
        staff[1] = new Developer("小林",6000,1000);
        staff[2] = new SalesEmployee("小周",5000,40000,0.10);
        double allmoney = calculateTotal(staff);
        System.out.println(allmoney);
        staff[1].setBaseSalary(6500);
        allmoney = calculateTotal(staff);
        System.out.println(allmoney);
    }
    public static double calculateTotal(Employee[] staff){
        double allsalary=0.0;
        for(Employee employee : staff){
            allsalary += employee.calculateSalary();
            System.out.println(employee.getName());
            System.out.println(employee.calculateSalary());
        }
        return allsalary;
    }
}
    class Employee{
        private String name;
        private double baseSalary;
        Employee(String name,double baseSalary){
            this.name=name;
            this.baseSalary=baseSalary;
        }
        public String getName(){
            return name;
        }
        public double calculateSalary(){
            return baseSalary;
        }
        public void setBaseSalary(double baseSalary){
            this.baseSalary=baseSalary;
        }
    }
    class Developer extends Employee{
        private double bonus;
        Developer(String name,double baseSalary,double bonus){
            super(name,baseSalary);
            this.bonus=bonus;
        }
        @Override
        public double calculateSalary(){
            return super.calculateSalary()+bonus;
        }
    } 
    class SalesEmployee extends Employee{
        private double salesAmount;
        private double commissionRate;
    SalesEmployee(String name,double baseSalary,double salesAmount,double commissionRate){
        super(name,baseSalary);
        this.salesAmount=salesAmount;
        this.commissionRate=commissionRate;
    }
    @Override
    public double calculateSalary(){
        return super.calculateSalary()+salesAmount*commissionRate;
    }
    }
