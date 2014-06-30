package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSCacheDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)cache:(NSCache *)cache willEvictObject:(id)obj;", selector = "cache:willEvictObject:")
    void cache$willEvictObject$(NSCache cache, NSObject obj);
}
