package javaDEV.L2.Enam;

public class TestNestedClass {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass("hello");
        OuterClass.NestedClass classStatic = new OuterClass.NestedClass("Hello");
        classStatic.printText(obj);


        OuterClass2 obj2 = new OuterClass2("OC2");
        OuterClass2.NestedClass2 class2 = new OuterClass2.NestedClass2(obj2,"NC2");
        class2.printText();

    }

}

class OuterClass {
    private String text;
    private static int number = 10;
    public OuterClass(String text) {
        super();
        System.out.println("O1");
        this.text = text;
    }
    public static class NestedClass {
        private String word;
        public NestedClass(String word) {
            super();
            System.out.println("N1");
            this.word = word;
        }
        public void printText(OuterClass classStatic) {
            System.out.println(word + " " + number + " " + classStatic.text);
        }
    }
}

class OuterClass2 {
    private String text2;
    private static int number2 = 10;
    public OuterClass2(String text) {
        super();
        System.out.println("O2");
        this.text2 = text;
    }

    class A{
      A(){
          System.out.println("A");
      }

    }
    public static class NestedClass2 extends A {
        private String word2;
        public NestedClass2(OuterClass2 obj,String word) {
            obj.super();
            System.out.println("N1");
            this.word2 = word;
        }
        public void printText() {
            System.out.println(word2 + " " + number2);
        }
    }
}
