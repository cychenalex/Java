package tw.org.iii.tutor;

import java.util.Arrays;

public class PokerV3 {

	public static void main(String[] args) {
		int num = 52;    //幾張牌
		
		int[] poker = new int[num];
		for (int i = 0 ; i < num ; i++)
		{
			poker[i] = i;
		}
		
		for (int i = num - 1 ; i > 0 ; i--)
		{
			int rand = (int)(Math.random() * (i + 1) );    //51 + 1
			
			/*洗牌 -> 交換位置*/
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		
		int[][] players = new int[4][13];    //空陣列 -> [玩家個數][玩家每人擁有的牌數]
		
		for (int i = 0 ; i < num ; i++)
		{
			players[i % 4][i / 4] = poker[i];
		}
		
		/*花色*/
		String[] suit = {"黑桃", "紅心", "梅花", "方塊"};
		String[] values = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		for (int[] player : players)
		{
			Arrays.sort(player);    //花色排序
			for (int card : player)
			{
				System.out.printf("%s%s ", suit[card/13], values[card % 13]);
			}
			System.out.println();
		}
	}

}
