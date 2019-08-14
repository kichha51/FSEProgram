import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {
  customer = new Customer;
  constructor(private service: ApiService) { }
  submitForm() {
    console.log(this.customer);
    this.service.createCustomer(this.customer).subscribe(data => {
      alert('Customer Created');
    }
    );
  }
  ngOnInit() {
  }

}
