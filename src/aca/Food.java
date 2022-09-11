package aca;

public class Food {

	private String name;
	private Double servingValue;
	private String servingUnit;
	private Integer caloriesTotalValue;
	private Integer caloriesFatValue;
	private Double totalFat;
	private Double saturatedFat;
	private Integer cholesterol;
	private Integer sodium;
	private Integer carb;
	private Integer fiber;
	private Integer protein;
	private Vitamins vitamins;
	private Minerals minerals;

	public Food() {
	}

	public Food(String name, Double servingValue, String servingUnit, Integer caloriesTotalValue,
			Integer caloriesFatValue, Double totalFat, Double saturatedFat, Integer cholesterol, Integer sodium,
			Integer carb, Integer fiber, Integer protein, Vitamins vitamins, Minerals minerals) {
		this.name = name;
		this.servingValue = servingValue;
		this.servingUnit = servingUnit;
		this.caloriesTotalValue = caloriesTotalValue;
		this.caloriesFatValue = caloriesFatValue;
		this.totalFat = totalFat;
		this.saturatedFat = saturatedFat;
		this.cholesterol = cholesterol;
		this.sodium = sodium;
		this.carb = carb;
		this.fiber = fiber;
		this.protein = protein;
		this.vitamins = vitamins;
		this.minerals = minerals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getServingValue() {
		return servingValue;
	}

	public void setServingValue(Double servingValue) {
		this.servingValue = servingValue;
	}

	public String getServingUnit() {
		return servingUnit;
	}

	public void setServingUnit(String servingUnit) {
		this.servingUnit = servingUnit;
	}

	public Integer getCaloriesTotalValue() {
		return caloriesTotalValue;
	}

	public void setCaloriesTotalValue(Integer caloriesTotalValue) {
		this.caloriesTotalValue = caloriesTotalValue;
	}

	public Integer getCaloriesFatValue() {
		return caloriesFatValue;
	}

	public void setCaloriesFatValue(Integer caloriesFatValue) {
		this.caloriesFatValue = caloriesFatValue;
	}

	public Double getTotalFat() {
		return totalFat;
	}

	public void setTotalFat(Double totalFat) {
		this.totalFat = totalFat;
	}

	public Double getSaturatedFat() {
		return saturatedFat;
	}

	public void setSaturatedFat(Double saturatedFat) {
		this.saturatedFat = saturatedFat;
	}

	public Integer getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(Integer cholesterol) {
		this.cholesterol = cholesterol;
	}

	public Integer getSodium() {
		return sodium;
	}

	public void setSodium(Integer sodium) {
		this.sodium = sodium;
	}

	public Integer getCarb() {
		return carb;
	}

	public void setCarb(Integer carb) {
		this.carb = carb;
	}

	public Integer getFiber() {
		return fiber;
	}

	public void setFiber(Integer fiber) {
		this.fiber = fiber;
	}

	public Integer getProtein() {
		return protein;
	}

	public void setProtein(Integer protein) {
		this.protein = protein;
	}

	public Vitamins getVitamins() {
		return vitamins;
	}

	public void setVitamins(Vitamins vitamins) {
		this.vitamins = vitamins;
	}

	public Minerals getMinerals() {
		return minerals;
	}

	public void setMineral(Minerals minerals) {
		this.minerals = minerals;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", servingValue=" + servingValue + ", servingUnit=" + servingUnit
				+ ", caloriesTotalValue=" + caloriesTotalValue + ", caloriesFatValue=" + caloriesFatValue
				+ ", totalFat=" + totalFat + ", saturatedFat=" + saturatedFat + ", cholesterol=" + cholesterol
				+ ", sodium=" + sodium + ", carb=" + carb + ", fiber=" + fiber + ", protein=" + protein + ", vitamins="
				+ vitamins + ", minerals=" + minerals + "]";
	}
}