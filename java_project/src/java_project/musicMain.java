package java_project;

import java.util.Scanner;

public class musicMain {

	public static void main(String[] args) {
		int num;
		String name,buf;
		chooseMethod cm = new chooseMethod();
		lyrics lr=new lyrics();
		Scanner sn = new Scanner(System.in);

		while (true) {
			cm.clean();
			System.out.println("----------------------------------");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      0. ��Ʈ ���                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      1. �뷡 �߰�                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      2. �뷡 ���                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      3. ���� ���                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      4. ����Ʈ ���                            |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      5. �뷡 ����                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      6. �뷡 ����                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      7. �뷡 2�� �߰�                         |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("----------------------------------");
			
			System.out.print("�޴� �Է� : ");
			num = sn.nextInt();
			
			switch (num) {
			case 0:
				cm.chart();
				System.out.println("\nȭ������ ���ư��� ������ �ƹ�Ű�� ��������");
				buf=sn.next();
				cm.clean();
				continue;
				
			case 1:
				System.out.print("��� ���� �뷡�� �߰��ϼ���. : ");
				name=sn.next();
				cm.setAddSong(name);
				continue;
				
			case 2:				
				System.out.print("��� ���� �뷡�� �Է��ϼ��� : ");
				name = sn.next();
				cm.choose(name);
				System.out.println("\nȭ������ ���ư��� ������ �ƹ�Ű�� ��������");
				buf=sn.next();
				continue;
				
			case 3:
				System.out.print("������ �Է��� �ּ��� : ");
				name=sn.next();
				lr.chooseLyrics(name);
				System.out.println("\nȭ������ ���ư��� ������ �ƹ�Ű�� ��������");
				buf=sn.next();
				continue;
				
			case 4:
				cm.getPrintSong();
				System.out.println("\nȭ������ ���ư��� ������ �ƹ�Ű�� ��������");
				buf=sn.next();
				continue;
				
			case 5:
				System.out.print("�����ϰ� ���� �뷡�� �Է��ϼ��� : " );
				name=sn.next();
				cm.remove(name);
				continue;
				
			case 6:
				cm.close();
				continue;
			case 7:
				System.out.print("ù ��° �뷡 �Է� : ");
				name=sn.next();
				System.out.print("�� ��° �뷡 �Է� : ");
				buf=sn.next();
				cm.setAddSong(name,buf);
				continue;
				
			}
		}
	}
}

