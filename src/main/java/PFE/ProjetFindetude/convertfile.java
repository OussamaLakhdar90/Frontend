package PFE.ProjetFindetude;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class convertfile {

    public static void main(String[] args) {

        String csvFile = "C:/Users/Grun/Desktop/PFE/MAchine larning plural/datacsv1.csv";
        String outputFilePath = "C:/Users/Grun/Desktop/PFE/MAchine larning plural/output.csv"; // this is where the updated file will be saved

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile));
             FileWriter fw = new FileWriter(outputFilePath)) {

            String line;
            boolean isFirstLine = true; // flag to skip the header row
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");

                // skip the header row
                if (isFirstLine) {
                    isFirstLine = false;
                    fw.write(line + "\n");
                    continue;
                }

                // assign "High" or "Low" to the 7th column
                 if(Long.parseLong(cols[4]) > 25318860) {
                    cols[7] = "Forfait data";
                }
                else if (Long.parseLong(cols[1]) > 300 && Long.parseLong(cols[6]) > 300 && Long.parseLong(cols[4]) > 52318860 || Long.parseLong(cols[1]) > 200  && Long.parseLong(cols[4]) > 52318860 ) {
                    cols[7] = "Forfait appel data";
                }
                else if (Long.parseLong(cols[2]) > 30 && Long.parseLong(cols[1]) < 300  && Long.parseLong(cols[6]) < 300 && Long.parseLong(cols[4]) > 52318860 ) {
                    cols[7] = " Forfait data SMS";
                }
                else if (Long.parseLong(cols[4]) > 300 && Long.parseLong(cols[1]) < 300  && Long.parseLong(cols[6]) < 300 && Long.parseLong(cols[4]) < 52318860 ) {
                    cols[7] = "forfait international";
                }
                else if (Long.parseLong(cols[4]) > 300 && Long.parseLong(cols[1]) > 300  && Long.parseLong(cols[6]) > 300 && Long.parseLong(cols[4]) > 52318860 ) {
                    cols[7] = "forfait hybrid";
                }
               else if (Long.parseLong(cols[1]) > 300 && Long.parseLong(cols[6]) > 300 && Long.parseLong(cols[4]) < 52318860 && Long.parseLong(cols[4]) < 300 || Long.parseLong(cols[1]) + Long.parseLong(cols[6])>400 || Long.parseLong(cols[1]) > 300 || Long.parseLong(cols[6]) > 300 ) {
                    cols[7] = "Forfait appel local";
                }

               else {
                    cols[7] = "Forfait Unknown";
                }


                // write the updated line to the output file
                for (int i = 0; i < cols.length; i++) {
                    fw.write(cols[i]);
                    if (i != cols.length - 1) {
                        fw.write(",");
                    }
                }
                fw.write("\n");
            }

            System.out.println("Output file saved to " + outputFilePath);

        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
