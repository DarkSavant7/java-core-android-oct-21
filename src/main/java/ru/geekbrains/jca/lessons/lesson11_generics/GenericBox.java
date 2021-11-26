package ru.geekbrains.jca.lessons.lesson11_generics;

//T(ype) E(lement) N(umber) K(ey) V(alue)
public class GenericBox<X> {
//    public static X someStaticField;
    private X obj;
    private X[] arr;

    public GenericBox(X obj) {
        this.obj = obj;
//        X type = new X();
//        arr = new X[10];
//        arr = (X[]) new Object[10];
    }

    public X getObj() {
        return obj;
    }

    public void setObj(X obj) {
        this.obj = obj;
    }
}
