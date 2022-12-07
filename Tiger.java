public class Tiger extends Animal implements Predator {
    private int stripes;

    public Tiger(String name, int age, int hunger, int stripes) {
        super(name, age, hunger);
        this.stripes = stripes;
    }
    @Override
    public void huntingRank() {
       int rank = 0;
       if (this.getAge() > 10) {
           rank = rank + 1;
       } else if (this.getAge() <= 4) {
           rank = rank + 2;
       } else {
           rank = rank + 3;
       }
       if (this.getHunger() <= 2) {
           rank = rank + 1;
       } else if (this.getHunger() >= 3 && this.getHunger() <= 5) {
           rank = rank + 2;
       } else if (this.getHunger() >= 6 && this.getHunger() <= 8){
           rank = rank + 3;
       } else {
           rank = rank + 4;
       }
       rank = rank + (stripes / (1 + (int)(Math.random() * this.getAge()))) % 4;

       System.out.println("the hunting rank of " +  this.getName() + " is " + rank);
    }

    @Override
    void eat() {
        System.out.println("The tiger is eating");
    }
}
