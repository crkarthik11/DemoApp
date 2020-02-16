import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { StudentsComponent } from './students/students.component';
import { BooksComponent } from './books/books.component';


const routes: Routes = [
  {
    path: 'students',
    component: StudentsComponent,
  },
  {
    path: 'books',
    component: BooksComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
