package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSSearchPathDirectory {
    NSApplicationDirectory($Foundation.NSApplicationDirectory),
    NSDemoApplicationDirectory($Foundation.NSDemoApplicationDirectory),
    NSDeveloperApplicationDirectory($Foundation.NSDeveloperApplicationDirectory),
    NSAdminApplicationDirectory($Foundation.NSAdminApplicationDirectory),
    NSLibraryDirectory($Foundation.NSLibraryDirectory),
    NSDeveloperDirectory($Foundation.NSDeveloperDirectory),
    NSUserDirectory($Foundation.NSUserDirectory),
    NSDocumentationDirectory($Foundation.NSDocumentationDirectory),
    NSDocumentDirectory($Foundation.NSDocumentDirectory),
    NSCoreServiceDirectory($Foundation.NSCoreServiceDirectory),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSAutosavedInformationDirectory($Foundation.NSAutosavedInformationDirectory),
    NSDesktopDirectory($Foundation.NSDesktopDirectory),
    NSCachesDirectory($Foundation.NSCachesDirectory),
    NSApplicationSupportDirectory($Foundation.NSApplicationSupportDirectory),
    /**
     * @since Available in iOS 2.0 and later.
     */
    NSDownloadsDirectory($Foundation.NSDownloadsDirectory),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSInputMethodsDirectory($Foundation.NSInputMethodsDirectory),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSMoviesDirectory($Foundation.NSMoviesDirectory),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSMusicDirectory($Foundation.NSMusicDirectory),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSPicturesDirectory($Foundation.NSPicturesDirectory),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSPrinterDescriptionDirectory($Foundation.NSPrinterDescriptionDirectory),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSSharedPublicDirectory($Foundation.NSSharedPublicDirectory),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSPreferencePanesDirectory($Foundation.NSPreferencePanesDirectory),
    NSApplicationScriptsDirectory($Foundation.NSApplicationScriptsDirectory),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSItemReplacementDirectory($Foundation.NSItemReplacementDirectory),
    NSAllApplicationsDirectory($Foundation.NSAllApplicationsDirectory),
    NSAllLibrariesDirectory($Foundation.NSAllLibrariesDirectory),
    NSTrashDirectory($Foundation.NSTrashDirectory);

    private final long value;

    private NSSearchPathDirectory(long value) { this.value = value; }
}
