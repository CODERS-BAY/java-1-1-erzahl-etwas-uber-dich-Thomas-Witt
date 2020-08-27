import java.time.LocalDate;

public class AboutMe {

    public static void main(String[] args) {
        String lastName = "Witt";
        String firstName = "Thomas";
        int age = 31;
        LocalDate birthDate = LocalDate.of(1989, 3, 30);
        boolean isFemale = false;
        double averageGrade = 2.1;
        boolean isMarried = false;

        if (isFemale) {
            System.out.print("Frau ");
        } else {
            System.out.print("Herr ");
        }
        // System.out.print(lastName + " " + firstName + ", der am " + dateOfBirth + " geboren wurde und daher " + age + " Jahre alt ist, ist ");          // My first attempt. Did work but was not pretty
        // System.out.printf("%s %s%s %s %s %d %s", lastName, firstName, ", der am", dateOfBirth, "geboren wurde und daher", age, "Jahre alt ist, ist ");  // My second attempt. Better, but still kind of ugly
        System.out.printf("%s %s, der %s geboren wurde und daher %d Jahre alt ist, ist ", firstName, lastName, birthDate, age);


        if (!isMarried) {
            System.out.print("nicht ");
        }

        System.out.println("verheiratet und hat einen Notendurchschnitt von " + averageGrade);


    }
}
