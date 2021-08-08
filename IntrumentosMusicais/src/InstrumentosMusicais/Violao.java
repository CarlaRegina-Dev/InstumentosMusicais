package InstrumentosMusicais;

public class Violao extends InstrumentoMusical {
	
	protected Violao() {
		super("Violão",TipoInstrumento.CORDA);		
	}

		@Override
		public String afinar() {
			return String.format("Afinando as cordas do violão!");
		}
	
		@Override
		public String tocar(String cancao) {
			return String.format("Tocando com o violão a música: %s\n",cancao);
		}
	
}
