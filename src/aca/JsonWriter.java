package aca;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonWriter {

	private Nutrition nutrition;
	private String jsonPath;

	public JsonWriter(Nutrition nutrition, String jsonPath) {
		this.nutrition = nutrition;
		this.jsonPath = jsonPath;
	}

	public void process() throws IOException {

		ObjectMapper mapper = new ObjectMapper();

		String jsonNutrition = mapper.writeValueAsString(nutrition);

		File file = new File(jsonPath);
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(fw);
		writer.write(jsonNutrition);
		writer.flush();
		writer.close();

	}
}