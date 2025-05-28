public class Main {
    String studentName = "Jeradin Iroha";   //field
    int score = 75;     //field

    public static void main(String[] args) {
        Main obj = new Main(); //creating object to access fields

        // Variable creation
        int age = 20;
        // If-else condition
        if (obj.score >= 50) {
            System.out.println(obj.studentName + " passed.");
        } else {
            System.out.println(obj.studentName + " failed.");
        }

        // Another if-else condition
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }

    }
}