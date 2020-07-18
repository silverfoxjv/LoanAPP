$(document).ready(function() {

    insertModalPoint();

    var message = $("#alertMessage") ? $("#alertMessage").text() : "";
    if (message && message.length !== 0) {
        console.log(message);
        $("#modalInsertPoint").load("component/alert/alert.component.html", () => {
            $('#alertMessageDest').append(message);
            $('#exampleModal').modal("show");
        });

    }
});


function insertModalPoint() {
    $("body").append("<div id=\"modalInsertPoint\"/>");
}