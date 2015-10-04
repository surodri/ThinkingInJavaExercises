package everythingInAnObjectChapter3;

import java.util.Date;

public class EverythingIsAnObjectHelloData {

    private static int variableIntUnitialized;
    private static char variableCharUnitialized;

    void ChapterExercises() {
        System.out.println("Hello, it is:");
        System.out.println(new Date());

        exercise1();

        exercise2("hello world");

        ATypeName exercise3 = new ATypeName();

        DataOnly exercise4 = new DataOnly();

        storage("exercise5");

        try{
            throw new Exception("ErrorHandlingWithExceptions-Exercise1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void exercise1(){

        System.out.println(variableIntUnitialized);
        System.out.println(variableCharUnitialized);
    }


    private static void exercise2(String output){
        System.out.println(output);
    }


    public int storage(String input){
        return input.length()*2;
    }

}
