import { Component, OnInit } from '@angular/core';

import { Funcao } from 'src/app/models/funcao.model';
import { ServiçosService } from 'src/app/services/serviços.service';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {


  Funcoes?: Funcao[];
  currentFuncao: Funcao = {};
  currentIndex = -1;
  title = '';

  constructor(private servicosService: ServiçosService) { }

  ngOnInit(): void {
    this.retrieveFuncoes();
  }
  retrieveFuncoes(): void{
    this.servicosService.getAll()
    .subscribe({
      next: (data) => {
        this.Funcoes = data;
        console.log(data);
      },
      error: (e) => console.error(e)
    });
  }

  refreshList():void{
    this.retrieveFuncoes();
    this.currentFuncao = {};
    this.currentIndex = -1;
  }

  setActiveFuncoes (funcao: Funcao, index: number): void{
    this.currentFuncao = funcao;
    this.currentIndex = index;
  }

  removeAllFuncoes(): void {
/*    this.servicosService.deleteAll ()
    .subscribe({
      next: (res) => {
        console.log(res);
        this.refreshList();
      },
      error:(e) => console.error(e)
    });*/
  }
  
  searchTitle (): void{
    this.currentFuncao = {};
    this.currentIndex = -1;

    this.servicosService.findByTitle(this.title)
    .subscribe({
      next: (data) =>{
        this.Funcoes = data;
        console.log(data);
      },
      error: (e) => console.error(e)
    });
  }
}
