<?php
require_once 'DbFunctions.php';
$response=array
();

if(isset($_POST['name'])|| isset($_POST['phone'])||isset($_POST['bd'])||isset($_POST['address'])){
$fun=new DBFunctions();
$bd=$_POST['bd'];
$phone=$_POST['phone'];
$address=$_POST['address'];
$name=$_POST['name'];
    if($fun->checkUserExists($phone)){
        $response['exists']="User already exists with phone ".$phone;
        echo json_encode($response);

    }else{
        $user=$fun->registerUser($phone,$name,$bd,$address);

        if($user){
            $response['phone']=$user['phone'];
            $response['name']=$user['name'];
            $response['bd']=$user['bd'];
            $response['address']=$user['address'];

            echo json_encode($response);

        }else{
            $response['err_msg']="Unknown error has occurred";
           echo json_encode($response);
        }

    
    }

}else{
    $response['err_msg']="Missing parameter in params";
    echo json_encode($response);
}


?>