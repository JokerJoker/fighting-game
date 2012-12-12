
public class locationCells {
	int[] locationCells =  {0,0,0} ;
	int numOfHits = 0;
	public void setLocationCells (int[] locations){ 
		 locationCells = locations;		//注意赋值过程（变量顺序）
	}
	public String checking(String checkStringNum) {
		int checkIntNum = Integer.parseInt(checkStringNum);
		String result = "偏了";
		for (int cell : locationCells){
			if (checkIntNum == cell) {
				result = "打中了！";
				numOfHits++;
				break;
			}
			}
		if (numOfHits == locationCells.length){
			result = "消灭！";
		}
		System.out.println(result);
		return result;
	}
}
