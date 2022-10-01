# Simple_Tic-Tac-Toe3
Take a string entered by the user and print the game grid as in the previous stage.
Analyze the game state and print the result. Possible states:

<ul>
<li><code class="java">Game not finished</code> when neither side has three in a row but the grid still has empty cells.</li>
<li><code class="java">Draw</code>  when no side has a three in a row and the grid has no empty cells.</li>
<li><code class="java">X wins</code> when the grid has three X’s in a row (including diagonals).</li>
<li><code class="java">O wins</code> when the grid has three O’s in a row (including diagonals).</li>
<li><code class="java">Impossible</code> when the grid has three X’s in a row as well as three O’s in a row, or there are a lot more X's than O's or vice versa (the difference should be 1 or 0; if the difference is 2 or more, then the game state is impossible). </li>
</ul>
