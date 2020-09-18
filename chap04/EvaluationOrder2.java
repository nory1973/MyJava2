// 式の評価順序が左→右であることを確認

class EvaluationOrder2 {

	public static void main(String[] args) {
		int a = 3;
		System.out.println("a = " + a);	
		int x = (++a) * (2 + a);
		System.out.println("a = " + a);	
		System.out.println("x = " + x);
		
		a = 3;
		System.out.println("a = " + a);	
		x = (a++) * (2 + a);
		System.out.println("a = " + a);	
		System.out.println("x = " + x);	
	}
}
