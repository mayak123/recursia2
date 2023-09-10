public class work {
	public static int func1 (int n) {
		if (n<=0)return 0;
		return func1(n-1)+n;
		}
		

	public static int func2 (int n) {
		if (n<=0) return 1;
		return func2(n-1)*n;
		}
		

	public static int func3 (int n) {
		if (n==1) 
		return n ;
		
		if (n%2==1)
		return func3(n-1)*n;
		
		return func3(n-1);
		}
		


	public static int func4 (int n) {
		if (n<10) 
		return 1;
		return func4(n/10)+1;
		}

  public static boolean func9(int n)
	{
		if(n<1)
			return true;
		if(n%2!=0) 
      return false;
			
		return func9(n/10);
  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
