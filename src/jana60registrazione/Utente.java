package jana60registrazione;

public class Utente {
/*Creare una classe Utente con attributi nome, cognome, email, password ed età.
Aggiungere un costruttore con parametri e metodi getter e setter.
Implementare dei metodi di validazione in modo che:
- email contenga un carattere @ e un .
- password sia lunga tra 8 e 12 caratteri
- età sia maggiore di 18 anni
In caso i parametri non siano validi, impedire che vengano valorizzati gli attributi nei metodi e nel costruttore, 
sollevando opportune eccezioni.*/
	
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private int eta;
	
//costruttore
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
		this.emailValida();
		this.passwordValida();
		this.etaValida();
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCognome() {
		return cognome;
	}



	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getEta() {
		return eta;
	}



	public void setEta(int eta) {
		this.eta = eta;
	}
	private void emailValida() throws Exception {
		//controllo che la mail sia correttamente formattata
				if(!(email.contains("@")) || !(email.contains("."))) {
					throw new Exception ("email non valida inserire @");
				}
	}
	private void passwordValida() throws Exception {
		//controllo che la mail sia correttamente formattata
				if(password.length()<8 || password.length()>12) {
					throw new Exception ("password non valida, deve contenere un minimo di 8 caratteri e un massimo di 12 caratteri");
				}
	}
	private void etaValida() throws Exception{
		//faccio lo stesso controllo per l eta 
				if( eta < 18 && eta >120) {
					//altrimenti metto eccezione
					throw new Exception("età passeggero non valida");
				}
	}
	 @Override
	    public String toString() {
	        return "Utente: " + nome + " " + cognome + "  " + eta + " Email: " + email +
	                " password: " + password + ". Grazie per esserti registrato";
	    }
	
}
