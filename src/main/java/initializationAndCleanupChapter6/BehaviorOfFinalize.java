package initializationAndCleanupChapter6;

public class BehaviorOfFinalize {

    private Boolean finalizeErrorFlag;

    public BehaviorOfFinalize(Boolean finalizeErrorFlag){
        this.finalizeErrorFlag = finalizeErrorFlag;
    }

    protected void finalize(){
        if(finalizeErrorFlag==true){
            System.out.println("Error: Exercise 9 behavior of finalize");
        }
    }
}
