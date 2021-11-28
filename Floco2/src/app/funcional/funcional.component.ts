import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-funcional',
  templateUrl: './funcional.component.html',
  styleUrls: ['./funcional.component.css']
})
export class FuncionalComponent implements OnInit {

  nomeProduto: string;

  constructor() { 
    this.nomeProduto = 'http://localhost4200';
  }

  ngOnInit(): void {
  }

}
