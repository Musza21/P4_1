import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Service s = new Service();

        while (true) {
            try {
                System.out.println("\n MENU ");
                System.out.println("1 - Lista studentów");
                System.out.println("2 - Dodawnie studenta");
                System.out.println("0 - Wyjście");
                System.out.print("Wybierz opcję: ");

                int wybor = input.nextInt();
                input.nextLine();

                switch (wybor) {
                    case 1:
                    var students = s.getStudents();
                    System.out.println("\n- Lista studentów ---");
                    for (Student current : students) {
                        System.out.println(current);

                    }
                    break;

                    case 2:
                    System.out.print("Podaj imię: ");
                    String name = input.nextLine();

                    System.out.print("Podaj nazwisko: ");
                    String surname = input.nextLine();
                    System.out.println("Podaj date urodzenia w formacie RRRR-MM-DD");
                    System.out.print("Podaj Date urodzenia: ");
                    String date = input.nextLine();
                    
                        

                    System.out.print("Podaj wiek: ");
                    int age = input.nextInt();
                    input.nextLine();

                    s.addStudent(new Student(name, surname, date, age));
                    System.out.println("Dodano studenta!\n");
                    break;


                    case 0:
                        System.out.println("Zamykanie programu...");
                        input.close();
                        return;

                    default:
                        System.out.println("Niepoprawna opcja!");
                }

            } catch (IOException e) {
                System.out.println("Błąd podczas operacji na pliku!");
            }
        }
    }

	@Override
	public String toString() {
		return "Main []";
	}
}

