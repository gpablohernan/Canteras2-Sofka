package com.contacts.contactsbackend.service;

import com.contacts.contactsbackend.dao.ContactDao ;
import com.contacts.contactsbackend.domain.Contact ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author Pablo Hernán Gatti
 */

@Service
public class ContactService implements IContactService{
    /**
     * Inyecta ContactDao
     */
    @Autowired
    private ContactDao contactDao;

    /**
     * Lista los contactos mientras DeletedAt sea null
     */
    @Override
    @Transactional(readOnly = true)
    public List<Contact> findByDeletedAtIsNull() {
        return contactDao.findByDeletedAtIsNull();
    }
    /**
     * Crea un contacto
     */
    //@Override
    @Transactional
    public Contact save(Contact contact) {
        return contactDao.save(contact);
    }
    /**
     * Realiza el borrado lógico de un contacto
     */
    @Transactional
    public void deleteLogical(Long id, Contact contact){
        contactDao.deleteLogical(id, contact.getDeletedAt());
    }
    /**
     * Realiza el borrado físico de un contacto
     */
    @Override
    @Transactional
    public void delete(Long id) {
        contactDao.delete(id);
    }
    /**
     * Busca un contacto por id
     */
    @Override
    public Optional<Contact> findContact(Long id) {
        return contactDao.findById(id);
    }
    /**
     * Actualiza un contacto
     */
    //@Override
    @Transactional
    public Contact update(Long id, Contact contact) {
        contact.setId(id);
        return contactDao.save(contact);
    }
}
