$(document).ready(function(){

$('table #editButton').on('click', function(event){
event.preventDefault();

var href = $(this).attr('href');

$.get(href, function(state, status){
    $('#idEdit').val(state.id);
    $('#nameEdit').val(state.name);
    $('#capitalEdit').val(state.capital);
    $('#codeEdit').val(state.code);
    $('#countryidEdit').val(state.countryid);
    $('#detailsEdit').val(state.details);

});
$('#editModal').modal();
});


$('table #detailsButton').on('click', function(event){


event.preventDefault();

var href = $(this).attr('href');

$.get(href, function(state, status){
    $('#idDetails').val(state.id);
    $('#nameDetails').val(state.name);
    $('#capitalDetails').val(state.capital);
    $('#codeDetails').val(state.code);
    $('#countryIdDetails').val(state.countryid);
    $('#detailsDetails').val(state.details);
    $('#detailsDetails').val(state.details);



});

$('#detailsModal').modal();

});


$('table #deleteButton').on('click', function(event){
event.preventDefault();
var href = $(this).attr('href');
$('#deleteButtonConfirma').attr('href', href);

$('#deleteModal').modal();
});

});
