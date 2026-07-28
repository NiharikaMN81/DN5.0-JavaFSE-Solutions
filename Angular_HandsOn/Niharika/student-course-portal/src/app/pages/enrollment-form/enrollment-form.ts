import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-enrollment-form',
  imports: [FormsModule],
  templateUrl: './enrollment-form.html',
  styleUrl: './enrollment-form.css'
})
export class EnrollmentForm {

  studentName = '';
  studentEmail = '';
  courseId = '';
  preferredSemester = '';
  agreeToTerms = false;

  submitted = false;

  onSubmit(form: any) {
    console.log(form.value);
    console.log(form.valid);

    this.submitted = true;
  }
}