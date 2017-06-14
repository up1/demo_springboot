$(document).ready(function() {
    $.ajax({
        url: "http://localhost:9001/user/all"
    }).then(function(data, status, jqxhr) {
       $('.id').append("Testddd");
       $('.name').append("Name");
       console.log(jqxhr);
    });
});