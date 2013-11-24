<?php

//CORS
header("Access-Control-Allow-Origin: *");
header("Access-Control-Allow-Credentials: true");
header("Access-Control-Allow-Methods: POST, GET");
header("Access-Control-Allow-Headers: Content-Type, Accept");
header("Access-Control-Expose-Headers: Accept-Ranges, Content-Encoding, Content-Length, Content-Range");

header('Content-type: application/json');

$result = array('author' => 'Diego Ramos');

echo json_encode( $result );

?>
