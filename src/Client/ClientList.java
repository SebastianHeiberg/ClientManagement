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

}
