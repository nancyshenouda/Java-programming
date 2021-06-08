package Tasks.constructors;

public class Student {
    String name;
    int age;
    char gender;
    String university;


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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", university='" + university + '\'' +
                '}';
    }

    public Student (String name, int age, char gender, String university){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.university = university;


    }
}
