
import Animals.animals.Animal;
import Animals.animals.Cat;
import Animals.animals.Dog;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Animal cat = new Cat("Oscar", "Whiskas");
        Animal dog = new Dog("Rocky", "Meat");
        System.out.println(cat.explainSelf());
        System.out.println(dog.explainSelf());

    }
}
