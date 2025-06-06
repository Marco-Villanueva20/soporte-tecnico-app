import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HomeService {
  private http = inject(HttpClient);
  private baseUrl = 'http://localhost:8091/api/ms-empleado';

  listar() {
    return this.http.get(this.baseUrl);
  }
  crear(data: any) {
    return this.http.post(this.baseUrl, data);
  }
  actualizar(id: number, data: any) {
    return this.http.put(`${this.baseUrl}/${id}`, data);
  }
  eliminar(id: number) {
    return this.http.delete(`${this.baseUrl}/${id}`);
  }
}
