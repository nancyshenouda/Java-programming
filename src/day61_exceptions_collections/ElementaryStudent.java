package day61_exceptions_collections;

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent(){} // we might need an empty constructor so the compiler won't provide one
    public ElementaryStudent(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
            } else{
                this.name = name;
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("---- Execution completed----");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <5 || age >12){
            throw new IllegalArgumentException("Age cannot be < 5 or > 12");
        }else{
            this.age = age;
        }

    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
