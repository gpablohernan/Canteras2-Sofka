import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Contact } from '../contact';
import { ContactService } from '../contact.service';
import Swal from 'sweetalert2';

/**
 * @author Pablo Hernán Gatti
 */

@Component({
  selector: 'app-contacts-list',
  templateUrl: './contacts-list.component.html',
  styleUrls: ['./contacts-list.component.css'],
})
export class ContactsListComponent implements OnInit {
  /**
   * Crea un array de Contactos
   */
  contacts: Contact[];

  constructor(private contactService: ContactService, private router: Router) {}
  /**
   * Llama a la función getContacts para mostrar la lista de contactos
   */
  ngOnInit(): void {
    this.getContacts();
  }
  /**
   * Funcion que llama a getContactsList para mostrar la lista de contactos
   */
  private getContacts() {
    this.contactService.getContactsList().subscribe({
      next: (data) => {
        this.contacts = data;
      },
      error: (error) => {
        console.error(error);
      },
    });
  }
  /**
   * Función que redirecciona a la página de agregar un contacto
   */
  addContact() {
    this.router.navigate(['/addcontact']);
  }
  /**
   * Función que redirecciona a la página de actualizar un contacto
   */
  updateContact(id: number) {
    this.router.navigate(['/updatecontact', id]);
  }

  /**
   * Función que llama a deleteContact para realizar el borrado físico de un contacto
   * @param id Recibe el id de tipo number para identificar el contacto a eliminar
   * Primero muestra un cartel preguntando si desea eliminar y luego muestra otro en
   * caso de que se elimine correctamente
   */
  deleteContact(id: number) {
    Swal.fire({
      title: 'Are you sure?',
      text: "You won't be able to revert this!",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Yes, delete it!',
    }).then((result) => {
      if (result.isConfirmed) {
        this.contactService.deleteContact(id).subscribe((data) => {
          console.log(data);
          this.getContacts();
        });
        Swal.fire('Deleted!', 'The contact has been deleted.', 'success');
      }
    });
  }
  /**
   * Función que llama a safeDeleteContact para realizar el borrado lógico de un contacto
   * @param id Recibe el id de tipo number para identificar el contacto a eliminar
   * Primero muestra un cartel preguntando si desea eliminar y luego muestra otro en
   * caso de que se elimine correctamente
   */
  safeDeleteContact(id: number) {
    Swal.fire({
      title: 'Are you sure?',
      text: "You won't be able to revert this!",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Yes, delete it!',
    }).then((result) => {
      if (result.isConfirmed) {
        this.contactService.safeDeleteContact(id).subscribe((data) => {
          console.log(data);
          this.getContacts();
        });
        Swal.fire('Deleted!', 'The contact has been deleted.', 'success');
      }
    });
  }
}
