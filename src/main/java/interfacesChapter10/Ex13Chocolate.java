package interfacesChapter10;

public class Ex13Chocolate extends Ex13Cocoa//, Ex15CocoaImaginary
        implements Ex12Fourth {

    public static void melting(Ex13First firstInterface){}

    public static void boiling(Ex13Second secondInterface){}

    public static void soft(Ex13Third thirdInterface){}

    public static void hard(Ex13Fourth fourthInterface){}

    public static void main(String[] args){
        Ex13Chocolate deliciousChocolate = new Ex13Chocolate();

        //all method calls give methods
//        melting(deliciousChocolate);
//        boiling(deliciousChocolate);
//        soft(deliciousChocolate);
//        hard(deliciousChocolate);

    }


}
