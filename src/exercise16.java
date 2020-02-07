public class exercise16 {
    public static void main(String[] args) {
        char symbol = (char) ('a' + (int) (Math.random() * ('z' - 'a')));

        System.out.print("Your letter is " + symbol);
    }
}
