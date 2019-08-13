/**
 * 
 */
package com.mindtree.fse.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.fse.demo.entities.Customer;

/**
 * @author M1031960
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
