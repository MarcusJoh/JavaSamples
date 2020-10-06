import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

	private JFrame frame;

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

		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("strawberry.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JLabel labelWithImg = new JLabel(new ImageIcon(image));
		container.add(labelWithImg);

		MessageListener btnActions = new MessageListener(labelWithImg, image);

		JButton rotateButton = new JButton("Rotate!");
		rotateButton.setActionCommand("rotate");
		rotateButton.addActionListener(btnActions);
		container.add(rotateButton);

		JButton grayscaleButton = new JButton("Grayscale!");
		grayscaleButton.setActionCommand("grayscale");
		grayscaleButton.addActionListener(btnActions);
		container.add(grayscaleButton);

		JButton invertButton = new JButton("Invert!");
		invertButton.setActionCommand("invert");
		invertButton.addActionListener(btnActions);
		container.add(invertButton);

	}

	public JFrame getFrame() {
		return frame;
	}

}