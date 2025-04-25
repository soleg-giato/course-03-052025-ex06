package classes;

import interfaces.Callable;
import interfaces.Photographable;

public class RotaryPhone extends Phone implements Callable, Photographable {

    public final int countMegapixels = Megapixels.RETRO.getMegapixels();

    public RotaryPhone(String modelName, int countSim) {
        super(modelName, countSim);
    }

    public RotaryPhone(String modelName) {
        super(modelName);
    }

    public RotaryPhone() {
        super();
    }

    @Override
    public String toString() {
        return "This is RotaryPhone: " + this.getModelName()
                + ", count SIM: " + this.getCountSim()
                + ", pixels: " + Megapixels.valueOf("RETRO")
                + " = " + countMegapixels + "МП";
    }

    @Override
    public void ring() {
        System.out.printf("Ring phone \"%s\": bzzz-bzzz-bzzz...", this.getModelName());
        System.out.println();
    }

    @Override
    public void makeCall() {
        System.out.println("Make a call: Pick up the phone and insert my finger into the phone dial...etc.");
    }

    @Override
    public void makePhoto() {
        System.out.println("Make photo: I don't know how to take a photos.");
    }
}
