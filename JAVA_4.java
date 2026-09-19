package ITC.exercise4;

import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;

    Student(int id , String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}

public class JAVA_4 {

    static Scanner input = new Scanner(System.in);

    static void displayStudents(Student[] students, int count) {

        System.out.println("==============================================");
        System.out.println("| No | ID  | Name             | Age          |");
        System.out.println("==============================================");

        for (int i = 0; i < count; i++) {

            System.out.printf("| %-2d | %-3d | %-16s | %-12d |\n",
                    i + 1,
                    students[i].getId(),
                    students[i].getName(),
                    students[i].getAge());
        }

        System.out.println("==============================================");
    }

    public static void main(String[] args) {
        Student[] students = new Student[100];

        int count =0;
        String choice;

        do{
            System.out.println("Stduent #" + (count+1));
            System.out.print("ID: ");
            int id = input.nextInt();

            System.out.print("Name: ");
            String name = input.next();

            System.out.print("Age: ");
            int age = input.nextInt();

            students[count] = new Student(id, name, age);

            count++;

            System.out.println(" ");
            System.out.println("Do you want to add more (y/n)?: ");
            choice = input.next();
        }while(choice.equalsIgnoreCase("y"));

        displayStudents(students, count);

        input.close();
    }
}
