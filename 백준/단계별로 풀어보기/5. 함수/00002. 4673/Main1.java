class Main1{
	
	public static void main(String[] args){
		for(int i=1; i<=10000; i++){
			boolean sw = true;
			for(int j=0; j<i; j++){
				int tmp = j;
				int p1000 = tmp / 1000;
				tmp = tmp % 1000;
				
				int p100 = tmp / 100;
				tmp = tmp % 100;
				
				int p10 = tmp / 10;
				tmp = tmp % 10;
				
				int p1 = tmp % 10;
				int res = j + p1000 + p100 + p10 + p1;
				if(res == i) sw = false;
			}
			if(sw) System.out.println(i);
		}
	}
}