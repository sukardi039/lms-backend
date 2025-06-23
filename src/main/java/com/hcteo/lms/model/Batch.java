/**
 * Represents a Batch entity in the LMS system.
 * <p>
 * This class is mapped to a database table using JPA annotations. It contains
 * information about a batch, including its creation and collection dates, and
 * status.
 * </p>
 *
 * Fields:
 * <ul>
 * <li>batch_id - The unique identifier for the batch (auto-generated).</li>
 * <li>batchCreatedDate - The date when the batch was created.</li>
 * <li>batchCollectedDate - The date when the batch was collected.</li>
 * <li>status - The status of the batch.</li>
 * </ul>
 *
 * Lombok annotations are used to generate boilerplate code such as getters,
 * setters, constructors, etc.
 */
package com.hcteo.lms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
public class Batch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long batch_id;
    private String batchCreatedDate;
    private String batchCollectedDate;
    private Long status;
}
