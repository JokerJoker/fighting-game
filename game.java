
public class game {
	
	public static void main(String[] args) {
		int numOfGesses = 0;
		int randomNum = (int)(Math.random()*10);
		int randomNum1 = (int)(Math.random()*10);
		int randomNum2 = (int)(Math.random()*10);
		int[] located = {randomNum,randomNum1,randomNum2};
		inPut inputer = new inPut();
		locationCells gam = new locationCells();
		gam.setLocationCells(located);
		boolean isAlive = true;
		while (isAlive == true) {
			String guess = inputer.getInPut();
			String result = gam.checking(guess);
			numOfGesses++;
			if (result == "消灭！"){
				isAlive = false;
				System.out.println("太棒了，全部消灭！你一共发起了" + numOfGesses + "次攻击。" );
			}
		}
		System.out.print("他们的坐标分别是：");
		for (int des : located ){
			System.out.print(des + " ");
		}
	}
}
