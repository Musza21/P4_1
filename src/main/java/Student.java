public class Student {

    private String Name;
    private String Surname;
    private String Date;
    private int Age;

    public Student(String name, String surname, String data, int age) {
        this.Name = name;
        this.Surname = surname;
        this.Date = data;
        this.Age = age;
    }

    public String getName() { return Name; }
    public String getSurname() { return Surname; }
    public String getDate() { return Date; }
    public int getAge() { return Age; }

    @Override
    public String toString() {
        return Name + " " + Surname + " " + Date + " " + Age;
    }

    public static Student Parse(String str) {
        String[] data = str.split(" ");
        if (data.length != 4)
            return new Student("Parse", "Error", "0000-00-00", -1);

        return new Student(
            data[0],
            data[1],
            data[2],
            Integer.parseInt(data[3])
        );
    }
}

