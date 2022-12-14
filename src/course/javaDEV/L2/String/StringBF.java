package course.javaDEV.L2.String;


/**
 * StringBuilder
 * StringBuffer
 */
public class StringBF {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
         for(int i = 0; i < 100000; i++){
             sb.append(i);
         }

        long endTime = System.currentTimeMillis();
         System.out.println(endTime - startTime);
    }
}
