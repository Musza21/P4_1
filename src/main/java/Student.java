public class Student {

    private String Name;
    private String Surname;
    private int Age;

    public Student(String name, String surname, int age) {
        this.Name = name;
        this.Surname = surname;
        this.Age = age;
    }

    public String getName() { return Name; }
    public String getSurname() { return Surname; }
    public int getAge() { return Age; }

    @Override
    public String toString() {
        return Name + " " + Surname + " " + Age;
    }

    public static Student Parse(String str) {
        String[] data = str.split(" ");
        if (data.length != 3)
            return new Student("Parse", "Error", -1);

        return new Student(data[0], data[1], Integer.parseInt(data[2]));
    }
}
