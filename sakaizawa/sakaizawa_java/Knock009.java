/**
09. Typoglycemia
�X�y�[�X�ŋ�؂�ꂽ�P���ɑ΂��āC�e�P��̐擪�Ɩ����̕����͎c���C����ȊO�̕����̏����������_���ɕ��ёւ���v���O�������쐬����D�������C�������S�ȉ��̒P��͕��ёւ��Ȃ����ƂƂ���D�K���ȉp��̕��i�Ⴆ��"I couldn't believe that I could actually understand what I was reading : the phenomenal power of the human mind ."�j��^���C���̎��s���ʂ��m�F����D
 */

/**
 * @author sakaisawayuya
 *
 */

import java.util.ArrayList;
import java.util.Collections;

public class Knock009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String sent = "I couldn't believe that I could actually understand what I was reading : the phenomenal power of the human mind .";
		ArrayList<String> result_list = new ArrayList<String>();
		for(String tok : sent.split(" ")){
			if(tok.length() <= 4){
				result_list.add(tok);
				continue;
			}
			ArrayList<Character> t = new ArrayList<Character>();
			StringBuffer sb = new StringBuffer();
			for(int i = 1; i<=tok.length()-2; i++){
				t.add(tok.charAt(i));
			}
			Collections.shuffle(t);
			t.add(tok.charAt(tok.length()-1));
			t.add(0, tok.charAt(0));
			for(Character c : t){
				sb.append(c);
			}
			result_list.add(sb.toString());
		}
		System.out.println(sent);
		for(int i = 0; i<= result_list.size()-1; i++){
			System.out.print(result_list.get(i));
			if(i != result_list.size()-1){
				System.out.print(" ");	
			}
		}
	}

}
