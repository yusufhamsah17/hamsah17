import java.util.List;

public class last {
    public static void main(String[] args) {
        // Ganti path sesuai lokasi file Anda
        String filePath = "C:\\Users\\Acer Nitro\\Downloads\\healthcare_dataset.csv";

        PatientReader reader = new PatientReader(filePath);
        List<Patient> patientList = reader.readData();

        for (Patient patient : patientList) {
            System.out.println(patient);
        }
    }
}
