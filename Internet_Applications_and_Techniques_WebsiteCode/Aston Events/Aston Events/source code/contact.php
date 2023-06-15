<!DOCTYPE html>
<html lang="en">
<html>
<head>
  <meta charset="UTF-8"/>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link rel="stylesheet" href="style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <title>Aston Events</title>
</head>
<body>
  <!-------------navbar start--------------->
  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <div class="navbar-header">
        <a class="navbar-brand" href="index.html">Aston Events</a>
      </div>
      <ul class="nav navbar-nav">
        <li><a href="index.html">Home</a></li>
        <li><a href="events.html">Events</a></li>
        <li><a href="contact.php">Contact</a></li>
        <li><a href="about.html">About</a></li>
        <li><a href="signin.html">Organisers</a></li>
      </ul>
    </div>
  </nav>
  <!-------------navbar end----------------->
  <!-------------content start--------------->
  <?php
  // define variables and set to empty values
  $nameErr = $emailErr = "";
  $name = $email = $comment = "";

  if ($_SERVER["REQUEST_METHOD"] == "POST") {
    if (empty($_POST["name"])) {
      $nameErr = "Name is required";
    } else {
      $name = test_input($_POST["name"]);
      // check if name only contains letters and whitespace
      if (!preg_match("/^[a-zA-Z-' ]*$/",$name)) {
        $nameErr = "Only letters and white space allowed";
      }
    }

    if (empty($_POST["email"])) {
      $emailErr = "Email is required";
    } else {
      $email = test_input($_POST["email"]);
      // check if e-mail address is correct format
      if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
        $emailErr = "Invalid email format: example@mail.com";
      }
    }

    if (empty($_POST["comment"])) {
      $comment = "";
    } else {
      $comment = test_input($_POST["comment"]);
    }
  }

  function test_input($data) {
    $data = trim($data);
    $data = stripslashes($data);
    $data = htmlspecialchars($data);
    return $data;
  }
  ?>
  <div class="container">
    <h1>Any enquires?</h1>
    <h3>Send us an email:</h3>
    <div class="col-lg-2">
      <p><span class="error">* = required field</span></p>
      <form method="post" action="">
        <div class="form-group">
          Name: <input type="text" name="name" class="form-control" value="<?php echo $name;?>">
          <span class="error">* <?php echo $nameErr;?></span>
          <br><br>
        </div>
        <div class="form-group">
          E-mail: <input type="text" name="email" class="form-control" value="<?php echo $email;?>">
          <span class="error">* <?php echo $emailErr;?></span>
          <br><br>
        </div>
        <div class="form-group">
          Comment: <textarea class="form-control" name="comment" rows="5" cols="40"><?php echo $comment;?></textarea>
          <br><br>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
  <!-------------content end--------------->
  <!-------------footer start--------------->
  <footer>
    <div class="footer">
      <div class="sqs-block-content">
        <div class="row sqs-row">
          <div class="col sqs-col-3 span-4">
            <div class="sqs-block-content">
              <h3>Aston St, Birmingham B4 7ET</h3>
            </div>
          </div>
          <div class="col sqs-col-3 span-4">
            <div class="sqs-block-content">
              <h3>Contact Us:</h3>
              <p>Tel: 0800 000 000</p>
            </div>
          </div>
        </div>
      </div>
    </footer>
    <!-------------footer end--------------->
  </body>
  </html>
