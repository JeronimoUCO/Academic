package academic.service.assembler;

import java.util.List;

public interface Assembler<D, T, E> {
	
	T convertDomainToDTO(D domain);
	
	E convertDomainToEntity(D domain);
	
	D convertDTOToDomain(T dto);
	
	D convertEntityToDomain(E entity);
 
	List<D> convertListEntityToListDomain(List<E> entities);
	
	List<T> convertListDomainToListDTO(List<D> domains);
}
