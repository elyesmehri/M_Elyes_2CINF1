// Fonction pour calculer la somme d'un tableau d'entiers
function calculerSomme(tableau) {
    return tableau.reduce((acc, curr) => acc + curr, 0);
}

// Fonction pour calculer la moyenne d'un tableau d'entiers
function calculerMoyenne(tableau) {
    if (tableau.length === 0) return 0;
    const somme = calculerSomme(tableau);
    return somme / tableau.length;
}

// Fonction pour calculer la factorielle d'un nombre
function calculerFactorielle(nombre) {
    if (nombre === 0 || nombre === 1) return 1;
    return nombre * calculerFactorielle(nombre - 1);
}

// Fonction pour vérifier si un nombre est pair
function estPair(nombre) {
    return nombre % 2 === 0;
}

// Fonction pour vérifier si un nombre est premier
function estPremier(nombre) {
    if (nombre <= 1) return false;
    for (let i = 2; i <= Math.sqrt(nombre); i++) {
        if (nombre % i === 0) return false;
    }
    return true;
}

// Fonction pour inverser une chaîne de caractères
function inverserChaine(chaine) {
    return chaine.split('').reverse().join('');
}

// Fonction pour calculer la puissance d'un nombre
function calculerPuissance(nombre, puissance) {
    return Math.pow(nombre, puissance);
}

// Ajoutez ici d'autres fonctions pour les fonctionnalités restantes...

// Tests des fonctions
const tableauEntiers = [1, 2, 3, 4, 5];
console.log("Somme:", calculerSomme(tableauEntiers));
console.log("Moyenne:", calculerMoyenne(tableauEntiers));
console.log("Factorielle de 5:", calculerFactorielle(5));
console.log("Est pair:", estPair(6));
console.log("Est premier:", estPremier(7));
console.log("Inverser chaîne:", inverserChaine("hello"));
console.log("Puissance:", calculerPuissance(2, 3));
