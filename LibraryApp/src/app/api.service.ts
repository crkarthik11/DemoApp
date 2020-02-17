import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http: HttpClient) { }


  getData(): Observable<Student> {
    return this.http.get<Student>('http://localhost:8080/students/getAll');
  }
}

export interface Student {
  name: string;
  id: string;
  department: string;
  userName: string;
  password: string;
  idNumber: string;
}
