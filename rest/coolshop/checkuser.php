<?php
require_once 'DbFunctions.php';
$response=array
();

if(isset($_POST['phone'])){
$fun=new DBFunctions();


    if($fun->checkUserExists($phone)){
        $response['exists']=true;
        echo json_encode($response);

    }else{
        $response['exists']=false;
        echo json_encode($response);
    }

}else{
    $response['err_msg']="Missing phone in params";
    echo json_encode($response);
}


?>