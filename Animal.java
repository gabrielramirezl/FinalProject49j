public abstract class Animal implements Comparable<Animal> {
    private String name;
    private int age;
    private int hunger;

    public Animal(String name, int age, int hunger) {
        this.name = name;
        this.age = age;
        this.hunger = hunger;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public int getHunger() {return hunger;}
    public void setHunger(int hunger) {this.hunger = hunger;}

    abstract void eat();

    @Override
    public int compareTo (Animal o) {
        int result = Integer.compare(age, o.age);
        if (result == 0) {
            result = Integer.compare(hunger, o.hunger);
        }
        if (result == 0) {
            result = name.compareTo(o.name);
        }
        return result;
    }
}
