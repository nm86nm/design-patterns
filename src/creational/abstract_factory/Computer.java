package creational.abstract_factory;

public abstract class Computer {

    public abstract String getCPU();
    public abstract String getRAM();
    public abstract String getMotherboard();
    public abstract String getGraphicscard();
    public abstract String getDisk();

    @Override
    public String toString() {
        return "CPU: " + getCPU()
                + ", RAM: " + getRAM()
                + ", Motherboard: " + getMotherboard()
                + ", Graphicscard: " + getGraphicscard()
                + ", Disk: " + getDisk();
    }
}
