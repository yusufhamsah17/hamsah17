import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PatientReader {
    private String filePath;

    public PatientReader(String filePath) {
        this.filePath = filePath;
    }

    public List<Patient> readData() {
        List<Patient> patientList = new ArrayList<>();
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Skip header
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);

                if (data.length >= 4) {
                    String name = data[0];
                    double age = Double.parseDouble(data[1]);
                    String gender = data[2];
                    String blood = data[3];

                    patientList.add(new Patient(name, age, gender, blood));
                }
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Format angka salah pada file CSV: " + e.getMessage());
        }

        return patientList;
    }
}
