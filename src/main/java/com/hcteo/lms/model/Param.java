/**
 * Entity representing a parameter with multiple possible value types.
 * <p>
 * Each parameter is identified by a unique key and can store its value as a
 * string, long, or decimal. Only one value type is expected to be used per
 * parameter instance.
 * </p>
 *
 * Fields:
 * <ul>
 * <li>param_key - Unique identifier for the parameter.</li>
 * <li>value_string - String representation of the parameter's value.</li>
 * <li>value_long - Long representation of the parameter's value.</li>
 * <li>value_decimal - Decimal representation of the parameter's value.</li>
 * </ul>
 *
 * Uses Lombok annotations for boilerplate code generation and JPA for
 * persistence.
 */
package com.hcteo.lms.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Param {

    @Id
    private String param_key;
    private String value_string;
    private Long value_long;
    private BigDecimal value_decimal;

}
