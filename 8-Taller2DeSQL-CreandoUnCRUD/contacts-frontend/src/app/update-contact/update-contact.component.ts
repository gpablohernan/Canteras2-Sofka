import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Contact } from '../contact';
import { ContactService } from '../contact.service';
import Swal from 'sweetalert2';

/**
 * @author Pablo Hernán Gatti
 */

@Component({
  selector: 'app-update-contact',
  templateUrl: './update-contact.component.html',
  styleUrls: ['./update-contact.component.css'],
})
export class UpdateContactComponent implements OnInit {
  /**
   * Crea un id de tipo number
   */
  id: number;
  /**
   * Crea un objeto de tipo Contacto
   */
  contact: Contact = new Contact();

  constructor(
    private contactService: ContactService,
    private router: Router,
    private route: ActivatedRoute
  ) {}
  /**
   * Recibe los datos del contacto y los muestra en los campos correspondientes
   */
  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.contactService.findContact(this.id).subscribe({
      next: (data) => {
        console.log(data);
        this.contact = data;
      },
      error: (error) => {
        console.error(error);
      },
    });
  }
  /**
   * Regresa a la ruta donde se encuentra la lista de contactos y muestra un cartel
   * indicando que el contacto se actualizó con éxito
   */
  returnToContacts() {
    this.router.navigate(['/contacts']);
    Swal.fire({
      position: 'center',
      icon: 'success',
      title: 'Contact updated',
      text: `Contact ${this.contact.fullName} was updated successfully`,
      showConfirmButton: true,
    });
  }
  /**
   * Actualiza el contacto, si no hay error llama a la función returnToContacts descripta arriba
   */
  onSubmit() {
    this.contactService.updateContact(this.id, this.contact).subscribe({
      next: (data) => {
        this.returnToContacts();
      },
      error: (error) => {
        console.error(error);
      },
    });
  }
}
