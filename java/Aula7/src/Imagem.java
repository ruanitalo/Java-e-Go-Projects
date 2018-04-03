//quem conseguir arrumar isso ate a aula que vem ganha 10

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

public class Imagem {
	
	private BufferedImage bf;
	
	public Imagem(String path) throws IOException {
	//	bf = ImageIO.read((ImageInputStream) new File(patch));
	}
	
	public void mostrarPixels() {
		for(int i=0; i < bf.getHeight();i++) {
			for(int j=0;j <  bf.getWidth();j++) {
				int[] pixel = new int[3];
				pixel = bf.getRaster().getPixel(j, i, pixel);
				System.out.println("R "+ pixel[0]);;
				System.out.println("G "+ pixel[1]);;
				System.out.println("B "+ pixel[2]);;
	//			int[] r = bf.getData().getPixel(i, j, null);
			}
		}
	}
}
