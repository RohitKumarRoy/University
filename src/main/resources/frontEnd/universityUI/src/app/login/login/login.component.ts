import { Component, OnInit } from '@angular/core';
import { Form, FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  loginFormGroup = new FormGroup({
    Email: new FormControl(''),
    password: new FormControl('')
 });

 onSubmit(){
   console.log("Form submitted");
   console.log(this.loginFormGroup.value);
   this.loginFormGroup.reset;
 }

}
