public class a02 {
	public static void main(String[] args){
        String s1 = new String("�p�g�J�[");
        String s2 = new String("�^�N�V�[");

        for (int n = 1; n < 5; n = n + 1) {
        System.out.print(s1.substring(n - 1, n));
    	System.out.print(s2.substring(n - 1, n));
    	}
    	System.out.println();
    }
}