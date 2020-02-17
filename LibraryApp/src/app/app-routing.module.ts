import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { StudentsComponent } from './students/students.component';
import { BooksComponent } from './books/books.component';
import {TestComponent} from "./test/test.component";


const routes: Routes = [
  {
    path: 'students',
    component: StudentsComponent,
  },
  {
    path: 'books',
    component: BooksComponent,
  },
  {
    path: 'test',
    component: TestComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
