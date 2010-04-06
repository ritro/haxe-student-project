package haxe.utils;

import java.util.ArrayList;

public class HaxeType {
	private static final String HAXE_PRIMARY_TYPES_PATH = "haxe.primaryTypes";
	private ArrayList<HaxeType> classHierarchy = new ArrayList<HaxeType>();
	private ArrayList<HaxeType> ImplementedTypes = new ArrayList<HaxeType>();
	private String TypeName;
	private String FullTypeName;

	public static final HaxeType haxeFloat;
	public static final HaxeType haxeInt;
	public static final HaxeType haxeVoid;
	public static final HaxeType haxeBool;
	public static final HaxeType haxeString;
	public static final HaxeType haxeDynamic;
	public static final HaxeType haxeObject;
	public static final HaxeType haxeNotYetRecognized;
	public static final HaxeType haxeUndefined;

	static {
		haxeFloat = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".Float");
		haxeInt = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".Int");
		haxeInt.setClassHierarchy(new ArrayList<HaxeType>() {
			private static final long serialVersionUID = 1L;
			{
				add(haxeFloat);
			}
		});
		haxeVoid = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".Void");
		haxeBool = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".Bool");
		haxeString = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".String");
		haxeDynamic = new HaxeType(HAXE_PRIMARY_TYPES_PATH + ".Dynamic");
		haxeObject = new HaxeType("haxe.Object");
		haxeNotYetRecognized = new HaxeType("haxe.notYetRecognized");
		haxeUndefined = new HaxeType("haxe.Undefined");
	}

	/**
	 * @return the classHierarchy
	 */
	public ArrayList<HaxeType> getClassHierarchy() {
		return classHierarchy;
	}

	/**
	 * @param classHierarchy
	 *            the classHierarchy to set
	 */
	public void setClassHierarchy(ArrayList<HaxeType> classHierarchy) {
		this.classHierarchy = classHierarchy;
	}

	/**
	 * @return the implementedTypes
	 */
	public ArrayList<HaxeType> getImplementedTypes() {
		return ImplementedTypes;
	}

	/**
	 * @param implementedTypes
	 *            the implementedTypes to set
	 */
	public void setImplementedTypes(ArrayList<HaxeType> implementedTypes) {
		ImplementedTypes = implementedTypes;
	}

	/**
	 * @return the typeName
	 */
	public String getTypeName() {
		return TypeName;
	}

	/**
	 * @param typeName
	 *            the typeName to set
	 */
	public void setTypeName(String typeName) {
		TypeName = typeName;
	}

	/**
	 * @return the fullTypeName
	 */
	public String getFullTypeName() {
		return FullTypeName;
	}

	/**
	 * @param fullTypeName
	 *            the fullTypeName to set
	 */
	public void setFullTypeName(String fullTypeName) {
		FullTypeName = fullTypeName;
	}

	public HaxeType(String fullTypeName) {
		this.FullTypeName = fullTypeName;
		this.TypeName = fullTypeName.substring(fullTypeName.lastIndexOf("."));
	}

	public HaxeType() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getFullTypeName().length() != 0 ? this.getFullTypeName()
				: this.getTypeName();
	}

}
