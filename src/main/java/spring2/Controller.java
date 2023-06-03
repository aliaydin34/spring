package spring2;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	private Service service;
	
	
	public Controller(Service service) {
		super();
		this.service = service;
	}


	@PostMapping("/api/user")
	public dataresultsucces<Entittyy> getbyname(@RequestBody Entittyy ent) {
		return service.getnamee(ent);
	
	}
	@GetMapping("/api/user/v1")
	public dataresultsucces<List<Entittyy>> getpagenameorname(@RequestBody String name){
		return service.getbyname(name);
	}
	@GetMapping("/api/user/v2")
	public ResultData getbynameorname(String name) {
		return service.ekle(name);
		
	}
	@GetMapping("/api/mylab")
	public dataresultsucces<Entittyy> getbypageno(int i){
		return service.getbypageno(i);
	}
	@GetMapping("/api/v2/user2")
	public dataresultsucces<List<Entittyy>> getbyordername(Entittyy ent){
		return service.getbynameorder(ent);
		
	}
	@GetMapping("/api/v3/user4")
	public dataresultsucces<List<Entittyy>> getbypagesize(int i){
		return service.getbypage_size(i);
	}

}
