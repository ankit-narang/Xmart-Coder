package org.xmart.objc.frameworks.json.JSONKit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("JSONKit")
public enum JKParseOptionFlags {
    JKParseOptionNone($JSONKit.JKParseOptionNone),
    JKParseOptionStrict($JSONKit.JKParseOptionStrict),
    JKParseOptionComments($JSONKit.JKParseOptionComments),
    JKParseOptionUnicodeNewlines($JSONKit.JKParseOptionUnicodeNewlines),
    JKParseOptionLooseUnicode($JSONKit.JKParseOptionLooseUnicode),
    JKParseOptionPermitTextAfterValidJSON($JSONKit.JKParseOptionPermitTextAfterValidJSON),
    JKParseOptionValidFlags($JSONKit.JKParseOptionValidFlags);

    private final long value;

    private JKParseOptionFlags(long value) { this.value = value; }
}
