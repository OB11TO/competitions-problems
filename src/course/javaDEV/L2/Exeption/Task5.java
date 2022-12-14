package course.javaDEV.L2.Exeption;

public class Task5 {

    public static void main(String[] args) {
        try {
            catchCustomException();
        }catch (MyException e){
            System.out.println("catch main");
            e.printStackTrace();
        }
    }

    public static void catchCustomException(){
        try {
            unsafe();
        }catch (RuntimeException e){
            System.out.println("RunTime Main");
            System.out.println(e.getMessage());
            throw new MyException(e);

        }
    }

    private static void unsafe(){
        throw new RuntimeException("OOOPs");
    }
}
