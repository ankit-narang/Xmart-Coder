package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UISearchBarStyle {
    UISearchBarStyleDefault($UIKit.UISearchBarStyleDefault),
    UISearchBarStyleProminent($UIKit.UISearchBarStyleProminent),
    UISearchBarStyleMinimal($UIKit.UISearchBarStyleMinimal);

    private final long value;

    private UISearchBarStyle(long value) { this.value = value; }
}
