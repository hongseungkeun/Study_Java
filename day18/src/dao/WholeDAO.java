package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import vo.FemaleVo;
import vo.MaleVo;

public class WholeDAO {
	public void merge() throws IOException {
		
		
		MaleDAO mdao = new MaleDAO();
		FemaleDAO fdao = new FemaleDAO();
		String data = "";
		
		data += fdao.setObject();
		data += mdao.setObject();
	

		MaleVo mvo = new MaleVo();
		FemaleVo fvo = new FemaleVo();
		ArrayList<MaleVo> a = new ArrayList(Arrays.asList(mvo));
		ArrayList<FemaleVo> b = new ArrayList(Arrays.asList(fvo));
		ArrayList<WholeDAO> total = new ArrayList<>();
	
		total.addAll(a);
		total.addAll(b);
//		String content1 = null;
//		String content2 = null;
//		String data1 = "";
//		String data2 = "";
//		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("males.txt"));
//		String temp = null;
//		
//		content1 = new String(Files.readAllBytes(Paths.get(DBConnecterM.getPath())));
//		content2 = new String(Files.readAllBytes(Paths.get(DBConnecterF.getPath())));
//		data1 = content1.charAt(content1.length() - 1) == '\n' ? "" : "\n";
//		data2 = content2.charAt(content2.length() - 1) == '\n' ? "" : "\n";
//		data1 += a;
//		data2 += b;
//		
//		BufferedReader br1 = DBConnecterM.getReader();
//		BufferedReader br2 = DBConnecterF.getReader();
//		BufferedWriter bw1 = DBConnecterM.getAppend();
//		BufferedWriter bw2 = DBConnecterF.getAppend();
//		
//		bw.write(data);
//		
//		bw.close();
	}

	public static void main(String[] args) throws IOException {
		WholeDAO d = new WholeDAO();
		d.merge();
	}

}
