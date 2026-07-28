import { Component, OnInit, ChangeDetectorRef } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCard } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  imports: [CommonModule, CourseCard],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList implements OnInit {
  isLoading = true;
  courses = [
    { id: 1, name: 'Data Structures', code: 'CS201', credits: 4, gradeStatus: 'passed' },
    { id: 2, name: 'Web Development', code: 'CS305', credits: 3, gradeStatus: 'failed' },
    { id: 3, name: 'Database Systems', code: 'CS310', credits: 4, gradeStatus: 'pending' }
  ];
  selectedCourseId: number | null = null;

  constructor(private cdr: ChangeDetectorRef) {}

  ngOnInit() {
    setTimeout(() => {
      this.isLoading = false;
      this.cdr.detectChanges();
    }, 1500);
  }

  trackByCourseId(index: number, course: any) {
    return course.id;
  }

  onEnroll(courseId: number) {
    console.log('Enrolling in course: ' + courseId);
    this.selectedCourseId = courseId;
    this.cdr.detectChanges();
  }
}