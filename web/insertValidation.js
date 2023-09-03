
 function insertValidation(){
    temp = 1;
        if(document.getElementById('insertFirstName').value.length === 0) {
          alert('enter first name');
          temp =0;
        }
       if(document.getElementById('insertLastName').value.length === 0) {
          alert('enter last name');
          temp =0;
        }
         if(document.getElementById('insertEmail').value.length === 0) {
          alert('enter email');
          temp =0;
        }
         if(document.getElementById('insertAge').value.length === 0) {
          alert('enter age');
          temp =0;
        }
         if(document.getElementById('insertPhoneNumber').value.length === 0) {
          alert('enter phone number');
          temp =0;
        }
        if(document.getElementById('insertId').value.length === 0) {
          alert('enter id');
          temp =0;
        }
        if (temp == 1) {
          document.getElementById('sub-insert').submit();
        }

}