import { NgForm } from '@angular/forms';
import { Observable } from 'rxjs';
import { of } from 'rxjs';
import { catchError } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

const httpOptions ={
  headers: new HttpHeaders({
    'Content-Type':'application/json',
    'Access-Control-Allow-Headers': 'Content-type',
    'Access-Control-Allow-Methods': 'Get',
    'Access-Control-Allow-Origin': '*'
    
  })
}
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  userName!:string;
  password!:string;
  result!:boolean;
  User ={userName:String, password:String};
  Credentials = {withCredentials:true};
  response:any;
  msgError="";

  constructor(private _http : HttpClient, private router:Router) { }

  ngOnInit(): void {
  }

  onSubmit() {
    let User ={userName:this.userName,
                password:this.password,
                

              };
    let Credentials = {withCredentials:true};
    console.log(this.userName);
    console.log(this.password);
    console.log(User);
    console.log(Credentials);

    let response = this._http.post<any>("http://localhost:3000/gamego/authcontroller/login",
    User, httpOptions).subscribe({
      next:(_v:1) => this.router.navigate(['admin/users']),
      error:(_e:0) => console.error(this.msgError="Invalid Credentials, Please Enter a Valid User Name and/or Password"),
      complete: () => window.localStorage.setItem("userName", this.userName)

    });
  }
};


