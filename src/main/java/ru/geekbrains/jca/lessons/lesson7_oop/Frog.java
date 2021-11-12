package ru.geekbrains.jca.lessons.lesson7_oop;

public class Frog {
    private String name;
    private Head head;
    private Heart heart;
    private Paw paw1;
    private Paw paw2;
    private Paw paw3;
    private Paw paw4;

    public Frog() {
        this.head = new Head();
        this.heart = new Heart();
        this.paw1 = new Paw();
        this.paw2 = new Paw();
        this.paw3 = new Paw();
        this.paw4 = new Paw();
    }

    public void doSomething() {
//        System.out.println(type);
        System.out.println(paw1.type);
    }

    private class Heart {
        private Heart() {
        }
    }

    //Inner class
    public class Head {
        public void doSomething() {
            System.out.println(name);
//            System.out.println(type);
            System.out.println(paw2.type);
        }
    }
    public class Paw {

        private String type;

        private Paw() {

        }
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Paw getPaw1() {
        return paw1;
    }

    public void setPaw1(Paw paw1) {
        this.paw1 = paw1;
    }

    public Paw getPaw2() {
        return paw2;
    }

    public void setPaw2(Paw paw2) {
        this.paw2 = paw2;
    }

    public Paw getPaw3() {
        return paw3;
    }

    public void setPaw3(Paw paw3) {
        this.paw3 = paw3;
    }

    public Paw getPaw4() {
        return paw4;
    }

    public void setPaw4(Paw paw4) {
        this.paw4 = paw4;
    }

    public static class NestedClassExample {
        private String name;

        public NestedClassExample(String name) {
            this.name = name;
        }
        public void doSomething(Frog f) {
            System.out.println(f.paw1);
        }
    }
}
