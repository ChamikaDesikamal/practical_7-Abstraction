public abstract class Human {
    Human(){
        System.out.println("Constructor is Running!");
    }
    abstract void eat();
    abstract void walk();
    void breathing (){
        System.out.println("Breathing!");
    }
}
class Man extends Human{
    @Override
    void eat() {
        System.out.println("Anything Eat!");
    }

    @Override
    void walk() {
        System.out.println("Any kind of Walk!");
    }

    @Override
    void breathing() {
        super.breathing();
        System.out.println("Lab Dab!!!");
    }
}
class Chamika extends Man{
    @Override
    void breathing() {
        super.breathing();
        System.out.println("Chamika Breathing!");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Eating Food!");
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Running!");
    }
}
class Running {
    public static void main(String[] args) {
        Human h = new Man();
        Human h1 = new Chamika();
        Man m = new Chamika();

        h.breathing();
        h.eat();
        h.walk();
        System.out.println();
        h1.breathing();
        h1.eat();
        h1.walk();
        System.out.println();
        m.breathing();
        m.eat();
        m.walk();
    }
}