import java.time.LocalDate;

public class Variable_n_datatypes {

    public static void main(String[] args) {
        int age = 30;
        String firstName = "Thomas";
        boolean female = false;
        String gender;
        if (female){
            gender = "weiblich";
        }
        else{
            gender = "männlich";
        }
        String lastName = "Witt";
        LocalDate birthdate = LocalDate.of(1989,3,30);
        double averageMark = 5.4;
        boolean married = false;
        String notMarried = "";
        if(!married){
            notMarried  = "nicht";
        }

        System.out.println("Halle! Mein Name ist "+ firstName + " " + lastName + ". Ich bin ein " + age +
                " Jahre altes, " + gender + "es Wesen, dass einen Notendurchschnitt von " + averageMark +
                " hat, " + notMarried + " verheiratet ist und dessen Geburtsdatum " + birthdate + " ist!");
    }
}
