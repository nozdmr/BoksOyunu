public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10 ,120, 100, 20 );
        Fighter f2 = new Fighter ("B", 15 , 85, 85, 30);
        Match match = new Match(f1,f2, 80, 120);
        match.run();
    }


}