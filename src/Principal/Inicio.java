package Principal;

public class Inicio {

	public static void main(String[] args) {

		try {
			Eventos browser = new Eventos();
			browser.abrirNavegador("http://www.facebook.com.br", "chrome");
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
