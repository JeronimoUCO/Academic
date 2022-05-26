package academic.service.usecase;

public interface UseCase<T> {
	void execute(T domain);
}
