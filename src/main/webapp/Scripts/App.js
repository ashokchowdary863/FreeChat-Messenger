/**
 * 
 */

$(document).ready(function(){
	loadActiveUsers();
});

function loadActiveUsers(){
	var id=1;
	var activeUserRow=$("#activeUserRow").clone();
	$.ajax({url: "http://localhost:8080/Messenger_JAX-RS/api/users/getRecentActiveUsers", success: function(result){
		$.each( result, function( key, value ) {
			  var row=activeUserRow.clone();
			  var children=row.children();
			  $(children[0]).html(id);
			  var anchor=$(children[1]).find("a");
			  $(anchor).attr("onclick","loadConversation('"+value.userName+"')");
			  $(anchor).html(value.firstName);
			  $(children[2]).find("i").html("Last seen at "+value.lastLoginDate.substring(0,value.lastLoginDate.length-2));
			  $('#users').find(".panel-body").append(row);
			  id++;
			});
    }});
}

function loadConversation(user){
	alert(user);
}
