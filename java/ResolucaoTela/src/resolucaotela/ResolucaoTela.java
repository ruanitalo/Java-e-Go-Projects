/**
 * 
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author ruani
 *
 */
public class ResolucaoTela {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit resolucao = Toolkit.getDefaultToolkit();
		Dimension r = resolucao.getScreenSize();
		System.out.println("A resolucao da tela esta em :");
		System.out.println(resolucao.getScreenSize());
		System.out.println("Ou");
		System.out.println("Screen width = " + r.width);
		System.out.println("Screen height = " + r.height);
		System.out.println("Ou Ainda");
		System.out.print("sua resolucao e:" + r.width);
		System.out.print(" por " + r.height);

	}

}
