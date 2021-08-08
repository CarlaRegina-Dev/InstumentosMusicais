package InstrumentosMusicais;

public class FlautaDoce extends InstrumentoMusical {
		
	public FlautaDoce() {
		super("Flauta Doce",TipoInstrumento.SOPRO);
	}

		@Override
		public String afinar() {
			return String.format("Reencaixando a flauta para a afina��o!");
		}
	
		@Override
		public String tocar(String cancao) {
			return String.format("Tocando na Flauta Doce a m�scia: %s\n", cancao);
		}
	
}
