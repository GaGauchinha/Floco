import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cliente',
  templateUrl: './cliente.component.html',
  template:`<p>Cliente</p>`,
  styleUrls: ['./cliente.component.css']
})
export class ClienteComponent implements OnInit {

  NomeCliente: string;
  IdCliente: number;
  Endereco: string;
  Numero: number;
  Data_Nascimento: number;
  CEP: number;
  Cidade: string;
  Estado: string;
  constructor() { 
    this.NomeCliente = 'Gabi';
    this.IdCliente = 1;
    this.Endereco = 'Endereco';
    this.Numero = 1213123;
    this.Data_Nascimento = 1/1/21;
    this.CEP = 13123123;
    this.Estado = 'RS';
    this.Cidade = 'Santa Maria'
  }
//Mesmo esquema do produto, preciso puxar da própria página html os dados, mandar pro construtor, para dai ele mandar pro banco de dados?
//Faço isso usando get e set? Ou usando comandos de insert como do bd, só que em código js?
//Esses valores fixados no construtor não podem ficar assim, devem ser inseridos pelo próprio usuário, o único que se altera sozinho seria o idcliente
  ngOnInit(): void {
  }

}
