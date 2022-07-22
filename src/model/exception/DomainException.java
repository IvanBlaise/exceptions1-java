package model.exception;

public class DomainException extends RuntimeException{ 
	//Runtimeexception n�o precisa ser tratada, enquanto Exception precisa ser tratada
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}
	

}
