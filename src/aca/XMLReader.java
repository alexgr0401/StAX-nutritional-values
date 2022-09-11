package aca;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.xml.sax.SAXException;

public class XMLReader {

	List<DailyValues> dailyValues = new ArrayList<>();
	List<Food> foodList = new ArrayList<>();

	String xmlFilePath;

	public XMLReader(String xmlFilePath) {
		this.xmlFilePath = xmlFilePath;
	}

	public void setXmlFilePath(String xmlFilePath) throws ParserConfigurationException, SAXException, IOException {
		this.xmlFilePath = xmlFilePath;
	}

	public void process() throws ParserConfigurationException, SAXException, IOException {

		boolean bTotalFat = false;
		boolean bTotalFat2 = false;
		boolean bSaturatedFat = false;
		boolean bSaturatedFat2 = false;
		boolean bCholesterol = false;
		boolean bCholesterol2 = false;
		boolean bSodium = false;
		boolean bSodium2 = false;
		boolean bCarb = false;
		boolean bCarb2 = false;
		boolean bFiber = false;
		boolean bFiber2 = false;
		boolean bProtein = false;
		boolean bProtein2 = false;
		boolean bName = false;
		boolean bServing = false;
		boolean bCalories = false;
		boolean bVitaminA = false;
		boolean bVitaminC = false;
		boolean bMineralCa = false;
		boolean bMineralFe = false;

		Integer totalFatValue = null;
		String totalFatUnit = null;
		Integer saturatedFatValue = null;
		String saturatedFatUnit = null;
		Integer cholesterolValue = null;
		String cholesterolUnit = null;
		Integer sodiumValue = null;
		String sodiumUnit = null;
		Integer carbValue = null;
		String carbUnit = null;
		Integer fiberValue = null;
		String fiberUnit = null;
		Integer proteinValue = null;
		String proteinUnit = null;
		String name = null;
		Double servingValue = null;
		String servingUnit = null;
		Integer caloriesTotalValue = null;
		Integer caloriesFatValue = null;
		Double totalFat = null;
		Double saturatedFat = null;
		Integer cholesterol = null;
		Integer sodium = null;
		Integer carb = null;
		Integer fiber = null;
		Integer protein = null;
		Integer vitaminA = null;
		Integer vitaminC = null;
		Integer mineralCa = null;
		Integer mineralFe = null;

		try {

			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(xmlFilePath));

			while (eventReader.hasNext()) {

				XMLEvent event = eventReader.nextEvent();

				switch (event.getEventType()) {
				case XMLStreamConstants.START_ELEMENT:
					StartElement startElement = event.asStartElement();
					String qName = startElement.getName().getLocalPart();

					Iterator<Attribute> iterator = startElement.getAttributes();

					if (qName.equalsIgnoreCase("total-fat")) {
						while (iterator.hasNext()) {
							Attribute attribute = iterator.next();
							totalFatUnit = attribute.getValue();
							bTotalFat = true;
						}
					} else if (qName.equalsIgnoreCase("saturated-fat")) {
						while (iterator.hasNext()) {
							Attribute attribute = iterator.next();
							saturatedFatUnit = attribute.getValue();
							bSaturatedFat = true;
						}
					} else if (qName.equalsIgnoreCase("cholesterol")) {
						while (iterator.hasNext()) {
							Attribute attribute = iterator.next();
							cholesterolUnit = attribute.getValue();
							bCholesterol = true;
						}
					} else if (qName.equalsIgnoreCase("sodium")) {
						while (iterator.hasNext()) {
							Attribute attribute = iterator.next();
							sodiumUnit = attribute.getValue();
							bSodium = true;
						}
					} else if (qName.equalsIgnoreCase("carb")) {
						while (iterator.hasNext()) {
							Attribute attribute = iterator.next();
							carbUnit = attribute.getValue();
							bCarb = true;
						}
					} else if (qName.equalsIgnoreCase("fiber")) {
						while (iterator.hasNext()) {
							Attribute attribute = iterator.next();
							fiberUnit = attribute.getValue();
							bFiber = true;
						}
					} else if (qName.equalsIgnoreCase("protein")) {
						while (iterator.hasNext()) {
							Attribute attribute = iterator.next();
							proteinUnit = attribute.getValue();
							bProtein = true;
						}
					}
					break;

				case XMLStreamConstants.CHARACTERS:
					Characters characters = event.asCharacters();

					if (bTotalFat) {
						totalFatValue = Integer.parseInt(characters.getData());
						bTotalFat = false;
					}
					if (bSaturatedFat) {
						saturatedFatValue = Integer.parseInt(characters.getData());
						bSaturatedFat = false;
					}
					if (bCholesterol) {
						cholesterolValue = Integer.parseInt(characters.getData());
						bCholesterol = false;
					}
					if (bSodium) {
						sodiumValue = Integer.parseInt(characters.getData());
						bSodium = false;
					}
					if (bCarb) {
						carbValue = Integer.parseInt(characters.getData());
						bCarb = false;
					}
					if (bFiber) {
						fiberValue = Integer.parseInt(characters.getData());
						bFiber = false;
					}
					if (bProtein) {
						proteinValue = Integer.parseInt(characters.getData());
						bProtein = false;
					}
					break;

				case XMLStreamConstants.END_ELEMENT:
					EndElement endElement = event.asEndElement();

					if (endElement.getName().getLocalPart().equalsIgnoreCase("daily-values")) {
						DailyValues values = new DailyValues(totalFatValue, totalFatUnit, saturatedFatValue,
								saturatedFatUnit, cholesterolValue, cholesterolUnit, sodiumValue, sodiumUnit, carbValue,
								carbUnit, fiberValue, fiberUnit, proteinValue, proteinUnit);
						dailyValues.add(values);
					}
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}

		try {

			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLEventReader eventReader = factory.createXMLEventReader(new FileReader(xmlFilePath));

			while (eventReader.hasNext()) {

				XMLEvent event = eventReader.nextEvent();

				switch (event.getEventType()) {
				case XMLStreamConstants.START_ELEMENT:
					StartElement startElement = event.asStartElement();
					String qName = startElement.getName().getLocalPart();

					Iterator<Attribute> iterator = startElement.getAttributes();

					if (qName.equalsIgnoreCase("name")) {
						bName = true;
					} else if (qName.equalsIgnoreCase("serving")) {
						while (iterator.hasNext()) {
							Attribute attribute = iterator.next();
							servingUnit = attribute.getValue();
							bServing = true;
						}
					} else if (qName.equalsIgnoreCase("calories")) {
						Attribute attribute1 = startElement.getAttributeByName(new QName("total"));
						caloriesTotalValue = Integer.parseInt(attribute1.getValue());
						Attribute attribute2 = startElement.getAttributeByName(new QName("fat"));
						caloriesFatValue = Integer.parseInt(attribute2.getValue());
						bCalories = true;
					} else if (qName.equalsIgnoreCase("total-fat")) {
						bTotalFat2 = true;
					} else if (qName.equalsIgnoreCase("saturated-fat")) {
						bSaturatedFat2 = true;
					} else if (qName.equalsIgnoreCase("cholesterol")) {
						bCholesterol2 = true;
					} else if (qName.equalsIgnoreCase("sodium")) {
						bSodium2 = true;
					} else if (qName.equalsIgnoreCase("carb")) {
						bCarb2 = true;
					} else if (qName.equalsIgnoreCase("fiber")) {
						bFiber2 = true;
					} else if (qName.equalsIgnoreCase("protein")) {
						bProtein2 = true;
					} else if (qName.equalsIgnoreCase("a")) {
						bVitaminA = true;
					} else if (qName.equalsIgnoreCase("c")) {
						bVitaminC = true;
					} else if (qName.equalsIgnoreCase("ca")) {
						bMineralCa = true;
					} else if (qName.equalsIgnoreCase("fe")) {
						bMineralFe = true;
					}
					break;

				case XMLStreamConstants.CHARACTERS:
					Characters characters = event.asCharacters();

					if (bName) {
						name = characters.getData();
						bName = false;
					}
					if (bServing) {
						servingValue = Double.parseDouble(characters.getData());
						bServing = false;
					}
					if (bCalories) {
						bCalories = false;
					}
					if (bTotalFat2) {
						totalFat = Double.parseDouble(characters.getData());
						bTotalFat2 = false;
					}
					if (bSaturatedFat2) {
						saturatedFat = Double.parseDouble(characters.getData());
						bSaturatedFat2 = false;
					}
					if (bCholesterol2) {
						cholesterol = Integer.parseInt(characters.getData());
						bCholesterol2 = false;
					}
					if (bSodium2) {
						sodium = Integer.parseInt(characters.getData());
						bSodium2 = false;
					}
					if (bCarb2) {
						carb = Integer.parseInt(characters.getData());
						bCarb2 = false;
					}
					if (bFiber2) {
						fiber = Integer.parseInt(characters.getData());
						bFiber2 = false;
					}
					if (bProtein2) {
						protein = Integer.parseInt(characters.getData());
						bProtein2 = false;
					}
					if (bVitaminA) {
						vitaminA = Integer.parseInt(characters.getData());
						bVitaminA = false;
					}
					if (bVitaminC) {
						vitaminC = Integer.parseInt(characters.getData());
						bVitaminC = false;
					}
					if (bMineralCa) {
						mineralCa = Integer.parseInt(characters.getData());
						bMineralCa = false;
					}
					if (bMineralFe) {
						mineralFe = Integer.parseInt(characters.getData());
						bMineralFe = false;
					}
					break;

				case XMLStreamConstants.END_ELEMENT:
					EndElement endElement = event.asEndElement();

					if (endElement.getName().getLocalPart().equalsIgnoreCase("food")) {
						Vitamins vitamins = new Vitamins(vitaminA, vitaminC);
						Minerals minerals = new Minerals(mineralCa, mineralFe);
						Food foods = new Food(name, servingValue, servingUnit, caloriesTotalValue, caloriesFatValue,
								totalFat, saturatedFat, cholesterol, sodium, carb, fiber, protein, vitamins, minerals);
						foodList.add(foods);
					}
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
	}

	public Nutrition getNutrition() {
		Nutrition nutrition = new Nutrition(dailyValues, foodList);
		return nutrition;
	}
}