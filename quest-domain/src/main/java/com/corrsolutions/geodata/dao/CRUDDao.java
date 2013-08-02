package com.corrsolutions.geodata.dao;


import java.io.Serializable;
import java.util.List;

public interface CRUDDao<T> {

    /**
     * Create method, which creates and persists an entity to the database.
     *
     * @param entity to be persisted
     */
    void save(T entity);

    /**
     * Read method, which finds the entity by its id and returns that unique object.
     *
     * @param id for searching the unique entity.
     * @return <T> typed object.
     */
    T read(Serializable id);

    /**
     * Delete method marks the object as deleted.
     *
     * @param entity the entity to delete.
     */
    void delete(T entity);

    /**
     * ReadAll method returns all the objects stored of the specified type in a {@link List}.
     *
     * @return List<T> of objects of type T
     */
    List<T> readAll();

    /**
     * Merges the entity with the copy that is already in the database.
     *
     * @param entity the entity to merge.
     */
    void merge(T entity);

}
