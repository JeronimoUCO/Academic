package academic.service.facade;

public interface UseCaseFacade<T> {
	void execute(T dto);
}
