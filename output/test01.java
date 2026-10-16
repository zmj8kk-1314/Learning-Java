import java.util.Scanner;
public class test01{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double price=input.nextDouble();
        int count=input.nextInt();
        double amount=price*count;
        System.out.println("数量："+count);
        System.out.printf("金额：%.2f%n",amount);
    }
}