package creational.builder;

public class CheckComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("Intel i9 9900k", "Corsair Dominator 2x16GB 3600MHz",
                "Gigabyte Aours Master Z390", "NVidia GeForce RTX2080Ti", "Samsung Evo Plus 1TB")
                .setBluetoothEnabled(true).setWiFiCardEnabled(true).build();

        System.out.println("cpu: " + computer.getCpu() + ", \nram: " + computer.getRam()
                + ", \nmotherboard: " + computer.getMotherboard() + ", \ngraphicscard: " + computer.getGraphicscard()
                + ", \ndisk: " + computer.getDisk() + ", \nbluetooth enabled: " + computer.isBluetoothEnabled()
                + ", \nwifi card enabled: " + computer.isWiFiCardEnabled());
    }
}
