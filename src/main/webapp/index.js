$(document).ready(function () {
    $("#form").submit(function () {
        $.ajax({
            type: 'POST',
            url: '/RESTeasily/warehouse-api/putApple',
            data: $("#form").serialize(),
            success: function (data, textStatus, xhr) {
                $("#infoLabel").empty();
                $("#storage").append(
                        "<div class='apple'>" +
                        "<div class='top'><span/></div>" +
                        "<div class='butt'><span/></div>" +
                        "</div>");
            },
            error: function (e) {
                console.log(e.responseText);
                $("#infoLabel").text(e.responseText);
            }
        });
        return false;
    });

    $("#clearStorage").click(function () {
        $.ajax({
            type: 'PUT',
            url: '/RESTeasily/warehouse-api/clearStorage',
            success: function (data) {
                $("#storage").empty();
            }
        })
    });

});