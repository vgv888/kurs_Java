package HommeWork5;

public class Mans {

    private String name;
    private String jobPosition;
    private String emails;
    private String tel;
    private int solary;
    private int age;

    public Mans(String name, String jobPosition, String emails, String tel, int solary, int age) {
        this.name = name;
        this.jobPosition = jobPosition;
        this.emails = emails;
        this.tel = tel;
        this.solary = solary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Mans{" +
                "name='" + name + '\'' +
                ", jobPosition='" + jobPosition + '\'' +
                ", emails='" + emails + '\'' +
                ", tel='" + tel + '\'' +
                ", solary=" + solary +
                ", age=" + age +
                '}';
    }

    public void printInfo() {
        System.out.println(this);
    }

    public int getAge() {
        return age;
    }
}
