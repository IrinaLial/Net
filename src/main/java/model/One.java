package model;

public class One {
    private String name;

    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public One(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void init(){
        System.out.println("Class One started");
    }
    public void destroy(){
        System.out.println("Class One destroyed");

    }
}

