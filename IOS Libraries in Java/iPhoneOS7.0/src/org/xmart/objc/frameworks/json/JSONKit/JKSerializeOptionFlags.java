package org.xmart.objc.frameworks.json.JSONKit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("JSONKit")
public enum JKSerializeOptionFlags {
    JKSerializeOptionNone($JSONKit.JKSerializeOptionNone),
    JKSerializeOptionPretty($JSONKit.JKSerializeOptionPretty),
    JKSerializeOptionEscapeUnicode($JSONKit.JKSerializeOptionEscapeUnicode),
    JKSerializeOptionEscapeForwardSlashes($JSONKit.JKSerializeOptionEscapeForwardSlashes),
    JKSerializeOptionValidFlags($JSONKit.JKSerializeOptionValidFlags);

    private final long value;

    private JKSerializeOptionFlags(long value) { this.value = value; }
}
