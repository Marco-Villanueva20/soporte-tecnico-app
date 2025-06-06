import { Component, inject, OnInit } from '@angular/core';
import { HomeService } from '../../services/home.service';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export default class HomeComponent implements OnInit {
  private homeService = inject(HomeService);

  home: any[] = [];

  ngOnInit(): void {
    this.homeService.listar()
      .subscribe({
        next: (home: any) => {
          console.log('Data fetched successfully:', home);
          this.home = home;
        },
        error: (error) => {
          console.error('Error fetching data:', error);
        }
      })
  }
}
