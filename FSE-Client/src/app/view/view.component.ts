import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {

  constructor(private service: ApiService) { }
  customer_list: Customer[];
  ngOnInit() {
    console.log('camehere');
    this.service.getCustomers().subscribe(data => {
      this.customer_list = data;
    });
  }
}
