package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KeboardInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStream in = System.in; 
		URL url = new URL("http://www.onet.pl");
		in= url.openStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		String line;
		int lineNumber =1;
		while ( (line=br.readLine() )!=null) {
			if (line.equals("END")) break;
			lineNumber++;
			System.out.println("[" + lineNumber + "]:" + line);
		}
		System.out.println("================================================================");
		in = url.openStream();
		int elemNumber=1;
		Scanner scanner = new Scanner(in);
		StringBuilder sb=new StringBuilder();
		//scanner.useDelimiter("a");
		while (scanner.hasNext()){
			String elem = scanner.next();
			if (elem.equals("END")) break;
			elemNumber++;
			sb.append(elem);
			sb.append("\n");
			System.out.println("[" + elemNumber + "]:" +elem);
			
		}
		System.out.println("Lines:"+lineNumber+" Elems:"+elemNumber);

		File out = new File(".\\output.txt");
		FileWriter fout = new FileWriter(out,true);
		//PrintWriter pout = new PrintWriter(out);
		//pout.println();
		String wzorzec = "<a\\b([^>]*)>(.*?)</a>";
		Pattern pattern = Pattern.compile(wzorzec);
		Matcher matcher = pattern.matcher(sb);
		while (matcher.find()){
			System.out.println(matcher.group());
			System.out.println(matcher.group(1).trim());
			System.out.println(matcher.group(2).trim());
			System.out.println("---");
			fout.write(matcher.group(1).trim());
			//fout.write("\r\n");
			fout.write(System.lineSeparator());
			
		}
		fout.close();
		
		
		

	}

}
