function generateResume() {

    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let phone = document.getElementById("phone").value;
    let skills = document.getElementById("skills").value;
    let education = document.getElementById("education").value;
    let projects = document.getElementById("projects").value;

    let resume =
`========================
RESUME
========================

Name: ${name}
Email: ${email}
Phone: ${phone}

Skills:
${skills}

Education:
${education}

Projects:
${projects}`;

    document.getElementById("output").innerText = resume;
}
