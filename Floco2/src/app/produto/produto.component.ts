import { Component, OnInit } from '@angular/core';
import { FuncionalService } from '../funcional/funcional.service';


@Component({
  selector: 'app-produto',
  templateUrl: './produto.component.html',
  template:`<p>Produto</p>`,
  styleUrls: ['./produto.component.css']
})
export class ProdutoComponent implements OnInit {

  NomeProduto:string;
  IdProduto: number;
  Marca: string[];
  QuantiaEstoque: number;
  Preco: number;

  constructor(private funcionalService: FuncionalService) { 
    this.NomeProduto = 'Tênis Esporte xx';
    this.IdProduto = 1;
    this.QuantiaEstoque = 3;
    this.Preco = 312;
    this.Marca= this.funcionalService.getMarca();
  
  }

  /*precisa de um get e set para mandar pro banco de dados os dados recebidos no html, tem que passar pelo construtor os dados?*/
  ngOnInit(): void {
  }

}
