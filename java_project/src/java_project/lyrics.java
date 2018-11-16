package java_project;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class lyrics extends musicList {

	void printLyrics(String url) throws Exception {
		Document doc = Jsoup.connect(url).get();
		Elements ele = doc.select("div.section_lyrics div#lyricText.show_lyrics");

		for (Element el : ele) {
			System.out.println(el);
		}	
	}

	void chooseLyrics(String name) {
		// TODO Auto-generated method stub
		switch (name) {
		case "badBoy":
			try {
				printLyrics(badBoyLyrics);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case "redFlavor":
			try {
				printLyrics(redFlavorLyrics);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "GoodDay":
			try {
				printLyrics(GoodDayLyrics);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "barcode":
			try {
				printLyrics(barcodeLyrics);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case "boongboong":
			try {
				printLyrics(boongboongLyrics);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		

	}
}
