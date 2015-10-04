package initializationAndCleanupChapter6;

/**
 * Created by Thoughtworker on 8/31/15.
 */
public class Dog {

    protected void bark(String bark){
        System.out.println(bark);
    }

    protected void bark(char barkChar) { System.out.println(barkChar);
    }

    protected void bark(String paramOne, char paramTwo) {
        System.out.println(paramOne + "," +  paramTwo);
    }

    protected void bark(char paramOne, String paramTwo) {
        System.out.println(paramOne + "," +  paramTwo);
    }

}
