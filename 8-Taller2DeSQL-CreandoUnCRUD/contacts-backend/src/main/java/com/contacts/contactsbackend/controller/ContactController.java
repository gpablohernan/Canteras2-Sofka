package com.contacts.contactsbackend.controller;

import com.contacts.contactsbackend.domain.Contact ;
import com.contacts.contactsbackend.service.ContactService ;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

/**
 * @author Pablo Hernán Gatti
 */


@Slf4j
@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "http://localhost:4200")
public class ContactController {
    /**
     * Inyecta ContactService
     */
    @Autowired
    private ContactService contactService;

    /**
     * Lista los contactos mientras DeletedAt sea null
     */
    @GetMapping(path ="/contacts")
    public List<Contact> findByDeletedAtIsNull(){
        log.info(contactService.findByDeletedAtIsNull().toString());
        return contactService.findByDeletedAtIsNull();
    }
    /**
     * Crea un contacto
     */
    @PostMapping(path = "/contacts")
    public ResponseEntity<Contact> create(@RequestBody Contact contact){
        log.info("User to create: {}", contact);
        contactService.save(contact);
        return new ResponseEntity<>(contact, HttpStatus.CREATED);
    }
    /**
     * Realiza el borrado físico de un contacto
     */
    @DeleteMapping(path = "/contacts/{id}")
    public ResponseEntity<Long> delete(@PathVariable("id") Long id){
        log.info("User ID to delete: {}", id);
        contactService.delete(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
    /**
     * Realiza el borrado lógico de un contacto
     */
    @PatchMapping(path = "/contacts/{id}")
    public ResponseEntity<Contact> deleteLogical(@RequestBody Contact contact, @PathVariable("id") Long id){
        log.info("User to logical delete: {}", contact);
        contactService.deleteLogical(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }
    /**
     * Actualiza un contacto
     */
    @PutMapping(path = "/contacts/{id}")
    public ResponseEntity<Contact> update(@RequestBody Contact contact, @PathVariable("id") Long id){
        log.info("User to update: {}", contact);
        contactService.update(id, contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }
    /**
     * Busca un contacto por id
     */
    @GetMapping(path = "/contacts/{id}")
    public Optional<Contact> findContact(@PathVariable Long id)
    {
        return contactService.findContact(id);
    }
}
