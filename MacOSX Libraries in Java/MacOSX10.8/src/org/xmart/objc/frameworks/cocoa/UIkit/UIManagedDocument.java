package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIManagedDocument extends UIDocument  {
    
    public UIManagedDocument() {}
    @ObjCPropertyGetter(selector = "managedObjectContext")
    public native NSManagedObjectContext getManagedObjectContext();
    @ObjCProperty public NSManagedObjectContext managedObjectContext;

    @ObjCPropertyGetter(selector = "managedObjectModel")
    public native NSManagedObjectModel getManagedObjectModel();
    @ObjCProperty public NSManagedObjectModel managedObjectModel;

    @ObjCPropertyGetter(selector = "persistentStoreOptions")
    public native NSDictionary getPersistentStoreOptions();
    @ObjCPropertySetter(selector = "setPersistentStoreOptions:")
    public native void setPersistentStoreOptions(NSDictionary v);
    @ObjCProperty public NSDictionary persistentStoreOptions;

    @ObjCPropertyGetter(selector = "modelConfiguration")
    public native NSString getModelConfiguration();
    @ObjCPropertySetter(selector = "setModelConfiguration:")
    public native void setModelConfiguration(NSString v);
    @ObjCProperty public NSString modelConfiguration;
    
    @ObjCMethodSign(sign = "- (BOOL)configurePersistentStoreCoordinatorForURL:(NSURL *)storeURL ofType:(NSString *)fileType modelConfiguration:(NSString *)configuration storeOptions:(NSDictionary *)storeOptions error:(NSError **)error;", selector = "configurePersistentStoreCoordinatorForURL:ofType:modelConfiguration:storeOptions:error:")
    public native boolean configurePersistentStoreCoordinatorForURL$ofType$modelConfiguration$storeOptions$error$(NSURL storeURL, NSString fileType, NSString configuration, NSDictionary storeOptions, NSError[] error);

    @ObjCMethodSign(sign = "- (NSString *)persistentStoreTypeForFileType:(NSString *)fileType;", selector = "persistentStoreTypeForFileType:")
    public native NSString persistentStoreTypeForFileType$(NSString fileType);

    @ObjCMethodSign(sign = "- (BOOL)readAdditionalContentFromURL:(NSURL *)absoluteURL error:(NSError **)error;", selector = "readAdditionalContentFromURL:error:")
    public native boolean readAdditionalContentFromURL$error$(NSURL absoluteURL, NSError[] error);

    @ObjCMethodSign(sign = "- (id)additionalContentForURL:(NSURL *)absoluteURL error:(NSError **)error;", selector = "additionalContentForURL:error:")
    public native NSObject additionalContentForURL$error$(NSURL absoluteURL, NSError[] error);

    @ObjCMethodSign(sign = "- (BOOL)writeAdditionalContent:(id)content toURL:(NSURL *)absoluteURL originalContentsURL:(NSURL *)absoluteOriginalContentsURL error:(NSError **)error;", selector = "writeAdditionalContent:toURL:originalContentsURL:error:")
    public native boolean writeAdditionalContent$toURL$originalContentsURL$error$(NSObject content, NSURL absoluteURL, NSURL absoluteOriginalContentsURL, NSError[] error);

    @ObjCMethodSign(sign = "+ (NSString *)persistentStoreName;", selector = "persistentStoreName")
    public static native NSString persistentStoreName();
}
