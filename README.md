# Greenfoot

<ul>
<li><a href="#Gre">1. Greenfoot Einleitung</a></li> 
<li><a href="#1.">2. Meet the Greeps</a></li>
<li><a href="#2.">3. FatCat</a></li>
<li><a href="#3.">4. Little Crab</a></li>
<li><a href="#Imp">5. Impressum</a></li>
</ul>

<h3>
<a id="Gre">1. <b>Greenfoot</b></a> 
</h3> 

<h3>
<a id="1.">2. <b>Meet the Greeps</b></a> 
</h3> 
<p> In diesem Szenario gibt es in der "world class" die Klasse "planet" und in der "actor class" die Klassen "greep" und "tomato". Das Startbild des Szenarios zeigt eine Instanz aus der "greep"-Klasse und mehrere Instanzen aus der "tomato"-Klasse. </p>

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

<h3>
<a id="3.">4. <b>Little Crab</b></a> 
</h3>

<h3>
<a id="Imp">5. <b>Impressum</b></a> 
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
 
