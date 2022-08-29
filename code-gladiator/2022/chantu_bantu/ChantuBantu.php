<!-- PHP SOLUTION (passed all test cases) -->

<?php

/* Read input from STDIN. Print your output to STDOUT*/

$fp = fopen('php://stdin', 'r');

//Write code here

$testCase = intval(readline());

$echo = "";

for ($i = 0;$i < $testCase;$i++) {

    $giftToBuy = intval(readline());

    readline();

    $giftPrices = array_map('intval', explode(' ', readline()));

    asort($giftPrices);

    $giftPrices = array_slice($giftPrices, 0, $giftToBuy);

    $echo.= array_sum($giftPrices) . PHP_EOL;

}

echo $echo;

?>