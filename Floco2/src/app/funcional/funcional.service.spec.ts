import { TestBed } from '@angular/core/testing';

import { FuncionalService } from './funcional.service';

describe('FuncionalService', () => {
  let service: FuncionalService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FuncionalService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
