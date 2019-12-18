package creational.abstract_factory;

public class GamingPCFactory implements ComputerAbstractFactory {

    private String cpu;
    private String ram;
    private String motherboard;
    private String graphicscard;
    private String disk;

    public GamingPCFactory(String cpu, String ram, String motherboard, String graphicscard, String disk) {
        this.cpu = cpu;
        this.ram = ram;
        this.motherboard = motherboard;
        this.graphicscard = graphicscard;
        this.disk = disk;
    }

    @Override
    public Computer createComputer() {
        return new GamingPC(cpu, ram, motherboard, graphicscard, disk);
    }
}
