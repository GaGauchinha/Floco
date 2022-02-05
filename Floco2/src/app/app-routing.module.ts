import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { ListaComponent } from './componentes/lista/lista.component';
import { DetalhesComponent } from './funcional/detalhes/detalhes.component';
import { AdicionarComponent } from './componentes/adicionar/adicionar.component';
import {ClienteComponent} from "./cliente/cliente.component";




const routes: Routes = [
  {path: '', redirectTo: 'componentes', pathMatch: 'full'},
  {path: 'componentes', component: ListaComponent},
  {path: 'componentes/:id', component: DetalhesComponent},
  {path: 'adicionar', component: AdicionarComponent},
  {path: 'cliente', component: ClienteComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
