import java.util.Comparator;


class X {
	public static final Comparator<T> COMPARATOR = new Comp();
	
	private static class Comp implements Comparator<T>{
		
		public int compare(T d1, T d2){
			//d1이 d2보다 크면 양수 반환
			//d1이 d2보다 작으면 음수 반환
			//d1이 d2와 같으면 0 반환
		}
	}
}