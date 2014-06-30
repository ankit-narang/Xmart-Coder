package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIPrintInfoOutputType {
    UIPrintInfoOutputGeneral($UIKit.UIPrintInfoOutputGeneral),
    UIPrintInfoOutputPhoto($UIKit.UIPrintInfoOutputPhoto),
    UIPrintInfoOutputGrayscale($UIKit.UIPrintInfoOutputGrayscale),
    UIPrintInfoOutputPhotoGrayscale($UIKit.UIPrintInfoOutputPhotoGrayscale);

    private final long value;

    private UIPrintInfoOutputType(long value) { this.value = value; }
}
