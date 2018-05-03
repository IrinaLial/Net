package model;

public class Two {
    private String name;

    public Two(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void init(){
        System.out.println("Class Two started");
    }
}
