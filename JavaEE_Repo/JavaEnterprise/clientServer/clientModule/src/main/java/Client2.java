import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9999);

            DataOutputStream dataOutputStream
                    = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream
                    = new DataInputStream(socket.getInputStream());

            String serverInput = dataInputStream.readUTF();
            System.out.println(serverInput);

            Scanner scanner = new Scanner(System.in);
            String line = "";
            do {
                line = scanner.nextLine();
                dataOutputStream.writeUTF(line);
                dataOutputStream.flush();
            } while (!line.equals("END"));

            dataOutputStream.close();
            dataInputStream.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
