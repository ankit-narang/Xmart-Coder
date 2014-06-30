package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITextGranularity {
    UITextGranularityCharacter($UIKit.UITextGranularityCharacter),
    UITextGranularityWord($UIKit.UITextGranularityWord),
    UITextGranularitySentence($UIKit.UITextGranularitySentence),
    UITextGranularityParagraph($UIKit.UITextGranularityParagraph),
    UITextGranularityLine($UIKit.UITextGranularityLine),
    UITextGranularityDocument($UIKit.UITextGranularityDocument);

    private final long value;

    private UITextGranularity(long value) { this.value = value; }
}
