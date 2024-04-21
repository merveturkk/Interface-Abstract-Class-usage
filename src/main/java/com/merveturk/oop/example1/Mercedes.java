package com.merveturk.oop.example1;

public class Mercedes extends Car {

    private String speedControl ;
    private String mirrorClean;

    public void infoMercedes ()
    {
        System.out.println("This is a mercedes");
    }

    public String getSpeedControl() {
        return speedControl;
    }

    public void setSpeedControl(String speedControl) {
        this.speedControl = speedControl;
    }

    public String getMirrorClean() {
        return mirrorClean;
    }

    public void setMirrorClean(String mirrorClean) {
        this.mirrorClean = mirrorClean;
    }
}
