$(document).ready(function() {

    insertModalPoint();

    var message = $("#alertMessage");
    if (message && message.text().length !== 0) {
        $("#modalInsertPoint").load("component/alert/alert.component.html", () => {
            $('#exampleModal').modal("show");
        });

    }
});


function insertModalPoint() {
    $("body").append("<div id=\"modalInsertPoint\"/>");
}