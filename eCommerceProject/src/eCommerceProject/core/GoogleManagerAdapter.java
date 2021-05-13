package eCommerceProject.core;


import eCommerceProject.GoogleAdapters.GoogleManager;
import eCommerceProject.core.abstracts.GoogleService;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void registerToSystem() {
		GoogleManager googleManager = new GoogleManager();
		googleManager.register();
		
	}

}
