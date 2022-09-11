package aca;

import java.io.Serializable;
import java.util.List;

public class Nutrition implements Serializable {

	private static final long serialVersionUID = -7877826908610700193L;

	List<DailyValues> dailyValues;
	List<Food> foodList;

	public Nutrition() {
	}

	public Nutrition(List<DailyValues> dailyValues, List<Food> foodList) {
		this.dailyValues = dailyValues;
		this.foodList = foodList;
	}

	public List<DailyValues> getDailyValues() {
		return dailyValues;
	}

	public List<Food> getFoodList() {
		return foodList;

	}

	@Override
	public String toString() {
		return "Nutrition [dailyValues=" + dailyValues + ", foodList=" + foodList + "]";
	}
}