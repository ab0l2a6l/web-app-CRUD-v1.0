
     function selectOneValidation(){
        if(document.getElementById('findOneId').value.length === 0) {
          alert('enter id');

        }
        else{
          document.getElementById('sub-findOne').submit();
        }

      }