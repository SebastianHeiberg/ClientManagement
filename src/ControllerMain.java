import Functions.AddNote;
import Functions.ChooseClient;
import Functions.CreateClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerMain {

  private final JFrame frame;

  public ControllerMain() {
    this.frame = new JFrame("Client Management");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 600);
    frame.setLocationRelativeTo(null);

    //Menubar
    JMenuBar menubar = new JMenuBar();
    JMenu manageClient = new JMenu("Manage Client");
    JMenuItem createClient = new JMenuItem("Create new client");
    JMenuItem deleteClient = new JMenuItem("Delete client");
    JMenuItem updateInfoClient = new JMenuItem("Update client info");

    JMenu menuClientInfo = new JMenu("Client info");
    JMenuItem readNotes = new JMenuItem("Read notes");
    JMenuItem addNote = new JMenuItem("Add note");

    JMenu menuAppointments = new JMenu("Appointments");
    JMenuItem manageAppointments = new JMenuItem("Manage appointments");
    JMenuItem viewAppointments = new JMenuItem("View appointments");

    frame.setJMenuBar(menubar);
    menubar.add(manageClient);
    manageClient.add(createClient);
    manageClient.add(deleteClient);
    manageClient.add(updateInfoClient);
    menubar.add(menuClientInfo);
    menubar.add(menuAppointments);
    menuAppointments.add(manageAppointments);
    menuAppointments.add(viewAppointments);
    menuClientInfo.add(readNotes);
    menuClientInfo.add(addNote);

    createClient.addActionListener(alCreateNewClient);
    deleteClient.addActionListener(alDeleteClient);
    addNote.addActionListener(alAddNote);

    frame.revalidate();
  }

  ActionListener alCreateNewClient = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      CreateClient createClient = new CreateClient();
      frame.setContentPane(createClient);
      frame.revalidate();
    }
  };

  ActionListener alAddNote = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      ChooseClient chooseClient = new ChooseClient("addnote",frame);
      frame.setContentPane(chooseClient);
      frame.revalidate();
    }
  };

  ActionListener alDeleteClient = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      ChooseClient chooseClient = new ChooseClient("deleteClient",frame);
      frame.setContentPane(chooseClient);
      frame.revalidate();
    }
  };


  public void run() {


  }

}
