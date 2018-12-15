<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello!</title>
    <link href="/css/main.css" rel="stylesheet">
</head>
<body>
  <h2>List of products</h2>
        
        <table>
            <tr>
                <th>Id</th>  
                <th>Name</th>  
                <th>SKU</th>
                <th>Description</th>
            </tr>        

            <#list products as product>
                <tr>
                    <td>${product.id?if_exists}</td> 
                    <td>${product.name?if_exists}</td> 
                    <td>${product.sku?if_exists}</td>
                    <td>${product.description?if_exists}</td>
                </tr>
            </#list>        
        </table>  
</body>
</html>