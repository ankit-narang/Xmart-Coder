package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSFileVersion extends NSObject  {
    
    public NSFileVersion() {}
    @ObjCPropertyGetter(selector = "URL")
    public native NSURL getURL();
    @ObjCProperty public NSURL URL;

    @ObjCPropertyGetter(selector = "localizedName")
    public native NSString getLocalizedName();
    @ObjCProperty public NSString localizedName;

    @ObjCPropertyGetter(selector = "localizedNameOfSavingComputer")
    public native NSString getLocalizedNameOfSavingComputer();
    @ObjCProperty public NSString localizedNameOfSavingComputer;

    @ObjCPropertyGetter(selector = "modificationDate")
    public native NSDate getModificationDate();
    @ObjCProperty public NSDate modificationDate;

    @ObjCPropertyGetter(selector = "persistentIdentifier")
    public native NSCoding getPersistentIdentifier();
    @ObjCProperty public NSCoding persistentIdentifier;

    @ObjCPropertyGetter(selector = "isConflict")
    public native boolean isConflict();
    @ObjCProperty public boolean conflict;

    @ObjCPropertyGetter(selector = "isResolved")
    public native boolean isResolved();
    @ObjCPropertySetter(selector = "setResolved:")
    public native void setResolved(boolean v);
    @ObjCProperty public boolean resolved;
    
    @ObjCMethodSign(sign = "- (NSURL *)replaceItemAtURL:(NSURL *)url options:(NSFileVersionReplacingOptions)options error:(NSError **)error;", selector = "replaceItemAtURL:options:error:")
    public native NSURL replaceItemAtURL$options$error$(NSURL url, NSFileVersionReplacingOptions options, NSError[] error);

    @ObjCMethodSign(sign = "- (BOOL)removeAndReturnError:(NSError **)outError;", selector = "removeAndReturnError:")
    public native boolean removeAndReturnError$(NSError[] outError);

    @ObjCMethodSign(sign = "+ (NSFileVersion *)currentVersionOfItemAtURL:(NSURL *)url;", selector = "currentVersionOfItemAtURL:")
    public static native NSFileVersion currentVersionOfItemAtURL$(NSURL url);

    @ObjCMethodSign(sign = "+ (NSArray *)otherVersionsOfItemAtURL:(NSURL *)url;", selector = "otherVersionsOfItemAtURL:")
    public static native NSArray otherVersionsOfItemAtURL$(NSURL url);

    @ObjCMethodSign(sign = "+ (NSArray *)unresolvedConflictVersionsOfItemAtURL:(NSURL *)url;", selector = "unresolvedConflictVersionsOfItemAtURL:")
    public static native NSArray unresolvedConflictVersionsOfItemAtURL$(NSURL url);

    @ObjCMethodSign(sign = "+ (NSFileVersion *)versionOfItemAtURL:(NSURL *)url forPersistentIdentifier:(id)persistentIdentifier;", selector = "versionOfItemAtURL:forPersistentIdentifier:")
    public static native NSFileVersion versionOfItemAtURL$forPersistentIdentifier$(NSURL url, NSObject persistentIdentifier);

    @ObjCMethodSign(sign = "+ (BOOL)removeOtherVersionsOfItemAtURL:(NSURL *)url error:(NSError **)outError;", selector = "removeOtherVersionsOfItemAtURL:error:")
    public static native boolean removeOtherVersionsOfItemAtURL$error$(NSURL url, NSError[] outError);
}
