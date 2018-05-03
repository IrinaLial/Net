package model;

public class Three {
    private String name;

    public Three(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void init(){
        System.out.println("Class Three started");
    }
}
