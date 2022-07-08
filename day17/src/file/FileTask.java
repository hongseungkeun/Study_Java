package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
//		// food.txt파일을 현재 경로에 생성하고,
//		// 파일 내용은 족발, 보쌈, 짜장면, 탕수육 네 가지 음식으로 작성한다.
//		// 각 음식은 줄바꿈 후 다음 음식을 넣도록 한다.
//
//		//작성한 내용을 콘솔에 출력한다.
//		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("food.txt"), true));
//		bw.write("족발\n보쌈\n짜장면\n탕수육\n"); //배열로 넣어서 하길바람
//		bw.close();
//
//		String line = null;
//
//		BufferedReader br = null;
//		try {
//			br = new BufferedReader(new FileReader("food.txt"));
//
//			while ((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (FileNotFoundException e) {
//			System.out.println("없는 파일입니다.");
//		} finally {
//			if (br != null) {
//				br.close();
//			}
//		}
		//파일 삭제
		File f = new File("food.txt");
		//exists : 파일이 있는지 검사
		if(f.exists()) {
			//있다면
			//delete : 파일을 삭제
			f.delete();
			System.out.println("삭제성공");
		}
	}
}
