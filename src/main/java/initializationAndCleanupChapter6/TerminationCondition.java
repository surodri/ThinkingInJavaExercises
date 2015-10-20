package initializationAndCleanupChapter6;


import everythingIsAnObjectChapter3.Tank;

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
