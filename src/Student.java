public class Student {
    String fullName;
    String phoneNumber;
    String address;
    double bankAccount;

    public Student(String fullName, String phoneNumber, String address, double bank) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankAccount = bank;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void updateInfo(String newName, String newPhone, String newAddress) {
        setFullName(newName);
        setPhoneNumber(newPhone);
        setAddress(newAddress);
    }

    public void displayInfo() {
        System.out.println("Имя: " + fullName + ", Телефон: " + phoneNumber + ", Баланс: " + bankAccount);
    }
}