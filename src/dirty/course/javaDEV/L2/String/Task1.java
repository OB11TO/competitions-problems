package dirty.course.javaDEV.L2.String;

public class Task1 {
    public static void main(String[] args) {
        String value = "sdakldkfl :( lsk;akdlk ;( ksa;dlk :( kslakmd :) :) :) :(";
        String result = replace1(value);
        System.out.println(result);

    }

    public static String replace1(String value){
        return value.replace(":(",":)" );
    }
}
