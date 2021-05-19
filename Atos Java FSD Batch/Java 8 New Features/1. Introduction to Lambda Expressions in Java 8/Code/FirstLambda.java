package org.module1;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

	public static void main(String[] args) {

//		FileFilter filter = new FileFilter() {
//
//			@Override
//			public boolean accept(File pathname) {
//
//				return pathname.getName().endsWith(".java");
//			}
//		};

		FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".java");
		File dir = new File("C:\\eclipse-workspace\\CoreJava\\WhatsNewInJava8\\src\\org\\module1");

//		File[] files = dir.listFiles(filter);
		File[] files = dir.listFiles(filterLambda);

		for (File f : files) {
			System.out.println(f);
		}
	}

}
