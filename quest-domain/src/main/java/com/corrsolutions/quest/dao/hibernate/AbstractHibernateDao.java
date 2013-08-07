/*
 * This file contains proprietary information of Rule Financial.
 * Copying or reproduction without prior written approval is prohibited.
 *
 * <b>Copyright</b> (c) 2013
 * <b>Company</b> Corr Solutions
 */

/**
 *
 */
package com.corrsolutions.quest.dao.hibernate;

import java.io.Serializable;
import java.util.List;

import com.corrsolutions.quest.dao.CRUDDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.GenericTypeResolver;
import org.springframework.dao.EmptyResultDataAccessException;


/**
 * Abstract Hibernate supporter Dao which allows for CRUD operations to be performed
 * by extending the {@link org.springframework.orm.hibernate3.support.HibernateDaoSupport}
 *
 * @param <T> Typed object for CRUD operations
 */
public abstract class AbstractHibernateDao<T> implements CRUDDao<T> {

    @Autowired
    @Qualifier("hibernateSessionFactory")
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

  /**
   * Determines the class of domain object on which this DAO operates.
   *
   * @return the domain object class.
   */
  @SuppressWarnings("unchecked")
  protected final Class<T> getDomainClass() {
    return (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), AbstractHibernateDao.class);
  }

  /**
   * {@inheritDoc}
   */
  public void save(T entity) {
      getSessionFactory().getCurrentSession().saveOrUpdate(entity);
  }


  /**
   * {@inheritDoc}
   */
  public Object read(Serializable id) {
      Object returnVal = getSessionFactory().getCurrentSession().get(getDomainClass(), id);
        if (returnVal == null) {
          throw new EmptyResultDataAccessException(
              "No item found in the database for Object of type: " +
                  getDomainClass().getCanonicalName() +
                  " and id: " + id, 1);
        }
        return returnVal;
  }


  /**
   * {@inheritDoc}
   */
  public void delete(T entity) {
      getSessionFactory().getCurrentSession().delete(entity);
  }


  /**
   * {@inheritDoc}
   */
  public List<T> readAll() {
      return getSessionFactory().getCurrentSession().createCriteria(getDomainClass()).list();
  }

  public void merge(T entity) {
      getSessionFactory().getCurrentSession().merge(entity);
  }

  /**
   * Finds entities based on the specified HQL query.
   * @param query query to execute.
   * @return list of domain objects satisfying the specified query.
   */
  @SuppressWarnings("unchecked")
  protected List<T> find(String query, Object... params) {
      Query queryObject = getSessionFactory().getCurrentSession().createQuery(query);
      if (params != null) {
          for (int i = 0; i < params.length; i++) {
              queryObject.setParameter(i, params[i]);
          }
      }
      return queryObject.list();
  }



}
