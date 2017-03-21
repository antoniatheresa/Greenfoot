# Greenfoot

<ul>
<li><a href="#Gre">1. Einführung in Greenfoot</a></li> 
<li><a href="#1.">2. Meet the Greeps</a></li>
<li><a href="#2.">3. FatCat</a></li>
<li><a href="#Imp">4. Impressum</a></li>
</ul>

<h3>
<a id="Gre">1. <b>Greenfoot</b></a> 
</h3> 

<h3>
<a id="1.">2. <b>Meet the Greeps</b></a> 
</h3> 
<p> In diesem Szenario gibt es in der "world class" die Klasse "planet" und in der "actor class" die Klassen "greep" und "tomato". Das Startbild des Szenarios zeigt eine Instanz aus der "greep"-Klasse und mehrere Instanzen aus der "tomato"-Klasse. </p>

<p><img src="Greenfoot Images/Meet the Creeps world.PNG" alt="Meet the Creeps world" style="width:803px;height:603px;border:0;"></p>

<p> Der Actor ("Greep") bewegt sich durch die "world class" "planet". Dabei sammelt er bei Kontakt mit anderen "Actors" (tomato) diese ein. Stößt er gegen den Rand der "world", ändert ere seine Richtung in stets dem gleichen Winkel. Deshalb bleiben die übrigen zwei Actors ("tomato") in der "world", da der Actor (Greep) nicht an sie herankommt. </p> 

<p> Der Actor ("Greep") kann mit der Maus in der"world" verschoben werden. Wird der Befehl "run" ausgelöst, läuft er geradeaus durch die "world" und bleibt bei Kontakt mit dem Rand stehen. Er sammelt auch keine anderen Actors "tomato" ein. Durch den Parameter (4) werden in der Methode die Informationen übergeben, die für die Bewegung notwendig sind. </p>

<p> Wird nun der "run"- Befehl betätigt, dreht sich der Actor ("Greep") auf der Stelle im Uhrzeigersinn. Wenn man den Parameter (3) im "turn"- Befehl benutzt, dreht der Actor in einem bestimmten Winkel.</p>

<p> Der Actor (Greep) bewegt sich im Uhrzeigersinn in einem bestimmten Radius. Bei Kontakt mit anderen Actors (Tomato) sammelt er diese nicht ein. </p>

<p> Durch die act Methode if (isAtEdge( ) ) -- turn (13) und den davon unabhängigen Befehl move (4) bewegt sich der Actor (Greep) durch die "world"- Klasse. Wenn er den Rand berührt, dreht er sich durch den im Parameter (13) bestimmten Winkel und bewegt sich erneut geradeaus durch die "world"- Klasse. </p>

<p> Durch die hinzugefügten Befehle werden die Actors (tomato) entfernt, sobald der Actor ("Greep") diese berührt. </p>

<p> Der Actor ("Greep") bewegt sich automatisch geradeaus durch die "world"- Klasse. Wird die linke Pfeiltaste gedrückt, erhält er den Befehl, sich um (-5) zu drehen. Wird die rechte Pfeiltaste betätigt, dreht er sich um (5). </p>

<p> Durch die hinzugefügten Befehle wird das Bild des Actors (Greep) verändert, sobald ein Actor (tomato) entfernt wurde. Bei dem Bild wird zwischen einer Tomate und mehreren Tomaten unterschieden. Zählt der Counter aus dem folgenden Schritt mehr als zwei gesammelte Actors (tomato), wird das Bild "greepwithmorefood" eingesetzt. </p>

<p> Im Editor des Actors (Greep) fügt man im Abschnitt "fields" den Befehl "private int tomatoes --0" hinzu. Dadurch wird die gesammelte Anzahl der Actors (tomato) zu Beginn auf 0 gesetzt. In der "if (isTouching (tomato.class)-Spalte muss der Befehl "tomatoes --tomatoes+1" eingegeben werden, damit der Zähler pro eingesammelte Tomate um 1 erweitert wird. </p>




<h3>
<a id="2.">3. <b>FatCat</b></a> 
</h3>

<p> Dieses Szenario beinhaltete die "World Class" "CatWorld" und die "Actor Classes" "Cat" und "My Cat". In der "CatWorld" ist eine dicke Katze zu sehen.</p>

<p> Im "cheat sheet" des "MyCat" "class editors" sindverschiedene "commands" zu sehen. Diese "Hotkeys" kann in den "oublic void act" durch Anklicken oder Einfügen des davor stehenden Symbols eingesetzt werden.</p>

<p> Mithilfe der Esc-Taste können die "Hotkeys" aus der Methode gelöscht werden. Befindet sich ein Text im "Hotkey", kann er durch die Esc-Funktion nicht mehr entfernt werden.</p>

Durch Drücken der "Space"-Taste in der act-Methode können weitere Befehle eingesetzt werden. Diese können nicht nur durch die Esc-Funktion enfernt werden, sondern auchh durch die "Backspace"-Taste oder die "delete"-Funktion. Diese kann genutzt werden, indem man den "Hotkey" mit der rechten Maustaste anklickt und im Kontext-Menü delete auswählt.</p>

Durch die eingefügten Methodendreht sich der "Actor" (MyCat) in einem bestimmten Winkel um einen festgelegten Punkt in der "World Class" (CatWorls).</p>

