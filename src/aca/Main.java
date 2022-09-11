package aca;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args)
			throws SAXException, IOException, ParserConfigurationException, XPathExpressionException, XMLStreamException {

		String xmlFilePath = "res/Nutrition-Values.xml";
		String jsonPath = "res/Nutrition-Values.json";

		XMLReader xmlReader = new XMLReader(xmlFilePath);
		xmlReader.process();

		Nutrition nutrition = xmlReader.getNutrition();

		JsonWriter jsonWriter = new JsonWriter(nutrition, jsonPath);
		jsonWriter.process();

		System.out.println("\"Nutrition-Values.json\" file has been created");
	}
}