package UI_Clickers;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable  {

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
		GridLayout layout = new GridLayout(1, 3);
		container.setLayout(layout);
		
		
		// call class that implements ActionListener
		MessageListener btnActions = new MessageListener();
		JButton b = new JButton("Click Here");
		b.setActionCommand("click");
		b.addActionListener(btnActions);
		container.add(b);

		JButton c = new JButton("Click also here");
		c.setActionCommand("click 2");

		container.add(c);

		// call a Anonymous class with ActionListener
		c.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.getActionCommand());
			}

		});

	}

}