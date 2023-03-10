package com.contacts.contactsbackend.dao;

import com.contacts.contactsbackend.domain.Contact ;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.sql.Timestamp;
import java.util.List;

/**
 * @author Pablo Hernán Gatti
 */

public interface ContactDao extends CrudRepository<Contact, Long> {

    /**
     * Muestra los contactos mientras deletedAt sea null
     */
    @Query("select con from Contact con where con.deletedAt=null")
    List<Contact> findByDeletedAtIsNull();
    /**
     * Borra de manera lógica un contacto agregando un dato de tipo Timestamp al atributo deletedAt
     */
    @Modifying
    @Query("update Contact con set con.deletedAt = :deletedAt where con.id = :id")
    void deleteLogical(@Param(value = "id") Long id, @Param(value = "deletedAt") Timestamp deletedAt);
    /**
     * Elimina un contacto con el id que le llega por parámetro
     */
    @Modifying
    @Query("delete Contact con where con.id = :id")
    void delete(@Param(value = "id") Long id);
}

