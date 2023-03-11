import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddContactComponent } from './add-contact/add-contact.component';
import { ContactsListComponent } from './contacts-list/contacts-list.component';
import { UpdateContactComponent } from './update-contact/update-contact.component';
/**
 * @author Pablo Hernán Gatti
 */

/**
 * Rutas de la aplicación
 */
const routes: Routes = [
  { path: 'contacts', component: ContactsListComponent },
  { path: '', redirectTo: 'contacts', pathMatch: 'full' },
  { path: 'addcontact', component: AddContactComponent },
  { path: 'updatecontact/:id', component: UpdateContactComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
