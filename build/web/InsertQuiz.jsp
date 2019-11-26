<%-- 
    Document   : InsertQuiz
    Created on : Nov 24, 2019, 4:02:08 PM
    Author     : USER
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

        <script>
            // Example starter JavaScript for disabling form submissions if there are invalid fields
            (function () {
                'use strict'

                window.addEventListener('load', function () {
                    // Fetch all the forms we want to apply custom Bootstrap validation styles to
                    var forms = document.getElementsByClassName('needs-validation')

                    // Loop over them and prevent submission
                    Array.prototype.filter.call(forms, function (form) {
                        form.addEventListener('submit', function (event) {
                            if (form.checkValidity() === false) {
                                event.preventDefault()
                                event.stopPropagation()
                            }
                            form.classList.add('was-validated')
                        }, false)
                    })
                }, false)
            }())

        </script>

        <style>
              html,
            body {
                height: 100%;
            }

            body {
                display: -ms-flexbox;
                display: flex;
                -ms-flex-align: center;
                align-items: center;
                padding-top: 40px;
                padding-bottom: 40px;
                background-color: #f5f5f5;
            }

            .form-signup {
                width: 100%;
                max-width: 420px;
                padding: 15px;
                margin: auto;
            }

            .form-label-group {
                position: relative;
                margin-bottom: 1rem;
            }

            .form-label-group > input,
            .form-label-group > label {
                height: 3.125rem;
                padding: .75rem;
            }

            .form-label-group > label {
                position: absolute;
                top: 0;
                left: 0;
                display: block;
                width: 100%;
                margin-bottom: 0; /* Override default `<label>` margin */
                line-height: 1.5;
                color: #495057;
                pointer-events: none;
                cursor: text; /* Match the input under the label */
                border: 1px solid transparent;
                border-radius: .25rem;
                transition: all .1s ease-in-out;
            }

            .form-label-group input::-webkit-input-placeholder {
                color: transparent;
            }

            .form-label-group input:-ms-input-placeholder {
                color: transparent;
            }

            .form-label-group input::-ms-input-placeholder {
                color: transparent;
            }

            .form-label-group input::-moz-placeholder {
                color: transparent;
            }

            .form-label-group input::placeholder {
                color: transparent;
            }

            .form-label-group input:not(:placeholder-shown) {
                padding-top: 1.25rem;
                padding-bottom: .25rem;
            }

            .form-label-group input:not(:placeholder-shown) ~ label {
                padding-top: .25rem;
                padding-bottom: .25rem;
                font-size: 12px;
                color: #777;
            }

            /* Fallback for IE
            -------------------------------------------------- */
            @media all and (-ms-high-contrast: none), (-ms-high-contrast: active) {
                .form-label-group > label {
                    display: none;
                }
                .form-label-group input:-ms-input-placeholder {
                    color: #777;
                }
            }

            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }
        </style>
        <title>Insert Quiz</title>
    </head>
    
    <body>
    <nav class="navbar fixed-top navbar-light bg-light">
            <a class="navbar-brand" href="Webquiz">
                <img src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
                Webquiz
            </a>
        </nav>

        <form class="form-signup" action="Signup" method="post" oninput="fullname.value = firstname.value +' ' + lastname.value">
            <div class="text-center mb-4">
                <h1 class="h3 mb-3 font-weight-normal">Insert your quiz</h1>
                <p>${msg}</p>
            </div>
             <div class="form-label-group">
                 <input type="text" id="inputsubjectID" name="subjectID" class="form-control" required autofocus>
                <label for="inputsubjectID">Subject ID : </label>
            </div>
            <div class="form-label-group">
                 <input type="text" id="inputquizID" name="quizID" class="form-control" required autofocus>
                <label for="inputquizID">Quiz ID : </label>
            </div>
            <div class="form-label-group">
                 <input type="text" id="inputchoice1" name="choice1" class="form-control" required autofocus>
                <label for="inputchoice1">Choice 1 : </label>
            </div>
            <div class="form-label-group">
                 <input type="text" id="inputchoice2" name="choice2" class="form-control" required autofocus>
                <label for="inputchoice2">Choice 2 : </label>
            </div>
            <div class="form-label-group">
                 <input type="text" id="inputchoice3" name="choice3" class="form-control" required autofocus>
                <label for="inputchoice3">Choice 3 : </label>
            </div>
            <div class="form-label-group">
                 <input type="text" id="inputchoice4" name="choice4" class="form-control" required autofocus>
                <label for="inputchoice4">Choice 4 : </label>
            </div>
            <div class="form-label-group">
                 <input type="text" id="inputanswer" name="answer" class="form-control" required autofocus>
                <label for="inputanswer">Answer : </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Insert</button>
         </form>
    </body>
</html>

