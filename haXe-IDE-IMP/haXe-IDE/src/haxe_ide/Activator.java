package haxe_ide;

import org.eclipse.imp.runtime.PluginBase;
import org.osgi.framework.BundleContext;

public class Activator extends PluginBase {

	public static final String kPluginID = "haXe_IDE";
	public static final String kLanguageID = "haxe";

	/**
	 * The unique instance of this plugin class
	 */
	protected static Activator sPlugin;

	public static Activator getInstance() {
		if (sPlugin == null)
			new Activator();
		return sPlugin;
	}

	public Activator() {
		super();
		sPlugin = this;
	}

	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	@Override
	public String getID() {
		return kPluginID;
	}

	@Override
	public String getLanguageID() {
		return kLanguageID;
	}
}
