package financialQueryTool;

public class ParamDaysRange implements ParamListInterface {
	private String paramName = "DaysRange";
	private String paramUlsdCode = "m";
	private String paramData;
	
	@Override
	public String getparamName() {
		return paramName;
	}

	@Override
	public String getparamData() {
		return paramData;
	}

	@Override
	public String getparamUlsdCode() {
		return paramUlsdCode;
	}

	@Override
	public void setparamData(String Data) {
		this.paramData = Data;
	}
}