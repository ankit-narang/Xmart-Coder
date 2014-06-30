package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIWebViewNavigationType {
    UIWebViewNavigationTypeLinkClicked($UIKit.UIWebViewNavigationTypeLinkClicked),
    UIWebViewNavigationTypeFormSubmitted($UIKit.UIWebViewNavigationTypeFormSubmitted),
    UIWebViewNavigationTypeBackForward($UIKit.UIWebViewNavigationTypeBackForward),
    UIWebViewNavigationTypeReload($UIKit.UIWebViewNavigationTypeReload),
    UIWebViewNavigationTypeFormResubmitted($UIKit.UIWebViewNavigationTypeFormResubmitted),
    UIWebViewNavigationTypeOther($UIKit.UIWebViewNavigationTypeOther);

    private final long value;

    private UIWebViewNavigationType(long value) { this.value = value; }
}
