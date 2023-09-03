
      function deleteValidation(){

 temp = 1;
        if(document.getElementById('deleteFirstName').value.length === 0) {
          alert('enter first name');
          temp =0;
        }
       if(document.getElementById('deleteLastName').value.length === 0) {
          alert('enter last name');
          temp =0;
        }
         if(document.getElementById('deleteEmail').value.length === 0) {
          alert('enter email');
          temp =0;
        }
         if(document.getElementById('deleteAge').value.length === 0) {
          alert('enter age');
          temp =0;
        }
         if(document.getElementById('deletePhoneNumber').value.length === 0) {
          alert('enter phone number');
          temp =0;
        }
        if(document.getElementById('deleteId').value.length === 0) {
          alert('enter id');
          temp =0;
        }
        if (temp == 1) {
          document.getElementById('sub-delete').submit();
        }

      }