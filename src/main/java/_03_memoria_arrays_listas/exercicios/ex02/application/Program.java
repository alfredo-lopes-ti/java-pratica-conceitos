package _03_memoria_arrays_listas.exercicios.ex02.application;

import java.util.Locale;
import java.util.Scanner;

import _03_memoria_arrays_listas.exercicios.ex02.entities.Employee;

import java.util.List;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Primeira parte - capturando e imprimindo os dados

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + ":");
            System.out.println("Enter the id: ");
            Integer id = sc.nextInt();
            System.out.println("Enter the name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Enter the salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        // Segunda parte - 

        System.out.println("Enter the employee id that will have salary increase: ");
        int idsalary = sc.nextInt();
        Integer pos = hasId(list, idsalary);
        if (pos == null) {
            System.out.println("The id does not exist! ");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employee: ");

        for (Employee emp : list) {
            System.out.println(emp);
        }




        sc.close();
    }

    public static Integer hasId(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}