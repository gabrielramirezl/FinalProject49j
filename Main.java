public class Main {
    public static void main(String[] args) {
        System.out.println("Animal Project");
        Bear bear = new Bear("bear", 9, 10, "black");
        bear.eat();

        Tiger tig = new Tiger("tig", 12, 1, 33);
        tig.huntingRank();
    }
}