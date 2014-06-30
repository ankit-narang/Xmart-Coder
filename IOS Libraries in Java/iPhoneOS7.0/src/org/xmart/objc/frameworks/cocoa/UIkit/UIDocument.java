package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIDocument extends NSObject implements NSFilePresenter {
    
    public UIDocument() {}
    @ObjCPropertyGetter(selector = "fileURL")
    public native NSURL getFileURL();
    @ObjCProperty public NSURL fileURL;

    @ObjCPropertyGetter(selector = "localizedName")
    public native NSString getLocalizedName();
    @ObjCProperty public NSString localizedName;

    @ObjCPropertyGetter(selector = "fileType")
    public native NSString getFileType();
    @ObjCProperty public NSString fileType;

    @ObjCPropertyGetter(selector = "fileModificationDate")
    public native NSDate getFileModificationDate();
    @ObjCPropertySetter(selector = "setFileModificationDate:")
    public native void setFileModificationDate(NSDate v);
    @ObjCProperty public NSDate fileModificationDate;

    @ObjCPropertyGetter(selector = "documentState")
    public native UIDocumentState getDocumentState();
    @ObjCProperty public UIDocumentState documentState;

    @ObjCPropertyGetter(selector = "undoManager")
    public native NSUndoManager getUndoManager();
    @ObjCPropertySetter(selector = "setUndoManager:")
    public native void setUndoManager(NSUndoManager v);
    @ObjCProperty public NSUndoManager undoManager;

    @ObjCPropertyGetter(selector = "presentedItemURL")
    public native NSURL getPresentedItemURL();
    @ObjCProperty public NSURL presentedItemURL;

    @ObjCPropertyGetter(selector = "presentedItemOperationQueue")
    public native NSOperationQueue getPresentedItemOperationQueue();
    @ObjCProperty public NSOperationQueue presentedItemOperationQueue;
    
    @ObjCMethodSign(sign = "- (id)initWithFileURL:(NSURL *)url;", selector = "initWithFileURL:")
    public native UIDocument initWithFileURL$(NSURL url);

    @ObjCMethodSign(sign = "- (void)openWithCompletionHandler:(void (^)(BOOL success))completionHandler;", selector = "openWithCompletionHandler:")
    public native void openWithCompletionHandler$(ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)closeWithCompletionHandler:(void (^)(BOOL success))completionHandler;", selector = "closeWithCompletionHandler:")
    public native void closeWithCompletionHandler$(ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (BOOL)loadFromContents:(id)contents ofType:(NSString *)typeName error:(NSError **)outError;", selector = "loadFromContents:ofType:error:")
    public native boolean loadFromContents$ofType$error$(NSObject contents, NSString typeName, NSError[] outError);

    @ObjCMethodSign(sign = "- (id)contentsForType:(NSString *)typeName error:(NSError **)outError;", selector = "contentsForType:error:")
    public native NSObject contentsForType$error$(NSString typeName, NSError[] outError);

    @ObjCMethodSign(sign = "- (void)disableEditing;", selector = "disableEditing")
    public native void disableEditing();

    @ObjCMethodSign(sign = "- (void)enableEditing;", selector = "enableEditing")
    public native void enableEditing();

    @ObjCMethodSign(sign = "- (BOOL)hasUnsavedChanges;", selector = "hasUnsavedChanges")
    public native boolean hasUnsavedChanges();

    @ObjCMethodSign(sign = "- (void)updateChangeCount:(UIDocumentChangeKind)change;", selector = "updateChangeCount:")
    public native void updateChangeCount$(UIDocumentChangeKind change);

    @ObjCMethodSign(sign = "- (id)changeCountTokenForSaveOperation:(UIDocumentSaveOperation)saveOperation;", selector = "changeCountTokenForSaveOperation:")
    public native NSObject changeCountTokenForSaveOperation$(UIDocumentSaveOperation saveOperation);

    @ObjCMethodSign(sign = "- (void)updateChangeCountWithToken:(id)changeCountToken forSaveOperation:(UIDocumentSaveOperation)saveOperation;", selector = "updateChangeCountWithToken:forSaveOperation:")
    public native void updateChangeCountWithToken$forSaveOperation$(NSObject changeCountToken, UIDocumentSaveOperation saveOperation);

    @ObjCMethodSign(sign = "- (void)saveToURL:(NSURL *)url forSaveOperation:(UIDocumentSaveOperation)saveOperation completionHandler:(void (^)(BOOL success))completionHandler;", selector = "saveToURL:forSaveOperation:completionHandler:")
    public native void saveToURL$forSaveOperation$completionHandler$(NSURL url, UIDocumentSaveOperation saveOperation, ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)autosaveWithCompletionHandler:(void (^)(BOOL success))completionHandler;", selector = "autosaveWithCompletionHandler:")
    public native void autosaveWithCompletionHandler$(ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (NSString *)savingFileType;", selector = "savingFileType")
    public native NSString savingFileType();

    @ObjCMethodSign(sign = "- (NSString *)fileNameExtensionForType:(NSString *)typeName saveOperation:(UIDocumentSaveOperation)saveOperation;", selector = "fileNameExtensionForType:saveOperation:")
    public native NSString fileNameExtensionForType$saveOperation$(NSString typeName, UIDocumentSaveOperation saveOperation);

    @ObjCMethodSign(sign = "- (BOOL)writeContents:(id)contents andAttributes:(NSDictionary *)additionalFileAttributes safelyToURL:(NSURL *)url forSaveOperation:(UIDocumentSaveOperation)saveOperation error:(NSError **)outError;", selector = "writeContents:andAttributes:safelyToURL:forSaveOperation:error:")
    public native boolean writeContents$andAttributes$safelyToURL$forSaveOperation$error$(NSObject contents, NSDictionary additionalFileAttributes, NSURL url, UIDocumentSaveOperation saveOperation, NSError[] outError);

    @ObjCMethodSign(sign = "- (BOOL)writeContents:(id)contents toURL:(NSURL *)url forSaveOperation:(UIDocumentSaveOperation)saveOperation originalContentsURL:(NSURL *)originalContentsURL error:(NSError **)outError;", selector = "writeContents:toURL:forSaveOperation:originalContentsURL:error:")
    public native boolean writeContents$toURL$forSaveOperation$originalContentsURL$error$(NSObject contents, NSURL url, UIDocumentSaveOperation saveOperation, NSURL originalContentsURL, NSError[] outError);

    @ObjCMethodSign(sign = "- (NSDictionary *)fileAttributesToWriteToURL:(NSURL *)url forSaveOperation:(UIDocumentSaveOperation)saveOperation error:(NSError **)outError;", selector = "fileAttributesToWriteToURL:forSaveOperation:error:")
    public native NSDictionary fileAttributesToWriteToURL$forSaveOperation$error$(NSURL url, UIDocumentSaveOperation saveOperation, NSError[] outError);

    @ObjCMethodSign(sign = "- (BOOL)readFromURL:(NSURL *)url error:(NSError **)outError;", selector = "readFromURL:error:")
    public native boolean readFromURL$error$(NSURL url, NSError[] outError);

    @ObjCMethodSign(sign = "- (void)performAsynchronousFileAccessUsingBlock:(void (^)(void))block;", selector = "performAsynchronousFileAccessUsingBlock:")
    public native void performAsynchronousFileAccessUsingBlock$(ObjCBlock block);

    @ObjCMethodSign(sign = "- (void)handleError:(NSError *)error userInteractionPermitted:(BOOL)userInteractionPermitted;", selector = "handleError:userInteractionPermitted:")
    public native void handleError$userInteractionPermitted$(NSError error, boolean userInteractionPermitted);

    @ObjCMethodSign(sign = "- (void)finishedHandlingError:(NSError *)error recovered:(BOOL)recovered;", selector = "finishedHandlingError:recovered:")
    public native void finishedHandlingError$recovered$(NSError error, boolean recovered);

    @ObjCMethodSign(sign = "- (void)userInteractionNoLongerPermittedForError:(NSError *)error;", selector = "userInteractionNoLongerPermittedForError:")
    public native void userInteractionNoLongerPermittedForError$(NSError error);

    @ObjCMethodSign(sign = "- (void)revertToContentsOfURL:(NSURL *)url completionHandler:(void (^)(BOOL success))completionHandler;", selector = "revertToContentsOfURL:completionHandler:")
    public native void revertToContentsOfURL$completionHandler$(NSURL url, ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)relinquishPresentedItemToReader:(void (^)(void (^reacquirer)(void)))reader;", selector = "relinquishPresentedItemToReader:")
    public native void relinquishPresentedItemToReader$(ObjCBlock reader);

    @ObjCMethodSign(sign = "- (void)relinquishPresentedItemToWriter:(void (^)(void (^reacquirer)(void)))writer;", selector = "relinquishPresentedItemToWriter:")
    public native void relinquishPresentedItemToWriter$(ObjCBlock writer);

    @ObjCMethodSign(sign = "- (void)savePresentedItemChangesWithCompletionHandler:(void (^)(NSError *errorOrNil))completionHandler;", selector = "savePresentedItemChangesWithCompletionHandler:")
    public native void savePresentedItemChangesWithCompletionHandler$(ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)accommodatePresentedItemDeletionWithCompletionHandler:(void (^)(NSError *errorOrNil))completionHandler;", selector = "accommodatePresentedItemDeletionWithCompletionHandler:")
    public native void accommodatePresentedItemDeletionWithCompletionHandler$(ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)presentedItemDidMoveToURL:(NSURL *)newURL;", selector = "presentedItemDidMoveToURL:")
    public native void presentedItemDidMoveToURL$(NSURL newURL);

    @ObjCMethodSign(sign = "- (void)presentedItemDidChange;", selector = "presentedItemDidChange")
    public native void presentedItemDidChange();

    @ObjCMethodSign(sign = "- (void)presentedItemDidGainVersion:(NSFileVersion *)version;", selector = "presentedItemDidGainVersion:")
    public native void presentedItemDidGainVersion$(NSFileVersion version);

    @ObjCMethodSign(sign = "- (void)presentedItemDidLoseVersion:(NSFileVersion *)version;", selector = "presentedItemDidLoseVersion:")
    public native void presentedItemDidLoseVersion$(NSFileVersion version);

    @ObjCMethodSign(sign = "- (void)presentedItemDidResolveConflictVersion:(NSFileVersion *)version;", selector = "presentedItemDidResolveConflictVersion:")
    public native void presentedItemDidResolveConflictVersion$(NSFileVersion version);

    @ObjCMethodSign(sign = "- (void)accommodatePresentedSubitemDeletionAtURL:(NSURL *)url completionHandler:(void (^)(NSError *errorOrNil))completionHandler;", selector = "accommodatePresentedSubitemDeletionAtURL:completionHandler:")
    public native void accommodatePresentedSubitemDeletionAtURL$completionHandler$(NSURL url, ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)presentedSubitemDidAppearAtURL:(NSURL *)url;", selector = "presentedSubitemDidAppearAtURL:")
    public native void presentedSubitemDidAppearAtURL$(NSURL url);

    @ObjCMethodSign(sign = "- (void)presentedSubitemAtURL:(NSURL *)oldURL didMoveToURL:(NSURL *)newURL;", selector = "presentedSubitemAtURL:didMoveToURL:")
    public native void presentedSubitemAtURL$didMoveToURL$(NSURL oldURL, NSURL newURL);

    @ObjCMethodSign(sign = "- (void)presentedSubitemDidChangeAtURL:(NSURL *)url;", selector = "presentedSubitemDidChangeAtURL:")
    public native void presentedSubitemDidChangeAtURL$(NSURL url);

    @ObjCMethodSign(sign = "- (void)presentedSubitemAtURL:(NSURL *)url didGainVersion:(NSFileVersion *)version;", selector = "presentedSubitemAtURL:didGainVersion:")
    public native void presentedSubitemAtURL$didGainVersion$(NSURL url, NSFileVersion version);

    @ObjCMethodSign(sign = "- (void)presentedSubitemAtURL:(NSURL *)url didLoseVersion:(NSFileVersion *)version;", selector = "presentedSubitemAtURL:didLoseVersion:")
    public native void presentedSubitemAtURL$didLoseVersion$(NSURL url, NSFileVersion version);

    @ObjCMethodSign(sign = "- (void)presentedSubitemAtURL:(NSURL *)url didResolveConflictVersion:(NSFileVersion *)version;", selector = "presentedSubitemAtURL:didResolveConflictVersion:")
    public native void presentedSubitemAtURL$didResolveConflictVersion$(NSURL url, NSFileVersion version);
}
