package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIViewKeyframeAnimationOptions {
    UIViewKeyframeAnimationOptionLayoutSubviews($UIKit.UIViewKeyframeAnimationOptionLayoutSubviews),
    UIViewKeyframeAnimationOptionAllowUserInteraction($UIKit.UIViewKeyframeAnimationOptionAllowUserInteraction),
    UIViewKeyframeAnimationOptionBeginFromCurrentState($UIKit.UIViewKeyframeAnimationOptionBeginFromCurrentState),
    UIViewKeyframeAnimationOptionRepeat($UIKit.UIViewKeyframeAnimationOptionRepeat),
    UIViewKeyframeAnimationOptionAutoreverse($UIKit.UIViewKeyframeAnimationOptionAutoreverse),
    UIViewKeyframeAnimationOptionOverrideInheritedDuration($UIKit.UIViewKeyframeAnimationOptionOverrideInheritedDuration),
    UIViewKeyframeAnimationOptionOverrideInheritedOptions($UIKit.UIViewKeyframeAnimationOptionOverrideInheritedOptions),
    UIViewKeyframeAnimationOptionCalculationModeLinear($UIKit.UIViewKeyframeAnimationOptionCalculationModeLinear),
    UIViewKeyframeAnimationOptionCalculationModeDiscrete($UIKit.UIViewKeyframeAnimationOptionCalculationModeDiscrete),
    UIViewKeyframeAnimationOptionCalculationModePaced($UIKit.UIViewKeyframeAnimationOptionCalculationModePaced),
    UIViewKeyframeAnimationOptionCalculationModeCubic($UIKit.UIViewKeyframeAnimationOptionCalculationModeCubic),
    UIViewKeyframeAnimationOptionCalculationModeCubicPaced($UIKit.UIViewKeyframeAnimationOptionCalculationModeCubicPaced);

    private final long value;

    private UIViewKeyframeAnimationOptions(long value) { this.value = value; }
}
