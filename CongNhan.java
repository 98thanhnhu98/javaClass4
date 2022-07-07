package javaClass.Bai4;

public class CongNhan implements CanBo {
    private String name;
    private int age;
    private String gender;
    private String street;
    private int level;
    public CongNhan(String name , int age, String gender,String street,int level){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.street = street;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String getname() {
        return name;
    }

    @Override
    public void setname(String name) {
        this.name = name;
    }

    @Override
    public int getage() {
        return age;
    }

    @Override
    public void setage(int age) {
        this.age = age;
    }

    @Override
    public String getgender() {
        return gender;
    }

    @Override
    public void setgender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public void setStreet() {
        this.street = street;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", street='" + street + '\'' +
                ", level=" + level +
                '}';
    }
}
