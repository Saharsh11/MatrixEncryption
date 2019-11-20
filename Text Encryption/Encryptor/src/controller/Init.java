package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import encryption.Cryptor;

public class Init {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Plain-Text: ");
		String str = scn.nextLine();
		String str1 = Cryptor.cryption(str);
		System.out.println("Encrypted Text "+str1);
		System.out.println("Decrypted Text "+Cryptor.cryption(str1));
	}
	
	/*private static void fileWriter(String fName,String str) {
		BufferedWriter b = null;
		try {
			Writer w= new FileWriter(new File(fName));
			b= new BufferedWriter(w);
			b.write(str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static String fileReader(String fName) {
		FileReader f;
		String str = "";
		try {
			f = new FileReader(fName);
			BufferedReader br = new BufferedReader(f);
			while(!(br.read()==-1)) {
				str+= br.readLine() + " ";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}*/
}
