import { Injectable } from '@angular/core';
import { ProdutoComponent } from '../produto/produto.component';

@Injectable({
  providedIn: 'root'
})
export class FuncionalService {

  constructor() { }
  getMarca(){
    return ['Nike','Adidas', 'Puma'];
  }
  
}
