/**
 * 03. �~����
"Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics."�Ƃ�������P��ɕ������C�e�P��́i�A���t�@�x�b�g�́j��������擪����o�����ɕ��ׂ����X�g���쐬����D
 */

/**
 * @author sakaisawayuya
 *
 */

import java.util.ArrayList;

public class Knock003 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String sent = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics.";
		ArrayList<Integer> pi;
		pi = new ArrayList<Integer>();
		for (String s : sent.split(" ")){
			s = s.replace(",", "");
			s = s.replace(".", "");
			pi.add(s.length());
			
		}
		for (int i : pi){
			System.out.print(i);
		}
		
	}

}
