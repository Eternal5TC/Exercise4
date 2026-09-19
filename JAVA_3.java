import java.util.Scanner;

public class JAVA_3 {
    static Scanner input = new Scanner(System.in);

    static void phoneMenu(){
        int choice;
        do{
            System.out.println(" ");
            System.out.println("Phone Setting:");
            System.out.println("1. General");
            System.out.println("2. Wi-Fi");
            System.out.println("3. Bluetooth");
            System.out.println("4. Mobile Data");
            System.out.println("5. Hotspot");
            System.out.println("6. Notification");
            System.out.println("0. Quit");
            System.out.println(" ");

            System.out.print("Enter your choice:");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    general();
                    break;
                case 2:
                    wifi();
                    break;
                case 3:
                    unavailable();
                    break;
                case 4:
                    unavailable();
                    break;
                case 5:
                    unavailable();
                    break;
                case 6:
                    unavailable();
                    break;
                case 0:
                    System.out.println("exit the program.......");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }while(choice != 0);
    }
    static void general(){
        int choice;
        do{
            System.out.println(" ");
            System.out.println("General setting:");
            System.out.println("1. About");
            System.out.println("2. Software");
            System.out.println("3. Storage");
            System.out.println("0. Back");

            System.out.print("Enter your choice:");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    about();
                    break;
                case 2:
                    softwareUpdate();
                    break;
                case 3:
                    System.out.println("Storage is full");
                    break;
                case 0:
                    System.out.println("Back...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 0);
    }

    static void wifi(){
        int choice;
        do{
            System.out.println(" ");
            System.out.println("Wi-Fi:");
            System.out.println("Status              on");
            System.out.println("Network             I-Coffee");
            System.out.println("1. Other network    >");
            System.out.println("0. Back");

            System.out.println(" ");
            System.out.print("Enter your choice:");
            choice = input.nextInt();

            switch (choice){
                case 1 :
                    otherNetwork();
                    break;
                case 0:
                    System.out.println("Back...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 0);
    }
    static void about(){
        int choice;
        do{
            System.out.println(" ");
            System.out.println(" General > About:");
            System.out.println("name    iPhone");
            System.out.println("Model   IXs");
            System.out.println("Version 18.5");
            System.out.println("0. back");

            System.out.println(" ");
            System.out.print("Enter your choice:");
            choice = input.nextInt();

        }while(choice != 0);
    }
    static void otherNetwork(){
        int choice;
        do{
            System.out.println(" ");
            System.out.println("Wi-Fi > Other network:");
            System.out.println("Bayon coffee        *******");
            System.out.println("Angkor coffee       ***");
            System.out.println("Brawn coffee        ******");
            System.out.println("Koi                 **");
            System.out.println("0. back");

            System.out.println(" ");
            System.out.print("Enter your choice:");
            choice = input.nextInt();

        }while(choice !=0 );
    }
    static void softwareUpdate(){
        int choice;
        do{
            System.out.println(" ");
            System.out.println(" General > Software:");
            System.out.println("======================");
            System.out.println("Software is up to date");
            System.out.println("======================");
            System.out.println("0. back");

            System.out.println(" ");
            System.out.print("Enter your choice:");
            choice = input.nextInt();

        }while(choice != 0);
    }
    static void unavailable(){
        int choice;
        do {
            System.out.println(" ");
            System.out.println("============================");
            System.out.println("The Feature is not available");
            System.out.println("============================");
            System.out.println("0. back");

            System.out.println(" ");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

        }while (choice != 0) ;
    }
    public static void main(String[] args) {
        phoneMenu();
    }
}
