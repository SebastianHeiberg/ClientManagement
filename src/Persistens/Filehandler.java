package Persistens;

import Client.Client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Filehandler {

  public ArrayList<Client> loadClients() {

    ArrayList <Client> clients = new ArrayList<>();
    try {
      Scanner file = new Scanner(new File("ClientList.csv"));
      while (file.hasNextLine()) {

        String line = file.nextLine();
        Scanner lineinput = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);
        String name = lineinput.next();
        int age = Integer.parseInt(lineinput.next());
        String industry = lineinput.next();
        String phoneNumber = lineinput.next();
        String issue = lineinput.next();

        Client client = new Client(name,age,industry,phoneNumber,issue);
        clients.add(client);

      }

    } catch (FileNotFoundException fnf) {
      System.err.println("File not found.");
    }

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
        file.print(client.getIssue() + ";");
        file.print("\n");

      }
    } catch (FileNotFoundException fnf) {
      System.err.println("file not found");
    }
  }
}
