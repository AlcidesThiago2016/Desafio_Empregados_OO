package devsuperior.application;

import devsuperior.entities.Andress;
import devsuperior.entities.Department;
import devsuperior.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String naDep = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        Integer payDay = sc.nextInt();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Telefone: ");
        Integer phone = sc.nextInt();

        Andress andress = new Andress(email, phone);
        Department department = new Department(naDep, payDay, andress );

        System.out.print("Quantos funcionarios tem o departamento? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Dados do funcionario " + (i+1) + ":");
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salario: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(name, salary);

            department.addEmployee(employee);
        }

        System.out.println();
        showReport(department);


        sc.close();
    }

    private static void showReport(Department department){
        System.out.println(department);
    }
}
