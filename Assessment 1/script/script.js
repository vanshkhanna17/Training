var value;
var id=0;
var pr="";
var price=0;
$(document).on("click", "button.btn1", function(){
 value=$(this).val();
 pr= value.toString().split("Rupees")[1];
 pr=parseInt(pr);
 price=price+pr;
 $("#cst").html("<strong>Total Amount: Rupees "+price+"</strong>");
 console.log(price);
addrow(value,pr);
id++;
});
var addrow = function(value,pr){
    var tr = "";
    tr += "<tr id=\""+id+"\">";
    tr += "<td>";
    tr += value;
    tr += "</td>";
    tr += "<td>";
    tr+= "<button type=\"button\" class=\"rmv\" data-indx=\""+id+"\" data-value=\""+pr+"\">Remove</button>";
    tr+="</td>";
    tr += "</tr>";
    $("#mdbdy1 > div").append(tr);
}
$(document).on("click", "button.rmv", function() {
    indx= $(this).data("indx");
    var prc= $(this).data("value");
    console.log(prc)
    price=price-prc;
    $("#cst").html("<strong>Total Amount: Rupees "+price+"</strong>");
    $("#mdbdy1 > div > tr#"+indx).remove("");

});
$("#sub").on("click", function(){
    
    var nam = $("#t1").val();
    var ema = $("#t2").val();
    var addr = $("#t3").val();
    console.log(nam);
    console.log(ema);
    console.log(addr);
    var txt= "<p>Thank you "+nam+" - "+ema+".<br>"+"Your order will be delivered to "+addr+" as soon as possible.</p>"
    $("#mdbdy3").append(txt);
    $("#mdbdy1 > div > tr").remove();
    $("#cst").html("");
});
