package Client;

import java.util.ArrayList;

public class ClientList {

  private ArrayList <Client> clients;

  public ClientList () {
    this.clients = new ArrayList<>();
  }

  public ArrayList<Client> getClients() {
    return clients;
  }

  public void setClients (ArrayList<Client> loadedClients) {
    this.clients = loadedClients;
  }

  public ArrayList<Client> findClients (String searchType, String keyword) {

    ArrayList <Client> result = new ArrayList<>();


    for (int i = 0 ; i < clients.size();i ++){
      Client client = clients.get(i);

      if (searchType.equals("name") && client.getName().contains(keyword)){
        result.add(client);
      }

    }
    return result;
  }

  }


