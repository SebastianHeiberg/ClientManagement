import Functions.CreateClient;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    createClient.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        CreateClient createClient = new CreateClient();
        frame.setContentPane(createClient);
        frame.revalidate();
      }
    });

    deleteClient.addActionListener(alDelte);

    frame.revalidate();
  }

ActionListener alDelte = new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e) {
    JPanel test = new JPanel(new BorderLayout());
    JLabel test2 = new JLabel("TEEEST");
    frame.setContentPane(test);
    test.add(test2);
    test.setBackground(Color.ORANGE);
    frame.revalidate();
  }
};

public void run() {

//    CreateClient createClient = new CreateClient();
//    frame.setContentPane(createClient);
//    frame.revalidate();

}

}
