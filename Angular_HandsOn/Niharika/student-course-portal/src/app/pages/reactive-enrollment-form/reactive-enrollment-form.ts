import { Component } from '@angular/core';
import { FormArray, FormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';import { noCourseCode } from '../../validators/course-code.validator';
import { simulateEmailCheck } from '../../validators/course-exists.validator';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-reactive-enrollment-form',
  imports: [CommonModule, ReactiveFormsModule],
  templateUrl: './reactive-enrollment-form.html',
  styleUrl: './reactive-enrollment-form.css'
})
export class ReactiveEnrollmentForm {

  enrollForm;

  constructor(private fb: FormBuilder) {

    this.enrollForm = this.fb.group({

	
	  studentEmail: [ '', [Validators.required, Validators.email], [simulateEmailCheck()]],
	  
	  courseId: ['', [Validators.required, noCourseCode]],
      preferredSemester: ['Odd', Validators.required],

      agreeToTerms: [false, Validators.requiredTrue],

	  additionalCourses: this.fb.array([])

    });

  }
  get additionalCourses(): FormArray {
  return this.enrollForm.get('additionalCourses') as FormArray;
}

  onSubmit() {

  console.log('Form Value');
  console.log(this.enrollForm.value);

  console.log('Raw Value');
  console.log(this.enrollForm.getRawValue());

}
addCourse() {
  this.additionalCourses.push(
    this.fb.control('', Validators.required)
  );
}

removeCourse(index: number) {
  this.additionalCourses.removeAt(index);
}

}