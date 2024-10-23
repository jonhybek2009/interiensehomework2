public class Apartament {
    String title;
    double price;
    String address;
    Student[] residents;

    public Apartament(String title, double price, String address, Student[] residents) {
        this.title = title;
        this.price = price;
        this.address = address;
        this.residents = residents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student[] getResidents() {
        return residents;
    }

    public void displayResidentsAndPayment() {
        System.out.println("Квартира: " + title + " Адрес: " + address);
        double paymentPerStudent = price / residents.length;
        System.out.println("Плата за 1 студента: " + paymentPerStudent);

        for (Student student : residents) {
            student.displayInfo();
            int months = (int) (student.getBankAccount() / paymentPerStudent);
            System.out.println(" проживет: " + months + " месяцев.\n");
        }
    }
}