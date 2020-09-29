import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MessageListener implements ActionListener {

	private LoadImage image;

	public MessageListener(LoadImage image) {
		this.image = image;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String[] commands = UserInterface.getBtncommands();

		for (int i = 0; i < commands.length; i++) {
			if (commands[i].equals(ae.getActionCommand())) {
				System.out.println(commands[i]);
				updateImage(commands[i]);

			}

		}

	}

	private void updateImage(String command) {

		Method[] methods = image.getClass().getMethods();

		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];

			if (method.getName().startsWith("change")) {

				if (method.getName().toLowerCase().endsWith(command)) {
					System.out.println(method.getName());
					try {
						method.invoke(image);
						UserInterface.updateLabel(image);

					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		}

	}

}