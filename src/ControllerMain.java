import javax.swing.*;

public class ControllerMain {

  private JFrame frame;
  private JMenuBar menubar;
  private JMenu manageClient;
  private JMenuItem createClient;
  private JMenuItem deleteClient;
  private JMenuItem updateInfoClient;
  private JMenu menuClientInfo;
  private JMenu menuAppointments;
  private JMenuItem manageAppointments;
  private JMenuItem viewAppointments;


  public ControllerMain(){
    this.frame = new JFrame("Client Management");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600,600);
    frame.setLocationRelativeTo(null);

    //Menubar
    menubar = new JMenuBar();
    manageClient = new JMenu("Manage Client");
    createClient = new JMenuItem("Create new client");
    deleteClient = new JMenuItem("Delete client");
    updateInfoClient = new JMenuItem("Update client info");

    menuClientInfo = new JMenu("Client info");

    menuAppointments = new JMenu("Appointments");
    manageAppointments = new JMenuItem("Manage appointments");
    viewAppointments = new JMenuItem("View appointments");

    frame.setJMenuBar(menubar);
    menubar.add(manageClient);
    manageClient.add(createClient);
    manageClient.add(deleteClient);
    manageClient.add(updateInfoClient);
    menubar.add(menuClientInfo);
    menubar.add(menuAppointments);
    menuAppointments.add(manageAppointments);
    menuAppointments.add(viewAppointments);

    frame.revalidate();
  }


public void run() {


}

}
