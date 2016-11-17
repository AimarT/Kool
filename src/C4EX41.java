/**
 * Created by admin on 17.11.2016.
 */
public class C4EX41 {
    public static void zoop (){
        baffle();
        System.out.println("You wugga ");
        baffle();
        //tõkesti; vahesein; ekraan,segadusseviima-tõlge
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("Wug");
        ping();
        //ülelöök-tõlge
    }

    public static void ping() {
        System.out.println(".");
    }

}
