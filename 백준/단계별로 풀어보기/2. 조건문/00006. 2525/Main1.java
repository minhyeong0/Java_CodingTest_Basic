import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;


class Main1{
	public static void main(String[] args) throws IOException{
		
		//1. 현재시간, 조리시간 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int hour   = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int play   = Integer.parseInt(br.readLine());
		
		//2. 조리시간 계산하기
		//2-1. 만약 (분 + 조리시간) / 60이 1이상이라면
		//2-1. (분 + 조리시간) / 60를 시에 더하기
		//2-1. (분 + 조리시간) % 60를 분으로 설정하기
		//2-1. 시간이 23시 59분이면 시간과 분을 0으로 바꾸기
		//2-2. 만약 (분 + 조리시간) / 60이 1이하라면
		//2-2. 분 + 조리시간으로 분 설정하기
		if((minute + play) / 60 >= 1){
			hour = hour + ((minute + play) / 60);
			minute = (minute + play) % 60;
			
			if(hour > 23){
				hour = hour - 24;
			}
		}else{
			minute = minute + play;
		}
	
		//3. 요리 끝나는 시간 출력
		sb.append(hour);
		sb.append(" ");
		sb.append(minute);
		
		bw.write(sb.toString());
		bw.newLine();
		
		bw.flush();
		bw.close();
		br.close();
	}
}