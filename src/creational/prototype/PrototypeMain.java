package creational.prototype;

import java.util.List;

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees1 = new Employees();
        employees1.loadData();

        Employees employees2 = (Employees) employees1.clone();
        Employees employees3 = (Employees) employees1.clone();
        List<String> list1 = employees2.getEmpList();
        list1.add("Martin");
        List<String> list2 = employees3.getEmpList();
        list2.remove("Larry");

        System.out.println("employees1 list: " + employees1.getEmpList());
        System.out.println("employees2 list: " + list1);
        System.out.println("employees3 list: " + list2);
    }
}
