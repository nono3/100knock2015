/**
07. �e���v���[�g�ɂ�镶����
����x, y, z���󂯎��ux����y��z�v�Ƃ����������Ԃ��֐�����������D����ɁCx=12, y="�C��", z=22.4�Ƃ��āC���s���ʂ��m�F����D
 */

/**
 * @author sakaisawayuya
 *
 */
public class Knock007 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println(template("12", "�C��", "22.4"));
	}

	private static String template(String x, String y, String z) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return String.format("%s����%s��%s", x, y, z);
	}

}
