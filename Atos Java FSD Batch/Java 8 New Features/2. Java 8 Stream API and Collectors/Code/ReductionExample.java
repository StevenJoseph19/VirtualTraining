package org.module2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

	public static void main(String... args) {

//		List<Integer> list = Arrays.asList(10,10,10);
//		List<Integer> list = Arrays.asList(10,10);
//		List<Integer> list = Arrays.asList(10);
//		List<Integer> list = Arrays.asList();
//		List<Integer> list = Arrays.asList(-10, -10);
		List<Integer> list = Arrays.asList();

//		Integer red = 
//		list.stream()
//				.reduce(0, (i1,i2) -> i1+i2);
//				.reduce(0, Integer::sum);

//		Integer red = 
//		list.stream()
//				.reduce(0, Integer::max);

		Optional<Integer> red = list.stream().reduce(Integer::max);

		System.out.println("red = " + red);
	}

}
