package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSURLRequestNetworkServiceType {
    NSURLNetworkServiceTypeDefault($Foundation.NSURLNetworkServiceTypeDefault),
    NSURLNetworkServiceTypeVoIP($Foundation.NSURLNetworkServiceTypeVoIP),
    NSURLNetworkServiceTypeVideo($Foundation.NSURLNetworkServiceTypeVideo),
    NSURLNetworkServiceTypeBackground($Foundation.NSURLNetworkServiceTypeBackground),
    NSURLNetworkServiceTypeVoice($Foundation.NSURLNetworkServiceTypeVoice);

    private final long value;

    private NSURLRequestNetworkServiceType(long value) { this.value = value; }
}
