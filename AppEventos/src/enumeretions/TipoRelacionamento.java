package enumeretions;


public enum TipoRelacionamento
{
	APOIO(1), PATROCÍNIO(2), COLABORACAO(3), IDEALIZAÇÃO(4);

	public int TipoRelacionamento;
	TipoRelacionamento(int valor){
		TipoRelacionamento = valor;		
	}

}
