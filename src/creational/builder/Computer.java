package creational.builder;

public class Computer {

    // required parameters
    private String cpu;
    private String ram;
    private String motherboard;
    private String graphicscard;
    private String disk;

    //optional parameters
    private boolean isBluetoothEnabled;
    private boolean isWiFiCardEnabled;

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getGraphicscard() {
        return graphicscard;
    }

    public String getDisk() {
        return disk;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public boolean isWiFiCardEnabled() {
        return isWiFiCardEnabled;
    }

    public Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.ram = computerBuilder.ram;
        this.motherboard = computerBuilder.motherboard;
        this.graphicscard = computerBuilder.graphicscard;
        this.disk = computerBuilder.disk;
        this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
        this.isWiFiCardEnabled = computerBuilder.isWiFiCardEnabled;
    }

    public static class ComputerBuilder{
        // required parameters
        private String cpu;
        private String ram;
        private String motherboard;
        private String graphicscard;
        private String disk;

        //optional parameters
        private boolean isBluetoothEnabled;
        private boolean isWiFiCardEnabled;

        public ComputerBuilder(String cpu, String ram, String motherboard, String graphicscard, String disk) {
            this.cpu = cpu;
            this.ram = ram;
            this.motherboard = motherboard;
            this.graphicscard = graphicscard;
            this.disk = disk;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public ComputerBuilder setWiFiCardEnabled(boolean wiFiCardEnabled) {
            isWiFiCardEnabled = wiFiCardEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
