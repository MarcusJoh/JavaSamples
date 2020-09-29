import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class LoadImage {

	private BufferedImage image;

	public LoadImage() {
		try {
			image = (ImageIO.read(new File("strawberry.jpg")));
		} catch (IOException e) {

		}

	}

	public BufferedImage getImg() {
		return image;
	}

	public void changeRotate() {

		int w = image.getWidth();
		int h = image.getHeight();

		BufferedImage rotated = new BufferedImage(w, h, image.getType());
		Graphics2D graphic = rotated.createGraphics();
		graphic.rotate(Math.toRadians(45), w / 2, h / 2);
		graphic.drawImage(image, null, 0, 0);
		graphic.dispose();
		this.image = rotated;
	}

	public void changeGrayscale() {

		for (int i = 0; i < image.getHeight(); i++) {
			for (int j = 0; j < image.getWidth(); j++) {
				float r = new Color(image.getRGB(j, i)).getRed();
				float g = new Color(image.getRGB(j, i)).getGreen();
				float b = new Color(image.getRGB(j, i)).getBlue();
				int grayScaled = (int) (r + g + b) / 3;
				image.setRGB(j, i, new Color(grayScaled, grayScaled, grayScaled).getRGB());
			}
		}

	}

	public void changeInvert() {

		for (int x = 0; x < image.getWidth(); x++) {
			for (int y = 0; y < image.getHeight(); y++) {
				int rgba = image.getRGB(x, y);
				Color col = new Color(rgba, true);
				col = new Color(255 - col.getRed(), 255 - col.getGreen(), 255 - col.getBlue());
				image.setRGB(x, y, col.getRGB());
			}
		}

	}

}
