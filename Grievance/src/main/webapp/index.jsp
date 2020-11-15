<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style1.css">
   

  </head>
<body>
    <!-- https://www.youtube.com/watch?v=yZnNnvXO8HI -->
    <header>
      <div class="head1">
        <img src="./img/logo.png" alt="">
        <span>Grievance Management</span>
      </div>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">GMS</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
          
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav ml-auto mr-4">
                <li class="nav-item active mx-5">
                  <a class="nav-link" href="#">HOME <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item mx-5">
                  <a class="nav-link" href="#">ABOUT</a>
                </li>
                <li class="nav-item dropdown mx-5">
                  <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    DEPARTMENT
                  </a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                 
                </li>
                <li class="nav-item mx-5">
                  <a class="nav-link" href="#">CONTACT</a>
                </li>
                
              </ul>
              <!-- <form class="form-inline  ">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
              </form> -->
              <div class="my-2 my-lg-0">
                <a href="<%=request.getContextPath()%>/AppController" class="btn btn-info" role="button">login</a>
               </div>
            </div>
          </nav>
    </header>
    <section>
        <div class="container-fluid">
          <div class="row">
            <div class="col-2 border left-aside">
                <img src="img/2.jpg"   alt="">
                <h4 class="heading">Corona Updates</h4>
                <p class="dark">
                  The Municipal Corporation of Greater Mumbai form 
                </p>
                <p>
                  The Municipal Corporation of Greater Mumbai form 
                </p>
                <p class="dark">
                  The Municipal Corporation of Greater Mumbai form 
                </p>
                <p>
                  The Municipal Corporation of Greater Mumbai form 
                </p>
                <p class="dark">
                  The Municipal Corporation of Greater Mumbai form 
                </p>
              <hr>
              <h4 class="heading">Quick links</h4>
              <h6 class="dark" >link 1</h6>
              <h6>link 2</h6>
              <h6 class="dark">link 3</h6>
              <h6>link 4</h6>
              <h6 class="dark">link 5</h6>

            </div>
            <div class="col-lg-7 col-md-12 col-sm-12 border">
              <div id="demo" class="carousel slide" data-ride="carousel">

                <!-- Indicators -->
                <ul class="carousel-indicators">
                  <li data-target="#demo" data-slide-to="0" class="active"></li>
                  <li data-target="#demo" data-slide-to="1"></li>
                  <li data-target="#demo" data-slide-to="2"></li>
                </ul>
              
                <!-- The slideshow -->
                <div class="carousel-inner">
                  <div class="carousel-item active">
                    <img src="img/bg3.jpg" alt="Los Angeles">
                  </div>
                  <div class="carousel-item">
                    <img src="img/bg1.jpg" alt="Chicago">
                  </div>
                  <div class="carousel-item">
                    <img src="img/bg2.jpg" alt="New York">
                  </div>
                </div>
              
                <!-- Left and right controls -->
                <a class="carousel-control-prev" href="#demo" data-slide="prev">
                  <span class="carousel-control-prev-icon"></span>
                </a>
                <a class="carousel-control-next" href="#demo" data-slide="next">
                  <span class="carousel-control-next-icon"></span>
                </a>
              
              </div>

              <div class="container">
                <div class="row">
                  <div class="col-3 dept" style="background-color: rgb(226, 153, 153);">
                    <img src="img/lg.jpg" alt="">
                    <h5>Department-1</h5>
                  </div>
                  <div class="col-3 dept">
                    <img src="img/lg.jpg" alt="">
                    <h5>Department-1</h5>
                  </div>
                  <div class="col-3 dept" style="background-color: rgb(226, 153, 153);">
                    <img src="img/lg.jpg" alt="">
                    <h5>Department-1</h5>
                  </div>
                </div>
                <div class="row">
                  <div class="col-3 dept">
                    <img src="img/lg.jpg" alt="">
                    <h5>Department-1</h5>
                  </div>
                  <div class="col-3 dept" style="background-color: rgb(226, 153, 153);">
                    <img src="img/lg.jpg" alt="">
                    <h5>Department-1</h5>
                  </div>
                  <div class="col-3 dept">
                    <img src="img/lg.jpg" alt="">
                    <h5>Department-1</h5>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-3 border right-aside">
                <h3 class="heading">Latest News</h3>
                <p class="dark">
                  The Municipal Corporation of Greater Mumbai formerly and commonly known as the Bombay Municipal Corporation is the governing civic body of Mumbai
                </p>
                <p>
                  The Municipal Corporation of Greater Mumbai formerly and commonly known as the Bombay Municipal Corporation is the governing civic body of Mumbai
                </p>
                <p class="dark">
                  The Municipal Corporation of Greater Mumbai formerly and commonly known as the Bombay Municipal Corporation is the governing civic body of Mumbai
                </p>
                <p>
                  The Municipal Corporation of Greater Mumbai formerly and commonly known as the Bombay Municipal Corporation is the governing civic body of Mumbai
                </p>
                <p class="dark">
                  The Municipal Corporation of Greater Mumbai formerly and commonly known as the Bombay Municipal Corporation is the governing civic body of Mumbai
                </p>
                <p>
                  The Municipal Corporation of Greater Mumbai formerly and commonly known as the Bombay Municipal Corporation is the governing civic body of Mumbai
                </p>
            </div>
          </div>
        </div>
    </section>

    <footer>
        <div class="container-fluid bg-dark">
          <div class="row">
            <div class="col-4 ft">
              <img src="img/lg.jpg" alt="">
              <h4>Grievance Mgmt</h4>
            </div>
            <div class="col-4 ft">
              <h5>Quick Links</h5>
              <h6>Home</h6>
              <h6>About</h6>
              <h6>Contact</h6>
              <h6>Other</h6>
            </div>
            <div class="col-4 ft">
              <h5>Department</h5>
              <h6>Dept-1</h6>
              <h6>Dept-2</h6>
              <h6>Dept-3</h6>
              <h6>Dept-4</h6>
            </div>
          </div>
        </div>
    </footer>
</body>
</html>