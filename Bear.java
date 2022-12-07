import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bear extends Animal{
    private String type;

    public Bear(String name, int age, int hunger, String type) {
        super(name, age, hunger);
        this.type = type;
    }
    public static int increaseHunger(int n) {
        if (n > 0) {
            return n + increaseHunger(n - 1);
        } else {
            return 0;
        }
    }
    public void adjustHunger(){
        if (getHunger() < 3) setHunger(3);
        int adj = increaseHunger(getHunger()) / 3;
        setHunger(adj);
    }
    public void writeFood(String file1, String file2) {
        Queue<String> food = new LinkedList<String>();
        String berries = "berries";
        String salmon = "salmon";
        String honey = "honey";

        File inputFile = new File(file1); // input file
        try (Scanner in = new Scanner(inputFile);
             PrintWriter out = new PrintWriter(file2)) {
            in.useDelimiter(","); // token in by ,
            // scan the input file
            while (in.hasNext())  {
                // scan the current token
                String token = in.next();
                Scanner tokenReader = new Scanner(token);
                // Write loop
                while (tokenReader.hasNext())  {
                    String word = tokenReader.next();
                    if (word.equals(berries) || word.equals(salmon) || word.equals(honey)) {
                        food.add(word);
                    }
                }
            }
            out.println(getName() + "'s hunger level is: " + getHunger());
            while (getHunger() != 0) {
                    String i = food.poll();
                    out.print(i); // write the food ate
                    switch (i) {
                        case "berries" -> {
                            setHunger(getHunger() - 3);
                            out.println(": -3");
                        }
                        case "salmon" -> {
                            setHunger(getHunger() - 2);
                            out.println(":  -2");
                        }
                        case "honey" -> {
                            setHunger(getHunger() - 1);
                            out.println(":   -1");
                        }
                        default -> throw new IllegalArgumentException("invalid food");
                    }
                    if (getHunger() <= 0) setHunger(0);
                }
        } catch (FileNotFoundException e) {
            System.out.println("File  not found!");
        }
    }
    @Override
    void eat() {
        adjustHunger();
        writeFood("C:\\Users\\Gabriel\\IdeaProjects\\FinalProject\\src\\food.txt",
                "C:\\Users\\Gabriel\\IdeaProjects\\FinalProject\\src\\ate.txt");
    }
}
