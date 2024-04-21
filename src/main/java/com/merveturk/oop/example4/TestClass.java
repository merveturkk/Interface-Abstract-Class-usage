package com.merveturk.oop.example4;

import java.sql.SQLOutput;

public class TestClass{
    public static void main(String[] args) {
        Insan insan= new Insan(165,50);
        System.out.println(insan.boyCm());
        System.out.println(insan.boyMt());





    }
}



interface Boy {

    int degisken=0;
    int boyCm();
    double boyMt();

    static String tanim (){
        return  "bu interface implement eden class icin zorunlu bir metoddur.";

    }
    default double boyKilometre(){
        return 20;
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


    static String tanim (){
        return  "bu interface implement eden class icin zorunlu bir metoddur.";

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

    @Override // Boy interface icerisinde var olan default metodu degistirdik.
    public double boyKilometre() {
        return 50;
    }

}







