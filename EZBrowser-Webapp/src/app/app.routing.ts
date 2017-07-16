import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LayoutComponent } from './layout/layout.component';
import {DashboardComponent} from './dashboard/dashboard.component';
import {ProjectsComponent} from "app/projects/projects.component";

export const routes: Routes = [
  { path: '', redirectTo: 'dashboard', pathMatch: 'full'},
  { path: '', component: LayoutComponent, children: [
    { path: 'dashboard', component: DashboardComponent },
    { path: 'projects', component: ProjectsComponent }
  ]}
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}