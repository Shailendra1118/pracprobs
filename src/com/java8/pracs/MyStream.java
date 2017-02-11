package com.java8.pracs;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MyStream {
	public static void  main(String args[]){
		try {
			String content = new String(Files.readAllBytes(Paths.get("D:/Keppler/CrazyCode/src/com/java8/pracs/inputBook.txt")));
			List<String> words = (List<String>) Arrays.asList(content.split("[\\P{L}]+"));
			int count = 0;
			for(String w : words){
				if(w.length() > 5){
					System.out.println(w);
					count++;
				}
			}
			
			System.out.println("count: "+count);
			long aCount = words.parallelStream().filter(w->w.length() >5).count();
			System.out.println("stream count: "+aCount);
			Stream<String> echos = Stream.generate(() -> "Echo");
			try(Stream<String> echos1 = Stream.generate(() -> "Echo")){
				boolean flag = echos1.anyMatch((a)-> a == "Echo" ? true : false);
				System.out.println("flag: "+flag);
			}
			
			try(Stream<BigInteger>integers = Stream.iterate(BigInteger.ZERO, n-> n.add(BigInteger.ONE))){	
				//integers.limit(1000); already acted upon
				if(integers.anyMatch(a-> {
					if(BigInteger.TEN.equals(a)){
						System.out.println("found a-"+a);
						return true;
					}else
						System.out.println("didnt work.");
					return false;
				})){
					//System.out.println(integers.count()); already closed
					System.out.println("done.");
				}
			}
			//System.out.println(echos.limit(10).count());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
