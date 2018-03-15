package textExcel;

public class FormulaCell extends RealCell {
	
	private Spreadsheet spread;
	
	public FormulaCell(String text, Location loc, Spreadsheet spread) {
		super(text, loc);
		this.spread = spread;
	}
		
	@Override
	public String abbreviatedCellText() {
		return String.format("%-10.10s", getDoubleValue());
	}

	@Override
	public String fullCellText() {
		return String.format("%s", super.fullCellText());
	}
	
	public double getDoubleValue() {
		
		String[] formula = super.fullCellText().split(" ");
		int forLen = formula.length;
 	
		for(int j = 1; j < forLen; j = j+2) {
			if(formula[j].toUpperCase().charAt(0) >= 65 && formula[j].toUpperCase().charAt(0) <= 90) {
				SpreadsheetLocation loc = new SpreadsheetLocation(formula[j]);
				double a = ((RealCell)spread.getCell(loc)).getDoubleValue();
				formula[j] = Double.toString(a);
			}
		}
		
		double ans = 0.0;

		for(int i = 2; i < forLen-2; i = i+2) {
			if(formula[i].equals("+")){
				ans += Double.parseDouble(formula[i - 1]) + Double.parseDouble(formula[i + 1]);
			} else if(formula[i].equals("-")){
				ans += Double.parseDouble(formula[i - 1]) - Double.parseDouble(formula[i + 1]);
			} else if(formula[i].equals("*")){
				ans += Double.parseDouble(formula[i - 1]) * Double.parseDouble(formula[i + 1]);
			} else if(formula[i].equals("/")){
				ans += Double.parseDouble(formula[i - 1]) / Double.parseDouble(formula[i + 1]);
			}
		}
		
		return ans ;
	}
	
}
