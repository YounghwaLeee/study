package com.bitcamp.myapp.register;

import java.util.List;

;

public interface RegisterDAOImpl {

   
   //ȸ������
   public int insertRecord(RegisterVO vo);
   
   //ȸ������ ���� �� ���� ���� �����ϴ� �޼ҵ� �α����ϸ� ���ǿ� ���� �־�д�. ȸ�������� �ϴϱ� ���̵� ���� �ʿ���(����)
   public void selectRecord(RegisterVO vo); //�Ű�������vo�� ����return �����൵��. �����ߴ����� �Ȱ��� ������ �ٲ�� ������ return�����൵��. 
   //public RegisterVO selectRecord(String userid);//���̵� ���� ������ ����������Ѵ�
   
   //ȸ������ ����(��ȯ��int �����Ǿ����� �ȵǾ�����) update��
   public int updateRecord(RegisterVO vo);
   
   //�α��� Ȯ���ϴ°�
   public void loginSelect(RegisterVO vo);
   
   //���̵� �ߺ��˻� (���̵�������̸Ӹ�Ű�����س�)
   public int idDoubleCheck(String userid);
   
   
   
   //�����ȣ�˻�(���θ��ּ� ������ db��ȸ��, ���θ��� �ش��ϴ� ���ڵ� �����ؼ� ����. vo��list ��Ƽ� return.
   public List<ZipCodeVO> zipSearchRecord(String doro);
   
   
}