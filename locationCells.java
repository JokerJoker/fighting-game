import java.util.ArrayList;

public class locationCells {
	private ArrayList<Integer> locationArr = new ArrayList<Integer>();
	public void setLocationCells (int[] loc){
		for (int x = 0; x < loc.length; x++){
			locationArr.add(loc[x]);
		}
	}
	public String checking(String checkStringNum) {  //判断
		int checkIntNum = Integer.parseInt(checkStringNum);
		String result = "偏了";
		int i = locationArr.indexOf(checkIntNum);
		if ( i >= 0){
			locationArr.remove(i);
			if (locationArr.isEmpty()){
				result = "消灭！";
			}else{
				result = "打中了！";
			}
		}
		System.out.println(result);
		return result;
	}
}