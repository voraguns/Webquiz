<%-- 
    Document   : Login
    Created on : Nov 15, 2019, 6:40:41 AM
    Author     : GunPc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quiz - Signin</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

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

            .form-signin {
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
    </head>
    <body>
        <!-- Image and text -->
        <nav class="navbar fixed-top navbar-light bg-light">
            <a class="navbar-brand" href="Webquiz">
                <img src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
                Webquiz
            </a>
        </nav>

        <form class="form-signin" action="Signin" method="post">
            <div class="text-center mb-4">
                <img class="mb-4" src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
                <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
            </div>
            <div class="form-label-group">
                <input type="text" id="inputEmail" class="form-control" placeholder="Username" required autofocus>
                <label for="inputEmail">Username</label>
            </div>

            <div class="form-label-group">
                <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
                <label for="inputPassword">Password</label>
            </div>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </body>
</html>
