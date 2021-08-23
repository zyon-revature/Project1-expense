import { HttpClient } from '@angular/common/http';
import { Component, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Login } from './login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  login: Login = {
    id: '',
    userpassword: ''
}
  constructor(private http:HttpClient, private router:Router) { }

  ngOnInit(){

  }
  onSubmit(form:NgForm){
    console.log(form)
    this.http.post("http://localhost:8080/users/login", JSON.stringify({employeeid: form.value.id, userpassword: form.value.userpassword}))
    .subscribe({
        next: (data:any)=>{
          if(data.status === 'success'){
            localStorage.setItem("employeeid", form.value.id);
          }

          this.router.navigate(['tickets'])
        }
    })







  }
}


