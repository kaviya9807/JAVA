import java.util.Scanner;

class Employee {
    String empName, empId, address, mailId, mobileNo;
    double basicPay;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        empId = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Mail ID: ");
        mailId = sc.nextLine();
        System.out.print("Enter Mobile No: ");
        mobileNo = sc.nextLine();
        System.out.print("Enter Basic Pay: ");
        basicPay = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + empName);
        System.out.println("ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("Basic Pay: " + basicPay);
    }
}

class Programmer extends Employee {
    void generatePaySlip() {
        double da = basicPay * 97 / 100;
        double hra = basicPay * 10 / 100;
        double pf = basicPay * 12 / 100;
        double staffClub = basicPay * 1 / 100;
        double gross = basicPay + da + hra;
        double net = gross - pf - staffClub;
        displayDetails();
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}

class AssistantProfessor extends Employee {
    void generatePaySlip() {
        double da = basicPay * 110 / 100;
        double hra = basicPay * 20 / 100;
        double pf = basicPay * 12 / 100;
        double staffClub = basicPay * 5 / 100;
        double gross = basicPay + da + hra;
        double net = gross - pf - staffClub;
        displayDetails();
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}

class AssociateProfessor extends Employee {
    void generatePaySlip() {
        double da = basicPay * 130 / 100;
        double hra = basicPay * 30 / 100;
        double pf = basicPay * 12 / 100;
        double staffClub = basicPay * 10 / 100;
        double gross = basicPay + da + hra;
        double net = gross - pf - staffClub;
        displayDetails();
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}

class Professor extends Employee {
    void generatePaySlip() {
        double da = basicPay * 140 / 100;
        double hra = basicPay * 40 / 100;
        double pf = basicPay * 12 / 100;
        double staffClub = basicPay * 15 / 100;
        double gross = basicPay + da + hra;
        double net = gross - pf - staffClub;
        displayDetails();
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}

public class EmployeePaySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Designation:");
        System.out.println("1. Programmer");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Professor");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Programmer prog = new Programmer();
                prog.getDetails();
                prog.generatePaySlip();
                break;
            case 2:
                AssistantProfessor ap = new AssistantProfessor();
                ap.getDetails();
                ap.generatePaySlip();
                break;
            case 3:
                AssociateProfessor asp = new AssociateProfessor();
                asp.getDetails();
                asp.generatePaySlip();
                break;
            case 4:
                Professor prof = new Professor();
                prof.getDetails();
                prof.generatePaySlip();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
