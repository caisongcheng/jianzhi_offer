package page_1;
/*
 * ����һ��double���͵ĸ�����base��int���͵�����exponent��
 * ��base��exponent�η���
 * coded by Jerome
 */
public class Power {
	public static double power(double base,int exponent){
		if(exponent == 0)
			return 1;
		else if(exponent>0){
			double result = 1;
			for(int i = 1;i<=exponent;i++){
				result *= base;
			}
			return result;
		}
		else{
			if(base==0.0)
				throw new RuntimeException("��ĸ����Ϊ0");
			exponent = Math.abs(exponent);
			double result = 1;
			for(int i = 1;i<=exponent;i++){
				result *= base;
			}
			return 1/result;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exponent =-3;
		double base = 2.0;
		double result = power(base,exponent);
		System.out.println(result);
	}

}
