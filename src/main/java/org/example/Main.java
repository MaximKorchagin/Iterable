package org.example;

public class Main {
    public static void main(String[] args) {
        Randoms randoms = new Randoms(90, 100);
        for (int r : randoms) {
            System.out.println("��������� �����: " + r);
            if (r == 100) {
                System.out.println("������ ����� 100, ������� �� ���� ��������");
                break;
            }
        }
    }
}