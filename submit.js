const { exec } = require('child_process')
const exercise = process.argv[2]

function camelCase (string) {
    string = string.replace(/^./, (letter) => letter.toUpperCase())
    return string.replace( /-([a-z])/ig, (all, letter) => letter.toUpperCase());
}

function toDash(string) {
    string = string.replace(/^./, (letter) => letter.toLowerCase())
    return string.replace(/([A-Z])/g, (g) => `-${g[0].toLowerCase()}`);
}

exec(`exercism submit ./${toDash(exercise)}/src/main/kotlin/${camelCase(exercise)}.kt`, (err, stdout, stderr) => {
    if (err) {
        console.log(`error: ${err.message}`);
        return;
    }
    if (stderr) {
        console.log(`stderr: ${stderr}`);
        return;
    }
    console.log(`stdout: ${stdout}`);
})
