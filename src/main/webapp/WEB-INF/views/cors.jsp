<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript">
        function push() {
            var url = "http://54.191.147.237:8080/app-1.0.0-BUILD-SNAPSHOT/api/genkey";
            //var url = "http://54.191.147.237:8080/shack02/person.do";
            $.ajax({
                type: 'GET',
                url: url,
                async: true,
                contentType: 'application/json',
                data: '{}',
                success: function (response) {
                    console.log(response);
                    alert(response);
                },
                error: function (xhr) {
                    alert('Error!  Status = ' + xhr.status + " Message = "
                            + xhr.statusText);
                }
            });

        }
    </script>

</head>
<body>


<input type="button" value=" send " onclick="push();">

</body>
</html>
