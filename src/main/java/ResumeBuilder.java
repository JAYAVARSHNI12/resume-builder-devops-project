import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ResumeBuilder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        String email;
        String phone;
        String address;
        String skills;
        String education;
        String projects;

        if (args.length >= 6) {

            name = args[0];
            email = args[1];
            phone = args[2];
            address = args[3];
            skills = args[4];
            education = args[5];
            projects = args.length > 6 ? args[6] : "";

        } else {

            System.out.println("============================");
            System.out.println(" SMART RESUME BUILDER ");
            System.out.println("============================");

            System.out.print("Enter Full Name: ");
            name = sc.nextLine();

            System.out.print("Enter Email: ");
            email = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            phone = sc.nextLine();

            System.out.print("Enter Address: ");
            address = sc.nextLine();

            System.out.print("Enter Skills (comma separated): ");
            skills = sc.nextLine();

            System.out.print("Enter Education: ");
            education = sc.nextLine();

            System.out.print("Enter Project Details: ");
            projects = sc.nextLine();
        }

        String resumeText =
                "\n==============================\n" +
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

        String resumeHtml =
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Resume Builder</title>\n" +
                "    <style>\n" +
                "        body {\n" +
                "            font-family: Arial, sans-serif;\n" +
                "            background-color: #f0f2f5;\n" +
                "            padding: 30px;\n" +
                "        }\n" +
                "\n" +
                "        .container {\n" +
                "            width: 700px;\n" +
                "            margin: auto;\n" +
                "            background: white;\n" +
                "            padding: 25px;\n" +
                "            border-radius: 10px;\n" +
                "            box-shadow: 0px 0px 10px rgba(0,0,0,0.2);\n" +
                "        }\n" +
                "\n" +
                "        h1 {\n" +
                "            text-align: center;\n" +
                "            color: darkblue;\n" +
                "        }\n" +
                "\n" +
                "        h2 {\n" +
                "            margin-top: 20px;\n" +
                "            color: #333;\n" +
                "        }\n" +
                "\n" +
                "        p {\n" +
                "            line-height: 1.8;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<div class=\"container\">\n" +
                "\n" +
                "    <h1>SMART RESUME</h1>\n" +
                "\n" +
                "    <h2>Personal Details</h2>\n" +
                "    <p><strong>Name:</strong> " + name + "</p>\n" +
                "    <p><strong>Email:</strong> " + email + "</p>\n" +
                "    <p><strong>Phone:</strong> " + phone + "</p>\n" +
                "    <p><strong>Address:</strong> " + address + "</p>\n" +
                "\n" +
                "    <h2>Skills</h2>\n" +
                "    <p>" + skills + "</p>\n" +
                "\n" +
                "    <h2>Education</h2>\n" +
                "    <p>" + education + "</p>\n" +
                "\n" +
                "    <h2>Projects</h2>\n" +
                "    <p>" + projects + "</p>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "</body>\n" +
                "</html>";

        try {

            FileWriter writer = new FileWriter("index.html");
            writer.write(resumeHtml);
            writer.close();

            System.out.println("Resume saved successfully as index.html");

        } catch (IOException e) {

            System.out.println("Error while saving index.html");
        }

        try {

            FileWriter writer = new FileWriter("Resume.txt");
            writer.write(resumeText);
            writer.close();

            System.out.println("Resume saved successfully as Resume.txt");

        } catch (IOException e) {

            System.out.println("Error while saving Resume.txt");
        }

        sc.close();
    }
}