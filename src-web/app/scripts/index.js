require(['jquery'], function($){

    $("#loginBtn").on("click",function () {

        $.ajax({
            url: '/loginPost?username=' + $("#username").val() + "&password=" + $("#password").val(),
            method:'POST',
            contentType: 'application/json; charset=utf-8',
            success: function (res) {
                console.log(res)
            },
            error: function(res){
                console.log(res)
            }
        })
    })
});