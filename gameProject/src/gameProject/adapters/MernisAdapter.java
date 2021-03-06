package gameProject.adapters;

import gameProject.entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter {
	public boolean customerCheck(Gamer gamer) {
		boolean result;
		
		KPSPublicSoapProxy publicSoap = new KPSPublicSoapProxy();
		
		try {
			result = publicSoap.TCKimlikNoDogrula(
					 Long.parseLong(gamer.getNationalId()), 
					 gamer.getFirstName().toUpperCase(),
					 gamer.getLastName().toUpperCase(),
					 gamer.getBirthOfYear()
			);
		
			return result;
		} catch (Exception e ) {
			e.printStackTrace();
			return false;
		}
		}
}
