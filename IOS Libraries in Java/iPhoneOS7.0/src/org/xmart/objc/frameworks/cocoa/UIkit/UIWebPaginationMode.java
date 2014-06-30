package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIWebPaginationMode {
    UIWebPaginationModeUnpaginated($UIKit.UIWebPaginationModeUnpaginated),
    UIWebPaginationModeLeftToRight($UIKit.UIWebPaginationModeLeftToRight),
    UIWebPaginationModeTopToBottom($UIKit.UIWebPaginationModeTopToBottom),
    UIWebPaginationModeBottomToTop($UIKit.UIWebPaginationModeBottomToTop),
    UIWebPaginationModeRightToLeft($UIKit.UIWebPaginationModeRightToLeft);

    private final long value;

    private UIWebPaginationMode(long value) { this.value = value; }
}
