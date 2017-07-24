package enums;


public enum StatusEvento
{
	NOVO(1), INSCRIÇÕES_ABERTAS(2), EM_ANDAMENTO(3), FINALIZADO(4);

	public int StatusEvento;
	StatusEvento(int valor){
		StatusEvento = valor;		
	}

}
