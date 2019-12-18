package creational.abstract_factory;

public class PCFactory implements ComputerAbstractFactory {

    private String cpu;
    private String ram;
    private String motherboard;
    private String graphicscard;
    private String disk;

    public PCFactory(String cpu, String ram, String motherboard, String graphicscard, String disk) {
        this.cpu = cpu;
        this.ram = ram;
        this.motherboard = motherboard;
        this.graphicscard = graphicscard;
        this.disk = disk;
    }

    @Override
    public Computer createComputer() {
        return new PC(cpu, ram, motherboard, graphicscard, disk);
    }
}
