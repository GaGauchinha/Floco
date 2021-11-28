import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-encomenda',
  templateUrl: './encomenda.component.html',
  template:`<p>Encomenda</p>`,
  styleUrls: ['./encomenda.component.css']
})
export class EncomendaComponent implements OnInit {

  IdEncomenda: number;
  DataEntrega: number;
  constructor() { 
    this.DataEntrega = 1/1/1;
    this.IdEncomenda = 1;
  }
  //Anotações do que precisa ser feito:
  //Esse idencomenda tem que incrementar um toda vez que tiver cadastro ou ele vai ser alterado no próprio banco de dados?
  //importar o idcliente e idproduto precisa de um getint ou algo do tipo

  ngOnInit(): void {
  }

}
