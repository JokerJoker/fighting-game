import java.io.*;
public class inPut {
public static String getInPut(){
	String inPutLine = null;
	System.out.print("请输入一个打击坐标:  ");
	try {
		BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
		inPutLine = is.readLine();
		if (inPutLine.length() == 0) return null;
	} catch (IOException e) {
		System.out.println("IOException: "+ e);
	}
	return inPutLine;
	
}
}
