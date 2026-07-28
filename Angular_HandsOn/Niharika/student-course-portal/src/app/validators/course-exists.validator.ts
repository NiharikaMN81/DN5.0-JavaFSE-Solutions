import { AbstractControl, AsyncValidatorFn, ValidationErrors } from '@angular/forms';

export function simulateEmailCheck(): AsyncValidatorFn {

  return (control: AbstractControl): Promise<ValidationErrors | null> => {

    return new Promise(resolve => {

      setTimeout(() => {

        if (control.value && control.value.includes('test@')) {
          resolve({ emailTaken: true });
        } else {
          resolve(null);
        }

      }, 800);

    });

  };

}