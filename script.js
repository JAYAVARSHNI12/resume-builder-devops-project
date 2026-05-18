function generateResume() {

    // INPUT VALUES

    let name = document.getElementById("name").value;
    let role = document.getElementById("role").value;
    let email = document.getElementById("email").value;
    let phone = document.getElementById("phone").value;
    let address = document.getElementById("address").value;

    let summary = document.getElementById("summary").value;
    let skills = document.getElementById("skills").value;
    let education = document.getElementById("education").value;
    let experience = document.getElementById("experience").value;
    let projects = document.getElementById("projects").value;
    let languages = document.getElementById("languages").value;

    // PREVIEW UPDATE

    document.getElementById("previewName").innerText = name;
    document.getElementById("previewRole").innerText = role;

    document.getElementById("previewEmail").innerText = email;
    document.getElementById("previewPhone").innerText = phone;
    document.getElementById("previewAddress").innerText = address;

    document.getElementById("previewSummary").innerText = summary;
    document.getElementById("previewSkills").innerText = skills;
    document.getElementById("previewEducation").innerText = education;
    document.getElementById("previewExperience").innerText = experience;
    document.getElementById("previewProjects").innerText = projects;
    document.getElementById("previewLanguages").innerText = languages;
}

// PROFILE IMAGE UPLOAD

document.getElementById("imageInput").addEventListener("change", function(event) {

    let reader = new FileReader();

    reader.onload = function() {

        document.getElementById("profileImage").src = reader.result;
    };

    reader.readAsDataURL(event.target.files[0]);

});
