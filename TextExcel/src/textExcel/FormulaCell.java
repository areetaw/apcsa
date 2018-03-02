package textExcel;

public class FormulaCell extends RealCell {
	
	public FormulaCell(String text, Location loc) {
		super(text, loc);
	}
		
	@Override
	public String abbreviatedCellText() {
		return String.format("%-10.10s", super.fullCellText());
	}

	@Override
	public String fullCellText() {
		return String.format("%s", super.fullCellText());
	}
	
	public double getDoubleValue() {
		return 0.0 ;
	}


}
