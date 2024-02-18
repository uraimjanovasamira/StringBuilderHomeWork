import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("file.txt")) {
            fileWriter.write("Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Oo Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz\n");

            for (int i = 1; i <= 26; i++) {
                fileWriter.write(i + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fileReader = new FileReader("file.txt")) {
            StringBuilder stringBuilder = new StringBuilder();
            int c;
            while ((c = fileReader.read()) != -1) {
                char character = (char) c;
                stringBuilder.append(character);
            }

            String[] a = stringBuilder.toString().split(" ");
            int count = 1;
            for (String b : a) {
                System.out.println(count + ":" + b);
                count++;
                if (count > 26) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


