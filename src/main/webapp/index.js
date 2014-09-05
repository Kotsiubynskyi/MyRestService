$(document).ready(function () {
    $("#submitButton").click(function () {
        $.ajax({
            type: 'POST',
            url: '/warehouse-api/putApple',
            data: $("#form").serialize(),
            async: false,
            dataType: 'json',
            success: function (data) {
                console.log(data);
                $("#storage").append("" +
                    "<div class='apple'>" +
                    "<div class='top'><span/></div>" +
                    "<div class='butt'><span/></div>" +
                    "</div>");
            }
        });
    })
});