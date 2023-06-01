package n1Exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<String, String> countries = new HashMap<>();

        String file = "src/n1Exercici3/Countries.txt";
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                var words = line.split(" ");
                if (line.equals("")) {
                    break;
                }
                countries.put(words[0], words[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        for (String country : countries.keySet()) {
            String city = countries.get(country);
            System.out.println(country + "  " + city);
        }






    }

}
