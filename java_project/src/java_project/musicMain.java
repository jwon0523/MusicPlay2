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
			System.out.println("|      0. 차트 출력                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      1. 노래 추가                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      2. 노래 재생                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      3. 가사 출력                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      4. 리스트 출력                            |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      5. 노래 삭제                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      6. 노래 멈춤                               |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("|      7. 노래 2개 추가                         |");
			System.out.println("|                                |");
			System.out.println("|                                |");
			System.out.println("----------------------------------");
			
			System.out.print("메뉴 입력 : ");
			num = sn.nextInt();
			
			switch (num) {
			case 0:
				cm.chart();
				System.out.println("\n화면으로 돌아가고 싶으면 아무키를 누르세요");
				buf=sn.next();
				cm.clean();
				continue;
				
			case 1:
				System.out.print("듣고 싶은 노래를 추가하세요. : ");
				name=sn.next();
				cm.setAddSong(name);
				continue;
				
			case 2:				
				System.out.print("듣고 싶은 노래를 입력하세요 : ");
				name = sn.next();
				cm.choose(name);
				System.out.println("\n화면으로 돌아가고 싶으면 아무키를 누르세요");
				buf=sn.next();
				continue;
				
			case 3:
				System.out.print("제목을 입력해 주세요 : ");
				name=sn.next();
				lr.chooseLyrics(name);
				System.out.println("\n화면으로 돌아가고 싶으면 아무키를 누르세요");
				buf=sn.next();
				continue;
				
			case 4:
				cm.getPrintSong();
				System.out.println("\n화면으로 돌아가고 싶으면 아무키를 누르세요");
				buf=sn.next();
				continue;
				
			case 5:
				System.out.print("삭제하고 싶은 노래를 입력하세요 : " );
				name=sn.next();
				cm.remove(name);
				continue;
				
			case 6:
				cm.close();
				continue;
			case 7:
				System.out.print("첫 번째 노래 입력 : ");
				name=sn.next();
				System.out.print("두 번째 노래 입력 : ");
				buf=sn.next();
				cm.setAddSong(name,buf);
				continue;
				
			}
		}
	}
}

