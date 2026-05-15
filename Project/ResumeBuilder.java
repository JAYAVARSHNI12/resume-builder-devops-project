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

        String resumeText = "\n==============================\n" +
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

        String resumeHtml = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Resume</title>\n" +
                "    <style>body{font-family:Arial, sans-serif;background:#eef2f7;padding:20px;} .resume-card{max-width:760px;margin:auto;background:#fff;padding:26px;border-radius:14px;box-shadow:0 16px 35px rgba(0,0,0,0.08);} h1{margin-top:0;font-size:28px;color:#1e3560;} h2{margin:12px 0 6px;color:#223042;} p{margin:8px 0;color:#4c5d75;} h3{margin-top:24px;color:#0c2b55;} .section-content{white-space:pre-wrap;line-height:1.75;}</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"resume-card\">\n" +
                "    <h1>Resume</h1>\n" +
                "    <h2>" + name + "</h2>\n" +
                "    <p><strong>Email:</strong> " + email + "</p>\n" +
                "    <p><strong>Phone:</strong> " + phone + "</p>\n" +
                "    <p><strong>Address:</strong> " + address + "</p>\n" +
                "    <div class=\"section-content\">\n" +
                "        <h3>Skills</h3>\n" +
                "        <p>" + skills + "</p>\n" +
                "        <h3>Education</h3>\n" +
                "        <p>" + education + "</p>\n" +
                "        <h3>Projects</h3>\n" +
                "        <p>" + projects + "</p>\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";

        try (FileWriter writer = new FileWriter("resume.html")) {
            writer.write(resumeHtml);
            System.out.println("Resume saved successfully as resume.html");
        } catch (IOException e) {
            System.out.println("Error while saving resume.html: " + e.getMessage());
        }

        try (FileWriter writer = new FileWriter("Resume.txt")) {
            writer.write(resumeText);
            System.out.println("Resume saved successfully as Resume.txt");
        } catch (IOException e) {
            System.out.println("Error while saving Resume.txt: " + e.getMessage());
        }

        sc.close();
    }
}