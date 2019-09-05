package pvt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static int clientNumbers = 1;

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            clientNumbers = 0;
            do {
                System.out.println("Server is running");
                Socket socket = serverSocket.accept();
                System.out.println("Accept client now");
                clientNumbers++;
                if(socket != null){
                    newClient newClient = new newClient(socket);
                    newClient.start();
                }

                String exit = " ";
                if(exit.equals("EXIT")) break;
            } while (true);


            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static class newClient extends Thread {
        Socket socket;
        int clientNumber;

        newClient(Socket socket){
            this.socket = socket;
            clientNumber = clientNumbers;
        }

        @Override
        public void run() {
            System.out.println("Running new client");
            try {
                DataOutputStream dataOutputStream =
                        new DataOutputStream(socket.getOutputStream());
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                dataOutputStream.writeUTF("Hello world to new client!");
                dataOutputStream.flush();

                String input = "";
                do {
                    input = dataInputStream.readUTF();
                    System.out.println("Client " + clientNumber +" Input:  " + input);
                } while (!input.equals("END"));
                dataInputStream.close();
                dataOutputStream.close();
                socket.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
