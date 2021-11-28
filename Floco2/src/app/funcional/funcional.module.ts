import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FuncionalComponent } from './funcional.component';
import { FuncionalService } from './funcional.service';



@NgModule({
  declarations: [
    FuncionalComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    FuncionalComponent
  ],
  providers: [FuncionalService]
})
export class FuncionalModule { }
