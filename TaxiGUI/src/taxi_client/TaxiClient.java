package taxi_client;

//Swing allows you to create Graphical User Interfaces
//You need the Swing library to create GUI interfaces
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.*;

//You must extend the JFrame class to make a frame

public class TaxiClient extends JFrame {
	JLabel nameLabel, streetLabel, stateLabel, dateLabel, ageLabel, sexLabel, optionsLabel, aboutLabel;
	JTextField nameText, streetText;

	public static void main(String[] args) {

		new TaxiClient();

	}

	public TaxiClient() {
		// Create the frame, position it and handle closing it

		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Random Layout");

		JPanel thePanel = new JPanel();

		thePanel.setLayout(new GridBagLayout());

		nameLabel = new JLabel("Your location:");

		addComp(thePanel, nameLabel, 0, 0, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);

		nameText = new JTextField(30);

		addComp(thePanel, nameText, 1, 0, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);

		streetLabel = new JLabel("Your destinatio:");

		addComp(thePanel, streetLabel, 0, 1, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);

		streetText = new JTextField(30);

		addComp(thePanel, streetText, 1, 1, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);

		this.add(thePanel);

		// Adjusts the size of the frame to best work for the components

		this.pack();

		this.setVisible(true);

		// Define if the user can resize the frame (true by default)
		this.setResizable(false);

	}

	private void addComp(JPanel thePanel, JComponent comp, int xPos, int yPos, int compWidth, int compHeight, int place,
			int stretch) {

		GridBagConstraints gridConstraints = new GridBagConstraints();

		gridConstraints.gridx = xPos;
		gridConstraints.gridy = yPos;
		gridConstraints.gridwidth = compWidth;
		gridConstraints.gridheight = compHeight;
		gridConstraints.weightx = 100;
		gridConstraints.weighty = 100;
		gridConstraints.insets = new Insets(5, 5, 5, 5);
		gridConstraints.anchor = place;
		gridConstraints.fill = stretch;

		thePanel.add(comp, gridConstraints);

	}

}