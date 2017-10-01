
<html>
<body>
<head>
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
  
</head>

<table style="width:100%">
  <tr>
    <th>Select platform</th>
</tr>
</table>


<form>

<tr>
<th>
<select>
  <option value="web">Web</option>
  <option value="mobile">Mobile</option>
</select>
</th>
</tr>  





<tr>
<th>Select date</th>
</tr>

<tr>
<th>
<form>
Start date:
    <input id="datepicker" />
 
<script>
  $(document).ready(function() {
    $("#datepicker").datepicker();
  });
  </script>
 
 </form> 
</th>
</tr>   





<tr>
<th>
<form>
End date:
  <input id="datepicker1" />
  
  <script>
  $(document).ready(function() {
    $("#datepicker1").datepicker();
  });
  </script>
  </form>
 </th>
</tr>


<tr>
<th>
  <input type="submit" value="Submit">
</th>
</tr>

</form> 

</body>
</html>