import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

	private JFrame frame;
	private static JLabel labelWithImg;
	private static final String[] btnCommands = { "rotate", "grayscale", "invert" };
	
	public static String[] getBtncommands() {
		return btnCommands;
	}

	public UserInterface() {

	}

	@Override
	public void run() {
		frame = new JFrame("Title");
		frame.setPreferredSize(new Dimension(200, 100));

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		createComponents(frame.getContentPane());

		frame.pack();
		frame.setVisible(true);
	}

	private void createComponents(Container container) {

		GridLayout layout = new GridLayout(2, 2);
		container.setLayout(layout);

		LoadImage imageObject = new LoadImage();

		labelWithImg = new JLabel(new ImageIcon(imageObject.getImg()));
		container.add(labelWithImg);

		MessageListener btnActions = new MessageListener(imageObject);

		String[] btnText = { "Rotate!", "Grayscale!", "Invert!" };
		
	
		ArrayList<JButton> btn = new ArrayList<JButton>();

		for (int i = 0; i < btnText.length; i++) {
			btn.add(new JButton(btnText[i]));
			btn.get(i).setActionCommand(btnCommands[i]);
			btn.get(i).addActionListener(btnActions);
			container.add(btn.get(i));
		}



	}

	public static void updateLabel(LoadImage imageObject) {

		labelWithImg.setIcon(new ImageIcon(imageObject.getImg()));

	}

}