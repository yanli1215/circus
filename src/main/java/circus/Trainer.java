package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        getToSpeak(d);

        Bird b = (Bird)d;  // upcasting
        getToSpeak(b);

        Animal a = (Animal)b; // upcasting: compiler done
        getToSpeak(a);

        Duck d2 = (Duck) a; // down casting: super class to sub class
        getToSpeak(d2);

        train(new Duck());  // down casting
        // train(new circus.animal.Parrot());
        // circus.animal.Animal a2 = new circus.animal.Animal();
        // circus.animal.Bird b2 = new circus.animal.Bird();
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
