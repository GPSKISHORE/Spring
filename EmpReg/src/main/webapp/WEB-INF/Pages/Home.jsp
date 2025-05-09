<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Registration</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', sans-serif;
            background: url('https://images.unsplash.com/photo-1506765515384-028b60a970df?auto=format&fit=crop&w=1950&q=80') no-repeat center center fixed;
            background-size: cover;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background: rgba(255, 255, 255, 0.85);
            backdrop-filter: blur(10px);
            padding: 40px;
            border-radius: 16px;
            box-shadow: 0 0 30px rgba(0,0,0,0.2);
            width: 400px;
        }

        h2 {
            text-align: center;
            color: #2e3b55;
            margin-bottom: 25px;
        }

        table {
            width: 100%;
        }

        td {
            padding: 8px 0;
        }

        input[type="text"],
        input[type="number"],
        .dt, select {
            width: 100%;
            padding: 10px;
            font-size: 15px;
            border: 1px solid #ccc;
            border-radius: 8px;
            box-sizing: border-box;
        }

        input[type="text"]:focus,
        input[type="number"]:focus,
        select:focus {
            border-color: #3f51b5;
            outline: none;
        }

        .submit-btn {
            width: 100%;
            background-color: #3f51b5;
            color: white;
            padding: 12px;
            border: none;
            border-radius: 8px;
            font-size: 16px;
            margin-top: 20px;
            cursor: pointer;
            transition: background 0.3s ease;
        }

        .submit-btn:hover {
            background-color: #283593;
        }

        .error {
            color: red;
            font-size: 13px;
            margin-top: 4px;
            display: block;
        }

        td label {
            display: inline-flex;
            align-items: center;
            font-size: 14px;
            cursor: pointer;
            margin-right: 20px;
        }

        input[type="radio"] {
            margin-right: 6px;
        }
    </style>

    <script>
        function validations(form) {
            document.getElementById("eNameError").innerHTML = "";
            document.getElementById("desError").innerHTML = "";
            document.getElementById("SalError").innerHTML = "";

            let ename = form.eName.value;
            let sal = form.sal.value;
            let designation = form.designation.value;
            let val = true;

            if (ename === "") {
                document.getElementById("eNameError").innerHTML = "Emp Name is Mandatory";
                val = false;
            } else if (designation === "") {
                document.getElementById("desError").innerHTML = "Designation is Mandatory";
                val = false;
            } else if (sal <= 0) {
                document.getElementById("SalError").innerHTML = "Salary must be greater than 0";
                val = false;
            }
            form.isValid.value = "YES";
            return val;
        }

        function sendReqForStates(frm) {
            frm.action = "StateList";
            frm.submit();
        }
    </script>
</head>
<body>
    <div class="form-container">
        <h2>Employee Registration</h2>
        <form:form modelAttribute="EmpEnty" action="Dinsrt" method="POST" onsubmit="return validations(this)">
            <input type="hidden" id="isValid" name="isValid" value="NO">
            <table>
                <tr>
                    <td>Emp Name:</td>
                    <td>
                        <form:input path="eName" name="eName"/>
                        <form:errors path="eName" cssClass="error"/>
                        <span id="eNameError" class="error"></span>
                    </td>
                </tr>
                <tr>
                    <td>Salary:</td>
                    <td>
                        <form:input path="sal" type="number" name="sal"/>
                        <form:errors path="sal" cssClass="error"/>
                        <span id="SalError" class="error"></span>
                    </td>
                </tr>
                <tr>
                    <td>Designation:</td>
                    <td>
                        <form:input path="designation" name="designation"/>
                        <form:errors path="designation" cssClass="error"/>
                        <span id="desError" class="error"></span>
                    </td>
                </tr>
                <tr>
                    <td>Gender:</td>
                    <td>
                        <input type="text" name="gen" value="${gen}"/>
                    </td>
                </tr>
                <tr>
                    <td>Country:</td>
                    <td>
                        <form:select path="country" cssClass="styled-select" onchange="sendReqForStates(this.form)">
                            <form:options items="${CountryInfo}"/>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>State:</td>
                    <td>
                        <form:select path="state" cssClass="styled-select">
                            <form:options items="${stateList}"/>
                        </form:select>
                    </td>
                </tr>
                <tr>
                    <td>DOB:</td>
                    <td>
                        <form:input path="dob" name="dob" type="date" cssClass="dt"/>
                    </td>
                </tr>
                <tr>
                    <td>DOJ:</td>
                    <td>
                        <form:input path="doj" name="doj" type="date" cssClass="dt"/>
                    </td>
                </tr>
                <tr>
                    <td>Previously Employed.?</td>
                    <td>
                        <label>
                            <form:radiobutton path="previousemployye" value="true"/> Yes
                        </label>
                        <label>
                            <form:radiobutton path="previousemployye" value="false"/> No
                        </label>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Register" class="submit-btn"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>