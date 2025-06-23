/**
 * Repository interface for {@link com.hcteo.lms.model.Param} entities.
 * <p>
 * Extends {@link org.springframework.data.jpa.repository.JpaRepository} to
 * provide CRUD operations and query methods for the Param entity.
 * </p>
 *
 * <p>
 * The primary key type for Param is {@link String}.
 * </p>
 */
package com.hcteo.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcteo.lms.model.Param;

@Repository
public interface ParamRepository extends JpaRepository<Param, String> {

}
