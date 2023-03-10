import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ReactiveFormsModule } from '@angular/forms';

const routes: Routes = [
  {path:'', component: LoginComponent}
]

export const loginRoutes = RouterModule.forChild(routes);

@NgModule({
  declarations: [
    LoginComponent
  ],
  imports: [
    CommonModule, loginRoutes, ReactiveFormsModule
  ]
})
export class LoginModule { }
