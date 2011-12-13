<?php
	$style = isset($_REQUEST['style']) ? $_REQUEST['style'] : '';
?>
<option value="">&mdash; choose color &mdash;</option>
<?php if ($style == '7141832') { ?>
    <option value="bk">Black Oil-tanned</option>
    <option value="br">Black Polishable</option>
<?php } else if ($style == '7173656') { ?>
    <option value="bk">Black</option>
    <option value="br">Crazy Horse</option>
<?php } else if ($style == '7141922') { ?>
    <option value="bk">Black</option>
    <option value="br">Crazy Horse</option>
<?php } else if ($style == '7177382') { ?>
    <option value="hy">Honey</option>
    <option value="sd">Peanut</option>
<?php } else if ($style == '7141730') { ?>
    <option value="rw">Brown</option>
    <option value="hy">Honey</option>
<?php } else if ($style == '7141833') { ?>
    <option value="br">Russet</option>
<?php } else if ($style == '7257914') { ?>
    <option value="br">Brown</option>
<?php } else if ($style == '7269643') { ?>
    <option value="bk">Black</option>
<?php } else if ($style == '7332058') { ?>
    <option value="bk">Tan/Brown/Amber</option>
<?php } else { ?>
    <option value="bk">Black</option>
<?php } ?>
