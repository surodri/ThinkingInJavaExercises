package chapter11InnerClasses.ex14HorrorShow;

public class Ex14HorrorShow {
    public DangerousMonster dangerousMonster(){
        return new DangerousMonster() {
            @Override
            public void destroy() {

            }

            @Override
            public void menace() {

            }
        };
    }
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public static void main(String[] args) {
        Ex14HorrorShow ex14HorrorShow = new Ex14HorrorShow();
        DangerousMonster barney  = ex14HorrorShow.dangerousMonster();
        u(barney);
        v(barney);
        Vampire vlad = new Vampire(){
            public void menace() {}
            public void destroy() {}
            public void kill() {}
            public void drinkBlood() {}
        };
        u(vlad);
        v(vlad);
        w(vlad); }
}
