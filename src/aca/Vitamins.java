package aca;

public class Vitamins {

	private Integer vitaminA;
	private Integer vitaminC;
	
	public Vitamins() {

	}
	public Vitamins(Integer vitaminA, Integer vitaminC) {
		super();
		this.vitaminA = vitaminA;
		this.vitaminC = vitaminC;
	}
	public Integer getVitaminA() {
		return vitaminA;
	}
	public void setVitaminA(Integer vitaminA) {
		this.vitaminA = vitaminA;
	}
	public Integer getVitaminC() {
		return vitaminC;
	}
	public void setVitaminC(Integer vitaminC) {
		this.vitaminC = vitaminC;
	}
	@Override
	public String toString() {
		return "Vitamins [vitaminA=" + vitaminA + ", vitaminC=" + vitaminC + "]";
	}


}
