package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public void loadData(){
        empList.add("George");
        empList.add("Susan");
        empList.add("Larry");
        empList.add("Elisabeth");
    }

    public List<String> getEmpList(){
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();

        for(String s : this.getEmpList()){
            temp.add(s);
        }

        return new Employees(temp);
    }
}
