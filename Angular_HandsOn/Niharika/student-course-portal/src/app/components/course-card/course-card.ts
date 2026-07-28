import { Highlight } from '../../directives/highlight';
import { CommonModule } from '@angular/common';
import { Component, EventEmitter, Input, Output } from '@angular/core';
import { CreditLabelPipe } from '../../pipes/credit-label-pipe';


@Component({
  selector: 'app-course-card',
  imports: [CommonModule, Highlight, CreditLabelPipe],
  templateUrl: './course-card.html',
  styleUrl: './course-card.css'
})
export class CourseCard {

  @Input() course: any;

  @Output() enrollRequested = new EventEmitter<number>();

  isExpanded = false;

  get cardClasses() {
    return {
      'card-enrolled': this.course.enrolled,
      'card-full': this.course.credits >= 4,
      'expanded': this.isExpanded
    };
  }

  enroll() {
    this.enrollRequested.emit(this.course.id);
  }

  toggleDetails() {
    this.isExpanded = !this.isExpanded;
  }
}