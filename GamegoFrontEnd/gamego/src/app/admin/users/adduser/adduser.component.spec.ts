import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdduserComponent } from './adduser.component';

describe('AdduserComponent', () => {
  let component: AdduserComponent;
  let fixture: ComponentFixture<AdduserComponent>;

  beforeEach(async( () => {
    TestBed.configureTestingModule({
      declarations: [ AdduserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() =>{
    fixture = TestBed.createComponent(AdduserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
function async(arg0: () => void): jasmine.ImplementationCallback {
  throw new Error('Function not implemented.');
}

