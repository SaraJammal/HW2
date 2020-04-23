public class Person {

    private String name;
    private int age;
    private String haircolor;

    public Person(){
        name = "";
        age = 0;
    }
    public Person(String name, int age, String haircolor){
        this.name = name;
        this.age = age;
        this.haircolor = haircolor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getHaircolor() {
        return haircolor;
    }
}
