import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Funcao } from 'src/app/models/funcao.model';


const baseUrl = 'http://localhost:8080/api/funcao';

@Injectable({
  providedIn: 'root'
})
export class ServiçosService{

  constructor (private http: HttpClient){}
  
  getAll(): Observable<Funcao[]>{
    return this.http.get<Funcao[]>(baseUrl);
  }
  get(id: any): Observable<Funcao> {
    return this.http.get('${baseUrl}/${id}');
  }
  create (data: any): Observable<any>{
    return this.http.post(baseUrl, data);
  }
  update (id:any, data:any): Observable<any>{
    return this.http.put('${baseUrl}/${id}', data);
  }
  delete (id:any): Observable<any>{
    return this.http.delete(baseUrl);
  }
  findByTitle(title:any): Observable<Funcao[]>{
    return this.http.get<Funcao[]>('${baseUrl}?title=${title}');
  }
}
