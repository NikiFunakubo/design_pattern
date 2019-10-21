package prototype;


/**
 * @author user
 * 
 */
//Cloneableはマーカブルインターフェース。クローン可能であることを示すのみで、メソッド定義はない。
public interface Product extends Cloneable{
	public abstract void use(String s);
	public abstract Product createClone();
}
