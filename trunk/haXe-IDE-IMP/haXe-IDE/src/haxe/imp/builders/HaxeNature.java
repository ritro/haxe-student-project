package haxe.imp.builders;

import org.eclipse.core.resources.IProject;

import org.eclipse.imp.builder.ProjectNatureBase;
import org.eclipse.imp.runtime.IPluginLog;

import org.eclipse.imp.smapifier.builder.SmapiProjectNature;

import haxe_ide.Activator;

public class HaxeNature extends ProjectNatureBase {
	public static final String k_natureID = Activator.kPluginID + ".imp.nature";

	public String getNatureID() {
		return k_natureID;
	}

	public String getBuilderID() {
		return HaxeBuilder.BUILDER_ID;
	}

	public void addToProject(IProject project) {
		super.addToProject(project);
		new SmapiProjectNature("haxe").addToProject(project);
	};

	protected void refreshPrefs() {
		// TODO implement preferences and hook in here
	}

	public IPluginLog getLog() {
		return Activator.getInstance();
	}

	protected String getDownstreamBuilderID() {
		// TODO If needed, specify the builder that will consume artifacts created by this nature's builder, or null if none
		return "org.eclipse.jdt.core.javabuilder";
	}
}
