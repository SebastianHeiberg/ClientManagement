import javax.swing.*;

public class ControllerMain {

  private JFrame frame;
  private JMenuBar menubar;
  private JMenu menuClient;
  private JMenuItem createClient;
  private JMenuItem deleteClient;
  private JMenuItem readInfoClient;
  private JMenuItem updateInfoClient;

  public ControllerMain(){
    this.frame = new JFrame("Client Management");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600,600);
    frame.setLocationRelativeTo(null);

    //Menubar
    menubar = new JMenuBar();
    menuClient = new JMenu("Client");
    createClient = new JMenuItem("Create new client");
    deleteClient = new JMenuItem("Delete client");
    readInfoClient = new JMenuItem("Read client info");
    updateInfoClient = new JMenuItem("Update client info");

    frame.setJMenuBar(menubar);
    menubar.add(menuClient);
    menuClient.add(createClient);
    menuClient.add(deleteClient);
    menuClient.add(readInfoClient);
    menuClient.add(updateInfoClient);


    frame.revalidate();
  }


public void run() {


}

}
