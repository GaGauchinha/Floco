import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EncomendaComponent } from './floco/encomenda.component';
import { ClienteComponent } from './floco/cliente.component';
import { ProdutoComponent } from './floco/produto.component';

@NgModule({
  declarations: [
    AppComponent,
    EncomendaComponent,
    ClienteComponent,
    ProdutoComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
