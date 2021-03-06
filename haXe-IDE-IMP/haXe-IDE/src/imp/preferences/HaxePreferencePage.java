/******************************************/
/* WARNING: GENERATED FILE - DO NOT EDIT! */
/******************************************/
package imp.preferences;

import org.eclipse.swt.widgets.TabFolder;import org.eclipse.imp.preferences.IPreferencesService;import org.eclipse.imp.preferences.PreferencesInitializer;import org.eclipse.imp.preferences.PreferencesTab;import org.eclipse.imp.preferences.TabbedPreferencesPage;import workspace.Activator;

/**
 * A preference page class.
 */
public class HaxePreferencePage extends TabbedPreferencesPage {
	public HaxePreferencePage() {
		super();
		prefService = Activator.getInstance().getPreferencesService();
	}

	protected PreferencesTab[] createTabs(IPreferencesService prefService,
		TabbedPreferencesPage page, TabFolder tabFolder) {
		PreferencesTab[] tabs = new PreferencesTab[1];

		HaxeInstanceTab instanceTab = new HaxeInstanceTab(prefService);
		instanceTab.createTabContents(page, tabFolder);
		tabs[0] = instanceTab;

		return tabs;
	}

	public PreferencesInitializer getPreferenceInitializer() {
		return new HaxeInitializer();
	}
}
