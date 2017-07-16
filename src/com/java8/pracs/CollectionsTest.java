package com.java8.pracs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
//import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Test(expected = UnsupportedOperationException.class)
	public void givenUsingTheJdk_whenUnmodifiableListIsCreated_thenNotModifiable() {
	    List<String> list = new ArrayList<String>(Arrays.asList("one", "two", "three"));
	    List<String> unmodifiableList = Collections.unmodifiableList(list);
	    unmodifiableList.add("four");
	}
	
	@Test
	public void givenListContainsNulls_whenRemovingNullsWithPlainJava_thenCorrect() {
	    List<Integer> list = new ArrayList<>();
	    list.add(null);
	    list.add(12);
	    list.add(null);
	    while (list.remove(null));	 
	    assertThat(list, hasSize(1));
	}
}
