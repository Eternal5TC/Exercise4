import java.util.Scanner;

class DataStudent{
    private int id;
    private String name;
    private int age;

    DataStudent(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void setValue(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public int getId() {
        return id;
    }
    public int getAge(){
        return age;
    }
    public String getName() {
        return name;
    }
}

public class JAVA_7 {

    static Scanner input = new Scanner(System.in);
    static DataStudent[] student = new DataStudent[100];
    static int count = 0;

    static void createStudent(){
        System.out.println("student #"+ (count+1));
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        System.out.print("Enter Name: ");
        String name = input.next();
        System.out.print("Enter Age: ");
        int age = input.nextInt();

        student[count] = new DataStudent(id, name, age);
        count++;

        System.out.println("student is added successfully");
    }

    static void listStudent(){
        System.out.println(" ");
        System.out.println("==========================================");
        System.out.printf("%-5s %-8s %-18s %-5s%n","No", "ID", "Name", "Age");
        System.out.println("==========================================");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-5d %-8d %-18s %-5d%n",
                    i + 1,
                    student[i].getId(),
                    student[i].getName(),
                    student[i].getAge() );
        }
        System.out.println("==========================================");
    }

    static void menu(){

        int choice = 0;
        int count =0;

        do{
            System.out.println(" ");
            System.out.println("====== Menu =====");
            System.out.println("1. Create Student");
            System.out.println("2. List Students");
            System.out.println("3. Exit Program");

            System.out.println(" ");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    createStudent();
                    break;
                case 2:
                    listStudent();
                    break;
                case 3:
                    System.out.println("exit .......");
            }

        }while(choice!=3);
        input.close();
    }

    public static void main(String[] args){
        menu();
    }
}
