import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ProdutoComponent } from './produto/produto.component';
import { ClienteComponent } from './cliente/cliente.component';
import { EncomendaComponent } from './encomenda/encomenda.component';
import { FuncionalComponent } from './funcional/funcional.component';
import { DetalhesComponent } from './funcional/detalhes/detalhes.component';
import { AdicionarComponent } from './componentes/adicionar/adicionar.component';
import { ListaComponent } from './componentes/lista/lista.component';

@NgModule({
  declarations: [
    AppComponent,
    ProdutoComponent,
    ClienteComponent,
    EncomendaComponent,
    FuncionalComponent,
    DetalhesComponent,
    AdicionarComponent,
    ListaComponent,
  ],
  imports: [
    FormsModule,
    HttpClientModule,
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
