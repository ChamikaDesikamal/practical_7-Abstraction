public abstract class School {
    void teaching (){
        System.out.println("Teaching!");
    }
    abstract void learning();
}
class Grade11 extends School{
    @Override
    void learning() {
        System.out.println("Grade 11 student Learning Well!");
    }

    @Override
    void teaching() {
        super.teaching();
        System.out.println("Teachers Teaching well!");
    }
}
class RunSchool{
    public static void main(String[] args) {
        School s = new Grade11();
        s.learning();
        s.teaching();
    }
}