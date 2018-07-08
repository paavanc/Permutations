package com.permutation.translate;

import com.permutation.translate.manager.impl.PermutationManagerImpl;

public class TranslateApplication {

	public static void main(String[] args) {
		PermutationManagerImpl pm = new PermutationManagerImpl();
		pm.printPermutations(args[0]);
	}
}
