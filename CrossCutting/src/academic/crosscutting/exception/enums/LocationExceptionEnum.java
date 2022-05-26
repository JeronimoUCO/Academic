package academic.crosscutting.exception.enums;

public enum LocationExceptionEnum {
	API, SERVICE,PERSISTNECE, DTO, DOMAIN, ENTITY, CROSSCUTTING, GENERAL;
	
	public static LocationExceptionEnum getDefault() {
		return GENERAL;
	}
	
}
