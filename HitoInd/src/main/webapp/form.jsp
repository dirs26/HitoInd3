<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>

<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Solocrossfit</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <style>
    body{
      background-color: burlywood;
    }
    .formu {
      color: white;
      margin: 0 auto;
      max-width: 500px ;
      border: 2px solid #624036;
      border-width: 2px solid black;
      border-radius: 15px;
      padding: 20px;
      margin-top: 50px;
      background-color:#724d42;


    }
  </style>

</head>

<body>

    <form action="add" method="post" class="formu">
      <h3>Inscr&iacute;bete Ya !!</h3>
      <div class="mb-3">
        <label for="nombre" class="form-label">Nombre del usuario:</label>
        <input type="text" id="nombre" name="nombre" class="form-control" required>
      </div>

      <div class="mb-3">
        <label for="plan" class="form-label">Plan a Contratar:</label>
        <select id="plan" name="plan" class="form-control" required onchange="determinarPrecio()">
          <option value="" disabled selected>Selecciona tu plan</option>
          <option value="Beginner">Beginner</option>
          <option value="Intermediate">Intermediate</option>
          <option value="Elite">Elite</option>
        </select>
      </div>
      <div class="mb-3">
        <label for="precio" class="form-label">Precio en base al plan:</label>
        <input type="number" id="precio" name="precio" class="form-control" required readonly>
      </div>

      <div class="mb-3">
        <label for="peso" class="form-label">Peso actual (kg):</label>
        <select id="peso" name="peso" class="form-control" required onchange="determinarCategoria()">
          <option value="" disabled selected>Selecciona tu peso</option>
          <option value="50-55">50 - 55 kg</option>
          <option value="60-65">60 - 65 kg</option>
          <option value="70-75">70 - 75 kg</option>
          <option value="80-85">80 - 85 kg</option>
          <option value="90-95">90 - 95 kg</option>
          <option value="100-105">100 - 105 kg</option>
        </select>
      </div>

      <div class="mb-3">
        <label for="categoria" class="form-label">Categor&iacute;a en base al peso:</label>
        <input type="text" id="categoria" name="categoria" class="form-control" required readonly>
      </div>

      <div class="mb-3">
        <label for="eventos" class="form-label">Eventos para competir :</label>
        <input type="number" min="0" max="5" id="competicion" name="competicion" class="form-control" required>
      </div>
      <div class="mb-3">
        <label for="horas" class="form-label">¿Desea a&ntilde;adir un n&uacute;mero de horas extra al mes?</label>
        <input type="number" id="horas" class="form-control" name="horas" min="0" max="10">
      </div>

      <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
      <script>
    function determinarCategoria() {
      var peso = document.getElementById('peso').value;
      var categoria = document.getElementById('categoria');

      switch (peso) {
        case '50-55':
          categoria.value = 'Peso pluma';
          break;
        case '60-65':
          categoria.value = 'Peso ligero';
          break;
        case '70-75':
          categoria.value = 'Peso medio-ligero';
          break;
        case '80-85':
          categoria.value = 'Peso medio';
          break;
        case '90-95':
          categoria.value = 'Peso medio-pesado';
          break;
        case '100-105':
          categoria.value = 'Peso pesado';
          break;
        default:
          categoria.value = '';
          break;
      }
    }
  function determinarPrecio() {
      var plan = document.getElementById('plan').value;
      var precio = document.getElementById('precio');

      switch (plan) {
        case 'Beginner':
          precio.value = '25';
          break;
        case 'Intermediate':
          precio.value = '30';
          break;
        case 'Elite':
          precio.value = '35';
          break;
        default:
          precio.value = '';
          break;
      }
    } 
  </script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
    crossorigin="anonymous"></script>
</body>

</html>