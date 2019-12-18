package creational.abstract_factory;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory){
        return computerAbstractFactory.createComputer();
    }
}
