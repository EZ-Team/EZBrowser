import { Component, OnInit } from '@angular/core';
import { SidebarService } from '../shared/sidebar/sidebar.service';

@Component({
  templateUrl: './dashboard.component.html'
})
export class DashboardComponent implements OnInit {

  constructor(private sidebarService: SidebarService) { }

  ngOnInit() {
    console.log('test');
    this.sidebarService.changeSidebar('Data from child');
    console.log('test2');
  }
}
