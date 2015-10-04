package access.mypackage;

import ReusingClassesChapter8.ProtectedEx15;

public class InheritingSomeClass extends ProtectedEx15 {

    public void methodCalling(){
        protectedMethod();
    }
    public static void main(String[] args) throws InterruptedException {
        InheritingSomeClass inheritingSomeClass = new InheritingSomeClass();
        inheritingSomeClass.methodCalling();

//
//        ProtectedEx15 protectedEx15 = new ProtectedEx15();
//        protectedEx15.protectedMethod();
    }


}
