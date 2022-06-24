package jana60registrazione;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) {
		/*Creare una classe Registrazione con metodo main in cui, tramite Scanner, vengono chieste le informazioni all’utente e
		 *  si prova a creare un nuovo oggetto Utente.
		Gestire tramite try e catch eventuali errori in fase di creazione in modo che il programma non si interrompa 
		bruscamente ma chieda all’utente di inserire dei dati corretti.*/

		Scanner sc = new Scanner(System.in);
		
		boolean ritenta = true;
		
		do {
			System.out.println("inserisci nome: ");
			String nome = sc.nextLine();
			System.out.println("inserisci cognome: ");
			String cognome = sc.nextLine();
			
			try {
				System.out.println("inserisci email: ");
				String email = sc.nextLine();
				System.out.println("Inserisci password:");
				String password = sc.nextLine();
				System.out.println("inserisci eta: ");
				int eta = Integer.parseInt(sc.nextLine());

				Utente nuovoUtente = new Utente(nome, cognome, email, password, eta);
				System.out.println("Grazie per esserti registrato");
				System.out.println(nuovoUtente);
				 ritenta = false;

			} catch (NumberFormatException etaUtente) {
				System.out.println("l'utente deve avere almeno 18 anni");
				System.out.println(etaUtente.getMessage());
				System.out.println("ritenta");
			} catch (Exception pass) {
				System.out.println("i dati inseriti non sono validi si prega di ritentare");
				System.out.println(pass.getMessage());
				System.out.println("ritenta");
			} 
		} while (ritenta);
sc.close();
	}

}
