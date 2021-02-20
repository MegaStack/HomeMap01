package com.gmail.oastro36;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File fileIn = new File("English.in.txt");
		File fileOut = new File("English.out.txt");
		MyMap myMap = new MyMap();
		
		Translater tr = new Translater(fileIn, fileOut, myMap.getHm());
		tr.loadEnglText();
	}

}
