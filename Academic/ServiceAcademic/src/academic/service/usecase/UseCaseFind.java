package academic.service.usecase;

import java.util.List;

public interface UseCaseFind<T> {
	List<T> execute(T domain);
}
