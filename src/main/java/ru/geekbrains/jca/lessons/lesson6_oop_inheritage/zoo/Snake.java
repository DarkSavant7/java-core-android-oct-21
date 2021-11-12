package ru.geekbrains.jca.lessons.lesson6_oop_inheritage.zoo;

public class Snake extends Animal {
    public static final String TYPE = "SNAKE";
    private String name;

    public Snake(String name, String color) {
        super(name, color);
        this.name = "some snake";
    }

    @Override
    public void walk() {
        System.out.printf("Snake %s crawl\n", super.name);
    }

    @Override
    public void voice() {
        System.out.print("Ssssshhh bandarlogs!\n");
    }

    public void useParentWalk() {
        super.walk();
    }
    public static void doSomething() {
        System.out.println("SNAKE STATIC");
    }

//    @Override
//    public String getName() {
//        return name;
//    }
}
