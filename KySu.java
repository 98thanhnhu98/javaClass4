package javaClass.Bai4;

public class KySu implements CanBo{
    private String name;
    private int age;
    private String gender;
    private String street;
    private String TrainingIndustry;
    public KySu(String name , int age, String gender,String street,String trainingIndustry){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.street = street;
        this.TrainingIndustry = trainingIndustry;
    }

    public String getTrainingIndustry() {
        return TrainingIndustry;
    }

    public void setTrainingIndustry(String trainingIndustry) {
        TrainingIndustry = trainingIndustry;
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
        return "KySu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", street='" + street + '\'' +
                ", TrainingIndustry='" + TrainingIndustry + '\'' +
                '}';
    }
}
