package InstrumentosMusicais;

public class Violao extends InstrumentoMusical {
	
	protected Violao() {
		super("Viol�o",TipoInstrumento.CORDA);		
	}

		@Override
		public String afinar() {
			return String.format("Afinando as cordas do viol�o!");
		}
	
		@Override
		public String tocar(String cancao) {
			return String.format("Tocando com o viol�o a m�sica: %s\n",cancao);
		}
	
}
