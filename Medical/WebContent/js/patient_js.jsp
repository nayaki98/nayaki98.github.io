<script type="text/javascript">
	$(window).load(function() {
		$("div.lay").show();
		$("div.lay1").hide();
		$("div.lay2").hide();
		$("div.cancel").hide();

	});
	$(document)
			.ready(
					function() {
						$("#nbutton").click(function() {
							$("div.lay").show();
							$("div.lay1").hide();
							$("div.lay2").hide();
							$("div.cancel").hide();

						});
						$("#nbutton1").click(function() {
							$("div.lay").hide();
							$("div.lay1").show();
							$("div.lay2").hide();
							$("div.cancel").hide();

						});
						$("#nbutton2").click(function() {
							$("div.lay").hide();
							$("div.lay1").hide();
							$("div.lay2").show();
							$("div.cancel").hide();

						});

						$("#nbutton3").click(function() {
							$("div.lay").hide();
							$("div.lay1").hide();
							$("div.lay2").hide();
							$("div.cancel").show();

						});

						$("#specialist")
								.click(
										function() {
											var spec_cat = $(
													'#specialist :selected')
													.text();
											if (spec_cat == "Dentist") {
												$('#spec_desc')
														.text(
																"Dentists are medical healthcare professionals who work with patients to treat dental and oral disease and injuries and to prevent dental health problems.");
											} else if (spec_cat == "Cardiologist") {
												$('#spec_desc')
														.text(
																"A cardiologist is a doctor with special training and skill in finding, treating and preventing diseases of the heart and blood vessels.")
											} else {
												$('#spec_desc').text("")
											}

										});

					});
</script>