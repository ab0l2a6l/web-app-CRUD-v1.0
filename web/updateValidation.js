
      function updateValidation(){

 temp = 1;

        if(document.getElementById('updateFirstName').value.length === 0) {
          alert('enter first name');
          temp =0;
        }
       if(document.getElementById('updateLastName').value.length === 0) {
          alert('enter last name');
          temp =0;
        }
         if(document.getElementById('updateEmail').value.length === 0) {
          alert('enter email');
          temp =0;
        }
         if(document.getElementById('updateAge').value.length === 0) {
          alert('enter age');
          temp =0;
        }
         if(document.getElementById('updatePhoneNumber').value.length === 0) {
          alert('enter phone number');
          temp =0;
        }
        if(document.getElementById('updateId').value.length === 0) {
          alert('enter id');
          temp =0;
        }
        if (temp == 1) {
          document.getElementById('sub-update').submit();
        }

      }