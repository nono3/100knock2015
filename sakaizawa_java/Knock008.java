/**
08. �Í���
�^����ꂽ������̊e�������C�ȉ��̎d�l�ŕϊ�����֐�cipher����������D

�p�������Ȃ��(219 - �����R�[�h)�̕����ɒu��
���̑��̕����͂��̂܂܏o��
���̊֐���p���C�p��̃��b�Z�[�W���Í����E����������D
 */

/**
 * @author sakaisawayuya
 *
 */
public class Knock008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String s = "Test String";
		String Encode_s = "";
		String Decode_s = "";
		System.out.println(s);
		System.out.println("\nEncode");
		Encode_s = cipher(s);
		System.out.println(Encode_s);
		System.out.println("\nDecode");
		Decode_s = cipher(Encode_s);
		System.out.println(Decode_s);
	}
	public static String cipher(String s){
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<s.length(); i++){
			if(Character.isLowerCase(s.charAt(i))){
				sb.append((char)(219 -  (int)s.charAt(i)));
			}else{
				sb.append(s.charAt(i));
			}
		}
		return s = sb.toString();
	}
}
