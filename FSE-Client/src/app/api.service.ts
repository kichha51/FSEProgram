import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Customer } from './customer';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  constructor(private httpClient: HttpClient) { }
  public getCustomers(): Observable<Customer[]> {
    return this.httpClient.get<Customer[]>('http://localhost:8080/customers');
   }

  createCustomer(customer: Customer) {
    const httpOptions = {
      headers: new  HttpHeaders({
        'Content-Type': 'application/json'
      }),
      responseType: 'text'  as  'json'
    };
    return this.httpClient.post<Customer>('http://localhost:8080/customers', customer, httpOptions);
  }

}
