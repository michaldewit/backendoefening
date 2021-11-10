package oefeningCloud.personEndpoint;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(maxAge=3600)
public class Endpoint {

	@GetMapping("zozo")
	public Werknemer2 daarGaanwe() {
		System.out.println("hij doet het ");
		Werknemer2 w = new Werknemer2();
		w.setNaam("karel");
		w.setBeroep("kapper");
		w.setLeeftijd(18);
		return w;
	}
	
}
