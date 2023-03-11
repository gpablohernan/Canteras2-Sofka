import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Contact } from '../contact';
import { ContactService } from '../contact.service';
import Swal from 'sweetalert2';

/**
 * @author Pablo Hernán Gatti
 */

@Component({
  selector: 'app-add-contact',
  templateUrl: './add-contact.component.html',
  styleUrls: ['./add-contact.component.css'],
})
export class AddContactComponent implements OnInit {
  /**
   * Crea un objeto de tipo Contacto
   */
  contact: Contact = new Contact();

  constructor(private contactService: ContactService, private router: Router) {}

  ngOnInit(): void {}
  /**
   * Si no hay errores, guarda el contacto y luego llama a la función returnToContacts descripta abajo
   */
  saveContact() {
    this.contactService.addContact(this.contact).subscribe({
      next: (data) => {
        console.log(data);
        this.returnToContacts();
      },
      error: (error) => {
        console.error(error);
      },
    });
  }
  /**
   * Regresa a la ruta donde se encuentra la lista de contactos y muestra un cartel
   * indicando que el contacto se creó con éxito
   */
  returnToContacts() {
    this.router.navigate(['/contacts']);
    Swal.fire({
      position: 'center',
      icon: 'success',
      title: 'Contact created',
      text: `Contact ${this.contact.fullName} was created successfully`,
      showConfirmButton: true,
    });
  }
  /**
   * llama a la función saveContact descripta arriba
   */
  onSubmit() {
    this.saveContact();
  }
}
