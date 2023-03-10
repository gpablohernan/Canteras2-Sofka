package com.contacts.contactsbackend.service;

import com.contacts.contactsbackend.domain.Contact ;
import java.util.List;
import java.util.Optional;

/**
 * @author Pablo Hernán Gatti
 */

public interface IContactService {
    /**
     * Lista los contactos mientras DeletedAt sea null
     */
     List<Contact> findByDeletedAtIsNull();
    /**
     * Guarda un contacto
     */
     Contact save(Contact contact);
    /**
     * Actualiza un contacto
     */
     Contact update(Long id, Contact contact);
    /**
     * Realiza el borrado físico de un contacto
     */
     void delete(Long id);
    /**
     * Busca un contacto por id
     */
     Optional<Contact> findContact(Long id);
}
