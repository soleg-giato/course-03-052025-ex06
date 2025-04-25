package classes;

public abstract class Phone {

    private final String modelName;
    private final int countSim;

    public Phone() {
        this.modelName = "Retro";
        this.countSim = 0;
    }

    public Phone(String modelName) {
        this.modelName = modelName;
        this.countSim = 0;
    }

    public Phone(String modelName, int countSim) {
        this.modelName = modelName;
        this.countSim = countSim;
    }

    public String getModelName() {
        return modelName;
    }

    public int getCountSim() {
        return countSim;
    }

    public abstract void ring();

}
