package javaClass.Bai4;

public class NhanVien implements CanBo{
    private String name;
    private int age;
    private String gender;
    private String street;
    private String job;
    public NhanVien(String name , int age, String gender,String street,String job){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.street = street;
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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
        return "NhanVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", street='" + street + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
