import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Contact } from './contact';

/**
 * @author Pablo Hernán Gatti
 */

@Injectable({
  providedIn: 'root',
})
export class ContactService {
  /**
   * Ruta donde se encuentra el backend
   */
  private url = 'http://localhost:8080/api/contacts';

  /**
   * Creación de fecha para realizar el borrado lógico
   */
  date = Date.now();

  constructor(private httpClient: HttpClient) {}

  /**
   * Lista los contactos mientras el atributo "deletedAt" sea nulo
   * @returns Devuelve la lista de contactos desde el backend
   */
  getContactsList(): Observable<Contact[]> {
    return this.httpClient.get<Contact[]>(`${this.url}`);
  }
  /**
   * Crea un contacto nuevo
   * @param contact recibe un objeto Contacto
   * @returns Devuelve un contacto nuevo desde el backend
   */
  addContact(contact: Contact): Observable<Object> {
    return this.httpClient.post(`${this.url}`, contact);
  }

  /**
   * Borrado físico
   * @param id Recibe el id de tipo number para identificar el contacto a eliminar
   * @returns Devuelve el borrado desde el backend
   */
  deleteContact(id: number): Observable<Object> {
    return this.httpClient.delete(`${this.url}/${id}`);
  }

  /**
   * Borrado lógico: Añade un timestamp al contacto en el atributo "deletedAt" para que no se muestre en la lista
   * @param id Recibe el id de tipo number para identificar el contacto a eliminar
   * @returns Devuelve el borrado desde el backend
   */
  safeDeleteContact(id: number): Observable<Object> {
    return this.httpClient.patch(`${this.url}/${id}`, {
      deletedAt: this.date,
    });
  }
  /**
   * Busca y devuelve un contacto según el id
   * @param id Recibe el id de tipo number para identificar el contacto a buscar
   * @returns Devuelve el contacto perteneciente al id ingresado desde el backend
   */
  findContact(id: number): Observable<Contact> {
    return this.httpClient.get<Contact>(`${this.url}/${id}`);
  }
  /**
   * Actualiza un contacto
   * @param id Recibe el id de tipo number para identificar el contacto a actualizar
   * @param contact Recibe el contacto a actualizar
   * @returns Devuelve el contacto perteneciente al id ingresado desde el backend
   */
  updateContact(id: number, contact: Contact): Observable<Object> {
    return this.httpClient.put(`${this.url}/${id}`, contact);
  }
}
