// Méthode 1 : Calculer la somme d’un tableau d’entiers.
function sommeTableau(tableau) {
    return tableau.reduce((acc, val) => acc + val, 0);
}

// Méthode 2 : Calculer la moyenne d’un tableau d’entiers.
function moyenneTableau(tableau) {
    return tableau.length === 0 ? 0 : sommeTableau(tableau) / tableau.length;
}

// Méthode 3 : Calculer la factorielle d’un nombre.
function factorielle(n) {
    if (n < 0) return -1;
    if (n === 0) return 1;
    return n * factorielle(n - 1);
}

// Méthode 4 : Vérifier si un nombre est pair.
function estPair(n) {
    return n % 2 === 0;
}

// Méthode 5 : Vérifier si un nombre est premier.
function estPremier(n) {
    if (n <= 1) return false;
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return true;
}

// Méthode 6 : Inverser une chaine de caractères.
function inverserChaine(chaine) {
    return chaine.split('').reverse().join('');
}

// Méthode 7 : Calculer la puissance d’un nombre.
function puissance(base, exposant) {
    return Math.pow(base, exposant);
}

// Méthode 8 : Calculer le PGCD de deux nombres.
function pgcd(a, b) {
    while (b !== 0) {
        let temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

// Méthode 9 : Trier un tableau d’entiers en ordre croissant.
function trierTableau(tableau) {
    return tableau.slice().sort((a, b) => a - b);
}

// Méthode 10 : Vérifier si une chaine est palindrome.
function estPalindrome(chaine) {
    const chaineNettoyee = chaine.replace(/[^A-Za-z0-9]/g, '').toLowerCase();
    return chaineNettoyee === chaineNettoyee.split('').reverse().join('');
}

// Méthode 11 : Rechercher l’élément maximal dans un tableau.
function elementMaximal(tableau) {
    return Math.max(...tableau);
}

// Méthode 12 : Concaténer deux tableaux.
function concatenerTableaux(tab1, tab2) {
    return tab1.concat(tab2);
}

// Méthode 13 : Calculer la racine carrée d’un nombre.
function racineCarree(n) {
    return Math.sqrt(n);
}

// Méthode 14 : Convertir une chaine en majuscule.
function convertirEnMajuscule(chaine) {
    return chaine.toUpperCase();
}

// Méthode 15 : Calculer la longueur d’une chaine.
function longueurChaine(chaine) {
    return chaine.length;
}


function sommeTableau2(tableau) {
    let somme = 0;
    for (let i = 0; i < tableau.length; i++) {
        somme += tableau[i];
    }
    return somme;
}

function moyenneTableau2(tableau) {
    if (tableau.length === 0) return 0;
    let somme = 0;
    for (let i = 0; i < tableau.length; i++) {
        somme += tableau[i];
    }
    return somme / tableau.length;
}

function factorielle2(n) {
    let resultat = 1;
    for (let i = 1; i <= n; i++) {
        resultat *= i;
    }
    return resultat;
}

function estPair2(n) {
    return (n & 1) === 0;
}

function estPremier2(n) {
    if (n <= 1) return false;
    if (n <= 3) return true;
    if (n % 2 === 0 || n % 3 === 0) return false;
    for (let i = 5; i * i <= n; i += 6) {
        if (n % i === 0 || n % (i + 2) === 0) return false;
    }
    return true;
}

function inverserChaine2(chaine) {
    let resultat = '';
    for (let i = chaine.length - 1; i >= 0; i--) {
        resultat += chaine[i];
    }
    return resultat;
}

function puissance2(base, exposant) {
    let resultat = 1;
    for (let i = 0; i < exposant; i++) {
        resultat *= base;
    }
    return resultat;
}

function pgcd2(a, b) {
    while (a !== b) {
        if (a > b) {
            a = a - b;
        } else {
            b = b - a;
        }
    }
    return a;
}

function trierTableau2(tableau) {
    for (let i = 0; i < tableau.length; i++) {
        for (let j = 0; j < tableau.length - i - 1; j++) {
            if (tableau[j] > tableau[j + 1]) {
                let temp = tableau[j];
                tableau[j] = tableau[j + 1];
                tableau[j + 1] = temp;
            }
        }
    }
    return tableau;
}

function estPalindrome2(chaine) {
    const chaineNettoyee = chaine.replace(/[^A-Za-z0-9]/g, '').toLowerCase();
    let debut = 0;
    let fin = chaineNettoyee.length - 1;
    while (debut < fin) {
        if (chaineNettoyee[debut] !== chaineNettoyee[fin]) {
            return false;
        }
        debut++;
        fin--;
    }
    return true;
}

function elementMaximal2(tableau) {
    let max = tableau[0];
    for (let i = 1; i < tableau.length; i++) {
        if (tableau[i] > max) {
            max = tableau[i];
        }
    }
    return max;
}

function concatenerTableaux2(tab1, tab2) {
    let resultat = [];
    for (let i = 0; i < tab1.length; i++) {
        resultat.push(tab1[i]);
    }
    for (let i = 0; i < tab2.length; i++) {
        resultat.push(tab2[i]);
    }
    return resultat;
}

function racineCarree2(n) {
    if (n < 0) return NaN;
    let x = n;
    let y = 1;
    let e = 0.000001; // Précision souhaitée
    while (x - y > e) {
        x = (x + y) / 2;
        y = n / x;
    }
    return x;
}

function convertirEnMajuscule2(chaine) {
    let resultat = '';
    for (let i = 0; i < chaine.length; i++) {
        const code = chaine.charCodeAt(i);
        if (code >= 97 && code <= 122) {
            resultat += String.fromCharCode(code - 32);
        } else {
            resultat += chaine[i];
        }
    }
    return resultat;
}

function longueurChaine2(chaine) {
    let longueur = 0;
    while (chaine[longueur] !== undefined) {
        longueur++;
    }
    return longueur;
}

// Fonction main pour démontrer l'utilisation des méthodes
function main() {
    console.log("Somme du tableau [1, 2, 3, 4, 5] :", sommeTableau([1, 2, 3, 4, 5]));
    console.log("Moyenne du tableau [1, 2, 3, 4, 5] :", moyenneTableau([1, 2, 3, 4, 5]));
    console.log("Factorielle de 5 :", factorielle(5));
    console.log("Est-ce que 4 est pair ?", estPair(4));
    console.log("Est-ce que 7 est premier ?", estPremier(7));
    console.log("Inverser la chaîne 'hello' :", inverserChaine('hello'));
    console.log("3 puissance 4 :", puissance(3, 4));
    console.log("PGCD de 56 et 98 :", pgcd(56, 98));
    console.log("Tableau [5, 3, 8, 1, 2] trié :", trierTableau([5, 3, 8, 1, 2]));
    console.log("Est-ce que 'radar' est un palindrome ?", estPalindrome('radar'));
    console.log("Élément maximal dans [10, 5, 20, 15] :", elementMaximal([10, 5, 20, 15]));
    console.log("Concaténer [1, 2] et [3, 4] :", concatenerTableaux([1, 2], [3, 4]));
    console.log("Racine carrée de 16 :", racineCarree(16));
    console.log("Convertir 'hello' en majuscule :", convertirEnMajuscule('hello'));
    console.log("Longueur de la chaîne 'hello' :", longueurChaine('hello'));

    console.log("Somme des éléments de [10, 2, 4, 20, 30] :", sommeTableau2([1, 2, 3, 4, 5]));
    console.log("Moyenne des éléments de [10, 20, 30, 40, 50] :", moyenneTableau2([1, 2, 3, 4, 5]));
    console.log("Factorielle de 7 est :", factorielle2(7));
    console.log("Le nombre 7 est-il pair ?", estPair2(7));
    console.log("Le nombre 11 est-il premier ?", estPremier2(1));
    console.log("La chaîne 'world' inversée :", inverserChaine2('world'));
    console.log("2 à la puissance 4 donne :", puissance2(2, 4));
    console.log("Le PGCD de 32 et 68 est :", pgcd2(32, 68));
    console.log("Le tableau [5, 3, 8, 1, 2] trié :", trierTableau2([5, 3, 8, 1, 2]));
    console.log("La chaîne 'radar' est-elle un palindrome ?", estPalindrome2('radar'));
    console.log("L'élément maximal du tableau [1, 5, 6, 15] est :", elementMaximal2([1, 5, 6, 15]));
    console.log("Concaténation des tableaux [1, 2] et [3, 4] donne :", concatenerTableaux2([1, 2], [3, 4]));
    console.log("La racine carrée de 9 est :", racineCarree2(9));
    console.log("La chaîne 'world' en majuscule donne :", convertirEnMajuscule2('world'));
    console.log("La longueur de la chaîne 'world' est :", longueurChaine2('world'));
}

// Appel de la fonction main pour exécuter les démonstrations
main();
