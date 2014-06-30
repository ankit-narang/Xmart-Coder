package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIDictationPhrase extends NSObject  {
    
    public UIDictationPhrase() {}
    @ObjCPropertyGetter(selector = "text")
    public native NSString getText();
    @ObjCProperty public NSString text;

    @ObjCPropertyGetter(selector = "alternativeInterpretations")
    public native NSArray getAlternativeInterpretations();
    @ObjCProperty public NSArray alternativeInterpretations;
    
    
}
