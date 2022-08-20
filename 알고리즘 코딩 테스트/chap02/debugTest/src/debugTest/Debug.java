package debugTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;



class Debug{
	
	//���� Ƚ�� : 100,000,000
	//������ ũ�� : 10
	//����� �ð����⵵ : n (10)
	
	public static void main(String[] args) throws IOException{
		//1. ũ�Ⱑ 10�� �迭�� �����.
		//2. 42�� ���� �������� �迭�� �����Ѵ�.
		//3. n�� n+1���� ������ ī���͸� ������Ų��.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[10];
		
		for(int i=0; i<=9; i++){
			a[i] = (Integer.parseInt(br.readLine())) % 42;
		}
		
		Arrays.sort(a);
		
		//ī��Ʈ�� �ʱⰪ�� 1�� ����
		//ó�� ���ؽ��� ���� �ε������� �񱳸� ���ϱ⶧���� 1�� �������������
		int count = 1;
		
		for(int i=0; i<=8; i++){
			if(a[i] != a[i+1]){
				count++;
			}
		}
		
		System.out.println(count);
	}
}