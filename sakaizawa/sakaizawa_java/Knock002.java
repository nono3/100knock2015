/**
 * 02.�u�p�g�J�[�v�{�u�^�N�V�[�v���u�p�^�g�N�J�V�[�[�v
�u�p�g�J�[�v�{�u�^�N�V�[�v�̕�����擪������݂ɘA�����ĕ�����u�p�^�g�N�J�V�[�[�v�𓾂�.
 */

/**
 * @author sakaisawayuya
 *
 */
public class Knock002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String src1, src2;
		StringBuffer sb;
		src1 = "�p�g�J�[";
		src2 = "�^�N�V�[";
		sb = new StringBuffer();
		
		for (int i=0; i<src1.length(); i++){
			sb.append(src1.charAt(i));
			sb.append(src2.charAt(i));
		}
		System.out.println(sb);

	}

}
