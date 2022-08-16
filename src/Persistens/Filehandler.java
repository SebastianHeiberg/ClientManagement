package Persistens;

import Client.Client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Filehandler {

  public ArrayList<Client> loadClients() {

    ArrayList <Client> clients = new ArrayList<>();


    return clients;
  }

  public void saveClients (ArrayList <Client> clients ) {

    try {
      PrintStream file = new PrintStream("ClientList.csv");
      for (Client client : clients) {
        file.print(client.getName()+";");
        file.print(client.getAge()+";");
        file.print(client.getIndustry()+";");
        file.print(client.getPhone_Number()+";");

      }
    } catch (FileNotFoundException fnf) {
      System.err.println("file not found");
    }
  }
}
