package initializationAndCleanupChapter6;

public class ExplicitStaticExc13 {

    public static void main(String[] args){
        System.out.println("Inside main()");

        //CupsExc13.cup1.f(99);   //(1)
    }

   static CupsExc13 cups1 = new CupsExc13();  //(2)
   static CupsExc13 cups2 = new CupsExc13();  //(2)
}

