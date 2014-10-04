$(document).ready(function(){
	$("#buttonTest").on("click", function(){
		//alert(json);
		sendData();
	})
})

function sendData(){
    $.ajax({
        url : "/display",
        type: "POST",
        data : json,
        dataType: "json",
        contentType: "application/json; charset=utf-8",
        success : function(){
        	window.location.replace("/display");
        },
        error : function(){
        	
        }
    });
}

var json = JSON.stringify({
	nom : "Sauvé",
	prenom : "David",
	list : [
	        {
	        	nom : "fewfw",
	        	prenom : "fwfwf"
	        },
	        {
	        	nom : "Sfdd",
	        	prenom : "ujkutg",
	        },
	        {
	        	nom : "qaswde",
	        	prenom : "fjj",
	        },
	        {
	        	nom : "pokeff",
	        	prenom : "cbdhcn",
	        },
	]
})