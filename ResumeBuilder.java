import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ResumeBuilder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("============================");
        System.out.println(" SMART RESUME BUILDER ");
        System.out.println("============================");

        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Skills (comma separated): ");
        String skills = sc.nextLine();

        System.out.print("Enter Education: ");
        String education = sc.nextLine();

        System.out.print("Enter Project Details: ");
        String projects = sc.nextLine();

        String resume = "\n==============================\n" +
                "         RESUME\n" +
                "==============================\n\n" +
                "Name       : " + name + "\n" +
                "Email      : " + email + "\n" +
                "Phone      : " + phone + "\n" +
                "Address    : " + address + "\n\n" +
                "Skills\n" +
                "------------------------------\n" +
                skills + "\n\n" +
                "Education\n" +
                "------------------------------\n" +
                education + "\n\n" +
                "Projects\n" +
                "------------------------------\n" +
                projects + "\n";

        System.out.println(resume);

        try {
            FileWriter writer = new FileWriter("Resume.txt");
            writer.write(resume);
            writer.close();

            System.out.println("Resume saved successfully as Resume.txt");

        } catch (IOException e) {
            System.out.println("Error while saving resume.");
        }

        sc.close();
    }
}