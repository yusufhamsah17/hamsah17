public class Patient {
    private String name;
    private double age;
    private String gender;
    private String blood;

    public Patient(String name, double age, String gender, String blood) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.blood = blood;
    }

    // Getter methods
    public String getName() {
        return name; }
    public double getAge() {
        return age; }
    public String getGender() {
        return gender; }
    public String getBlood() {
        return blood; }

    @Override
    public String toString() {
        return "Nama: " + name + ", Umur: " + age + ", Jenis Kelamin: " + gender + ", Golongan Darah: " + blood;
    }
}
