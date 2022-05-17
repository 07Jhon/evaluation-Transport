<%@page import=" java.text.*, java.util.*"%>
<%@ page
        import="com.fasterxml.jackson.databind.JsonNode, java.util.Iterator ,evaluation.chauffeur.Chauffeur"%>
<%
    String titre = (request.getAttribute("nom")!=null) ? (String) request.getAttribute("nom") : "";
    JsonNode creds = (JsonNode) session.getAttribute("creds");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <%
        if(creds !=null){
            for( int i = 0; i< creds.size(); i++){
                creds.get(i).get("nom").asText();
            }
        }
    %>
</body>
</html>