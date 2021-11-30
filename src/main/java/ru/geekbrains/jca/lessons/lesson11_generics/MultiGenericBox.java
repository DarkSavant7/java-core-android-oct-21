package ru.geekbrains.jca.lessons.lesson11_generics;

public class MultiGenericBox<X, Y, Z, Q> {
    private X objX;
    private Y objY;
    private Z objZ;
    private Q objQ;

    public MultiGenericBox(X objX, Y objY, Z objZ, Q objQ) {
        this.objX = objX;
        this.objY = objY;
        this.objZ = objZ;
        this.objQ = objQ;
    }

    public X getObjX() {
        return objX;
    }

    public void setObjX(X objX) {
        this.objX = objX;
    }

    public Y getObjY() {
        return objY;
    }

    public void setObjY(Y objY) {
        this.objY = objY;
    }

    public Z getObjZ() {
        return objZ;
    }

    public void setObjZ(Z objZ) {
        this.objZ = objZ;
    }

    public Q getObjQ() {
        return objQ;
    }

    public void setObjQ(Q objQ) {
        this.objQ = objQ;
    }
}
