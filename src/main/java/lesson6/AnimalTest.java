package lesson6;

public class AnimalTest {
    public static void main(String[] args) {

        Animal animal = new Animal("Cats");
        Cat cat = new Cat("Барсик, ", false, 200);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal danimal = new Animal("Dogs");
        Dog dog = new Dog("Бобик,", 10, 500);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}
