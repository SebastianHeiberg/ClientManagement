package Functions;

import Client.Client;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Client.ClientList;
import Persistens.Filehandler;

public class CreateClient extends JPanel {

  private final ClientList clientList = new ClientList();
  private final Filehandler filehandler = new Filehandler();
  JTextField inputName;
  JTextField inputAge;
  JTextField inputIndustry;
  JTextField inputPhoneNumber;
  JTextField inputIssue;

  public CreateClient() {

    this.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.BOTH; // components grow in both dimensions
    c.insets = new Insets(10, 10, 10, 10); // 5-pixel margins on all sides

    JLabel labelName = new JLabel("Name");
    JLabel labelAge = new JLabel("Age");
    JLabel labelIndustry = new JLabel("Industry");
    JLabel labelPhoneNumber = new JLabel(" Phone number ");
    JLabel labelIssue = new JLabel("Issue");
    JButton buttonCreateNewClient = new JButton("Create new client");

    inputName = new JTextField("",15);
    inputAge = new JTextField("",15);
    inputIndustry = new JTextField("",15);
    inputPhoneNumber = new JTextField("",15);
    inputIssue = new JTextField("",15);

    labelName.setHorizontalAlignment(JLabel.CENTER);
    labelAge.setHorizontalAlignment(JLabel.CENTER);
    labelIndustry.setHorizontalAlignment(JLabel.CENTER);
    labelPhoneNumber.setHorizontalAlignment(JLabel.CENTER);
    labelIssue.setHorizontalAlignment(JLabel.CENTER);

    Border blackline = BorderFactory.createLineBorder(Color.black);
    labelName.setBorder(blackline);
    labelAge.setBorder(blackline);
    labelIndustry.setBorder(blackline);
    labelPhoneNumber.setBorder(blackline);
    labelIssue.setBorder(blackline);



    c.gridx = 4;
    c.gridy = 0;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(labelName,c);

    c.gridx = 6;
    c.gridy = 0;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(inputName, c);

    c.gridx = 4;
    c.gridy = 1;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(labelAge, c);

    c.gridx = 6;
    c.gridy = 1;
    c.gridwidth = 1;
    c.gridheight = 1;
    this.add(inputAge, c);

    c.gridx = 4;
    c.gridy = 2;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(labelIndustry, c);

    c.gridx = 6;
    c.gridy = 2;
    c.gridwidth = 1;
    c.gridheight = 1;
    this.add(inputIndustry, c);

    c.gridx = 4;
    c.gridy = 3;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(labelIssue, c);

    c.gridx = 6;
    c.gridy = 3;
    c.gridwidth = 1;
    c.gridheight = 1;
    this.add(inputIssue, c);

    c.gridx = 4;
    c.gridy = 4;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(labelPhoneNumber, c);

    c.gridx = 6;
    c.gridy = 4;
    c.gridwidth = 2;
    c.gridheight = 1;
    this.add(inputPhoneNumber, c);

    c.gridx = 4;
    c.gridy = 5;
    c.gridwidth = 4;
    c.gridheight = 1;
    this.add(buttonCreateNewClient, c);
    buttonCreateNewClient.addActionListener(alTest);

    this.revalidate();
  }

  ActionListener alTest = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

      try {
        String clientName = inputName.getText();
        String clientAge = inputAge.getText();
        String clientIndustry = inputIndustry.getText();
        String clientPhoneNumber = inputPhoneNumber.getText();
        String clientIssue = inputIssue.getText();

        if (clientName.isEmpty() || clientIndustry.isEmpty() || clientIssue.isEmpty() || clientPhoneNumber.isEmpty()) {
          JOptionPane.showMessageDialog(null,
              "All info must be filled in",
              "Missing input.",
              JOptionPane.WARNING_MESSAGE);
        } else {
          Client client = new Client(clientName, clientAge, clientIndustry, clientPhoneNumber, clientIssue);
          clientList.setClients(filehandler.loadClients());
          clientList.getClients().add(client);
          filehandler.saveClients(clientList.getClients());
          inputName.setText("");
          inputAge.setText("");
          inputIndustry.setText("");
          inputPhoneNumber.setText("");
          inputIssue.setText("");

        }

      } catch (NumberFormatException ne) {
        JOptionPane.showMessageDialog(null,
            "Age must be a whole number",
            "Wrong input.",
            JOptionPane.WARNING_MESSAGE);
      }
    }
  };

}