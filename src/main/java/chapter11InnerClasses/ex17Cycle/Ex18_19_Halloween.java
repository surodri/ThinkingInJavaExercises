package chapter11InnerClasses.ex17Cycle;

import java.io.PrintStream;

public class Ex18_19_Halloween {

    protected static class Wardrobe{
        private final PrintStream printStream;

        public Wardrobe(PrintStream printStream){
            this.printStream = printStream;
            printStream.println("Wardrobe()");
        }

    }

    protected static class WardrobeDoubleNested{
        private final PrintStream printStream ;

        public WardrobeDoubleNested(PrintStream printStream){
            this.printStream = printStream;
            printStream.println("WardrobeDoubleNested");
        }
        protected static class Clothes{
            private final PrintStream printStream1;
            public Clothes(PrintStream printStream1) {
                this.printStream1 = printStream1;
                printStream1.println("Clothes()");
            }
        }
    }
    private static Wardrobe ex18(PrintStream printStream) {
        return new Wardrobe(printStream);
    }

    private static WardrobeDoubleNested.Clothes ex19(PrintStream printStream){
        return new WardrobeDoubleNested.Clothes(printStream);
    }

    public static void main(String[] args){
        Wardrobe costume3 = new Wardrobe(System.out);

        Wardrobe costume = ex18(System.out);
        WardrobeDoubleNested.Clothes costume2 = ex19(System.out);
    }


}
