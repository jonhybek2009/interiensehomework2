import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] students1 = {
                new Student("Нурбек Нурбекович", "996509", "Ленин кочосу 1", 2000),
                new Student("Али Алимбекович", "996502", "Ленин кочосу 1", 2500),
                new Student("Канур Канурбекович", "996505", "Ленин кочосу 1", 1800)
        };
        Student[] students2 = {
                new Student("Бексултан Кадырбаев", "996706", "Алыкул Осмонов 5", 3000),
                new Student("Залкар Токоевич", "996701", "Алыкул Осмонов 5", 3500),
                new Student("Нурсултан Абакиров", "996703", "Алыкул Осмонов 5", 4000)
        };

        Apartament apartment1 = new Apartament("Квартира1", 6000, "Ленин кочосу 1", students1);
        Apartament apartment2 = new Apartament("Квартира2", 7500, "Алыкул Осмонов 5", students2);

        Apartament[] apartments = {apartment1, apartment2};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите адрес квартиры: ");
        String inputAddress = scanner.nextLine();

        for (Apartament apartment : apartments) {
            if (apartment.getAddress().equalsIgnoreCase(inputAddress)) {
                apartment.displayResidentsAndPayment();
            }
        }
    }
}