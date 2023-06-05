import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  private debug = false;
  private myAppUrl = '';
  private myApiUrl = `api/usuario/`;

  constructor(
    private http: HttpClient
  ) {
    this.myAppUrl = `http://localhost:8080/`;
  }

  getListUsuarios(): Observable<any> {
    const url = `${this.myAppUrl}${this.myApiUrl}list`;
    if (this.debug) console.log(url);

    return this.http.get(url);
  }

  deleteUser(id: number): Observable<any> {
    const url = `${this.myAppUrl}${this.myApiUrl}${id}`;
    if (this.debug) console.log(url);

    return this.http.post(url, '');
  }

  saveUser(user: any): Observable<any> {
    const url = `${this.myAppUrl}${this.myApiUrl}new`;
    if (this.debug) console.log(url, user);

    return this.http.post(url, user);
  }

  updateUser(id: number, user: any): Observable<any> {
    const url = `${this.myAppUrl}${this.myApiUrl}update`;
    if (this.debug) console.log(url, user);

    return this.http.post(url, user);
  }
}
