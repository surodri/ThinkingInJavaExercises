package interfacesChapter10.adventure;

public class Adventure {

    public static void t(CanFight x) { x.fight();}

    public static void u(CanSwim x) {x.swim(); }

    public static void v(CanFly x) {x.fly();}

    public static void w(ActionCharacter x) {x.fight(); }

    private static void x(CanClimb x) { x.climb();}

    public static void main(String[] args){
        Hero hero = new Hero();
        t(hero); //Treat it as a CanFight
        u(hero); //Treat it as a CanSwim
        v(hero); //Treat it as a CanFly
        w(hero); //Treat it as an ActionCharacter
        x(hero); //Treat it as a CanClimb
    }


}
