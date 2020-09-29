import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.color.ColorSpace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MessageListener implements ActionListener {

	private JLabel labelWithImg;
	private BufferedImage image;

	public MessageListener(JLabel labelWithImg, BufferedImage image) {
		this.labelWithImg = labelWithImg;

		this.image = image;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		// changeImage();

		switch (ae.getActionCommand()) {
		case "rotate":
			System.out.println("rotate");
			updateImage(ae.getActionCommand());
			break;
		case "grayscale":
			System.out.println("grayscale");
			updateImage(ae.getActionCommand());
		case "invert":
			System.out.println("invert");
			updateImage(ae.getActionCommand());

		}

	}

	private void updateImage(String command) {

		BufferedImage updatedImage = null;
		if (command.equals("rotate")) {
			updatedImage = rotate();
		} else if (command.equals("grayscale")) {
			updatedImage = grayscale();

		} else if (command.equals("invert")) {
			updatedImage = invert();
		}

		labelWithImg.setIcon(new ImageIcon(updatedImage));
	}

	public BufferedImage rotate() {

		int w = image.getWidth();
		int h = image.getHeight();

		BufferedImage rotated = new BufferedImage(w, h, image.getType());
		Graphics2D graphic = rotated.createGraphics();
		graphic.rotate(Math.toRadians(45), w / 2, h / 2);
		graphic.drawImage(image, null, 0, 0);
		graphic.dispose();
		return rotated;
	}

	public BufferedImage grayscale() {

		for (int i = 0; i < image.getHeight(); i++) {
			for (int j = 0; j < image.getWidth(); j++) {
				float r = new Color(image.getRGB(j, i)).getRed();
				float g = new Color(image.getRGB(j, i)).getGreen();
				float b = new Color(image.getRGB(j, i)).getBlue();
				int grayScaled = (int) (r + g + b) / 3;
				image.setRGB(j, i, new Color(grayScaled, grayScaled, grayScaled).getRGB());
			}
		}
		return image;
	}

	public BufferedImage invert() {

		for (int x = 0; x < image.getWidth(); x++) {
			for (int y = 0; y < image.getHeight(); y++) {
				int rgba = image.getRGB(x, y);
				Color col = new Color(rgba, true);
				col = new Color(255 - col.getRed(), 255 - col.getGreen(), 255 - col.getBlue());
				image.setRGB(x, y, col.getRGB());
			}
		}

		return image;
	}
}