package prototype;


/**
 * @author user
 * 
 */
//Cloneable�̓}�[�J�u���C���^�[�t�F�[�X�B�N���[���\�ł��邱�Ƃ������݂̂ŁA���\�b�h��`�͂Ȃ��B
public interface Product extends Cloneable{
	public abstract void use(String s);
	public abstract Product createClone();
}
