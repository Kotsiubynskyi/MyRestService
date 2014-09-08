$(document).ready(function () {
    $("#form").submit(function () {
        $.ajax({
            type: 'POST',
            url: '/RESTeasily/warehouse-api/putApple',
            data: $("#form").serialize(),
            async: false,
            success: function (data) {
                console.log(data);
                var text = data.responseText;
                console.log(text);
                $("#storage").append("" +
                    "<div class='apple'>" +
                    "<div class='top'><span/></div>" +
                    "<div class='butt'><span/></div>" +
                    "</div>");
            },
            error: function (e) {
                console.log(e);
            }
        });
        return false;
    })
});