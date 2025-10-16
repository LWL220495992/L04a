public abstract class TestPrime {
    public void checkAndPrint(int number) {
        CheckPrime checker = createCheckPrime();
        if (checker.isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    protected abstract CheckPrime createCheckPrime();
}
