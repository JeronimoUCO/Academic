package academic.service.facade;

import java.util.List;

public interface UseCaseFindFacade<T> {
	List<T> execute(T dto);
}
