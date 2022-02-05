import { Component, OnInit } from '@angular/core';

import { Funcao } from 'src/app/models/funcao.model';
import { ServiçosService } from 'src/app/services/serviços.service';

@Component({
  selector: 'app-adicionar',
  templateUrl: './adicionar.component.html',
  styleUrls: ['./adicionar.component.css']
})
export class AdicionarComponent implements OnInit {

  funcao: Funcao = {
    title: '',
    description: '',
    published: false
  };
  submitted = false;

  constructor(private serviçosService : ServiçosService) { }

  ngOnInit(): void {
  }

  saveFuncao(): void{
    const data = {
      title: this.funcao.title,
      description: this.funcao.description
    };
    this.serviçosService.create(data)
    .subscribe({
      next: (res) => {
        console.log(res);
        this.submitted = true;
      },
      error: (e) => console.error(e)
    })
  }

  newFuncao(): void{
    this.submitted = false;
    this.funcao = {
      title: '',
      description: '',
      published: false
    };
  }

}
