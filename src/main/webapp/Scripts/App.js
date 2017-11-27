/**
 * 
 */

$(document).ready(function(){
	loadDashboard();
});

function  loadDashboard(){
	$("#messages").hide();
	$("#feeds").hide();
	$("#users").hide();
	$("#dashboard").show();
	loadActiveUsers();
}

function  loadMessages(){
	$("#messages").show();
	$("#feeds").hide();
	$("#users").hide();
	$("#dashboard").hide();
}

function  loadFeeds(){
	$("#messages").hide();
	$("#feeds").show();
	$("#users").hide();
	$("#dashboard").hide();
}

function  loadUsers(){
	$("#messages").hide();
	$("#feeds").hide();
	$("#users").show();
	$("#dashboard").hide();
}

function loadActiveUsers(){
	var id=1;
	var activeUserRow=$("#activeUserRow").clone();
	$.ajax({url: "http://localhost:8080/Messenger_JAX-RS/api/users/getRecentActiveUsers", success: function(result){
		$('#users-db').find(".panel-body").empty();
		$.each( result, function( key, value ) {
			  var row=activeUserRow.clone();
			  var children=row.children();
			  $(children[0]).html(id);
			  var anchor=$(children[1]).find("a");
			  $(anchor).attr("onclick","loadConversation('"+value.userName+"')");
			  $(anchor).html(value.firstName+" "+value.lastName);
			  $(children[2]).find("i").html("Last seen at "+value.lastLoginDate.substring(0,value.lastLoginDate.length-2));
			  $('#users-db').find(".panel-body").append(row);
			  id++;
			});
    }});
}

function loadConversation(user){
	alert(user);
}
