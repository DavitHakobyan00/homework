public class StringUtil {
    public static void main(String[] args) {
        /**
         * 1․Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․
         *    1.1     “hello” , “world”
         *    1.2     1 , 2 , “hello”
         *    1.3     “1” , 2 , “hello”
         *    1.4     “hello”, 1 ,2, “world”
         */

        System.out.println("hello" + "world");
        System.out.println(1 + 2 + "hello");
        System.out.println("1" + 2 + "hello");
        System.out.println("hello" + 1 + 2 + "world");


        /**
         * 2.Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն դատարկ  սիվոլից նոր տողում օգտագործելով  String Literal ( \t, \b ….)․
         * actual:  “We are living in”
         * result:  We
         *          are
         *          living
         *          in
         */

        String text2 = "We are living in";

        String[] words = text2.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }


        /**
         * 3․ Գրել method (reverse), որը  շուռ է տալիս String.
         *     actual:  “sample”
         *     result:  “elpmas”
         */

        String text3 = "sample";

        for (int i = text3.length() - 1; i >= 0; i--) {
            System.out.print(text3.charAt(i));
        }
        System.out.println();



    }
}


