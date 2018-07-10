<?php
class DB_Connect{
    private $conn;

    public function connect(){
require_once('Config.php');
$this->conn=new mysqli(DB_HOST,DB_USER,DB_USER_PASS,DB_NAME);
return $this->conn;
    }
   
}

?>