/******************************************/
/* WARNING: GENERATED FILE - DO NOT EDIT! */
/******************************************/
package haxe.imp.preferences;

import org.eclipse.imp.preferences.PreferencesInitializer;
import org.eclipse.imp.preferences.IPreferencesService;
import haxe.ide.Activator;

/**
 * Initializations of default values for preferences.
 */
public class HaxeInitializer extends PreferencesInitializer {
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferencesService service = Activator.getInstance().getPreferencesService();

		service.setStringPreference(IPreferencesService.DEFAULT_LEVEL, HaxeConstants.P_SOURCEFONT, "Courier New");
		service.setIntPreference(IPreferencesService.DEFAULT_LEVEL, HaxeConstants.P_TABWIDTH, 4);
		service.setBooleanPreference(IPreferencesService.DEFAULT_LEVEL, HaxeConstants.P_SPACESFORTABS, false);
		service.setBooleanPreference(IPreferencesService.DEFAULT_LEVEL, HaxeConstants.P_USEDEFAULTINCLUDEPATH, true);
		service.setStringPreference(IPreferencesService.DEFAULT_LEVEL, HaxeConstants.P_INCLUDEPATHTOUSE, ".;..; ${workspaceLoc;${projectLoc:projectName}");
		service.setStringPreference(IPreferencesService.DEFAULT_LEVEL, HaxeConstants.P_SOURCEFILEEXTENSIONS, "hx");
		service.setBooleanPreference(IPreferencesService.DEFAULT_LEVEL, HaxeConstants.P_GENERATELOG, true);
		service.setIntPreference(IPreferencesService.DEFAULT_LEVEL, HaxeConstants.P_MAXLOGENTRIES, 100);
	}

	/*
	 * Clear (remove) any preferences set on the given level.
	 */
	public void clearPreferencesOnLevel(String level) {
		IPreferencesService service = Activator.getInstance().getPreferencesService();
		service.clearPreferencesAtLevel(level);

	}
}
