package Functions;

import Client.Client;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteClient extends JPanel {

  Client deleteClient;
  JButton buttonDeleteClient;
  JButton buttonCancelDeletionProcess;
  JFrame frame;
  JLabel clientName;
  JLabel clientAge;
  JLabel clientIndustry;
  JLabel clientPhoneNumber;
  JLabel clientIssue;

public DeleteClient (Client deleteClient, JFrame frame) {
  this.frame = frame;
  this.deleteClient = deleteClient;
  clientName = new JLabel(" Client name: " + deleteClient.getName()+ " ");
  clientAge = new JLabel(" Client age: " + deleteClient.getAge()+ " ");
  clientIndustry = new JLabel(" Client industry: " + deleteClient.getIndustry()+ " ");
  clientPhoneNumber = new JLabel(" Client phone: " + deleteClient.getPhone_Number()+ " ");
  clientIssue = new JLabel(" Client issue: " + deleteClient.getIssue()+ " ");
  buttonDeleteClient = new JButton(" Delete client");
  buttonCancelDeletionProcess = new JButton("Back / Cancel");

  Border blackline = BorderFactory.createLineBorder(Color.BLACK);
  clientName.setBorder(blackline);
  clientAge.setBorder(blackline);
  clientIndustry.setBorder(blackline);
  clientPhoneNumber.setBorder(blackline);
  clientIssue.setBorder(blackline);

  this.setLayout(new GridBagLayout());
  GridBagConstraints c = new GridBagConstraints();
  c.fill = GridBagConstraints.BOTH; // components grow in both dimensions
  c.insets = new Insets(10, 10, 10, 10); // 5-pixel margins on all sides

  c.gridx = 4;
  c.gridy = 0;
  c.gridwidth = 2;
  c.gridheight = 1;
  this.add(clientName, c);

  c.gridx = 4;
  c.gridy = 1;
  c.gridwidth = 2;
  c.gridheight = 1;
  this.add(clientAge, c);

  c.gridx = 4;
  c.gridy = 2;
  c.gridwidth = 2;
  c.gridheight = 1;
  this.add(clientIndustry, c);

  c.gridx = 4;
  c.gridy = 3;
  c.gridwidth = 2;
  c.gridheight = 1;
  this.add(clientIssue, c);

  c.gridx = 4;
  c.gridy = 5;
  c.gridwidth = 2;
  c.gridheight = 1;
  this.add(clientPhoneNumber, c);

  c.gridx = 4;
  c.gridy = 6;
  c.gridwidth = 2;
  c.gridheight = 1;
  this.add(buttonDeleteClient, c);
  buttonDeleteClient.addActionListener(alDelete);

  c.gridx = 4;
  c.gridy = 7;
  c.gridwidth = 2;
  c.gridheight = 1;
  this.add(buttonCancelDeletionProcess, c);
  buttonCancelDeletionProcess.addActionListener(alBack);


}

  ActionListener alBack = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      ChooseClient chooseClient = new ChooseClient("deleteClient",frame);
      frame.setContentPane(chooseClient);
      frame.revalidate();
    }
  };

  ActionListener alDelete = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
      JOptionPane.showMessageDialog(frame,
          "Client deleted.",
          "Sucess",
          JOptionPane.WARNING_MESSAGE);

          clientName.setText(" Name: ");
          clientAge.setText(" Age: ");
          clientIndustry.setText(" Industry: ");
          clientPhoneNumber.setText(" Phone Number: ");
          clientIssue.setText(" Issue: ");
    }
  };

}
