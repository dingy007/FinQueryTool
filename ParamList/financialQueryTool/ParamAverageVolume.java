package financialQueryTool;

public class ParamAverageVolume implements ParamListInterface {
	private String paramName = "AverageVolume";
	private String paramData="N/A";
	private String queryCode;
	
	@Override
	public String getparamName() {
		return paramName;
	}

	@Override
	public String getparamData() {
		return paramData;
	}

	@Override
	public void setparamData(String Data) {
		this.paramData = Data;
	}

	@Override
	public String getQueryCode() {
		return this.queryCode;
	}

	@Override
	public void setQueryCode(String queryCode) {
		this.queryCode =queryCode;
		
	}
}
