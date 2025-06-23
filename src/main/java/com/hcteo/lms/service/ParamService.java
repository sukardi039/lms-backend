/**
 * Service class for managing {@link Param} entities. Provides methods to
 * interact with the {@link ParamRepository}.
 *
 * <p>
 * This service is annotated with {@code @Service} to indicate that it's a
 * Spring service component.</p>
 *
 * @author
 */
package com.hcteo.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcteo.lms.model.Param;
import com.hcteo.lms.repository.ParamRepository;

@Service
public class ParamService {

    @Autowired
    private ParamRepository paramRepository;

    public List<Param> getAllParams() {
        return paramRepository.findAll();
    }
}
