

import java.util.Scanner;
import java.util.Calendar;
class CalendarEx
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("�⵵=");
        int year = scan.nextInt();

        System.out.print("��=");
        int month = scan.nextInt();

        //�������
        System.out.printf("\t\t%d�� %d��\n", year, month);
        System.out.println("��\t��\tȭ\t��\t��\t��\t��");

        //���� ��¥ �ð� ��ü ���ϱ�
        Calendar date = Calendar.getInstance();
        date.set(year, month-1, 1);//��¥ ����   1��->0, 2��->1,.... 5��->4, 6��->5

        int week = date.get(Calendar.DAY_OF_WEEK);//���ϱ��ϱ�

        int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);
        //��������

        //�������
        for(int s=1; s<week; s++){
            System.out.print("\t");//���������� ������ ����϶�.
        }
        //��¥ ���
        for(int d=1; d<=lastDay; d++){
            System.out.print(d+"\t");
            if((d+week-1)%7==0){//����� ���ڰ� 7�� ������̸� �ٹٲٱ�
                System.out.println();
            }
        }
        System.out.println();
    }
}