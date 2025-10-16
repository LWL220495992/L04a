public class AdvancedTestPrime extends TestPrime {
    @Override
    protected CheckPrime createCheckPrime() {
        return new AdvancedCheckPrime();
    }
}
