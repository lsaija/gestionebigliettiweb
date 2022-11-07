<header>
  <!-- Fixed navbar -->
 <nav class="navbar navbar-expand-lg navbar-dark bg-info" aria-label="Eighth navbar example">
    <div class="container">
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample07" aria-controls="navbarsExample07" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExample07">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="text-secondary nav-link active" aria-current="page" href="index.jsp">Home</a>
          </li>
          <li class="nav-item">
            <a class="text-secondary nav-link" href="#">Link</a>
          </li>
          <li class="nav-item">
            <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
          </li>
          <li class="nav-item dropdown">
            <a class="text-secondary nav-link dropdown-toggle" href="#" id="dropdown07" data-bs-toggle="dropdown" aria-expanded="false">Agenda</a>
            <ul class="dropdown-menu" aria-labelledby="dropdown07">
              <li><a class="dropdown-item" href="ListBigliettiServlet">I miei biglietti</a></li>
              <li><a class="dropdown-item" href="PrepareInsertBigliettiServlet">Nuovo biglietto</a></li>
              <li><a class="dropdown-item" href="PrepareSearchBigliettoServlet">Cerca biglietti</a></li>
            </ul>
          </li>
        </ul>
      </div>
      <div class="col-md-3 text-end">
        <a  class="btn btn-secondary" href="login.jsp">Login</a>
      </div>
    </div>
  </nav>
  
  
</header>