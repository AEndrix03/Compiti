let visPass = false;
let visProdotti = false;
let prodotti = [];

function visualizzaPassword() {
    if (visPass)
        document.getElementById("password").type = "password";
    else
        document.getElementById("password").type = "text";

    visPass = !visPass;
}

function validateForm() {
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    if (username===""||password==="") {
        alert("Inserisci tutti i dati!");
        return false;
    }

    return true;
}

function insertProdotto() {

    var marca = document.getElementById("marcaProdotto").value;
    var modello = document.getElementById("modelloProdotto").value;
    var amount = document.getElementById("amountProdotto").value;
    var prezzo = document.getElementById("prezzoProdotto").value;

    if (marca===""||modello===""||amount===""||prezzo==="") {
        alert("Inserisci tutti i dati necessari per completare l'inserimento del prodotto!");
        return false;
    }

    if (isNaN(amount)) {
        alert("La quantità inserita non è un numero valido");
        return false;
    } else if (isNaN(prezzo)) {
        alert("Il prezzo inserito non è un numero valido");
        return false;
    }

    prodotti.push({marca: marca, modello: modello, amount: amount, prezzo: prezzo});
    alert("Prodotto inserito!");

    document.getElementById("marcaProdotto").value = "";
    document.getElementById("modelloProdotto").value = "";
    document.getElementById("amountProdotto").value = "";
    document.getElementById("prezzoProdotto").value = "";
    return true;
}

function containsProdotto(modello) {
    for (let i = 0; i<prodotti.length; i++)
        if (prodotti[i].modello === modello)
            return true;
    return false;
}

function vendiProdotto() {

    var modello = document.getElementById("modelloProdottoVend").value;
    var amount = document.getElementById("amountProdottoVend").value;

    if (modello===""||amount==="") {
        alert("Inserisci tutti i dati necessari per completare la vendita del prodotto!");
        return false;
    }

    if (isNaN(amount)) {
        alert("La quantità inserita non è un numero valido");
        return false;
    }

    console.log(containsProdotto(modello))

    if (!containsProdotto(modello)) {
        alert("Il modello del prodotto inserito, non è presente nel magazzino");
        return false;
    }

    prodotti.forEach(prod => {
        if (prod.modello === modello) {
            if (prod.amount<amount) {
                alert("Il magazzino dispone solo di "+prod.amount+" pezzi, non è possibile quindi concludere la vendita");
                return false;
            }
            prod.amount -= amount;

            alert("Il prodotto è stato venuto con successo restituendo un guadagno pari a "+(prod.prezzo*amount)+"€");
            return true;
        }
    })
}

function visualizzaProdotti() {
    if (visProdotti)
        document.getElementById("listProdotti").value = "Visualizza Prodotti";
    else
        document.getElementById("listProdotti").value = "Nascondi Prodotti";

    visProdotti = !visProdotti;

    if (visProdotti) {
        var list = "";
        prodotti.forEach(prod => {
            list += "Modello: " + prod.modello + ", Marca: " + prod.marca + ", Quantità: " + prod.amount + ", Prezzo: " + prod.prezzo + "<br>--------------------------------<br>";
        });
        document.getElementById("listProdottiVis").innerHTML = list;
    } else
        document.getElementById("listProdottiVis").innerHTML = "";
}

function sendData() {
    document.moduloDati.submit();
    alert("Dati inviati con successo");
}