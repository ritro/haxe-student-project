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
	//public static final HaxeType haxeString;

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

}
