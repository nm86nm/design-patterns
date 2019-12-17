package creational.factory;

public class GamingPC extends Computer {

    private String cpu;
    private String ram;
    private String motherboard;
    private String graphicscard;
    private String disk;

    public GamingPC(String cpu, String ram, String motherboard, String graphicscard, String disk) {
        this.cpu = cpu;
        this.ram = ram;
        this.motherboard = motherboard;
        this.graphicscard = graphicscard;
        this.disk = disk;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getMotherboard() {
        return this.motherboard;
    }

    @Override
    public String getGraphicscard() {
        return this.graphicscard;
    }

    @Override
    public String getDisk() {
        return this.disk;
    }
}
