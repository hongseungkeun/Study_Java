package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import vo.MaleVo;

public class MaleDAO {
	//메모장의 데이터를 VO객체로 리턴하는 메소드
	public ArrayList<MaleVo> setObject() throws IOException{
		BufferedReader br = DBConnecterM.getReader();
		MaleVo mvo = new MaleVo();
		ArrayList<MaleVo> males = new ArrayList<>(Arrays.asList(mvo));
		String line = null;
		
		 while((line = br.readLine()) != null) {
	         String[] mvoDatas = line.split("\t");
	         mvo.setName(mvoDatas[0]);
	         mvo.setRanking(Integer.parseInt(mvoDatas[1]));
	         mvo.setNames(Integer.parseInt(removeComma(mvoDatas[2])));
	         males.add(mvo);
	      }
	      return males;
	}
	
	public String removeComma(String data) {
	      return data.replaceAll(",", "");
	   }
}
