

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

    return val;
}