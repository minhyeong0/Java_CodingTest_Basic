import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


class Main1{
	
	public static void main(String[] args) throws IOException{
		
		//1. 시 분 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int hour   = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		
		
		//2. 45분 일찍 알람설정하기
		//2-1. 만약 기존의 분에서 45분을 뺏을때 0보다 작을 경우 시간을 1 마이너스하기
		//2-2. 만약 시간이 0인경우에는 시간을 23으로 설정하기
		//2-2. 만약 기존의 분에서 45분을 뺏을때 0보다 작을 경우 기존시간 - 45 + 60으로 분 설정하기

		if(minute - 45 < 0){
			if(hour == 0)
				hour = 23;
			else
				hour--;
			minute = minute - 45 + 60;
		}else{
			minute = minute - 45;
		}
		
		//3. 45분 앞당긴 시 분 출력하기
		sb.append(hour);
		sb.append(" ");
		sb.append(minute);
		
		bw.write(sb.toString());
		
		bw.flush();
		br.close();
		bw.close();
	}
}