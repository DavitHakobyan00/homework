package homeworks;

import java.util.*;

public class AllStaticExercises {
    public static void main(String[] args) throws InterruptedException {
        counterTest();
        maxIndexTest();
        // guessGame(); // Uncomment for interactive guessing
        timeCheckTest();
        oldestTest();
        commonCharsTest();
        factorialTest();
        binaryTest();
        evenFilterTest();
        nextPrimeTest();
    }

    // 1. Counter test
    static void counterTest() {
        Counter.set(7);
        Counter.print();
    }

    static class Counter {
        private static int count;
        public static void set(int value) { count = value; }
        public static void print() { System.out.println("Counter: " + count); }
    }

    // 2. Max index
    static void maxIndexTest() {
        int[] arr = {5, 12, 3, 90, 32};
        System.out.println("Max index: " + MaxIndex.find(arr));
    }

    static class MaxIndex {
        public static int find(int[] arr) {
            int max = 0;
            for (int i = 1; i < arr.length; i++)
                if (arr[i] > arr[max]) max = i;
            return max;
        }
    }

    // 3. Guessing game (optional, interactive)
    static void guessGame() {
        Scanner s = new Scanner(System.in);
        int secret = (int)(Math.random() * 100) + 1;
        int g;
        do {
            System.out.print("Guess: ");
            g = s.nextInt();
            if (g < secret) System.out.println("Too low");
            else if (g > secret) System.out.println("Too high");
        } while (g != secret);
        System.out.println("Correct!");
    }

    // 4. Time check
    static void timeCheckTest() throws InterruptedException {
        Thread.sleep(2000);
        long seconds = (System.currentTimeMillis() - TimeCheck.start) / 1000;
        System.out.println("Elapsed: " + seconds + " sec");
    }

    static class TimeCheck {
        static final long start = System.currentTimeMillis();
    }

    // 5. Oldest person
    static void oldestTest() {
        Person[] people = {
                new Person("Anna", 25),
                new Person("Mike", 42),
                new Person("Nora", 31)
        };
        Person oldest = Person.findOldest(people);
        System.out.println("Oldest: " + oldest.name + " (" + oldest.age + ")");
    }

    static class Person {
        String name;
        int age;
        Person(String n, int a) { name = n; age = a; }

        public static Person findOldest(Person[] list) {
            Person max = list[0];
            for (Person p : list)
                if (p.age > max.age) max = p;
            return max;
        }
    }

    // 6. Common characters
    static void commonCharsTest() {
        String a = "abcdef", b = "bdxyef";
        System.out.println("Common: " + CommonChars.find(a, b));
    }

    static class CommonChars {
        public static String find(String a, String b) {
            StringBuilder res = new StringBuilder();
            for (char c : a.toCharArray())
                if (b.contains("" + c) && res.indexOf("" + c) == -1)
                    res.append(c);
            return res.toString();
        }
    }

    // 7. Factorial
    static void factorialTest() {
        System.out.println("5! = " + Factorial.calc(5));
    }

    static class Factorial {
        public static int calc(int n) {
            if (n <= 1) return 1;
            return n * calc(n - 1);
        }
    }

    // 8. Binary conversion
    static void binaryTest() {
        Binary b = new Binary();
        System.out.println("Binary of 10: " + b.toBin(10));
    }

    static class Binary {
        public final String toBin(int n) {
            return Integer.toBinaryString(n);
        }
    }

    // 9. Even number filter
    static void evenFilterTest() {
        int[] nums = {3, 6, 1, 8, 11, 4};
        System.out.print("Even numbers: ");
        for (int x : EvenFilter.getEven(nums))
            System.out.print(x + " ");
        System.out.println();
    }

    static class EvenFilter {
        public static int[] getEven(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int n : arr) if (n % 2 == 0) list.add(n);
            return list.stream().mapToInt(i -> i).toArray();
        }
    }

    // 10. Next prime
    static void nextPrimeTest() {
        System.out.println("Next prime after 101: " + PrimeNext.next());
    }

    static class PrimeNext {
        static final int START = 101;
        public static boolean isPrime(int n) {
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0) return false;
            return true;
        }

        public static int next() {
            int n = START + 1;
            while (!isPrime(n)) n++;
            return n;
        }
    }
}
