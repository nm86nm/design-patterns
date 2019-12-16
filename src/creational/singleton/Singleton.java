package creational.singleton;

class Singleton {
    private static Singleton singleton = null;
    public String text;

    public Singleton() {
        text = "This is constructor from Singleton class";
    }

    public static Singleton getInstance(){
        if(singleton == null)
            singleton = new Singleton();

        return singleton;
    }
}

class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        singleton1.text = (singleton1.text).toUpperCase();
        System.out.println("singleton1.text: " + singleton1.text + " (upper case verion)");
        System.out.println("singleton2.text: " + singleton2.text + " (upper case verion)");
        System.out.println("singleton3.text: " + singleton3.text + " (upper case verion)");

        singleton2.text = (singleton2.text).toLowerCase();
        System.out.println("singleton1.text: " + singleton1.text + " (lower case verion)");
        System.out.println("singleton2.text: " + singleton2.text + " (lower case verion)");
        System.out.println("singleton3.text: " + singleton3.text + " (lower case verion)");
    }
}
