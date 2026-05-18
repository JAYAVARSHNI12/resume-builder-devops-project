import java.io.FileWriter;
import java.io.IOException;

public class ResumeBuilder {

    public static void generateResume(

            String name,
            String role,
            String email,
            String phone,
            String address,
            String summary,
            String skills,
            String education,
            String experience,
            String projects,
            String languages

    ) {

        String resume =

                "============================\n" +
                "      SMART RESUME\n" +
                "============================\n\n" +

                "Name: " + name + "\n" +
                "Role: " + role + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Address: " + address + "\n\n" +

                "SUMMARY\n" +
                "----------------------------\n" +
                summary + "\n\n" +

                "SKILLS\n" +
                "----------------------------\n" +
                skills + "\n\n" +

                "EDUCATION\n" +
                "----------------------------\n" +
                education + "\n\n" +

                "EXPERIENCE\n" +
                "----------------------------\n" +
                experience + "\n\n" +

                "PROJECTS\n" +
                "----------------------------\n" +
                projects + "\n\n" +

                "LANGUAGES\n" +
                "----------------------------\n" +
                languages;

        try {

            FileWriter writer = new FileWriter("Resume.txt");

            writer.write(resume);

            writer.close();

            System.out.println("Resume generated successfully");

        }

        catch (IOException e) {

            System.out.println("Error generating resume");
        }
    }

    public static void main(String[] args) {

        System.out.println("Smart Resume Builder Backend Started");

    }
}
