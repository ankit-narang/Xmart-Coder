package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIStateRestoring 
    extends NSObjectProtocol {

    
    @ObjCPropertyGetter(selector = "restorationParent")
    UIStateRestoring getRestorationParent();
    @ObjCPropertyGetter(selector = "objectRestorationClass")
    ObjCClass getObjectRestorationClass();
    @ObjCMethodSign(sign = "- (void) encodeRestorableStateWithCoder:(NSCoder *)coder;", selector = "encodeRestorableStateWithCoder:")
    void encodeRestorableStateWithCoder$(NSCoder coder);

    @ObjCMethodSign(sign = "- (void) decodeRestorableStateWithCoder:(NSCoder *)coder;", selector = "decodeRestorableStateWithCoder:")
    void decodeRestorableStateWithCoder$(NSCoder coder);

    @ObjCMethodSign(sign = "- (void) applicationFinishedRestoringState;", selector = "applicationFinishedRestoringState")
    void applicationFinishedRestoringState();
}
