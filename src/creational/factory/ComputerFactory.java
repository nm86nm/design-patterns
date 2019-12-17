package creational.factory;

public class ComputerFactory {

    public static Computer getComputer(String type, String cpu, String ram, String motherboard, String graphicscard, String disk){
        if("PC".equalsIgnoreCase(type))
            return new PC(cpu, ram, motherboard, graphicscard, disk);
        else if("GamingPC".equalsIgnoreCase(type))
            return new GamingPC(cpu, ram, motherboard, graphicscard, disk);

        return null;
    }
}
