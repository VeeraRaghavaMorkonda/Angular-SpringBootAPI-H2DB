import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import { Observable, of } from 'rxjs';
import { Employee } from './employee';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
};

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseURL = "http://localhost:8080";

  constructor(private http: HttpClient)  { }
  
  getEmployeesList(): Observable<Employee[]>{
    return this.http.get<Employee[]>(this.baseURL + '/api/employees');
  }


  createEmployee(employee: Employee): Observable<Object>{
    return this.http.post(this.baseURL + '/api/employees', employee, httpOptions);
  }

  getEmployeeById(id: number): Observable<Employee>{
    return this.http.get<Employee>(`${this.baseURL}/api/employees/${id}`);
  }

  updateEmployee(id: number, employee: Employee): Observable<Object>{
    return this.http.put(`${this.baseURL}/api/employees/${id}`, employee, httpOptions);
  }

  deleteEmployee(id: number): Observable<Object>{
    if (confirm('Are you sure to delete this User?')) {
    return this.http.delete(`${this.baseURL}/api/employees/${id}`, httpOptions);
  }
  return of({});
  }

}