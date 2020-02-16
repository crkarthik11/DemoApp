import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {

  public myBooks = [
    {
      'id': 1,
     'name': 'Amanda Doe',
     'author': 250,
     'category': 'Tech',
     'isbn': '1234567'
   },
   {
    'id': 1,
     'name': 'Jon Doe',
     'author': 250,
     'category': 'Tech',
     'isbn': '1234567'
   }];

  constructor() { }

  ngOnInit(): void {
  }

}
