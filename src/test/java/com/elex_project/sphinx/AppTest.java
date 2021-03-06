/*
 * Project Sphinx
 *
 * Copyright (c) 2021. Elex
 * All Rights Reserved.
 */

package com.elex_project.sphinx;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
@Slf4j
class AppTest {

	public static void main(String... args){
		log.info("Test");
		log.info("isTraceEnabled? {}", log.isTraceEnabled());
		JPanel contentPane = new JPanel();
		contentPane.add(new JButton("Click!"));
		new App.Builder()
				.title("Hello")
				.size(800,600)
				.content(contentPane)
				.build().start();
	}
}
