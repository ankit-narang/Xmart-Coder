package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSFilePresenter 
    extends NSObjectProtocol {

    
    @ObjCPropertyGetter(selector = "presentedItemURL")
    NSURL getPresentedItemURL();
    @ObjCPropertyGetter(selector = "presentedItemOperationQueue")
    NSOperationQueue getPresentedItemOperationQueue();
    @ObjCMethodSign(sign = "- (void)relinquishPresentedItemToReader:(void (^)(void (^reacquirer)(void)))reader;", selector = "relinquishPresentedItemToReader:")
    void relinquishPresentedItemToReader$(ObjCBlock reader);

    @ObjCMethodSign(sign = "- (void)relinquishPresentedItemToWriter:(void (^)(void (^reacquirer)(void)))writer;", selector = "relinquishPresentedItemToWriter:")
    void relinquishPresentedItemToWriter$(ObjCBlock writer);

    @ObjCMethodSign(sign = "- (void)savePresentedItemChangesWithCompletionHandler:(void (^)(NSError *errorOrNil))completionHandler;", selector = "savePresentedItemChangesWithCompletionHandler:")
    void savePresentedItemChangesWithCompletionHandler$(ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)accommodatePresentedItemDeletionWithCompletionHandler:(void (^)(NSError *errorOrNil))completionHandler;", selector = "accommodatePresentedItemDeletionWithCompletionHandler:")
    void accommodatePresentedItemDeletionWithCompletionHandler$(ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)presentedItemDidMoveToURL:(NSURL *)newURL;", selector = "presentedItemDidMoveToURL:")
    void presentedItemDidMoveToURL$(NSURL newURL);

    @ObjCMethodSign(sign = "- (void)presentedItemDidChange;", selector = "presentedItemDidChange")
    void presentedItemDidChange();

    @ObjCMethodSign(sign = "- (void)presentedItemDidGainVersion:(NSFileVersion *)version;", selector = "presentedItemDidGainVersion:")
    void presentedItemDidGainVersion$(NSFileVersion version);

    @ObjCMethodSign(sign = "- (void)presentedItemDidLoseVersion:(NSFileVersion *)version;", selector = "presentedItemDidLoseVersion:")
    void presentedItemDidLoseVersion$(NSFileVersion version);

    @ObjCMethodSign(sign = "- (void)presentedItemDidResolveConflictVersion:(NSFileVersion *)version;", selector = "presentedItemDidResolveConflictVersion:")
    void presentedItemDidResolveConflictVersion$(NSFileVersion version);

    @ObjCMethodSign(sign = "- (void)accommodatePresentedSubitemDeletionAtURL:(NSURL *)url completionHandler:(void (^)(NSError *errorOrNil))completionHandler;", selector = "accommodatePresentedSubitemDeletionAtURL:completionHandler:")
    void accommodatePresentedSubitemDeletionAtURL$completionHandler$(NSURL url, ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)presentedSubitemDidAppearAtURL:(NSURL *)url;", selector = "presentedSubitemDidAppearAtURL:")
    void presentedSubitemDidAppearAtURL$(NSURL url);

    @ObjCMethodSign(sign = "- (void)presentedSubitemAtURL:(NSURL *)oldURL didMoveToURL:(NSURL *)newURL;", selector = "presentedSubitemAtURL:didMoveToURL:")
    void presentedSubitemAtURL$didMoveToURL$(NSURL oldURL, NSURL newURL);

    @ObjCMethodSign(sign = "- (void)presentedSubitemDidChangeAtURL:(NSURL *)url;", selector = "presentedSubitemDidChangeAtURL:")
    void presentedSubitemDidChangeAtURL$(NSURL url);

    @ObjCMethodSign(sign = "- (void)presentedSubitemAtURL:(NSURL *)url didGainVersion:(NSFileVersion *)version;", selector = "presentedSubitemAtURL:didGainVersion:")
    void presentedSubitemAtURL$didGainVersion$(NSURL url, NSFileVersion version);

    @ObjCMethodSign(sign = "- (void)presentedSubitemAtURL:(NSURL *)url didLoseVersion:(NSFileVersion *)version;", selector = "presentedSubitemAtURL:didLoseVersion:")
    void presentedSubitemAtURL$didLoseVersion$(NSURL url, NSFileVersion version);

    @ObjCMethodSign(sign = "- (void)presentedSubitemAtURL:(NSURL *)url didResolveConflictVersion:(NSFileVersion *)version;", selector = "presentedSubitemAtURL:didResolveConflictVersion:")
    void presentedSubitemAtURL$didResolveConflictVersion$(NSURL url, NSFileVersion version);
}
