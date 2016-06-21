var doGet;

$(document).ready(
		function() {
			doGet = function() {
				$.getJSON("/getInfoByTidServlet", function(data) {
			        $("#url").html("");//清空url内容
			        $("#response").html("");//清空response内容
			        $("#url").html(data.urlStr);//清空url内容
			        $("#response").html(data.responseStr);//清空response内容
			        
			        });
			};

		})