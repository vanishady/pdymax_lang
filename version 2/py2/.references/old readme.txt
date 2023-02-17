JAVA-TARGET: cartella per il testing della grammatica, utile per visualizzare il parse tree 
PY-TARGET: cartella principale 

- * - * - LANGUAGE SPECS - * - * - 

Regole implementate:
- node declaration (declaration statement)
- inlet/outlet declaration (una sorta di connessione in cui specificare anche gli inlet/outlet)
- connessione (connection statement) 
- block, con scoping per blocco
- if, elif, else
- for loops
- break, continue, pass

Da fare:
-/

Bug da fixare:
- dentro alle stringhe non sono allowed i whitespace!!! e nemmeno i numeri.
- algoritmo di posizionamento (non è che funzioni proprio benissimo)

Plus:
- aggiungere function call alla grammatica, per scrivere cose tipo 'numbernode.getValue()' (in realtà si può 
costruire qualcosa di utile usando la select di puredata)
- aggiungere gli iteratori (variabile thisround) per creare tanti oggetti dai nomi diversi nei for
- supporto per nodetypes (generaltypes e objtypes)
- shell personalizzata con documentazione di supporto
- colors e font
- preparare patch (da usare come oggetti nella main patch, facendo un import tipo)
- controllo degli errori