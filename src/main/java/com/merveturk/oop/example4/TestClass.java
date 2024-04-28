package com.merveturk.oop.example4;

public class TestClass{
    public static void main(String[] args) {
        Insan insan= new Insan(165,50);
        System.out.println(insan.boyCm());
        System.out.println(insan.boyMt());
        System.out.println(insan.tanim());


    }
}


interface Boy {

    int degisken=0;
    int boyCm();
    double boyMt();

    default boolean tanim(){
       System.out.println("default tanim metodu calisti " );
       altTanim();
        return false;
    }

    static void altTanim (){
        System.out.println("static tanim metodu calisti " );
    }

}

abstract class Hayvan implements Boy  {

    private int boy;
    private int kilo ;
    public abstract boolean canliMi();
    public boolean uzunMu(){

        return true;
    }


    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }
}

class Insan extends Hayvan{

    public Insan(int boy , int kilo ) {
        this.setBoy(boy);
        this.setKilo(kilo);
    }

    @Override // hayvan classindan gelir
    public boolean canliMi() {
        return false;
    }

    @Override  // boy interface getirir.
    public int boyCm() {
        return 200;
    }

    @Override  // boy interface getirir.
    public double boyMt() {
        return 2;
    }

}


class Bina implements Boy{

    @Override
    public int boyCm() {
        return 90;
    }

    @Override
    public double boyMt() {
        return 80;
    }


}







