public class Main {
    public static void main(String[] args) {
        TestPrime simpleTest = new TestPrime() {
            @Override
            protected CheckPrime createCheckPrime() {
                return new SimpleCheckPrime();
            }
        };

        TestPrime advancedTest = new AdvancedTestPrime();

        System.out.println("Using SimpleCheckPrime:");
        simpleTest.checkAndPrint(17);
        simpleTest.checkAndPrint(18);

        System.out.println("Using AdvancedCheckPrime:");
        advancedTest.checkAndPrint(17);
        advancedTest.checkAndPrint(18);
    }
}
