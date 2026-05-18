function generateResume() {

    let name = document.getElementById("name").value;
    let email = document.getElementById("email").value;
    let phone = document.getElementById("phone").value;
    let address = document.getElementById("address").value;
    let skills = document.getElementById("skills").value;
    let education = document.getElementById("education").value;
    let projects = document.getElementById("projects").value;
    let summary = document.getElementById("summary").value;

    document.getElementById("outName").innerText = name;
    document.getElementById("outEmail").innerText = email;
    document.getElementById("outPhone").innerText = phone;
    document.getElementById("outAddress").innerText = address;

    document.getElementById("outSummary").innerText = summary;
    document.getElementById("outSkills").innerText = skills;
    document.getElementById("outEducation").innerText = education;
    document.getElementById("outProjects").innerText = projects;

    let imageInput = document.getElementById("imageInput");

    if (imageInput.files && imageInput.files[0]) {

        let reader = new FileReader();

        reader.onload = function(e) {
            document.getElementById("profileImage").src = e.target.result;
        };

        reader.readAsDataURL(imageInput.files[0]);
    }
}
