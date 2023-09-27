document.querySelector("h1").classList.add("class-name");
document.querySelector("h1").innerHTML="<em>Hello</em";
document.querySelector("h1").textContent="Tauseef";
document.querySelector("h1").setAttribute("href","new.com");

.class_name{
background-image: url('location of image');
}
$("h1").addClass("title");
$("h1").removeClass("titile");

app.get("/",function(req,res){
  res.send("Hello");
  res.send("<h1>Hello</h1>");
  //we can write res.write() many times similar like res.send() but res.send() only one time
  res.sendFile(__dirname + "/file_name");
});

const express = require("express");
const body_parser = require("body-parser");
const app = express();
app.use(body_parser.urlencoded({extended:true}));
app.listen(3000, function(){
    console.log("Server started on port 3000.");
});
app.get("/", function(request, response){
    response.sendFile(__dirname+"/bmi_calculator.html");
});
app.post("/", function(request, response){
    var weight = Number(request.body.weight);
    var height = Number(request.body.height);
    var bmi = weight / (height*height);
    response.send("Your BMI is:- "+bmi);
});


<form action="/" method="post">
        <input type="text" name="weight" placeholder="Enter your weight in kg">
        <input type="text" name="height" placeholder="Enter your height in cm">
        <button type="submit" name="submit">Calculate BMI</button>
</form>
