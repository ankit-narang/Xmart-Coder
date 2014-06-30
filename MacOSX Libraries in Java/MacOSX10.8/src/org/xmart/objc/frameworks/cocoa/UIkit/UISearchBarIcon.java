package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UISearchBarIcon {
    UISearchBarIconSearch($UIKit.UISearchBarIconSearch),
    UISearchBarIconClear($UIKit.UISearchBarIconClear),
    UISearchBarIconBookmark($UIKit.UISearchBarIconBookmark),
    UISearchBarIconResultsList($UIKit.UISearchBarIconResultsList);

    private final long value;

    private UISearchBarIcon(long value) { this.value = value; }
}
