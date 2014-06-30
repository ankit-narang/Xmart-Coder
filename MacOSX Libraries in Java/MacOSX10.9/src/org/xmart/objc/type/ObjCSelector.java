package org.xmart.objc.type;

public final class ObjCSelector extends ObjCObject {

    private String name;

    private ObjCSelector() {
    }
    
    @Override
    public String toString() {
    	return getName();
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
}
