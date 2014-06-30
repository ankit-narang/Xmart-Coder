package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIUserInterfaceIdiom {
    UIUserInterfaceIdiomPhone($UIKit.UIUserInterfaceIdiomPhone),
    UIUserInterfaceIdiomPad($UIKit.UIUserInterfaceIdiomPad);

    private final long value;

    private UIUserInterfaceIdiom(long value) { this.value = value; }
}
