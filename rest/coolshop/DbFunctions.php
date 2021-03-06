<?php
class DBFunctions{
    private $conn;
    function __construct()
    {
        require_once('db_connect.php');
        $db=new DB_Connect();
        $this->conn=$db->connect();


    }


    function __destruct()
    {
        
    }


    function checkUserExists($phone){

        $stmt=$this->conn->prepare("SELECT * FROM users WHERE Phone =?");
        $stmt->bind_param("s",$phone);

        $stmt->execute();
        $stmt->store_result();


        if($stmt->num_rows>0){
            $stmt->close();
            return true;
        }else{
            $stmt->close();
            return false;
        }
    }

    //createuser n return him

    public function registerUser($phone,$name,$bd,$address){
        $stmt=$this->conn->prepare(
            "INSERT INTO users (phone,name,bd,address)
             VALUES (?,?,?,?)");
        $stmt->bind_param("ssss",$phone,$name,$bd,$address);

       $result= $stmt->execute();
        $stmt->close();



        if($result){
            $stmt=$this->conn->prepare(
                "SELECT * FROM users WHERE Phone =?");
                $stmt->bind_param("s",$phone);

                $stmt->execute();
              $user=$stmt->get_result()->fetch_assoc();
              $stmt->close();
              return $user;
        

        }else{
            return false;

        }
    }
}


?>