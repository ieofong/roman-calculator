package com.ieofong.romancalculator.service;

import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

@Service
public class FileStreamService {

	public List<String> readFile(String fileName) {
		
		List<String> listData = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			listData = stream.collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return listData;
	}
}
