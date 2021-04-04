package HomeWork7;

public class MainClassTest {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Барсик", 20), new Cat("Тим", 20),
                new Cat("Пушок", 90)};

        Plate plate = new Plate(100);

        System.out.println("Сейчас в миске - " + plate.getFood() + " грамм кошачьего корма");

        for (Cat cat : cats) {
            plate.info();
            cat.eat(plate);
            cat.info();

        }
    }
}




