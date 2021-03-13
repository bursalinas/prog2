public class Contacto 
{
  private String nome;
  private String telefone;
  private String email;
  
  public Contacto(String _nome, String _telefone, String _email)
  {
	  nome = _nome;
	  telefone = _telefone;
	  email = _email;
  }
  public Contacto(String _nome, String _telefone)
  {
	  nome = _nome;
	  telefone = _telefone;
  }
  public String nome()
  { 
	  return nome; 
  }
  public String telefone()
  { 
	  return telefone; 
  }
  public String email()
  { 
	  return email;
  }
}
