package InstrumentosMusicais;

public abstract class InstrumentoMusical {
	
	private String nome;
	private TipoInstrumento tipo;
	
	protected InstrumentoMusical (String nome, TipoInstrumento tipo) {
		this.nome=nome;
		this.tipo=tipo;
	}
		
		public abstract String afinar();
		
		public abstract String tocar(String cancao);

}
