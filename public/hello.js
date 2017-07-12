$(document).ready(function() {
    $.ajax({
        url: "http://localhost:9001/employee/1234"
    }).then(function(data, status, jqxhr) {
       $('.id').append("Testddd");
       $('.name').append("Name");
       console.log(jqxhr);
    });
});