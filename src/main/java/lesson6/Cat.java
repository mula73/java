package lesson6;

public class Cat extends Animal {
    protected boolean swim;


    public Cat(String name, boolean swim, int run) {
        this.name = name;
        this.swim = swim;
        this.run = run;
    }

    public void catInfo() {
        System.out.println("Кот имя -  " + name + " ограничение бега -  " + run+ " метров, " + " плаванье -  " + swim);
    }
}


