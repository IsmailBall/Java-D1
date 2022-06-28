package registration.dbSimulation;

public class Result {

	private String description;
	private boolean isSuccess;

	public Result(String description, boolean isSuccess) {
		super();
		this.description = description;
		this.isSuccess = isSuccess;
	}

	public Result(boolean isSuccess) {
		super();
		this.isSuccess = isSuccess;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

}
