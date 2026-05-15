let currentResumeText = '';
let currentResumeHTML = '';

function generateResume(event) {
    if (event) {
        event.preventDefault();
    }

    const name = document.getElementById('name').value.trim();
    const email = document.getElementById('email').value.trim();
    const phone = document.getElementById('phone').value.trim();
    const address = document.getElementById('address').value.trim();
    const skills = document.getElementById('skills').value.trim();
    const education = document.getElementById('education').value.trim();
    const projects = document.getElementById('projects').value.trim();

    currentResumeText = `==============================\n` +
        `         RESUME\n` +
        `==============================\n\n` +
        `Name       : ${name}\n` +
        `Email      : ${email}\n` +
        `Phone      : ${phone}\n` +
        `Address    : ${address}\n\n` +
        `Skills\n` +
        `------------------------------\n` +
        `${skills}\n\n` +
        `Education\n` +
        `------------------------------\n` +
        `${education}\n\n` +
        `Projects\n` +
        `------------------------------\n` +
        `${projects}`;

    currentResumeHTML = `
        <div class="resume-card">
            <div class="resume-header">
                <h2>${name}</h2>
                <p>${email} | ${phone}</p>
                <p>${address}</p>
            </div>
            <div class="resume-section">
                <h3>Skills</h3>
                <p>${formatParagraph(skills)}</p>
            </div>
            <div class="resume-section">
                <h3>Education</h3>
                <p>${formatParagraph(education)}</p>
            </div>
            <div class="resume-section">
                <h3>Projects</h3>
                <p>${formatParagraph(projects)}</p>
            </div>
        </div>`;

    document.getElementById('output').innerHTML = currentResumeHTML;
}

function formatParagraph(text) {
    return text
        .split('\n')
        .map(line => line.trim())
        .filter(line => line.length > 0)
        .join('<br>');
}

function downloadResume(type) {
    if (!currentResumeText || !currentResumeHTML) {
        generateResume();
    }

    let blob;
    let fileName;
    let fileContent;

    if (type === 'html') {
        fileContent = `<!DOCTYPE html>\n<html lang="en">\n<head>\n<meta charset="UTF-8">\n<meta name="viewport" content="width=device-width, initial-scale=1.0">\n<title>Resume</title>\n<style>body{font-family:Arial,sans-serif;background:#f0f2f5;padding:20px;} .resume-card{max-width:760px;margin:auto;background:#fff;padding:26px;border-radius:14px;box-shadow:0 14px 32px rgba(0,0,0,0.08);} h2{margin-bottom:0;} p{margin:8px 0;color:#3b4b63;} h3{margin-top:24px;color:#182d4a;}</style>\n</head>\n<body>\n${currentResumeHTML}\n</body>\n</html>`;
        fileName = 'resume.html';
        blob = new Blob([fileContent], { type: 'text/html' });
    } else {
        fileContent = currentResumeText;
        fileName = 'resume.txt';
        blob = new Blob([fileContent], { type: 'text/plain' });
    }

    const link = document.createElement('a');
    link.href = URL.createObjectURL(blob);
    link.download = fileName;
    document.body.appendChild(link);
    link.click();
    document.body.removeChild(link);
}
