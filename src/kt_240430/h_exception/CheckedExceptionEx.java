package kt_240430.h_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionEx {
    public void readFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader((new FileReader("README.md")));

            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
