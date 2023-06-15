<?php
$mysqli = new mysqli("sql309.epizy.com", "epiz_29443851", "A9OQlVVYbvHMsPY", "epiz_29443851_events");
if($mysqli->connect_error) {
  exit('Could not connect');
}

if(isset($_POST['submitsport']))
{
  $name = $_POST['name'];
  $date = $_POST['date'];
  $description = $_POST['description'];
  $organiser = $_POST['organiser'];
  $location = $_POST['location'];

  $sql_si = "INSERT INTO sports (category,name,dates,description,organiser,location)
VALUES ('Sports','name','date','description','organiser','location')";

    if ($mysqli->query($sql_si) === FALSE) {
      header("Location: http://astonevents.lovestoblog.com/account.php");
      exit();
    } else {
      echo "Could not create table. Make sure all fields are correct";
    }
}

if(isset($_POST['submitculture']))
{
  $name = $_POST['name'];
  $date = $_POST['date'];
  $description = $_POST['description'];
  $organiser = $_POST['organiser'];
  $location = $_POST['location'];

  $sql_ci = "INSERT INTO culture (category,name,dates,description,organiser,location)
VALUES ('Culture','name','date','description','organiser','location')";

    if ($mysqli->query($sql_ci) === FALSE) {
      header("Location: http://astonevents.lovestoblog.com/account.php");
      exit();
    } else {
      echo "Could not create table. Make sure all fields are correct";
    }
}

if(isset($_POST['submitother']))
{
  $name = $_POST['name'];
  $date = $_POST['date'];
  $description = $_POST['description'];
  $organiser = $_POST['organiser'];
  $location = $_POST['location'];

  $sql_oi = "INSERT INTO other (category, name, dates, description, organiser, location)
VALUES ('Other','name','date','description','organiser','location')";

    if ($mysqli->query($sql_oi) === FALSE) {
      header("Location: http://astonevents.lovestoblog.com/account.php");
      exit();
    } else {
      echo "Could not create table. Make sure all fields are correct";
    }
}
?>
