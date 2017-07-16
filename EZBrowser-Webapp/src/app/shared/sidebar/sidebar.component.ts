import { Component, OnInit } from '@angular/core';
import {SidebarService} from './sidebar.service';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html'
})
export class SidebarComponent implements OnInit {

  constructor(private sidebarService: SidebarService) {}

  ngOnInit() {
    console.log('testside');
    this.sidebarService.getSidebar().subscribe(
      text => {
        console.log(text);
      }
    );
    console.log('testside2');
  }
}
