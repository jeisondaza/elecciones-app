let finalCount = getNodos('cell');
let conteo = getNodos('card__count');
let votos = [0, 0, 0, 0];

function getNodos(selector) {
    let nodos = document.getElementsByClassName(selector)
    return nodos;
}

function votar(params) {
    switch (params) {
        case '1':
            votos[0]++
            conteo[0].textContent = votos[0];
            break;
        case '2':
            votos[1]++
            conteo[1].innerHTML = votos[1];
            break;
        case '3':
            votos[2]++
            conteo[2].innerHTML = votos[2];
            break;
        case '4':
            votos[3]++
            conteo[3].innerHTML = votos[3];
            break;
    }
}

total = () => votos.reduce((p, e) => p + e);

function redBtn(){
    for (let i = 0; i < votos.length; i++) {
        let porcentaje = votos[i] / total() * 100;
        finalCount[i].innerHTML = `${votos[i]} (${porcentaje.toFixed(2)})%`;
    }
    finalCount[4].innerHTML = total();
}