package ReusingClassesChapter8;

class BoardGame extends Game {
    BoardGame(int i) {
        //System.out.println("Calling base class needs to be first");
        super(i); //Exercise 6 not calling base class constructor, uncomment this
        System.out.println("BoardGame constructor");
    }
}
