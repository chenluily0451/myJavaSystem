require(['jquery'], function($){

    $.ajax({
        url: '/user',
        method:'GET',
        contentType: 'application/json; charset=utf-8',
        success: function (res) {
            appendTd(res)
        },
        error: function(res){
            console.log(res)
        }
    })

    function appendTd(res){

        for(var i = 0; i<res.length;i++) {
            $("tbody").append("<tr></tr>").append("<td>" +res[i].id + "</td>")
                                          .append("<td>" +res[i].username + "</td>")
                                          .append("<td>" +res[i].phone + "</td>")
        }
    }
});