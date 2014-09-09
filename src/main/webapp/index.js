$(document).ready(function () {
    $("#appleAddForm").submit(function () {
        $.ajax({
            type: 'POST',
            url: '/RESTeasily/warehouse-api/putApple',
            data: $("#appleAddForm").serialize(),
            success: function (data, textStatus, xhr) {
                $("#infoLabel").text(data.responseText);
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

    $("#appleRemoveForm").submit(function () {
        $.ajax({
            type: 'POST',
            url: '/RESTeasily/warehouse-api/deleteApple',
            data: $("#appleRemoveForm").serialize(),
            success: function (data) {
                $("#infoLabel").text(data.responseText);
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
            type: 'DELETE',
            url: '/RESTeasily/warehouse-api/clearStorage',
            success: function (data) {
                $("#storage").empty();
            }
        })
    });

});