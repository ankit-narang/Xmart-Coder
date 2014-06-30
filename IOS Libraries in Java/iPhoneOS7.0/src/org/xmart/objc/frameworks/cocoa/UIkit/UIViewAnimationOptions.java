package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIViewAnimationOptions {
    UIViewAnimationOptionLayoutSubviews($UIKit.UIViewAnimationOptionLayoutSubviews),
    UIViewAnimationOptionAllowUserInteraction($UIKit.UIViewAnimationOptionAllowUserInteraction),
    UIViewAnimationOptionBeginFromCurrentState($UIKit.UIViewAnimationOptionBeginFromCurrentState),
    UIViewAnimationOptionRepeat($UIKit.UIViewAnimationOptionRepeat),
    UIViewAnimationOptionAutoreverse($UIKit.UIViewAnimationOptionAutoreverse),
    UIViewAnimationOptionOverrideInheritedDuration($UIKit.UIViewAnimationOptionOverrideInheritedDuration),
    UIViewAnimationOptionOverrideInheritedCurve($UIKit.UIViewAnimationOptionOverrideInheritedCurve),
    UIViewAnimationOptionAllowAnimatedContent($UIKit.UIViewAnimationOptionAllowAnimatedContent),
    UIViewAnimationOptionShowHideTransitionViews($UIKit.UIViewAnimationOptionShowHideTransitionViews),
    UIViewAnimationOptionOverrideInheritedOptions($UIKit.UIViewAnimationOptionOverrideInheritedOptions),
    UIViewAnimationOptionCurveEaseInOut($UIKit.UIViewAnimationOptionCurveEaseInOut),
    UIViewAnimationOptionCurveEaseIn($UIKit.UIViewAnimationOptionCurveEaseIn),
    UIViewAnimationOptionCurveEaseOut($UIKit.UIViewAnimationOptionCurveEaseOut),
    UIViewAnimationOptionCurveLinear($UIKit.UIViewAnimationOptionCurveLinear),
    UIViewAnimationOptionTransitionNone($UIKit.UIViewAnimationOptionTransitionNone),
    UIViewAnimationOptionTransitionFlipFromLeft($UIKit.UIViewAnimationOptionTransitionFlipFromLeft),
    UIViewAnimationOptionTransitionFlipFromRight($UIKit.UIViewAnimationOptionTransitionFlipFromRight),
    UIViewAnimationOptionTransitionCurlUp($UIKit.UIViewAnimationOptionTransitionCurlUp),
    UIViewAnimationOptionTransitionCurlDown($UIKit.UIViewAnimationOptionTransitionCurlDown),
    UIViewAnimationOptionTransitionCrossDissolve($UIKit.UIViewAnimationOptionTransitionCrossDissolve),
    UIViewAnimationOptionTransitionFlipFromTop($UIKit.UIViewAnimationOptionTransitionFlipFromTop),
    UIViewAnimationOptionTransitionFlipFromBottom($UIKit.UIViewAnimationOptionTransitionFlipFromBottom);

    private final long value;

    private UIViewAnimationOptions(long value) { this.value = value; }
}
