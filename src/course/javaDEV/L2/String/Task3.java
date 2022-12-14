package course.javaDEV.L2.String;

public class Task3 {
    public static void main(String[] args) {

        String name = "Ivan";
        String lastName = "Ivanov";
        String priorName = "Jovanovich";
        System.out.println(name.charAt(0));
        System.out.println(initialName(name,lastName,priorName));
    }

    private static String initialName (String name, String lastName, String nameO){
        String nameInitial = String.valueOf(name.charAt(0)).toUpperCase();
        String lastNameInitial = String.valueOf(lastName.charAt(0)).toUpperCase();
        String priorNameInitial = String.valueOf(nameO.charAt(0)).toUpperCase();

        return String.format("%s.%s.%s",nameInitial,lastNameInitial,priorNameInitial);
    }
}
