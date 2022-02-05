import { Component, Input, OnInit } from '@angular/core';

import { Destalhes}

@Component({
  selector: 'app-detalhes',
  templateUrl: './detalhes.component.html',
  styleUrls: ['./detalhes.component.css']
})
export class DetalhesComponent implements OnInit {

  @Input() viewMode = false;

  @Input() currentDetalhes: Detalhes{
    title: '',
    description: '',
    published: false;
  };

  constructor() { }

  ngOnInit(): void {
  }

}
