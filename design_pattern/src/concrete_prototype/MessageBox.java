package concrete_prototype;

import prototype.Product;

public class MessageBox implements Product {
	private char decochar;
	
	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		for(int i = 0; i < length +4 ; i++ ) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);
		for(int i =0; i< length + 4 ; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}
	
	public Product createClone() {
		Product p = null;
		try {
			//clone���\�b�h��Java����d�l�ŋK�肳��Ă���B(Object�N���X���\�b�h)
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
