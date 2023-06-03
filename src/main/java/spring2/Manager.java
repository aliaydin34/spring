package spring2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Manager implements Service {
	private REPOSİTORY rprstry;
	
	
    @Autowired
	public Manager(REPOSİTORY rprstry) {
		super();
		this.rprstry = rprstry;
	}

	@Override
	public dataresultsucces<List<Entittyy>> getbyname(String name) {
		
	
		return new SuccessDataResult<List<Entittyy>>(rprstry.getbyname(name),"listelenme başarılı");
	}

	

	@Override
	public dataresultsucces<Entittyy> getnamee(Entittyy ent) {
		
		return null;
	}

	@Override
	public ResultData ekle(String name) {
		return null;
	}

	@Override
	public dataresultsucces<Entittyy> getbypageno(int i) {
		return new SuccessDataResult<Entittyy>(rprstry.getbypageno(i),"DATA LİSTELENDİ");
		
	}

	@Override
	public dataresultsucces<List<Entittyy>> getbynameorder(Entittyy enty) {
		return new SuccessDataResult<List<Entittyy>>(enty);
	}

	@Override
	public dataresultsucces<List<Entittyy>> getbypage_size(int in) {
		return null;
	}
	

}
