package com.permutation.translate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.permutation.translate.manager.PermutationManager;
import com.permutation.translate.manager.impl.PermutationManagerImpl;

@Configuration
public class BeanConfig {

	@Bean
	public PermutationManager getPermutationManager() {
		return new PermutationManagerImpl();
	}

}
