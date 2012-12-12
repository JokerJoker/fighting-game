
public class game {
	
	public static void main(String[] args) {
		int numOfGesses = 0;
		inPut inputer = new inPut();
		locationCells gam = new locationCells();
		int randomNum = (int)(Math.random()*10);
		int[] located = {randomNum,randomNum + 1,randomNum +2};
		gam.setLocationCells(located);
		boolean isAlive = true;
		while (isAlive == true) {
			String guess = inputer.getInPut();
			String result = gam.checking(guess);
			numOfGesses++;
			if (result == "消灭！"){
				isAlive = false;
				System.out.println("太棒了，全部消灭！你猜了" + numOfGesses + "次。" );
			}
		}
		
	}

}
