package spring2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface REPOSİTORY extends JpaRepository<Entittyy,Integer> {
	List<Entittyy> getbyname(String name);
	List<Entittyy> getbyordernameorname(Entittyy enty);
	Entittyy getbypageno(int i);

}
