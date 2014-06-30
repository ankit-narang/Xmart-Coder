package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIReferenceLibraryViewController extends UIViewController  {
    
    public UIReferenceLibraryViewController() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithTerm:(NSString *)term;", selector = "initWithTerm:")
    public native UIReferenceLibraryViewController initWithTerm$(NSString term);

    @ObjCMethodSign(sign = "+ (BOOL)dictionaryHasDefinitionForTerm:(NSString *)term;", selector = "dictionaryHasDefinitionForTerm:")
    public static native boolean dictionaryHasDefinitionForTerm$(NSString term);
}
