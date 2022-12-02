package it.virna.spring.model;

public class SignUpForm {
	
	private String Nome;
	private String Cognome;
	private String emailId;
	private String Messaggio;
	public SignUpForm(String nome, String cognome, String emailId, String messaggio) {
		super();
		this.Nome = nome;
		this.Cognome = cognome;
		this.emailId = emailId;
		this.Messaggio = messaggio;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		this.Cognome = cognome;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMessaggio() {
		return Messaggio;
	}
	public void setMessaggio(String messaggio) {
		this.Messaggio = messaggio;
	}
	@Override
	public String toString() {
		return "SignUpForm [Nome=" + Nome + ", Cognome=" + Cognome + ", emailId=" + emailId + ", Messaggio=" + Messaggio
				+ "]";
	}
	
 // default Construct




}
