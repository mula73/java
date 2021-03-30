package lesson6;

public class Dog extends Animal{
    public int swim;


    public Dog(String name, int swim, int run ) {
        this.name = name;
        this.swim = swim;
        this.run = run;
    }
    public void dogInfo() {
        System.out.println("Собака имя -  " + name + " ограничение бега - " + run+ " метров, " + " плаванье -  " + swim);
    }
}

