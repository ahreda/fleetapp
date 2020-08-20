$(document).ready(function(){

$('table #editBtn').on('click', function(event){
event.preventDefault();

var href = $(this).attr('href');

$.get(href, function(employeeType, status){
    $('#id-edit').val(employeeType.id);
    $('#desEdit').val(employeeType.description);
    $('#detEdit').val(employeeType.details);
});

$('#edtModal').modal();

});


$('table #detailsButton').on('click', function(event){

event.preventDefault();

var href = $(this).attr('href');

$.get(href, function(employeeType, status){
    $('#idDetails').val(employeeType.id);
    $('#desDetails').val(employeeType.description);
    $('#detDetails').val(employeeType.details);
});


$('#detModal').modal();

});

$('table #deleteButton').on('click', function(event){
event.preventDefault();

var href = $(this).attr('href');
$('#deleteButtonConfirmation').attr('href', href);

$('#deltModal').modal();
});


});
