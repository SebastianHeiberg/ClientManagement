package Functions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseClient extends JPanel {

  JComboBox comboBoxChoice;
  JTextField choiceInput;
  String whatToDoAfterFoundClient;
  JFrame frame;

  public ChooseClient(String whatToDoAfterFoundClient, JFrame frame) {

    JLabel jLabelChoice = new JLabel("Search client by ");
    String[] comboChoices = {"Name", "Age", "Phone number"};
    comboBoxChoice = new JComboBox(comboChoices);
    choiceInput = new JTextField("", 15);
    JButton testButton = new JButton("Test");


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
    this.add(testButton, c);
    testButton.addActionListener(changeFrame);

    this.whatToDoAfterFoundClient = whatToDoAfterFoundClient;
    this.frame = frame;
  }

  ActionListener changeFrame = new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

      if (whatToDoAfterFoundClient.equals("addnote")) {
        AddNote addNote = new AddNote();
        frame.setContentPane(addNote);
      } else if (whatToDoAfterFoundClient.equals("deleteClient")) {
        DeleteClient deleteClient = new DeleteClient();
        frame.setContentPane(deleteClient);

      }
      frame.revalidate();

    }
  };


}
