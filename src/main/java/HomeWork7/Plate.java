package HomeWork7;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0)
            return false;

        food -= n;
        return true;
    }

    void addFood(int food) {
        this.food += food;
    }


    public void info() {
        System.out.println("plate: " + food);
    }
}
