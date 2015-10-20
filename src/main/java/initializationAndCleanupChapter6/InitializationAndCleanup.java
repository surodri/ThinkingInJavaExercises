package initializationAndCleanupChapter6;

public class InitializationAndCleanup {


    private String unitializedStringField;
    private String initializedField = "initializedAtDefinition";

    public InitializationAndCleanup(){
        System.out.println("Message");
    }

    public InitializationAndCleanup(String initializedField) {

        this.initializedField = initializedField;
    }

    public String exercise1() {
        return unitializedStringField;
    }

    public void setUnitializedStringField(String unitializedStringField) {
        this.unitializedStringField = unitializedStringField;
    }

    public String exercise2() {

        return initializedField;
    }

    public static class InitializationCleanupOverloadedMethods {


        private Dog dog;
        private String barkString = "Bark string";
        private char barkChar = 'B';
        private int numberOfCalls;

        public InitializationCleanupOverloadedMethods(String parameter) {
            System.out.println("Message with :" + parameter);
        }

        public InitializationCleanupOverloadedMethods() {
            this("Exercise9Initialization&Clenup");
            System.out.print("Message with :");
        }

        public InitializationCleanupOverloadedMethods(Dog dog) {
            this.dog = dog;
        }

        public void dogOverLoadedMethods() {

            dog.bark(barkString);
            dog.bark(barkChar);
            dog.bark(barkString, barkChar);
            dog.bark(barkChar, barkString);
        }


        public int method1CallsMethod2Twice() {
            this.method2();
            method2();
            return this.numberOfCalls;
        }

        private void method2() {
            this.numberOfCalls++;
        }
    }
}
