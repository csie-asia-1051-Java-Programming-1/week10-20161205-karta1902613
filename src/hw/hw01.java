package hw;
/*
 * Topic: �Y���Ǯ��|��^���˩w����A�Y�O�ǥͳq�L�Ӵ���A�h��q�L���~���e�C�Ѯv�ǳƪ��^����礤�����T�Ӷ��ط�@�ҸաA���O�Oť�O�B�\Ū�B�f���C �C�@�Ӷ��ش��纡���Ҭ� 100 ���A�`���� 300 ���C�Q�n�q�L���禳��ؤ覡�C
 *        �覡�@:�Y�O�T�Ӷ��ؤ��ƬҬ� 60 ���H�W ( �]�t 60 �� ) �Y���q�L����C
 *        �覡�G:�Y�T�Ӷ��ؤ����䤤�@�Ӷ��ؤ��ƥ��� 60 ���A���T�Ӷ��ؤ����`�X�W�L 220 ���A�]�i��q�L����C
 *        (�Y�T�Ӷ��ؤ����䤤�@�Ӷ��ؤ��ƥ��� 60 ���A�ӤT�Ӷ��ؤ����`�X�]�S��W�L 220 ���A�i��o�ɦҾ��|�C   �Y�O�T�Ӷ��ؤ�����Ӷ��ؤ��ή�A���t�@�Ӷ��ئ��Z���� 80 �� ( �]�t 80 �� ) �A�]�i��o�ɦҪ����|�C)
 *        ��l�ҧP�w���L�k�q�L����C
 *        ����: �Ĥ@�欰�@�Ӿ�� N �A�N��@�� N �մ��ո�ơC���ᦳ N ��A�C�@�榳 3 �ӫD�t��� ( �d��Ҭ� 0 �� 100), ���O�N��ӦW�ǥ�ť�O�B�\Ū�B�f����������ơC�Y�O�q�L����A�h��X ��P�� �C�Y�O�ݭn�ɦҡA�h��X ��M�� �C�Y�O�L�k�q�L����A �h��X ��F��
 * Date: 2016/12/05
 * Author: 105021043 �B�ͤ�
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
				System.out.println("�Э��s��J���T����:1~100");
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
