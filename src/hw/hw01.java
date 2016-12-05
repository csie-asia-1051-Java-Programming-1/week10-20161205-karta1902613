package hw;
/*
 * Topic: 某間學校舉辦英文檢定測驗，若是學生通過該測驗，則能通過畢業門檻。老師準備的英文測驗中分為三個項目當作考試，分別是聽力、閱讀、口說。 每一個項目測驗滿分皆為 100 分，總分為 300 分。想要通過測驗有兩種方式。
 *        方式一:若是三個項目分數皆為 60 分以上 ( 包含 60 分 ) 即為通過測驗。
 *        方式二:若三個項目中有其中一個項目分數未滿 60 分，但三個項目分數總合超過 220 分，也可算通過測驗。
 *        (若三個項目中有其中一個項目分數未滿 60 分，而三個項目分數總合也沒能超過 220 分，可獲得補考機會。   若是三個項目中有兩個項目不及格，但另一個項目成績高於 80 分 ( 包含 80 分 ) ，也可獲得補考的機會。)
 *        其餘皆判定為無法通過測驗。
 *        說明: 第一行為一個整數 N ，代表共有 N 組測試資料。之後有 N 行，每一行有 3 個非負整數 ( 範圍皆為 0 到 100), 分別代表該名學生聽力、閱讀、口說的測驗分數。若是通過測驗，則輸出 ”P” 。若是需要補考，則輸出 ”M” 。若是無法通過測驗， 則輸出 ”F”
 * Date: 2016/12/05
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		int score[][]=new int[n][3];
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
			score[i][j] =scn.nextInt();
			if(score[i][j]<0||score[i][j]>100){
				j=j-1;
				System.out.println("請重新輸入正確的值:1~100");
			   }			
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<3;j++){
				
			System.out.print(score[i][j]+"\t");
			}if((score[i][0]+score[i][1]+score[i][2])/3>=60){
				System.out.print("P");
			}else if(score[i][0]+score[i][1]+score[i][2]>=220){
				if((score[i][0]>=60&&score[i][1]>=60&&score[i][2]<60)||(score[i][0]>=60&&score[i][1]<60&&score[i][2]>=60)||(score[i][0]>=60&&score[i][1]<60&&score[i][2]>=60)||(score[i][0]<60&&score[i][1]>=60&&score[i][2]>=60)){
					System.out.print("P");
		         }
			}
			else if((score[i][0]<=60&&score[i][1]<=60&&score[i][2]>=80)||(score[i][0]<=60&&score[i][1]>=80&&score[i][2]<=60)||(score[i][0]<=60&&score[i][1]>=80&&score[i][2]<=60)||(score[i][0]>=80&&score[i][1]<=60&&score[i][2]<=60)){
				System.out.print("M");
			}else{
					System.out.print("F");
		    }
			System.out.println();
	   }
	}
}
