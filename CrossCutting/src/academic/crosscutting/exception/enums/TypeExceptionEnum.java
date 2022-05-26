package academic.crosscutting.exception.enums;

public enum TypeExceptionEnum {
	BUSSINESS, TECHNICAL, DEFAULT;

	
	public static TypeExceptionEnum getDefault() {
		return DEFAULT;
	}

}
