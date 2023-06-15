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
 <table class="table table-striped table-light" id="myTable">
    <thead class="thead-light">
      <tr class="table-info">
        <th scope="col">Name</th>
        <th scope="col">Date</th>
        <th scope="col">Description</th>
        <th scope="col">Organiser</th>
        <th scope="col">Ranking</th>
      </tr>
    </thead>
    <?php
    $mysqli = new mysqli("sql309.epizy.com", "epiz_29443851", "A9OQlVVYbvHMsPY", "epiz_29443851_events");
    if($mysqli->connect_error) {
      exit('Could not connect');
    }

    $sql = "SELECT category, name, dates, description, organiser, ranking FROM culture";
    $result = $mysqli->query($sql);

    if ($result->num_rows > 0) {

      while($row = $result->fetch_assoc()) {
        echo "<tr><td>" . $row["name"]. "</td><td>" . $row["dates"] . "</td><td>"
        . $row["description"]. "</td><td>" . $row["organiser"] . "</td><td>"
        . $row["ranking"] . "<td></tr>";
      }
      echo "</table>";
    }
    else { echo "0 results"; }
    $mysqli->close();
    ?>
  </table>
  <p><button onclick="sortTable()" type="submit" name="submit" class="btn btn-primary">Highest Rated</button></p>
  <script>
  function sortTable() {
    var table, rows, switching, i, x, y, shouldSwitch;
    table = document.getElementById("myTable");
    switching = true;
    while (switching) {
      switching = false;
      rows = table.rows;
      for (i = 1; i < (rows.length - 1); i++) {
        shouldSwitch = false;
        x = rows[i].getElementsByTagName("td")[0];
        y = rows[i + 1].getElementsByTagName("td")[0];
        if (Number(x.innerHTML) > Number(y.innerHTML)) {
          shouldSwitch = true;
          break;
        }
      }
      if (shouldSwitch) {
        rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
        switching = true;
      }
    }
  }
</script>
  <!-------------content end--------------->
  <!-------------footer start-------------->
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
  <!-------------footer end-------------->
  </body>
  </html>
