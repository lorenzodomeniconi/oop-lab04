# Esercizio con Git, in locale

Per ogni passo,
si annoti in questo file il comando utilizzato ed il suo output,
per confrontarlo con le soluzioni.

### Si crei una nuova directory
mkdir directory
### Si inizializzi un repository Git dentro la cartella suddetta.
git init
### Si osservi lo stato del repository
git status
### Si scriva un file `HelloWorld.java` contenente un `main` con una stampa a video e si osservi il contenuto del repository
touch helloWorld.java
### Si aggiunga `HelloWorld.java` allo stage, e si osservi lo stato del repository
git add HelloWorld.java
git status
### Si crei il primo commit, con messaggio ragionevole. Se necessario, si configuri nome utente ed email di git usando i dati dell'account istituzionale.
git commit -m "..."
### Si compili il file Java e si verifichi lo stato del repository
git status dice che c'è un file untracked
### Si noti che c'è un file rigenerabile (`HelloWorld.class`). Si costruisca una lista di file ignorati che ignori tutti i file con estensione `.class`
touch .gitignore
*.class
### Si osservi lo stato del repository

### Si crei un nuovo commit che tracci il la ignore list, aggiungendo allo stage i file necessari. Si osservi sempre lo stato del repository dopo l'esecuzione di un comando
git add .gitignore
git commit -m "add .gitignore"
### Si gestiscano i caratteri di fine linea in modo appropriato, creando un file `.gitattributes`
* text=auto eol=lf
*.[cC][mM][dD] text eol=crlf
*.[bB][aA][tT] text eol=crlf
*.[pP][sS]1 text eol=crlf
### Si osservi la storia del repository usando `git log --all --graph`

### Da questo punto in poi, prima e dopo ogni comando, ci si assicuri di osservare lo stato del repository con `git status`

### Si crei un file Mistake.java, con contenuto arbitrario, lo si aggiunga al tracker, e si faccia un commit
touch Mistake.java
git add Mistake.java
git commit -m "added Mistake.java"
### Si rinomini `Mistake.java` in `ToDelete.java`, e si faccia un commit che registra la modifica
prima rinominarlo sul computer
git add Mistake.java ToDelete.java
### Si elimini `ToDelete.java` e si registri la modifica in un commit
rm ToDelete.java
git add ToDelete.java
git commit -m "deleted ToDelete.java"
### Si osservi la storia del repository e si identifichi il commit dove è stato creato `Mistake.java`. Per una visione compatta, si usi l'opzione `--oneline`
git log --oneline --all --graph
### Si ripristini Mistake.java dal commit identificato al passo precedente
git checkout 0c54eac -- Mistake.java
### Si rimuova il file ripristinato e si ripulisca lo stage
rm Mistake.java
### Si torni al commit precedente a quello in cui `Mistake.java` è stato creato. Si utilizzi la storia del repository se utile.
git log --oneline --all --graph
git checkout 37ed...