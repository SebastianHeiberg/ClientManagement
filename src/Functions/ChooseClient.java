package Functions;

import Client.Client;
import Client.ClientList;
import Persistens.Filehandler;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseClient extends JPanel {

  JComboBox comboBoxChoice;
  JTextField choiceInput;
  String whatToDoAfterFoundClient;
  JFrame frame;
  JTextArea foundClientsDisplay;
  JTextField foundClientInfo;
  JButton confirmClient;
  ClientList clientList;
  Filehandler filehandler;
  JScrollPane foundClientScrollPanel;

  public ChooseClient(String whatToDoAfterFoundClient, JFrame frame) {

    clientList = new ClientList();
    filehandler = new Filehandler();

    JLabel jLabelChoice = new JLabel("Search client by ");
    String[] comboChoices = {"Name", "Age", "Phone number"};
    comboBoxChoice = new JComboBox(comboChoices);
    choiceInput = new JTextField("", 15);
    JButton searchButton = new JButton("Search");
    foundClientsDisplay = new JTextArea();
    JLabel labelClientInfo = new JLabel("Input id ");
    foundClientInfo = new JTextField("", 15);
    confirmClient = new JButton("Continue");
    foundClientScrollPanel = new JScrollPane(foundClientsDisplay);
    foundClientsDisplay.setRows(10);

    Border blackline = BorderFactory.createLineBorder(Color.BLACK);
    jLabelChoice.setBorder(blackline);
    labelClientInfo.setBorder(blackline);

    labelClientInfo.setHorizontalAlignment(JLabel.CENTER);
    foundClientsDisplay.setEditable(false);



    this.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.BOTH; // components grow in both dimensions
    c.insets = new Insets(10, 10, 10, 10); // 5-pixel margins on all sides

    c.gridx = 4;
    c.gridy = 0;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(jLabelChoice, c);

    c.gridx = 6;
    c.gridy = 0;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(comboBoxChoice, c);

    c.gridx = 8;
    c.gridy = 0;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(choiceInput, c);

    c.gridx = 4;
    c.gridy = 1;
    c.gridwidth = 4;
    c.gridheight = 1;
    this.add(searchButton, c);
    searchButton.addActionListener(alSearh);

    c.gridx = 4;
    c.gridy = 4;
    c.gridwidth = 8;
    c.gridheight = 3;
    this.add(foundClientScrollPanel, c);

    c.gridx = 4;
    c.gridy = 8;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(labelClientInfo, c);

    c.gridx = 6;
    c.gridy = 8;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(foundClientInfo, c);

    c.gridx = 4;
    c.gridy = 9;
    c.gridwidth = 4;
    c.gridheight = 1;
    this.add(confirmClient, c);
    confirmClient.addActionListener(alContinue);

    this.whatToDoAfterFoundClient = whatToDoAfterFoundClient;
    this.frame = frame;
    frame.revalidate();
  }

  ActionListener alSearh = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      clientList.setClients(filehandler.loadClients());
      foundClientsDisplay.setText("");

      for (int i = 0 ; i < clientList.getClients().size();i ++){
        Client client = clientList.getClients().get(i);
        foundClientsDisplay.append(client.getName()+", ");
        foundClientsDisplay.append("Age: " + client.getAge()+", ");
        foundClientsDisplay.append("Industry: " + client.getIndustry()+", ");
        foundClientsDisplay.append("Phone: " + client.getPhone_Number()+", ");
        foundClientsDisplay.append("Id: "+ client.getId() + "\n");
      }
    }
  };

  ActionListener alContinue = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

      if (whatToDoAfterFoundClient.equals("addnote")) {
        AddNote addNote = new AddNote();
        frame.setContentPane(addNote);
      } else if (whatToDoAfterFoundClient.equals("deleteClient")) {
        DeleteClient deleteClient = new DeleteClient(new Client("Testy Mctester",20,"Testing a Tester","30476666","A test is not enough, how big can this get"),frame);
        frame.setContentPane(deleteClient);

      }
      frame.revalidate();

    }
  };
}
