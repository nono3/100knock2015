public class a01 {
	public static void main(String[] args){
        String s = new String("�p�^�g�N�J�V�[�[");

        for (int n = 1; n < 8; n = n + 2) {
        System.out.print(s.substring(n - 1, n));
    	}
    	System.out.println();
    }
}