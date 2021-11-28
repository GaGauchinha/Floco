import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FuncionalComponent } from './funcional.component';

describe('FuncionalComponent', () => {
  let component: FuncionalComponent;
  let fixture: ComponentFixture<FuncionalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FuncionalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FuncionalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
