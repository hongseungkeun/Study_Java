package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import vo.FemaleVo;


public class FemaleDAO {
	//메모장의 데이터를 VO객체로 리턴하는 메소드
	public ArrayList<FemaleVo> setObject() throws IOException{
		BufferedReader br = DBConnecterM.getReader();
		FemaleVo fvo = new FemaleVo();
		ArrayList<FemaleVo> females = new ArrayList<>(Arrays.asList(fvo));
		String line = null;
		
		 while((line = br.readLine()) != null) {
	         String[] fvoDatas = line.split("\t");
	         fvo.setName(fvoDatas[0]);
	         fvo.setRanking(Integer.parseInt(fvoDatas[1]));
	         fvo.setNames(Integer.parseInt(removeComma(fvoDatas[2])));
	         females.add(fvo);
	      }
	      return females;
	}
	
	public String removeComma(String data) {
	      return data.replaceAll(",", "");
	   }
}
