function enviarFormularioOpcion2(){
	const XHR = new XMLHttpRequest();
	  var formData = new FormData(document.getElementById('contact-form'));

	  // Define what happens on successful data submission
	  XHR.addEventListener('load', (event) => {
	    alert('Yeah! Data sent and response loaded.');
	  });

	  // Define what happens in case of error
	  XHR.addEventListener('error', (event) => {
	    alert('Oops! Something went wrong.');
	  });

	  // Set up our request
	  XHR.open('POST', '/NewServlet');

	  // Send our FormData object; HTTP headers are set automatically
	  XHR.send(formData);
	
}