import kr.or.bit.AirPlane;

/*
�츮 ȸ��� ����⸦ �ֹ� ���� �Ǹ��ϴ� ȸ���Դϴ�
�츮 ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ��Ϸ��� �մϴ�

������� �䱸����
1. ����⸦ �����ϸ� ������� �̸��� ��ȣ�� �ο��ؾ� �մϴ�
2. ����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο������ Ȯ�� ��� �������
3. ����Ⱑ ��� �ɶ����� ������� ��������� Ȯ�� �� �� �ֽ��ϴ�

����⸦ ����� (AirPlane air = new AirPlane())

���赵�� ���ݱ��� ��� �ڵ�� �ۼ� .... (�ּ��� 3��...)���弼��
kr.or.bit.AriPlane �̸����� �ۼ�
 */




public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
//		
//		AirPlane ar = new AirPlane();
//		
//		ar.AirPlaneInfo("�����װ�", 1);
////		ar.name = "�����װ�";
////		ar.number = 1;
////		ar.AirPlaneInfo();
////		ar.AirPlaneCount();
//		
//		AirPlane ar2 = new AirPlane();
//		ar2.AirPlaneInfo("���ֿ���", 2);
////		ar2.name = "���ֿ���";
////		ar2.number = 2;
////		ar2.AirPlaneInfo();
////		ar2.AirPlaneCount();
//		
//		AirPlane ar3 = new AirPlane();
//		ar3.AirPlaneInfo("�ƽþƳ��װ�", 3);
////		ar3.name = "�ƽþƳ��װ�";
////		ar3.number = 3;
////		ar3.AirPlaneInfo();
////		ar3.AirPlaneCount();
//		
		AirPlane air = new AirPlane(707, "�����װ�");
		air.airPlaneInfo();
		air.airPlaneTotalCount();
		
		AirPlane air2 = new AirPlane(808, "�ƽþƳ�");
		air2.airPlaneInfo();
		air2.airPlaneTotalCount();
		
		
	}

}
