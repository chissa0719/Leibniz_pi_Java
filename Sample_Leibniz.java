import java.util.*;
import java.lang.*;

public class Sample_Leibniz {
	public static void main(String args[]){
		
		//����
		System.out.println("���C�v�j�b�c�̌�����p���ĉ~�������v�Z���܂�");
		System.out.print("�J��Ԃ��񐔂���͂��Ă������� >> ");
		
		//����(long�^����Ȃ���100����Exception�ɂȂ���)
		Scanner sc = new Scanner(System.in);
		long input = sc.nextLong();
		
		//�C���X�^���X����
		Leibniz tmp = new Leibniz();
		
		// �����O�̎������擾
	        long startTime = System.currentTimeMillis();
		
		//�v�Z�ۓ���
		System.out.println(tmp.calc(input));
		
		// ������̎������擾
	        long endTime = System.currentTimeMillis();
		
		//������-�����O�ŁA���Ԃ��Z�o
		System.out.println("�v�Z���ԁF" + (endTime - startTime) + " ms");
		
	}
}
