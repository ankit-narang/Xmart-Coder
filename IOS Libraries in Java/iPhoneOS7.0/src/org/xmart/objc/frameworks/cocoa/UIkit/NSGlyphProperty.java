package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSGlyphProperty {
    NSGlyphPropertyNull($UIKit.NSGlyphPropertyNull),
    NSGlyphPropertyControlCharacter($UIKit.NSGlyphPropertyControlCharacter),
    NSGlyphPropertyElastic($UIKit.NSGlyphPropertyElastic),
    NSGlyphPropertyNonBaseCharacter($UIKit.NSGlyphPropertyNonBaseCharacter);

    private final long value;

    private NSGlyphProperty(long value) { this.value = value; }
}
