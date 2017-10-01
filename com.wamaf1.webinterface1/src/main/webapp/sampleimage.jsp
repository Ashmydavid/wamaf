<HTML>
<HTML>
<HEAD>
<TITLE>Background Image</TITLE>
</HEAD>

<img src="${pageContext.request.contextPath}/images/backimage.jpg" />
<link rel="stylesheet" type="text/css" href="yourCSSpath/yourCSSname.css" />
<SCRIPT>
function validate() {
if (document.forms[0].name.value=="") {
alert("Please Enter the Name !");
return false;
}
alert("Welcome!");
return true;
}
</SCRIPT>
<FORM onSubmit="return validate()">
<P><br />
<br />
<BR>
<FONT COLOR="white" SIZE="4">Enter the Name:
<INPUT TYPE="text" NAME="name" size="35" VALUE="" >
<br />
<BR>
<INPUT TYPE=SUBMIT VALUE="Submit">
<BR>
<B><FONT COLOR=BLACK SIZE=4>
</TABLE>
</FORM>
</BODY> 