package java_project;

public class chooseMethod extends musicList {
	private String song[] = new String[] { "", "", "", "", "" };
	int cnt = 0;
	MusicPlayer mp = new MusicPlayer();

	void choose(String name) {
		for (int i = 0; i < cnt; i++) {
			if (song[i].equals(name) == true) {
				if (name.equals("GoodDay")) {
					mp.setMusic(GoodDay);
					mp.play();
					return;
				}else if (name.equals("badBoy")) {
					mp.setMusic(badBoy);
					mp.play();
					return;
				}else if (name.equals("redFlavor")) {
					mp.setMusic(redFlavor);
					mp.play();
					return;
				}else if (name.equals("barcode")) {
					mp.setMusic(barcode);
					mp.play();
					return;
				}else if (name.equals("boongboong")) {
					mp.setMusic(boongboong);
					mp.play();
					return;
				}
			}
		}
	}

	void close() {
		mp.close();
	}

	void setAddSong(String name) {
		song[cnt++] = name;
	}

	void setAddSong(String name1, String name2) {
		song[cnt++] = name1;
		song[cnt++] = name2;
	}

	void getPrintSong() {
		System.out.println("\n------Playe List-------\n");
		for (int k = 0; k < cnt; k++) {
			System.out.printf("%s\n", song[k]);
		}
		System.out.println("\n-----------------------");
	}

	void remove(String name) {

		for (int k = 0; k < song.length; k++) {
			if (song[k].equals(name)) {
				for (int j = k; j < song.length - 1; j++) {
					song[j] = song[j + 1];
				}
				cnt--;
				break;
			}
		}
	}

	void chart() {
		System.out.println("\n------Chart-------\n");
		System.out.printf("1. GoodDay\n2. badBoy\n3. redFlavor\n4. barcorde\n5. boongboong\n\n");
		System.out.println("--------------------");
	}

	void clean() {
		for (int i = 0; i < 17; i++)
			System.out.println("\n");
	}

}
