package initializationAndCleanupChapter6;

<<<<<<< HEAD
import EverythingInAnObjectChapter3.Tank;
=======
import everythingInAnObjectChapter3.Tank;
>>>>>>> 3aba159c4348c990e7154e2169e267508c343c0d

public class TerminationCondition {


    private static void doStuff() {
        BehaviorOfFinalize exercise9 = new BehaviorOfFinalize(true);

        Tank tank = new Tank(false);

        tank.emptied(false);
    }

    public static void main(String[] args) throws InterruptedException {

        //this does nothing not sure why
        doStuff();

        //Does this mean my finalized is always called
        System.gc();
        Thread.sleep(10000);
//
//        ProtectedEx15 protectedEx15 = new ProtectedEx15();
//        protectedEx15.protectedMethod();
    }


}
