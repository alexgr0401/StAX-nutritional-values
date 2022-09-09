package aca;

public class Minerals {

	private Integer mineralCa;
	private Integer mineralFe;

	public Minerals() {

	}

	public Minerals(Integer mineralCa, Integer mineralFe) {
		this.mineralCa = mineralCa;
		this.mineralFe = mineralFe;
	}

	public Integer getMineralCa() {
		return mineralCa;
	}

	public void setMineralCa(Integer mineralCa) {
		this.mineralCa = mineralCa;
	}

	public Integer getMineralFe() {
		return mineralFe;
	}

	public void setMineralFe(Integer mineralFe) {
		this.mineralFe = mineralFe;
	}

	@Override
	public String toString() {
		return "Minerals [mineralCa=" + mineralCa + ", mineralFe=" + mineralFe + "]";
	}
}