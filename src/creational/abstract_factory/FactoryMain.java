package creational.abstract_factory;

public class CheckFactory {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("AMD A6-9400", "8gb 2400MHz",
                "Gigabyte GA-A320M-H", "NVidia GeForce GTX 1050", "Toshiba HDD 500GB"));
        Computer gamingPC = ComputerFactory.getComputer(new PCFactory( "Intel 9900k", "32gb 3600MHz",
                "ARock Taichi Z390", "NVidia GeForce RTX 2080Ti", "Samsung Evo Plus 970 1TB"));

        System.out.println("AbstractFactory PC::" + pc);
        System.out.println("AbstractFactory GamingPC::" + gamingPC);
    }
}
