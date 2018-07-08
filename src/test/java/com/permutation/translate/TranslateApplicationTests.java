package com.permutation.translate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.permutation.translate.manager.impl.PermutationManagerImpl;

@RunWith(MockitoJUnitRunner.class)
public class TranslateApplicationTests {

	private final static String TEST_STRING = "10X10X0";
	@InjectMocks
	private PermutationManagerImpl permutationManager;

	@Test
	public void contextLoads() {
		permutationManager.printPermutations(TEST_STRING);

	}

}