Um zu verhindern, dass der "Actor" (MyCat) eine Methode ausführt, ohne diese aus der "act-Methode" zu entfernen, muss die Funktion "disable" ausgeführt werden. Dazu muss man durch gedrückz halten der "Shift"-Taste und Bewegen des "Frame-Cursor" markiert werden. Dazu zieht man den "Frame-Cursor" über die Methode Durch anklicken der markierten Methode mit der rechten Maustaste kann im Kontext-Menü "disable" ausgewählt werden. Der "Actor" (MyCat) führt diese Methode nicht mehr aus.</p>

<p> Wenn eine Methode wieder aktiviert werden soll, muss diese zunächst wieder durch die "Shift"-Taste und den "Frame-Cursor" markiert werden. Durch einen Klick mit der rechten Maustaste kann im Kontext-Menü die Funktion "enable" ausgewählt werden. Dies bewirkt, dass die Methode im im Editor erneut sichtbar wird un der "Actor" (MyCat) die Methode in der "CatWorld" wieder ausführt.</p>

<p> Nach einem Rechtsklick auf den Actor (MyCat) in der "CatWorld" erscheinen verschiedene mögliche Funktionen. Bei Berühren des Menüpunkts "inherited from Actor" können Änderungen an der Umgebung und Interaktion des "Actors" mit der "World" vorgenommen werden. Bei dem Menüpunkt "inherited from Cat" werden dem Benutzer verschiedene Optionen zum Zustand und den Handlungen des "Actors" (MyCat) angeboten.</p>

<p> Wählt man im "Class Editor" das Feld"extends Cat" aus, so erhält man ein ähnliches Bild wie beim Anklicken des "Actord" (MyCat) mit der rechten Maustaste. Auch hier kann zwischen "inherited from Actor" und "inherited from Cat" gwählt werden. Jedoch ist die Auswahl an Methoden in der "CatWorld" kleiner, als im "Class Editor".</p>

<p> Das Layout des "Class Editors" (Cat) kann im "view"-Menü verändert werden. Durch Auswählen der "Birds-Eye"-Funktion werden nur die methoden Gruppen sichtbar (public void..), nicht die Methoden bzw. Hotkeys. Um die "Hotkeys" sehen zu können, müssen die Methoden angeklickt werden. Durch diese Funktion wird er "Class Edditor" übersichtlicher.</p>

<p> Drückt man in einem freien Feld den "shortcut" "Strg" und "Space" zur automatischen Quelltext Ergänzung zeitgleich, so erscheint eine Art Kontext-Menü, aus dem man verschiedene Methoden auswählen kann., die in die entsprechende "public void"-Methode eingefügt werden können.<br>
Tippt man nun einen Buchstaben, so werden alle Methoden angezeigt, die mit dem ausgewählten Buchstaben beginnen. Durch Anklicken können diese Methoden eingefügt werden.</p>

<p> Da die "MyCat"-Klasse eine Unterklasse der "Cat"-Klasse ist können alle Methoden, die in der "Actor"-Klasse "Cat" programmiert sind, durch einen einfachen festgelegten Beferehl in der "MyCat"-Klasse eingefügt werden, ohne neu programmiert werden zu müssen." Dmait der "Actoe" "MyCat" isst, schläft und tanzt sobald act gestartet wird, müssen die Methoden "eat", "sleep(5)" und"dance" in die "Act"-Methode eingefügt werden.</p>

<p> Durch den "if-Befehl" führt der "Actor" nur dann die Methode aus, wenn die angegebene Bedingung erfüllt ist. In diesem Fall schläft der "Actor" "MyCat" nur dann, wenn er müde ist, also die Bedingung "isTired" erfüllt ist. Diese boolschen Variablen, müssen als private boolsche Variablen für den Actor im "Class Editor" initiiert werden. Dazu setzt man die Variablen "isTired" und "isHungry" auf false bzw. "isBored" auf true.</p>

<p> Soll der "Actor" eine andere Methode ausführen, wenn die Bedingung nicht erfüllt wurde, wird der "if-else" Hotkey eingefügt werden. Der "if"-Hotkey wird nun um eine "else"-Spalte ergänzt, in die die Methode eingefügt werden muss, die der "Actor audführen soll, wenn die "if"-Bedingung nicht erfüllt wird. In diesem Beispiel soll der "Actor", wenn er müde ist schlafen und hooray rufen. Ist er allerdings nicht mürde, ruft er nur hooray. Dazu wird der "if-else"-Befehl wie beschrieben angewendet. Damit die Bedingung "isTired" erfüllt, und die "if"-Methode ausgeführt werden kann, muss der "Actor" müde werden. Dazu muss die boolsche Variable "isTired", nachdem der "Actor" getanzt hat auf "true" gesetzt werden. Da die boolsche Variable "isBored" von Anfang an als "true" initiiert ist, beginnt der "Actor" beim Starten der "act"-Methode mit dem tanzen und wird daraufhin müde, was die Methode auslöst, die den "Actor" schlafen lässt. </p>



<h3>
<a id="Imp">4. <b>Impressum</b></a> 
</h3>

<table>
<thead>
<tr>
<th>Name</th>
<th align="center">Klasse</th>
<th align="center">Schule</th>
<th align="center">Link</th>
</tr>
</thead>
<tbody>
<tr>
<td><i>Antonia Heitmann</i></td>
<td align="center"><i>12a</i></td>
<td align="center"><i>Stormarnschule Ahrensburg</i></td>
<td align="center"><a href="http://stormarnschule.de/">Stormarnschule </a></td>
</tr>
<tr>
<td><i>Theresa Daniel</i></td>
<td align="center"><i>12a</i></td>
<td align="center"><i>Stormarnschule Ahrensburg</i></td>
<td align="center"><a href="http://stormarnschule.de/">Stormarnschule</a></td>
</tr>
 
