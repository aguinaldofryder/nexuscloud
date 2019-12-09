package br.com.nexuscloud.cadastro.converter;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AbstractConverter<O, D> {

    /**
     * Converte uma lista de DTO para uma lista de ORM.
     */
    public List<O> dtoListToOrmList(final List<D> dtoList) {
	if (dtoList == null) {
	    return null;
	}
	return dtoList.stream().map(this::dtoToOrm).collect(Collectors.toList());
    }

    /**
     * Converte um DTO para um novo ORM
     * 
     * @param dto
     * @return
     */
    public O dtoToOrm(final D dto) {
	if (dto == null) {
	    return null;
	}

	final O orm = newInstanceOfORM();

	return dtoToOrm(dto, orm);
    }

    /**
     * Converte uma lista de ORM para uma lista de DTO.
     */
    public List<D> ormListToDtoList(final List<O> ormList) {
	if (ormList == null) {
	    return null;
	}
	return ormList.stream().map(item -> ormToDto(item)).collect(Collectors.toList());
    }

    /**
     * Converte um ORM para um novo DTO
     * 
     * @param orm
     * @return
     */
    public D ormToDto(final O orm) {
	if (orm == null) {
	    return null;
	}
	final D dto = newInstanceOfDTO();
	return ormToDto(orm, dto);
    }

    /**
     * Converte um DTO para um ORM existente
     * 
     * @param dto
     * @param orm
     * @return
     */
    protected abstract O dtoToOrm(D dto, O orm);

    /**
     * Converte um ORM para um DTO existente
     * 
     * @param orm
     * @param dto
     * @return
     */
    protected abstract D ormToDto(final O orm, final D dto);

    /**
     * Cria uma nova instância do DTO
     * 
     * @return
     */
    private D newInstanceOfDTO() {
	final ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
	try {
	    @SuppressWarnings("unchecked")
	    final Class<D> type = (Class<D>) superClass.getActualTypeArguments()[1];
	    return type.newInstance();
	} catch (final Exception e) {
	    throw new RuntimeException(e);
	}
    }

    /**
     * Cria uma nova instância do ORM
     * 
     * @return
     */
    private O newInstanceOfORM() {
	final ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
	@SuppressWarnings("unchecked")
	final Class<O> type = (Class<O>) superClass.getActualTypeArguments()[0];
	try {
	    return type.newInstance();
	} catch (final Exception e) {
	    throw new RuntimeException(e);
	}
    }
}
