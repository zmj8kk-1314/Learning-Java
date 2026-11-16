public class Test03 {
    public static void main(String[] args) {
        Employee e = new Employee("小王", 6000);
        Developer a = new Developer("小林", 6000, 1000);
        Developer b = new Developer("小周", 8000, 2000);

        System.out.println(e.getName() + "：" + e.calculateSalary());
        System.out.println(a.getName() + "：" + a.calculateSalary());
        System.out.println(b.getName() + "：" + b.calculateSalary());

        a.setBaseSalary(6500);

        System.out.println(a.getName() + "：" + a.calculateSalary());
        System.out.println(b.getName() + "：" + b.calculateSalary());
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

