<?php
	for ($invoer = 0; $invoer < 175; $invoer++)
	{
		$fac = faculteit($invoer);	
		echo "De faculteit van ".$invoer." (oftewel ".$invoer."!) is ".$fac.".<br>";
	}
	echo "<br>-----<br>";
	echo "Klaar.";

	function faculteit($invoer)
	{
		if ($invoer == 0)
		{
			return 1;
		}
		else
		{
			return ($invoer * faculteit(($invoer - 1)));
		}
	}
?>

