require(['jquery'], function($){

    $("#submit").on("click",function(){

        var data = {
            "username": $("input[name='username']").val(),
            "password": $("input[name='password']").val(),
            "phone": $("input[name='phone']").val()
        }
        $.ajax({
            url: '/user',
            method:'POST',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data),
            success: function (res) {
                console.log(res)
            },
            error: function(res){
                console.log(res)
            }
        })
    })
});