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
  <div class="container">
  <h1>Welcome Organiser</h1>
  <h3>My Events</h3>
  <table class="table table-striped table-light" id="myTable">
    <thead class="thead-light">
      <tr class="table-info">
        <th scope="col">Name</th>
        <th scope="col">Date</th>
        <th scope="col">Description</th>
        <th scope="col">Location</th>
        <th scope="col">Ranking</th>
      </tr>
    </thead>
    <?php
    $mysqli = new mysqli("sql309.epizy.com", "epiz_29443851", "A9OQlVVYbvHMsPY", "epiz_29443851_events");
    if($mysqli->connect_error) {
      exit('Could not connect');
    }

    $sql = "SELECT name, dates, description, location, ranking FROM culture";
    $result = $mysqli->query($sql);

    if ($result->num_rows > 0) {

      while($row = $result->fetch_assoc()) {
        echo "<tr><td>" . $row["name"]. "</td><td>" . $row["dates"] . "</td><td>"
        . $row["description"]. "</td><td>" . $row["location"] . "</td><td>"
        . $row["ranking"] . "<td></tr>";
      }
      echo "</table>";
    }
    else { echo "0 results"; }
    $mysqli->close();
    ?>
  </table>

  <h3>Create new events below:</h3>
  <div class="row">
    <div class="grid">
      <div class="container">
        <div class="col-md-8">
          <h3>New sports event</h3>
          <div class="form-group">
            <form class="" action="insertevent.php" method="post">
              <label>Name</label>
              <input type="text" name="name" class="form-control">
              <label>Date</label>
              <input type="date" name="date" class="form-control">
              <label>Description</label>
              <input type="text" name="description" class="form-control">
              <label>Organiser</label>
              <input type="text" name="organiser" class="form-control">
              <label>Location</label>
              <input type="text" name="location" class="form-control">
              <p></p>
              <button type="submit" name="submitsport" class="btn btn-primary">Create</button>
            </form>
          </div>
        </div>
      </div>

      <div class="container">
        <div class="col-md-8">
          <h3>New culture event</h3>
          <div class="form-group">
            <form class="" action="insertevent.php" method="post">
              <label>Name</label>
              <input type="text" name="name" class="form-control">
              <label>Date</label>
              <input type="date" name="date" class="form-control">
              <label>Description</label>
              <input type="text" name="description" class="form-control">
              <label>Organiser</label>
              <input type="text" name="organiser" class="form-control">
              <label>Location</label>
              <input type="text" name="location" class="form-control">
              <p></p>
              <button type="submit" name="submitculture" class="btn btn-primary">Create</button>
            </form>
          </div>
        </div>
      </div>

      <div class="container">
        <div class="col-md-8">
          <h3>New other event</h3>
          <div class="form-group">
            <form class="" action="insertevent.php" method="post">
              <label>Name</label>
              <input type="text" name="name" class="form-control">
              <label>Date</label>
              <input type="date" name="date" class="form-control">
              <label>Description</label>
              <input type="text" name="description" class="form-control">
              <label>Organiser</label>
              <input type="text" name="organiser" class="form-control">
              <label>Location</label>
              <input type="text" name="location" class="form-control">
              <p></p>
              <button type="submit" name="submitother" class="btn btn-primary">Create</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
</div>
<!-------------content end--------------->
<!-------------footer start--------------->
<footer>
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
      </footer>
      <!-------------footer end--------------->
    </body>
    </html>
