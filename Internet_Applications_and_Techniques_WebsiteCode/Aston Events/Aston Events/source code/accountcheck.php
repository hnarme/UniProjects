<?php
$mysqli = new mysqli("sql309.epizy.com", "epiz_29443851", "A9OQlVVYbvHMsPY", "epiz_29443851_organisers");
if($mysqli->connect_error) {
  exit('Could not connect');
}
//get email and password from form on signin.html
$checkemail = $_POST['inputEmail'];
$checkpwd = $_POST['psw'];

//get the email and password from the database
$sql_e = "SELECT email FROM organiser_information";
$sql_p = "SELECT password FROM organiser_information";

//check if the email and password are equal to any combination on the database
if($sql_e == $checkemail AND $sql_p == $checkpwd) {
  header("Location: http://astonevents.lovestoblog.com/account.php");
  exit();
} else {
  header("Location: http://astonevents.lovestoblog.com/register.html");
  exit();
}
?>