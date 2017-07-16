import { Injectable } from '@angular/core';
import { Subject } from 'rxjs/Subject';

@Injectable()
export class SidebarService {

  private changeSidebarSource$ = new Subject<string>();

  getSidebar() {
    return this.changeSidebarSource$;
  }

  changeSidebar(data: any) {
    this.changeSidebarSource$.next(data);
  }
}
