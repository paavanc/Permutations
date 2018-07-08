package com.permutation.translate.manager.impl;

import com.permutation.translate.manager.PermutationManager;

public class PermutationManagerImpl implements PermutationManager {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.permutation.translate.manager.impl.PermutationManager#printPermutaitons(
	 * java.lang.String)
	 */
	@Override
	public void printPermutations(String x) {
		if (x != null && !x.isEmpty()) {
			printHelper(x.toCharArray(), 0);
		}
	}

	private void printHelper(char charrArr[], int index) {
		if (index == charrArr.length) {
			System.out.println(charrArr);
			return;
		}
		if (charrArr[index] == 'X') {
			charrArr[index] = '1';
			printHelper(charrArr, index + 1);
			charrArr[index] = '0';
			printHelper(charrArr, index + 1);
			charrArr[index] = 'X';
		} else
			printHelper(charrArr, index + 1);
	}
}
