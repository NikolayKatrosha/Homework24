package homework25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Ну в целом я понимаю задание, но чем больше стараюсь его сделать, тем больше путаюсь.
// Я понимаю, что должен быть не String Mother, а Person Mother...
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter person's name, mother's name, father's name: ");
            Person person= new Person(reader.readLine(), reader.readLine(), reader.readLine());
    }
}
