package academic.service.usecase.validator.rules;

public interface Rule<D> {
	
	void execute(D domain);


}
