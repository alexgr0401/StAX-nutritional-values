package aca;

public class DailyValues {

	private Integer totalFatValue;
	private String totalFatUnit;
	private Integer saturatedFatValue;
	private String saturatedFatUnit;
	private Integer cholesterolValue;
	private String cholesterolUnit;
	private Integer sodiumValue;
	private String sodiumUnit;
	private Integer carbValue;
	private String carbUnit;
	private Integer fiberValue;
	private String fiberUnit;
	private Integer proteinValue;
	private String proteinUnit;

	public DailyValues() {
	}

	public DailyValues(Integer totalFatValue, String totalFatUnit, Integer saturatedFatValue, String saturatedFatUnit,
			Integer cholesterolValue, String cholesterolUnit, Integer sodiumValue, String sodiumUnit, Integer carbValue,
			String carbUnit, Integer fiberValue, String fiberUnit, Integer proteinValue, String proteinUnit) {
		super();
		this.totalFatValue = totalFatValue;
		this.totalFatUnit = totalFatUnit;
		this.saturatedFatValue = saturatedFatValue;
		this.saturatedFatUnit = saturatedFatUnit;
		this.cholesterolValue = cholesterolValue;
		this.cholesterolUnit = cholesterolUnit;
		this.sodiumValue = sodiumValue;
		this.sodiumUnit = sodiumUnit;
		this.carbValue = carbValue;
		this.carbUnit = carbUnit;
		this.fiberValue = fiberValue;
		this.fiberUnit = fiberUnit;
		this.proteinValue = proteinValue;
		this.proteinUnit = proteinUnit;
	}

	public Integer getTotalFatValue() {
		return totalFatValue;
	}

	public void setTotalFatValue(Integer totalFatValue) {
		this.totalFatValue = totalFatValue;
	}

	public String getTotalFatUnit() {
		return totalFatUnit;
	}

	public void setTotalFatUnit(String totalFatUnit) {
		this.totalFatUnit = totalFatUnit;
	}

	public Integer getSaturatedFatValue() {
		return saturatedFatValue;
	}

	public void setSaturatedFatValue(Integer saturatedFatValue) {
		this.saturatedFatValue = saturatedFatValue;
	}

	public String getSaturatedFatUnit() {
		return saturatedFatUnit;
	}

	public void setSaturatedFatUnit(String saturatedFatUnit) {
		this.saturatedFatUnit = saturatedFatUnit;
	}

	public Integer getCholesterolValue() {
		return cholesterolValue;
	}

	public void setCholesterolValue(Integer cholesterolValue) {
		this.cholesterolValue = cholesterolValue;
	}

	public String getCholesterolUnit() {
		return cholesterolUnit;
	}

	public void setCholesterolUnit(String cholesterolUnit) {
		this.cholesterolUnit = cholesterolUnit;
	}

	public Integer getSodiumValue() {
		return sodiumValue;
	}

	public void setSodiumValue(Integer sodiumValue) {
		this.sodiumValue = sodiumValue;
	}

	public String getSodiumUnit() {
		return sodiumUnit;
	}

	public void setSodiumUnit(String sodiumUnit) {
		this.sodiumUnit = sodiumUnit;
	}

	public Integer getCarbValue() {
		return carbValue;
	}

	public void setCarbValue(Integer carbValue) {
		this.carbValue = carbValue;
	}

	public String getCarbUnit() {
		return carbUnit;
	}

	public void setCarbUnit(String carbUnit) {
		this.carbUnit = carbUnit;
	}

	public Integer getFiberValue() {
		return fiberValue;
	}

	public void setFiberValue(Integer fiberValue) {
		this.fiberValue = fiberValue;
	}

	public String getFiberUnit() {
		return fiberUnit;
	}

	public void setFiberUnit(String fiberUnit) {
		this.fiberUnit = fiberUnit;
	}

	public Integer getProteinValue() {
		return proteinValue;
	}

	public void setProteinValue(Integer proteinValue) {
		this.proteinValue = proteinValue;
	}

	public String getProteinUnit() {
		return proteinUnit;
	}

	public void setProteinUnit(String proteinUnit) {
		this.proteinUnit = proteinUnit;
	}

	@Override
	public String toString() {
		return "DailyValues [totalFatValue=" + totalFatValue + ", totalFatUnit=" + totalFatUnit + ", saturatedFatValue="
				+ saturatedFatValue + ", saturatedFatUnit=" + saturatedFatUnit + ", cholesterolValue="
				+ cholesterolValue + ", cholesterolUnit=" + cholesterolUnit + ", sodiumValue=" + sodiumValue
				+ ", sodiumUnit=" + sodiumUnit + ", carbValue=" + carbValue + ", carbUnit=" + carbUnit + ", fiberValue="
				+ fiberValue + ", fiberUnit=" + fiberUnit + ", proteinValue=" + proteinValue + ", proteinUnit="
				+ proteinUnit + "]";
	}
}
