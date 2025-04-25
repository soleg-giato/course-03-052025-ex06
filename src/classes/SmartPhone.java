package classes;

import interfaces.Callable;
import interfaces.Photographable;

public class SmartPhone extends Phone implements Callable, Photographable {

    public final int countMegapixels = Megapixels.SMARTPHONE.getMegapixels();

    public SmartPhone() {
        super();
    }

    public SmartPhone(String modelName) {
        super(modelName);
    }

    public SmartPhone(String modelName, int countSim) {
        super(modelName, countSim);
    }

    @Override
    public String toString() {
        return "This is SmartPhone: " + this.getModelName()
                + ", count SIM: " + this.getCountSim()
                + ", pixels: " + Megapixels.valueOf("SMARTPHONE")
                + " = " + countMegapixels + "МП";
    }

    @Override
    public void ring() {
        System.out.printf("Ring phone \"%s\": I can play any melody, but the silent mode is on.", this.getModelName());
        System.out.println();
    }

    @Override
    public void makeCall() {
        System.out.println("Make a call: Hello Siri. Call my wife...");
    }

    @Override
    public void makePhoto() {
        System.out.println("Make photo: Slide left and let's go...");
    }
}
