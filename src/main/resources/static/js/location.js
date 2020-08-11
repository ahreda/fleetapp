$(document).ready(function(){

$('table #editLocationButton').on('click', function(event){
event.preventDefault();

var href = $(this).attr('href');

$.get(href, function(location, status){
    $('#IdName').val(location.id);
    $('#descriptionname').val(location.description);
    $('#details_Name').val(location.details);
    $('#City-name').val(location.city);
    $('#Countryid-name').val(location.countryid);
    $('#addresslName').val(location.address);

});
$('#editLocationModal').modal();
});


$('table #deailsBtn').on('click', function(event){
event.preventDefault();

var href = $(this).attr('href');

$.get(href, function(location, status){
    $('#Id-Name').val(location.id);
    $('#descriptioname').val(location.description);
    $('#detailName').val(location.details);
    $('#Cityname').val(location.city);
    $('#Countryidname').val(location.countryid);


});

$('#detailsLocation').modal();

});

$('table #deleteLocationButton').on('click', function(event){

event.preventDefault();

var href = $(this).attr('href');
$('#deleteButtonConfirma').attr('href', href);
$('#dltModal').modal();
});

});
