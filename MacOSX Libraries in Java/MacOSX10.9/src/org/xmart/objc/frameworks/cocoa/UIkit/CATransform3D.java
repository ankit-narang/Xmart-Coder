package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CATransform3D extends ObjCStructure  {
    
    public CATransform3D() {}
    public CATransform3D(float m11, float m12, float m13, float m14, float m21, float m22, float m23, float m24, float m31, float m32, float m33, float m34, float m41, float m42, float m43, float m44) {
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m14 = m14;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m24 = m24;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;
        this.m34 = m34;
        this.m41 = m41;
        this.m42 = m42;
        this.m43 = m43;
        this.m44 = m44;
    }
    
    @ObjCStructureMember(index=0, name="m11") public float m11;
    @ObjCStructureMember(index=1, name="m12") public float m12;
    @ObjCStructureMember(index=2, name="m13") public float m13;
    @ObjCStructureMember(index=3, name="m14") public float m14;
    @ObjCStructureMember(index=4, name="m21") public float m21;
    @ObjCStructureMember(index=5, name="m22") public float m22;
    @ObjCStructureMember(index=6, name="m23") public float m23;
    @ObjCStructureMember(index=7, name="m24") public float m24;
    @ObjCStructureMember(index=8, name="m31") public float m31;
    @ObjCStructureMember(index=9, name="m32") public float m32;
    @ObjCStructureMember(index=10, name="m33") public float m33;
    @ObjCStructureMember(index=11, name="m34") public float m34;
    @ObjCStructureMember(index=12, name="m41") public float m41;
    @ObjCStructureMember(index=13, name="m42") public float m42;
    @ObjCStructureMember(index=14, name="m43") public float m43;
    @ObjCStructureMember(index=15, name="m44") public float m44;
    
}
