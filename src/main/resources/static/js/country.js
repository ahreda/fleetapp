$(document).ready(function(){

$('table #editButton').on('click', function(event){
event.preventDefault();

var href = $(this).attr('href');

$.get(href, function(country, status){
    $('#idEdit').val(country.id);
    $('#descriptionEdit').val(country.description);
    $('#capitalEdit').val(country.capital);
    $('#codeEdit').val(country.code);
    $('#continantEdit').val(country.continent);
    $('#nationalityEdit').val(country.nationality);

});

$('#editModal').modal();

});


$('table #deleteButton').on('click', function(event){
event.preventDefault();
var href = $(this).attr('href');
$('#deleteButtonConfirmation').attr('href', href);

$('#deleteModal').modal();
});

});
