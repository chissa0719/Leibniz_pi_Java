import java.util.*;
import java.lang.*;

public class Sample_Leibniz {
	public static void main(String args[]){
		
		//����
		System.out.println("���C�v�j�b�c�̌�����p���ĉ~�������v�Z���܂�");
		System.out.print("�J��Ԃ��񐔂���͂��Ă������� >> ");
		
		//int����
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		//�C���X�^���X����
		Leibniz tmp = new Leibniz();
		
		//�v�Z�ۓ���
		System.out.println(tmp.calc(input));
		
	}
}
