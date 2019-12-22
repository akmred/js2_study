package lesson1;

public class StatDemoApp {
    public static void main(String[] args) {
        Stats<Integer> intStats = new Stats<Integer>(1,2,3,4,5);
        System.out.println("Sr. value intStats is equal: " + intStats.avg());
        Stats <Double> doubleStats = new Stats<Double>(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println("Sr. value doubleStats is equal: " + doubleStats.avg());

        // Это не скомпилируется, потому что String не является подклассом Number
        // Stats<String> strStats = new Stats<>("1", "2", "3");


    }
}
