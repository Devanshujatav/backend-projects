package org.devanshu.dao;

import org.devanshu.model.Contact;
import java.util.List;

/**
 * Data Access Object interface for Contact operations
 * Defines contract for database operations
 */
public interface ContactDAO {
    /**
     * Save a new contact to database
     *@paramcontactContact object to save
     * @return true if successful, false otherwise
     */
    boolean saveContact(Contact contact);


    /**
     * Retrieve all contacts from database
     *@return List of all contacts
     */
    List<Contact> getAllContacts();


    /**
     * Get contact by ID
     *@paramidContact ID
     * @return Contact object or null if not found
     */
    Contact getContactById(int id);



    /**
     * Delete contact by ID
     *@paramidContact ID
     * @return true if successful, false otherwise
     */
    boolean deleteContactById(int id);
}