class FizzBuzzWhile {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        while (start <= end) {
            start = BuzzFizz(start);
        }
    }

    private static int BuzzFizz(int start) {
        boolean divisibleBy3 = start % 3 == 0;
        boolean divisibleBy5 = start % 5 == 0;

        if (divisibleBy3 & divisibleBy5) {
            System.out.println("Fizz Buzz");
        } else if (divisibleBy3) {
            System.out.println("Fizz");
        } else if (divisibleBy5) {
            System.out.println("Buzz");
        } else {
            System.out.println(start);
        }
        start++;
        return start;
    }
}
