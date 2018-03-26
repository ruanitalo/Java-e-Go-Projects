package idiomasistema;

import java.util.Locale;

public class IdiomaSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale idioma = Locale.getDefault();
		System.out.println("O idioma desse computador e:");
		System.out.println(idioma.toString());
		System.out.println("Ou ainda este");
		System.out.println(idioma.getDisplayLanguage());
	}

}
