import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/model/User';
import { HttpClientService } from 'src/app/service/http-client.service';


@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  @Input()
  user!: User;

  @Output()
  userAddedEvent = new EventEmitter();

  message!: string;
  password!: string;
  
 

  constructor(private httpClientService: HttpClientService,
    private router: Router) { }

  ngOnInit(): void {
  }
  addUser() {
    this.httpClientService.addUser(this.user).subscribe(
      (user) => {
        this.userAddedEvent.emit();
        this.router.navigate(['Components']);
      }
    );
  }
}
