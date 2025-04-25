package classes;

import interfaces.Callable;
import interfaces.Photographable;

public class FlipPhone extends Phone implements Callable, Photographable {

    public final int countMegapixels = Megapixels.FLIP.getMegapixels();

    public FlipPhone() {
        super();
    }

    public FlipPhone(String modelName) {
        super(modelName);
    }

    public FlipPhone(String modelName, int countSim) {
        super(modelName, countSim);
    }

    @Override
    public String toString() {
        return "This is FlipPhone: " + this.getModelName()
                + ", count SIM: " + this.getCountSim()
                + ", pixels: " + Megapixels.valueOf("FLIP")
                + " = " + countMegapixels + "МП";
    }

    @Override
    public void ring() {
        System.out.printf("Ring phone \"%s\": mp3 playing...", this.getModelName());
        System.out.println();
    }

    @Override
    public void makeCall() {
        System.out.println("Make a call: I open the flip phone and call...");
    }

    @Override
    public void makePhoto() {
        System.out.println("Make photo: I open the flip phone and make a photo...");
    }
}
