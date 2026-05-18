import java.io.FileWriter;
import java.io.IOException;

public class ResumeBuilder {

    public static void saveResume(
            String name,
            String email,
            String phone,
            String address,
            String skills,
            String education,
            String projects,
            String summary) {

        String resume =
                "============================\n" +
                "         RESUME\n" +
                "============================\n\n" +

                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Address: " + address + "\n\n" +

                "SUMMARY\n" +
                summary + "\n\n" +

                "SKILLS\n" +
                skills + "\n\n" +

                "EDUCATION\n" +
                education + "\n\n" +

                "PROJECTS\n" +
                projects + "\n";

        try {

            FileWriter writer = new FileWriter("Resume.txt");

            writer.write(resume);

            writer.close();

            System.out.println("Resume saved successfully.");

        }

        catch (IOException e) {

            System.out.println("Error saving resume.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Smart Resume Builder Backend Started Successfully");
    }
}
