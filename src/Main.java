//package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Name of employee");

        String employe_name1 = scan.next();
        System.out.println("Below Choose an Employee Paying method!");

        System.out.println("Monthly(1), Hourly(2) ,Weekly(3)");
        int payment = scan.nextInt();

switch (payment)
{
    case 1:
        System.out.println("Insert Amount Earned per day");
        double salary = scan.nextInt();

        double grossSalary = salary * 30;  //30days
        double deduction = (salary * 30)/100;
        double completion = (salary *2)/100;

        salary = grossSalary + completion - deduction ;
        System.out.println("Dear " +employe_name1 +  " your salary per month is " +salary);
    break;
    case 2:
        System.out.println("Insert Amount gained for full hours");
        salary = scan.nextInt();
        System.out.println("Please Enter number of hour ");
        int hour = scan.nextInt();

        double hourRate = salary / 12 ;  //12hours
         deduction = (salary * 30) / 100;
        double tax = (salary * 3) / 100;

        salary = (hourRate * hour ) - deduction -  tax;
        System.out.println("hello " +employe_name1 +  " your available salary is " +salary);
        break;
    case 3:
        System.out.println("enter his/her salary Amount per day");
         salary = scan.nextInt();

        salary = (salary * 7 );
        System.out.println("hello " +employe_name1 +  " your available salary  per week is " +salary);
        break;
        default:
            System.out.println("Enter correct payment method");
            break;
}

    }
}

