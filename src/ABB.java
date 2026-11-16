import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class ABB<K, V> implements IMapeamento<K, V>{

	// atributos
	private long comparacoes;
	private long inicio;
	private long termino;
	private No<K, V> raiz;
	private Comparator<K> comparador;
	
	/**
	 * Construtor da classe.
	 * @param comparador o comparador a ser utilizado para organizar os elementos da árvore.  
	 */
	public ABB(Comparator<K> comparador) {

	}

	public ABB() {
		this.comparador = (Comparator<K>) Comparator.naturalOrder();
	}
	
	public Boolean vazia(){
		if(raiz == null){
			return true;
		}
		return false;
	}

	public V pesquisar(K chave){
		V valor;

		if(chave == null){
			throw new IllegalArgumentException("sdhbshdgb");
		}

		valor = pesquisar(raiz, chave);

		return valor;
	}

	private V pesquisar(No<K, V> raiz, K chave){
		if(vazia()){
			throw new IllegalArgumentException("owuegiwuf");
		}

		final int result = comparador.compare(chave, raiz.getChave());

		if(result == 0){
			return raiz.getItem();
		}
		if(result < 0){
			return pesquisar(raiz.getEsquerda(), chave);
		}
		if(result > 0){
			return pesquisar(raiz.getDireita(), chave);
		}
		return null;
	}



















	@Override
	public long getComparacoes() {
		return comparacoes;
	}

	@Override
	public double getTempo() {
		return (termino - inicio) / 1_000_000;
	}
}
