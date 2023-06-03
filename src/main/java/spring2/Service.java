package spring2;

import java.util.List;

public interface Service {
	dataresultsucces<List<Entittyy>> getbyname(String name);
	dataresultsucces<Entittyy> getnamee(Entittyy ent);
	dataresultsucces<Entittyy> getbypageno(int i);
	dataresultsucces<List<Entittyy>> getbynameorder(Entittyy enty);
	dataresultsucces<List<Entittyy>> getbypage_size(int in);
	ResultData ekle(String name);
	
	
	
	

}
