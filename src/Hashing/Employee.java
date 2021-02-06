package Hashing;

public class Employee {

    private String name;
    private int age;
    private String address;

    public Employee(){}

    public Employee(String name, int age, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;

        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + age;
        result = prime * result + (address == null ? 0 : address.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj){

        if(obj == null){
            return false;
        }

        if(obj instanceof Employee && this == obj) {
            return true;
        }

        Employee newEmp = (Employee)obj;

        if(age != newEmp.age) {
            return false;
        }

        if(name != null && !name.equalsIgnoreCase(newEmp.name)){
            return false;
        }

        if(address != null && !address.equalsIgnoreCase(newEmp.address)){
            return false;
        }
        return true;
    }
}
