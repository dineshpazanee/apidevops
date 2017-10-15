
var sendReq = function(link, method, params){
	$.ajax({
                url: link,
                dataType: 'json',
                type: method,
                contentType: 'application/json',
                data: JSON.stringify({username:"dinesh", password:"123456789", email:"dinesh@apidevops.com", isactive:"true"}),
                success: function( data, textStatus, jQxhr ){
                    alert(textStatus+" "+data);
                     console.log( textStatus+" "+data );
                },
                error: function( jqXhr, textStatus, errorThrown ){
                	alert(textStatus+" "+errorThrown);
                    console.log( errorThrown );
                }
            });
	
}


var getEventSource = function(url) {
		if(!!typeof(EventSource)) {
		    var source = new EventSource(url);
		    source.onmessage = function(event) {
		    	console.log( event.data  );
		    };
		} else {
		    document.getElementById("result").innerHTML = "Sorry, your browser does not support server-sent events...";
		}
}


$(window).load(function () {
	if ($(window).width() > 768) {
		$.app.nav.init({speed: 0});
		$.app.menu.toggle();
	}
	$.app.nav.init({speed: 2000});
});

$(document).ready(function() {
			// alert("window is loaded");
		  // 	sendReq("/adduser", "POST","");
		   //	getEventSource("/scala/eventSource/liveClock");
		});
