package nyc.c4q.abassawo;

//A Person class

public class Person {
    public static void main(String[] args) {
        Person abass = new Person("Abass");
        abass.setCity("St. Albans");
        abass.setPhoneNumber("911");

        Person faiz = new Person("Fa'iz");
        faiz.setCity("Bronx");
        faiz.setPhoneNumber("646");

        System.out.println(checkSameCity(abass, faiz));
        registerChild(faiz);
    }

    private String name;
    private String phoneNumber;
    private String city;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public static boolean checkSameCity(Person x, Person Y) {
        if (x.getCity().equals(Y.getCity())) {
            //checkSameCity(x, Y);
            return true;
        } else {
            return false;
        }
    }

    public static Person registerChild(Person Parent) {
        Person child = new Person();
        child.setName("ABC");
        child.city = Parent.getCity();
        child.phoneNumber = Parent.getPhoneNumber();
        System.out.println(child.city);
        System.out.print(child.getPhoneNumber());
        return child;
    }
}





