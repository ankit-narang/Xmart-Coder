package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class $Foundation extends NSObject  {
    @DefineConstant(name="NSIntegerMax") public static final long NSIntegerMax = 2147483647L;
    @DefineConstant(name="NSUIntegerMax") public static final float NSUIntegerMax = 0xffffffff;
    @DefineConstant(name="NSFoundationVersionNumber10_0") public static final double NSFoundationVersionNumber10_0 = 397.40;
    @DefineConstant(name="NSFoundationVersionNumber10_1") public static final double NSFoundationVersionNumber10_1 = 425.00;
    @DefineConstant(name="NSFoundationVersionNumber10_1_1") public static final double NSFoundationVersionNumber10_1_1 = 425.00;
    @DefineConstant(name="NSFoundationVersionNumber10_1_2") public static final double NSFoundationVersionNumber10_1_2 = 425.00;
    @DefineConstant(name="NSFoundationVersionNumber10_1_3") public static final double NSFoundationVersionNumber10_1_3 = 425.00;
    @DefineConstant(name="NSFoundationVersionNumber10_1_4") public static final double NSFoundationVersionNumber10_1_4 = 425.00;
    @DefineConstant(name="NSFoundationVersionNumber10_2") public static final double NSFoundationVersionNumber10_2 = 462.00;
    @DefineConstant(name="NSFoundationVersionNumber10_2_1") public static final double NSFoundationVersionNumber10_2_1 = 462.00;
    @DefineConstant(name="NSFoundationVersionNumber10_2_2") public static final double NSFoundationVersionNumber10_2_2 = 462.00;
    @DefineConstant(name="NSFoundationVersionNumber10_2_3") public static final double NSFoundationVersionNumber10_2_3 = 462.00;
    @DefineConstant(name="NSFoundationVersionNumber10_2_4") public static final double NSFoundationVersionNumber10_2_4 = 462.00;
    @DefineConstant(name="NSFoundationVersionNumber10_2_5") public static final double NSFoundationVersionNumber10_2_5 = 462.00;
    @DefineConstant(name="NSFoundationVersionNumber10_2_6") public static final double NSFoundationVersionNumber10_2_6 = 462.00;
    @DefineConstant(name="NSFoundationVersionNumber10_2_7") public static final double NSFoundationVersionNumber10_2_7 = 462.70;
    @DefineConstant(name="NSFoundationVersionNumber10_2_8") public static final double NSFoundationVersionNumber10_2_8 = 462.70;
    @DefineConstant(name="NSFoundationVersionNumber10_3") public static final double NSFoundationVersionNumber10_3 = 500.00;
    @DefineConstant(name="NSFoundationVersionNumber10_3_1") public static final double NSFoundationVersionNumber10_3_1 = 500.00;
    @DefineConstant(name="NSFoundationVersionNumber10_3_2") public static final double NSFoundationVersionNumber10_3_2 = 500.30;
    @DefineConstant(name="NSFoundationVersionNumber10_3_3") public static final double NSFoundationVersionNumber10_3_3 = 500.54;
    @DefineConstant(name="NSFoundationVersionNumber10_3_4") public static final double NSFoundationVersionNumber10_3_4 = 500.56;
    @DefineConstant(name="NSFoundationVersionNumber10_3_5") public static final double NSFoundationVersionNumber10_3_5 = 500.56;
    @DefineConstant(name="NSFoundationVersionNumber10_3_6") public static final double NSFoundationVersionNumber10_3_6 = 500.56;
    @DefineConstant(name="NSFoundationVersionNumber10_3_7") public static final double NSFoundationVersionNumber10_3_7 = 500.56;
    @DefineConstant(name="NSFoundationVersionNumber10_3_8") public static final double NSFoundationVersionNumber10_3_8 = 500.56;
    @DefineConstant(name="NSFoundationVersionNumber10_3_9") public static final double NSFoundationVersionNumber10_3_9 = 500.58;
    @DefineConstant(name="NSFoundationVersionNumber10_4") public static final double NSFoundationVersionNumber10_4 = 567.00;
    @DefineConstant(name="NSFoundationVersionNumber10_4_1") public static final double NSFoundationVersionNumber10_4_1 = 567.00;
    @DefineConstant(name="NSFoundationVersionNumber10_4_2") public static final double NSFoundationVersionNumber10_4_2 = 567.12;
    @DefineConstant(name="NSFoundationVersionNumber10_4_3") public static final double NSFoundationVersionNumber10_4_3 = 567.21;
    @DefineConstant(name="NSFoundationVersionNumber10_4_4_Intel") public static final double NSFoundationVersionNumber10_4_4_Intel = 567.23;
    @DefineConstant(name="NSFoundationVersionNumber10_4_4_PowerPC") public static final double NSFoundationVersionNumber10_4_4_PowerPC = 567.21;
    @DefineConstant(name="NSFoundationVersionNumber10_4_5") public static final double NSFoundationVersionNumber10_4_5 = 567.25;
    @DefineConstant(name="NSFoundationVersionNumber10_4_6") public static final double NSFoundationVersionNumber10_4_6 = 567.26;
    @DefineConstant(name="NSFoundationVersionNumber10_4_7") public static final double NSFoundationVersionNumber10_4_7 = 567.27;
    @DefineConstant(name="NSFoundationVersionNumber10_4_8") public static final double NSFoundationVersionNumber10_4_8 = 567.28;
    @DefineConstant(name="NSFoundationVersionNumber10_4_9") public static final double NSFoundationVersionNumber10_4_9 = 567.29;
    @DefineConstant(name="NSFoundationVersionNumber10_4_10") public static final double NSFoundationVersionNumber10_4_10 = 567.29;
    @DefineConstant(name="NSFoundationVersionNumber10_4_11") public static final double NSFoundationVersionNumber10_4_11 = 567.36;
    @DefineConstant(name="NSFoundationVersionNumber10_5") public static final double NSFoundationVersionNumber10_5 = 677.00;
    @DefineConstant(name="NSFoundationVersionNumber10_5_1") public static final double NSFoundationVersionNumber10_5_1 = 677.10;
    @DefineConstant(name="NSFoundationVersionNumber10_5_2") public static final double NSFoundationVersionNumber10_5_2 = 677.15;
    @DefineConstant(name="NSFoundationVersionNumber10_5_3") public static final double NSFoundationVersionNumber10_5_3 = 677.19;
    @DefineConstant(name="NSFoundationVersionNumber10_5_4") public static final double NSFoundationVersionNumber10_5_4 = 677.19;
    @DefineConstant(name="NSFoundationVersionNumber10_5_5") public static final double NSFoundationVersionNumber10_5_5 = 677.21;
    @DefineConstant(name="NSFoundationVersionNumber10_5_6") public static final double NSFoundationVersionNumber10_5_6 = 677.22;
    @DefineConstant(name="NSFoundationVersionNumber10_5_7") public static final double NSFoundationVersionNumber10_5_7 = 677.24;
    @DefineConstant(name="NSFoundationVersionNumber10_5_8") public static final double NSFoundationVersionNumber10_5_8 = 677.26;
    @DefineConstant(name="NSFoundationVersionNumber10_6") public static final double NSFoundationVersionNumber10_6 = 751.00;
    @DefineConstant(name="NSFoundationVersionNumber10_6_1") public static final double NSFoundationVersionNumber10_6_1 = 751.00;
    @DefineConstant(name="NSFoundationVersionNumber10_6_2") public static final double NSFoundationVersionNumber10_6_2 = 751.14;
    @DefineConstant(name="NSFoundationVersionNumber10_6_3") public static final double NSFoundationVersionNumber10_6_3 = 751.21;
    @DefineConstant(name="NSFoundationVersionNumber10_6_4") public static final double NSFoundationVersionNumber10_6_4 = 751.29;
    @DefineConstant(name="NSFoundationVersionNumber10_6_5") public static final double NSFoundationVersionNumber10_6_5 = 751.42;
    @DefineConstant(name="NSFoundationVersionNumber10_6_6") public static final double NSFoundationVersionNumber10_6_6 = 751.53;
    @DefineConstant(name="NSFoundationVersionNumber10_6_7") public static final double NSFoundationVersionNumber10_6_7 = 751.53;
    @DefineConstant(name="NSFoundationVersionNumber10_6_8") public static final double NSFoundationVersionNumber10_6_8 = 751.62;
    @DefineConstant(name="NSFoundationVersionNumber10_7") public static final double NSFoundationVersionNumber10_7 = 833.10;
    @DefineConstant(name="NSFoundationVersionNumber10_7_1") public static final double NSFoundationVersionNumber10_7_1 = 833.10;
    @DefineConstant(name="NSFoundationVersionNumber10_7_2") public static final double NSFoundationVersionNumber10_7_2 = 833.20;
    @DefineConstant(name="NSFoundationVersionNumber10_7_3") public static final double NSFoundationVersionNumber10_7_3 = 833.24;
    @DefineConstant(name="NSFoundationVersionNumber10_7_4") public static final double NSFoundationVersionNumber10_7_4 = 833.25;
    @DefineConstant(name="NSFoundationVersionNumber10_8") public static final double NSFoundationVersionNumber10_8 = 945.00;
    @DefineConstant(name="NSFoundationVersionNumber10_8_1") public static final double NSFoundationVersionNumber10_8_1 = 945.00;
    @DefineConstant(name="NSFoundationVersionNumber10_8_2") public static final double NSFoundationVersionNumber10_8_2 = 945.11;
    @DefineConstant(name="NSFoundationVersionNumber10_8_3") public static final double NSFoundationVersionNumber10_8_3 = 945.16;
    @DefineConstant(name="NSFoundationVersionNumber10_8_4") public static final double NSFoundationVersionNumber10_8_4 = 945.18;
    @DefineConstant(name="NSFoundationVersionNumber_iPhoneOS_2_0") public static final double NSFoundationVersionNumber_iPhoneOS_2_0 = 678.24;
    @DefineConstant(name="NSFoundationVersionNumber_iPhoneOS_2_1") public static final double NSFoundationVersionNumber_iPhoneOS_2_1 = 678.26;
    @DefineConstant(name="NSFoundationVersionNumber_iPhoneOS_2_2") public static final double NSFoundationVersionNumber_iPhoneOS_2_2 = 678.29;
    @DefineConstant(name="NSFoundationVersionNumber_iPhoneOS_3_0") public static final double NSFoundationVersionNumber_iPhoneOS_3_0 = 678.47;
    @DefineConstant(name="NSFoundationVersionNumber_iPhoneOS_3_1") public static final double NSFoundationVersionNumber_iPhoneOS_3_1 = 678.51;
    @DefineConstant(name="NSFoundationVersionNumber_iPhoneOS_3_2") public static final double NSFoundationVersionNumber_iPhoneOS_3_2 = 678.60;
    @DefineConstant(name="NSFoundationVersionNumber_iOS_4_0") public static final double NSFoundationVersionNumber_iOS_4_0 = 751.32;
    @DefineConstant(name="NSFoundationVersionNumber_iOS_4_1") public static final double NSFoundationVersionNumber_iOS_4_1 = 751.37;
    @DefineConstant(name="NSFoundationVersionNumber_iOS_4_2") public static final double NSFoundationVersionNumber_iOS_4_2 = 751.49;
    @DefineConstant(name="NSFoundationVersionNumber_iOS_4_3") public static final double NSFoundationVersionNumber_iOS_4_3 = 751.49;
    @DefineConstant(name="NSFoundationVersionNumber_iOS_5_0") public static final double NSFoundationVersionNumber_iOS_5_0 = 881.00;
    @DefineConstant(name="NSFoundationVersionNumber_iOS_5_1") public static final double NSFoundationVersionNumber_iOS_5_1 = 890.10;
    @DefineConstant(name="NSFoundationVersionNumber_iOS_6_0") public static final double NSFoundationVersionNumber_iOS_6_0 = 993.00;
    @DefineConstant(name="NSFoundationVersionNumber_iOS_6_1") public static final double NSFoundationVersionNumber_iOS_6_1 = 993.00;
    @DefineConstant(name="NSTimeIntervalSince1970") public static final double NSTimeIntervalSince1970 = 978307200.0;
    @DefineConstant(name="NSDecimalMaxSize") public static final int NSDecimalMaxSize = 8;
    @DefineConstant(name="NSDecimalNoScale") public static final int NSDecimalNoScale = 32767;
    @DefineConstant(name="NSFoundationVersionWithFileManagerResourceForkSupport") public static final int NSFoundationVersionWithFileManagerResourceForkSupport = 412;
    @DefineConstant(name="NSURLResponseUnknownLength") public static final int NSURLResponseUnknownLength = -1;
    @ObjCEnumValue(enumname="NSComparisonResult") public static final long NSOrderedAscending = -1L;
    @ObjCEnumValue(enumname="NSComparisonResult") public static final long NSOrderedSame = 0L;
    @ObjCEnumValue(enumname="NSComparisonResult") public static final long NSOrderedDescending = 1L;
    @ObjCEnumValue(enumname="NSEnumerationOptions") public static final int NSEnumerationConcurrent = 1;
    @ObjCEnumValue(enumname="NSEnumerationOptions") public static final int NSEnumerationReverse = 2;
    @ObjCEnumValue(enumname="NSSortOptions") public static final int NSSortConcurrent = 1;
    @ObjCEnumValue(enumname="NSSortOptions") public static final int NSSortStable = 16;
    @ObjCEnumValue(enumname="") public static final int NSNotFound = 2147483647;
    @ObjCEnumValue(enumname="NSBinarySearchingOptions") public static final long NSBinarySearchingFirstEqual = 256L;
    @ObjCEnumValue(enumname="NSBinarySearchingOptions") public static final long NSBinarySearchingLastEqual = 512L;
    @ObjCEnumValue(enumname="NSBinarySearchingOptions") public static final long NSBinarySearchingInsertionIndex = 1024L;
    @ObjCEnumValue(enumname="NSBundleExecutableArchitectureType") public static final int NSBundleExecutableArchitectureI386 = 7;
    @ObjCEnumValue(enumname="NSBundleExecutableArchitectureType") public static final int NSBundleExecutableArchitecturePPC = 18;
    @ObjCEnumValue(enumname="NSBundleExecutableArchitectureType") public static final int NSBundleExecutableArchitectureX86_64 = 16777223;
    @ObjCEnumValue(enumname="NSBundleExecutableArchitectureType") public static final int NSBundleExecutableArchitecturePPC64 = 16777234;
    @ObjCEnumValue(enumname="") public static final int NS_UnknownByteOrder = 0;
    @ObjCEnumValue(enumname="") public static final int NS_LittleEndian = 1;
    @ObjCEnumValue(enumname="") public static final int NS_BigEndian = 2;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitEra = 2L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitYear = 4L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitMonth = 8L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitDay = 16L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitHour = 32L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitMinute = 64L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitSecond = 128L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitWeekday = 512L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitWeekdayOrdinal = 1024L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitQuarter = 2048L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitWeekOfMonth = 4096L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitWeekOfYear = 8192L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitYearForWeekOfYear = 16384L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitNanosecond = 32768L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitCalendar = 1048576L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarUnitTimeZone = 2097152L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSEraCalendarUnit = 2L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSYearCalendarUnit = 4L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSMonthCalendarUnit = 8L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSDayCalendarUnit = 16L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSHourCalendarUnit = 32L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSMinuteCalendarUnit = 64L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSSecondCalendarUnit = 128L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSWeekCalendarUnit = 256L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSWeekdayCalendarUnit = 512L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSWeekdayOrdinalCalendarUnit = 1024L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSQuarterCalendarUnit = 2048L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSWeekOfMonthCalendarUnit = 4096L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSWeekOfYearCalendarUnit = 8192L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSYearForWeekOfYearCalendarUnit = 16384L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSCalendarCalendarUnit = 1048576L;
    @ObjCEnumValue(enumname="NSCalendarUnit") public static final long NSTimeZoneCalendarUnit = 2097152L;
    @ObjCEnumValue(enumname="NSCalendarOptions") public static final long NSCalendarWrapComponents = 1L;
    @ObjCEnumValue(enumname="NSCalendarOptions") public static final long NSCalendarMatchStrictly = 2L;
    @ObjCEnumValue(enumname="NSCalendarOptions") public static final long NSCalendarSearchBackwards = 4L;
    @ObjCEnumValue(enumname="NSCalendarOptions") public static final long NSCalendarMatchPreviousTimePreservingSmallerUnits = 256L;
    @ObjCEnumValue(enumname="NSCalendarOptions") public static final long NSCalendarMatchNextTimePreservingSmallerUnits = 512L;
    @ObjCEnumValue(enumname="NSCalendarOptions") public static final long NSCalendarMatchNextTime = 1024L;
    @ObjCEnumValue(enumname="NSCalendarOptions") public static final long NSCalendarMatchFirst = 4096L;
    @ObjCEnumValue(enumname="NSCalendarOptions") public static final long NSCalendarMatchLast = 8192L;
    @ObjCEnumValue(enumname="") public static final int NSWrapCalendarComponents = 1;
    @ObjCEnumValue(enumname="") public static final int NSDateComponentUndefined = 2147483647;
    @ObjCEnumValue(enumname="") public static final int NSUndefinedDateComponent = 2147483647;
    @ObjCEnumValue(enumname="NSStringCompareOptions") public static final long NSCaseInsensitiveSearch = 1L;
    @ObjCEnumValue(enumname="NSStringCompareOptions") public static final long NSLiteralSearch = 2L;
    @ObjCEnumValue(enumname="NSStringCompareOptions") public static final long NSBackwardsSearch = 4L;
    @ObjCEnumValue(enumname="NSStringCompareOptions") public static final long NSAnchoredSearch = 8L;
    @ObjCEnumValue(enumname="NSStringCompareOptions") public static final long NSNumericSearch = 64L;
    @ObjCEnumValue(enumname="NSStringCompareOptions") public static final long NSDiacriticInsensitiveSearch = 128L;
    @ObjCEnumValue(enumname="NSStringCompareOptions") public static final long NSWidthInsensitiveSearch = 256L;
    @ObjCEnumValue(enumname="NSStringCompareOptions") public static final long NSForcedOrderingSearch = 512L;
    @ObjCEnumValue(enumname="NSStringCompareOptions") public static final long NSRegularExpressionSearch = 1024L;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSASCIIStringEncoding = 1;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSNEXTSTEPStringEncoding = 2;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSJapaneseEUCStringEncoding = 3;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSUTF8StringEncoding = 4;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSISOLatin1StringEncoding = 5;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSSymbolStringEncoding = 6;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSNonLossyASCIIStringEncoding = 7;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSShiftJISStringEncoding = 8;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSISOLatin2StringEncoding = 9;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSUnicodeStringEncoding = 10;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSWindowsCP1251StringEncoding = 11;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSWindowsCP1252StringEncoding = 12;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSWindowsCP1253StringEncoding = 13;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSWindowsCP1254StringEncoding = 14;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSWindowsCP1250StringEncoding = 15;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSISO2022JPStringEncoding = 21;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSMacOSRomanStringEncoding = 30;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSUTF16StringEncoding = 10;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSUTF16BigEndianStringEncoding = -1879047936;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSUTF16LittleEndianStringEncoding = -1811939072;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSUTF32StringEncoding = -1946156800;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSUTF32BigEndianStringEncoding = -1744830208;
    @ObjCEnumValue(enumname="NSStringEncoding") public static final int NSUTF32LittleEndianStringEncoding = -1677721344;
    @ObjCEnumValue(enumname="NSStringEncodingConversionOptions") public static final long NSStringEncodingConversionAllowLossy = 1L;
    @ObjCEnumValue(enumname="NSStringEncodingConversionOptions") public static final long NSStringEncodingConversionExternalRepresentation = 2L;
    @ObjCEnumValue(enumname="NSStringEnumerationOptions") public static final long NSStringEnumerationByLines = 0L;
    @ObjCEnumValue(enumname="NSStringEnumerationOptions") public static final long NSStringEnumerationByParagraphs = 1L;
    @ObjCEnumValue(enumname="NSStringEnumerationOptions") public static final long NSStringEnumerationByComposedCharacterSequences = 2L;
    @ObjCEnumValue(enumname="NSStringEnumerationOptions") public static final long NSStringEnumerationByWords = 3L;
    @ObjCEnumValue(enumname="NSStringEnumerationOptions") public static final long NSStringEnumerationBySentences = 4L;
    @ObjCEnumValue(enumname="NSStringEnumerationOptions") public static final long NSStringEnumerationReverse = 256L;
    @ObjCEnumValue(enumname="NSStringEnumerationOptions") public static final long NSStringEnumerationSubstringNotRequired = 512L;
    @ObjCEnumValue(enumname="NSStringEnumerationOptions") public static final long NSStringEnumerationLocalized = 1024L;
    @ObjCEnumValue(enumname="NSProprietaryStringEncoding") public static final int NSProprietaryStringEncoding = 65536;
    @ObjCEnumValue(enumname="") public static final int NSOpenStepUnicodeReservedBase = 62464;
    @ObjCEnumValue(enumname="NSDataReadingOptions") public static final long NSDataReadingMappedIfSafe = 1L;
    @ObjCEnumValue(enumname="NSDataReadingOptions") public static final long NSDataReadingUncached = 2L;
    @ObjCEnumValue(enumname="NSDataReadingOptions") public static final long NSDataReadingMappedAlways = 8L;
    @ObjCEnumValue(enumname="NSDataReadingOptions") public static final long NSDataReadingMapped = 1L;
    @ObjCEnumValue(enumname="NSDataReadingOptions") public static final long NSMappedRead = 1L;
    @ObjCEnumValue(enumname="NSDataReadingOptions") public static final long NSUncachedRead = 2L;
    @ObjCEnumValue(enumname="NSDataWritingOptions") public static final long NSDataWritingAtomic = 1L;
    @ObjCEnumValue(enumname="NSDataWritingOptions") public static final long NSDataWritingWithoutOverwriting = 2L;
    @ObjCEnumValue(enumname="NSDataWritingOptions") public static final long NSDataWritingFileProtectionNone = 268435456L;
    @ObjCEnumValue(enumname="NSDataWritingOptions") public static final long NSDataWritingFileProtectionComplete = 536870912L;
    @ObjCEnumValue(enumname="NSDataWritingOptions") public static final long NSDataWritingFileProtectionCompleteUnlessOpen = 805306368L;
    @ObjCEnumValue(enumname="NSDataWritingOptions") public static final long NSDataWritingFileProtectionCompleteUntilFirstUserAuthentication = 1073741824L;
    @ObjCEnumValue(enumname="NSDataWritingOptions") public static final long NSDataWritingFileProtectionMask = -268435456L;
    @ObjCEnumValue(enumname="NSDataWritingOptions") public static final long NSAtomicWrite = 1L;
    @ObjCEnumValue(enumname="NSDataSearchOptions") public static final long NSDataSearchBackwards = 1L;
    @ObjCEnumValue(enumname="NSDataSearchOptions") public static final long NSDataSearchAnchored = 2L;
    @ObjCEnumValue(enumname="NSDataBase64EncodingOptions") public static final long NSDataBase64Encoding64CharacterLineLength = 1L;
    @ObjCEnumValue(enumname="NSDataBase64EncodingOptions") public static final long NSDataBase64Encoding76CharacterLineLength = 2L;
    @ObjCEnumValue(enumname="NSDataBase64EncodingOptions") public static final long NSDataBase64EncodingEndLineWithCarriageReturn = 16L;
    @ObjCEnumValue(enumname="NSDataBase64EncodingOptions") public static final long NSDataBase64EncodingEndLineWithLineFeed = 32L;
    @ObjCEnumValue(enumname="NSDataBase64DecodingOptions") public static final long NSDataBase64DecodingIgnoreUnknownCharacters = 1L;
    @ObjCEnumValue(enumname="NSDateFormatterStyle") public static final long NSDateFormatterNoStyle = 0L;
    @ObjCEnumValue(enumname="NSDateFormatterStyle") public static final long NSDateFormatterShortStyle = 1L;
    @ObjCEnumValue(enumname="NSDateFormatterStyle") public static final long NSDateFormatterMediumStyle = 2L;
    @ObjCEnumValue(enumname="NSDateFormatterStyle") public static final long NSDateFormatterLongStyle = 3L;
    @ObjCEnumValue(enumname="NSDateFormatterStyle") public static final long NSDateFormatterFullStyle = 4L;
    @ObjCEnumValue(enumname="NSDateFormatterBehavior") public static final long NSDateFormatterBehaviorDefault = 0L;
    @ObjCEnumValue(enumname="NSDateFormatterBehavior") public static final long NSDateFormatterBehavior10_4 = 1040L;
    @ObjCEnumValue(enumname="NSRoundingMode") public static final long NSRoundPlain = 0L;
    @ObjCEnumValue(enumname="NSRoundingMode") public static final long NSRoundDown = 1L;
    @ObjCEnumValue(enumname="NSRoundingMode") public static final long NSRoundUp = 2L;
    @ObjCEnumValue(enumname="NSRoundingMode") public static final long NSRoundBankers = 3L;
    @ObjCEnumValue(enumname="NSCalculationError") public static final long NSCalculationNoError = 0L;
    @ObjCEnumValue(enumname="NSCalculationError") public static final long NSCalculationLossOfPrecision = 1L;
    @ObjCEnumValue(enumname="NSCalculationError") public static final long NSCalculationUnderflow = 2L;
    @ObjCEnumValue(enumname="NSCalculationError") public static final long NSCalculationOverflow = 3L;
    @ObjCEnumValue(enumname="NSCalculationError") public static final long NSCalculationDivideByZero = 4L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSApplicationDirectory = 1L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSDemoApplicationDirectory = 2L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSDeveloperApplicationDirectory = 3L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSAdminApplicationDirectory = 4L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSLibraryDirectory = 5L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSDeveloperDirectory = 6L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSUserDirectory = 7L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSDocumentationDirectory = 8L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSDocumentDirectory = 9L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSCoreServiceDirectory = 10L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSAutosavedInformationDirectory = 11L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSDesktopDirectory = 12L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSCachesDirectory = 13L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSApplicationSupportDirectory = 14L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSDownloadsDirectory = 15L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSInputMethodsDirectory = 16L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSMoviesDirectory = 17L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSMusicDirectory = 18L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSPicturesDirectory = 19L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSPrinterDescriptionDirectory = 20L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSSharedPublicDirectory = 21L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSPreferencePanesDirectory = 22L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSApplicationScriptsDirectory = 23L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSItemReplacementDirectory = 99L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSAllApplicationsDirectory = 100L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSAllLibrariesDirectory = 101L;
    @ObjCEnumValue(enumname="NSSearchPathDirectory") public static final long NSTrashDirectory = 102L;
    @ObjCEnumValue(enumname="NSSearchPathDomainMask") public static final long NSUserDomainMask = 1L;
    @ObjCEnumValue(enumname="NSSearchPathDomainMask") public static final long NSLocalDomainMask = 2L;
    @ObjCEnumValue(enumname="NSSearchPathDomainMask") public static final long NSNetworkDomainMask = 4L;
    @ObjCEnumValue(enumname="NSSearchPathDomainMask") public static final long NSSystemDomainMask = 8L;
    @ObjCEnumValue(enumname="NSSearchPathDomainMask") public static final long NSAllDomainsMask = 65535L;
    @ObjCEnumValue(enumname="NSVolumeEnumerationOptions") public static final long NSVolumeEnumerationSkipHiddenVolumes = 2L;
    @ObjCEnumValue(enumname="NSVolumeEnumerationOptions") public static final long NSVolumeEnumerationProduceFileReferenceURLs = 4L;
    @ObjCEnumValue(enumname="NSDirectoryEnumerationOptions") public static final long NSDirectoryEnumerationSkipsSubdirectoryDescendants = 1L;
    @ObjCEnumValue(enumname="NSDirectoryEnumerationOptions") public static final long NSDirectoryEnumerationSkipsPackageDescendants = 2L;
    @ObjCEnumValue(enumname="NSDirectoryEnumerationOptions") public static final long NSDirectoryEnumerationSkipsHiddenFiles = 4L;
    @ObjCEnumValue(enumname="NSFileManagerItemReplacementOptions") public static final long NSFileManagerItemReplacementUsingNewMetadataOnly = 1L;
    @ObjCEnumValue(enumname="NSFileManagerItemReplacementOptions") public static final long NSFileManagerItemReplacementWithoutDeletingBackupItem = 2L;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsStrongMemory = 0;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsOpaqueMemory = 2;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsMallocMemory = 3;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsMachVirtualMemory = 4;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsWeakMemory = 5;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsObjectPersonality = 0;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsOpaquePersonality = 256;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsObjectPointerPersonality = 512;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsCStringPersonality = 768;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsStructPersonality = 1024;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsIntegerPersonality = 1280;
    @ObjCEnumValue(enumname="NSPointerFunctionsOptions") public static final int NSPointerFunctionsCopyIn = 65536;
    @ObjCEnumValue(enumname="") public static final int NSHashTableStrongMemory = 0;
    @ObjCEnumValue(enumname="") public static final int NSHashTableCopyIn = 65536;
    @ObjCEnumValue(enumname="") public static final int NSHashTableObjectPointerPersonality = 512;
    @ObjCEnumValue(enumname="") public static final int NSHashTableWeakMemory = 5;
    @ObjCEnumValue(enumname="NSHTTPCookieAcceptPolicy") public static final long NSHTTPCookieAcceptPolicyAlways = 0L;
    @ObjCEnumValue(enumname="NSHTTPCookieAcceptPolicy") public static final long NSHTTPCookieAcceptPolicyNever = 1L;
    @ObjCEnumValue(enumname="NSHTTPCookieAcceptPolicy") public static final long NSHTTPCookieAcceptPolicyOnlyFromMainDocumentDomain = 2L;
    @ObjCEnumValue(enumname="NSJSONReadingOptions") public static final long NSJSONReadingMutableContainers = 1L;
    @ObjCEnumValue(enumname="NSJSONReadingOptions") public static final long NSJSONReadingMutableLeaves = 2L;
    @ObjCEnumValue(enumname="NSJSONReadingOptions") public static final long NSJSONReadingAllowFragments = 4L;
    @ObjCEnumValue(enumname="NSJSONWritingOptions") public static final long NSJSONWritingPrettyPrinted = 1L;
    @ObjCEnumValue(enumname="NSKeyValueObservingOptions") public static final long NSKeyValueObservingOptionNew = 1L;
    @ObjCEnumValue(enumname="NSKeyValueObservingOptions") public static final long NSKeyValueObservingOptionOld = 2L;
    @ObjCEnumValue(enumname="NSKeyValueObservingOptions") public static final long NSKeyValueObservingOptionInitial = 4L;
    @ObjCEnumValue(enumname="NSKeyValueObservingOptions") public static final long NSKeyValueObservingOptionPrior = 8L;
    @ObjCEnumValue(enumname="NSKeyValueChange") public static final long NSKeyValueChangeSetting = 1L;
    @ObjCEnumValue(enumname="NSKeyValueChange") public static final long NSKeyValueChangeInsertion = 2L;
    @ObjCEnumValue(enumname="NSKeyValueChange") public static final long NSKeyValueChangeRemoval = 3L;
    @ObjCEnumValue(enumname="NSKeyValueChange") public static final long NSKeyValueChangeReplacement = 4L;
    @ObjCEnumValue(enumname="NSKeyValueSetMutationKind") public static final long NSKeyValueUnionSetMutation = 1L;
    @ObjCEnumValue(enumname="NSKeyValueSetMutationKind") public static final long NSKeyValueMinusSetMutation = 2L;
    @ObjCEnumValue(enumname="NSKeyValueSetMutationKind") public static final long NSKeyValueIntersectSetMutation = 3L;
    @ObjCEnumValue(enumname="NSKeyValueSetMutationKind") public static final long NSKeyValueSetSetMutation = 4L;
    @ObjCEnumValue(enumname="NSPropertyListMutabilityOptions") public static final long NSPropertyListImmutable = 0L;
    @ObjCEnumValue(enumname="NSPropertyListMutabilityOptions") public static final long NSPropertyListMutableContainers = 1L;
    @ObjCEnumValue(enumname="NSPropertyListMutabilityOptions") public static final long NSPropertyListMutableContainersAndLeaves = 2L;
    @ObjCEnumValue(enumname="NSPropertyListFormat") public static final long NSPropertyListOpenStepFormat = 1L;
    @ObjCEnumValue(enumname="NSPropertyListFormat") public static final long NSPropertyListXMLFormat_v1_0 = 100L;
    @ObjCEnumValue(enumname="NSPropertyListFormat") public static final long NSPropertyListBinaryFormat_v1_0 = 200L;
    @ObjCEnumValue(enumname="NSLocaleLanguageDirection") public static final long NSLocaleLanguageDirectionUnknown = 0L;
    @ObjCEnumValue(enumname="NSLocaleLanguageDirection") public static final long NSLocaleLanguageDirectionLeftToRight = 1L;
    @ObjCEnumValue(enumname="NSLocaleLanguageDirection") public static final long NSLocaleLanguageDirectionRightToLeft = 2L;
    @ObjCEnumValue(enumname="NSLocaleLanguageDirection") public static final long NSLocaleLanguageDirectionTopToBottom = 3L;
    @ObjCEnumValue(enumname="NSLocaleLanguageDirection") public static final long NSLocaleLanguageDirectionBottomToTop = 4L;
    @ObjCEnumValue(enumname="") public static final int NSMapTableStrongMemory = 0;
    @ObjCEnumValue(enumname="") public static final int NSMapTableCopyIn = 65536;
    @ObjCEnumValue(enumname="") public static final int NSMapTableObjectPointerPersonality = 512;
    @ObjCEnumValue(enumname="") public static final int NSMapTableWeakMemory = 5;
    @ObjCEnumValue(enumname="NSPostingStyle") public static final long NSPostWhenIdle = 1L;
    @ObjCEnumValue(enumname="NSPostingStyle") public static final long NSPostASAP = 2L;
    @ObjCEnumValue(enumname="NSPostingStyle") public static final long NSPostNow = 3L;
    @ObjCEnumValue(enumname="NSNotificationCoalescing") public static final long NSNotificationNoCoalescing = 0L;
    @ObjCEnumValue(enumname="NSNotificationCoalescing") public static final long NSNotificationCoalescingOnName = 1L;
    @ObjCEnumValue(enumname="NSNotificationCoalescing") public static final long NSNotificationCoalescingOnSender = 2L;
    @ObjCEnumValue(enumname="NSNumberFormatterBehavior") public static final long NSNumberFormatterBehaviorDefault = 0L;
    @ObjCEnumValue(enumname="NSNumberFormatterBehavior") public static final long NSNumberFormatterBehavior10_4 = 1040L;
    @ObjCEnumValue(enumname="NSNumberFormatterStyle") public static final long NSNumberFormatterNoStyle = 0L;
    @ObjCEnumValue(enumname="NSNumberFormatterStyle") public static final long NSNumberFormatterDecimalStyle = 1L;
    @ObjCEnumValue(enumname="NSNumberFormatterStyle") public static final long NSNumberFormatterCurrencyStyle = 2L;
    @ObjCEnumValue(enumname="NSNumberFormatterStyle") public static final long NSNumberFormatterPercentStyle = 3L;
    @ObjCEnumValue(enumname="NSNumberFormatterStyle") public static final long NSNumberFormatterScientificStyle = 4L;
    @ObjCEnumValue(enumname="NSNumberFormatterStyle") public static final long NSNumberFormatterSpellOutStyle = 5L;
    @ObjCEnumValue(enumname="NSNumberFormatterPadPosition") public static final long NSNumberFormatterPadBeforePrefix = 0L;
    @ObjCEnumValue(enumname="NSNumberFormatterPadPosition") public static final long NSNumberFormatterPadAfterPrefix = 1L;
    @ObjCEnumValue(enumname="NSNumberFormatterPadPosition") public static final long NSNumberFormatterPadBeforeSuffix = 2L;
    @ObjCEnumValue(enumname="NSNumberFormatterPadPosition") public static final long NSNumberFormatterPadAfterSuffix = 3L;
    @ObjCEnumValue(enumname="NSNumberFormatterRoundingMode") public static final long NSNumberFormatterRoundCeiling = 0L;
    @ObjCEnumValue(enumname="NSNumberFormatterRoundingMode") public static final long NSNumberFormatterRoundFloor = 1L;
    @ObjCEnumValue(enumname="NSNumberFormatterRoundingMode") public static final long NSNumberFormatterRoundDown = 2L;
    @ObjCEnumValue(enumname="NSNumberFormatterRoundingMode") public static final long NSNumberFormatterRoundUp = 3L;
    @ObjCEnumValue(enumname="NSNumberFormatterRoundingMode") public static final long NSNumberFormatterRoundHalfEven = 4L;
    @ObjCEnumValue(enumname="NSNumberFormatterRoundingMode") public static final long NSNumberFormatterRoundHalfDown = 5L;
    @ObjCEnumValue(enumname="NSNumberFormatterRoundingMode") public static final long NSNumberFormatterRoundHalfUp = 6L;
    @ObjCEnumValue(enumname="NSOperationQueuePriority") public static final long NSOperationQueuePriorityVeryLow = -8L;
    @ObjCEnumValue(enumname="NSOperationQueuePriority") public static final long NSOperationQueuePriorityLow = -4L;
    @ObjCEnumValue(enumname="NSOperationQueuePriority") public static final long NSOperationQueuePriorityNormal = 0L;
    @ObjCEnumValue(enumname="NSOperationQueuePriority") public static final long NSOperationQueuePriorityHigh = 4L;
    @ObjCEnumValue(enumname="NSOperationQueuePriority") public static final long NSOperationQueuePriorityVeryHigh = 8L;
    @ObjCEnumValue(enumname="") public static final int NSOperationQueueDefaultMaxConcurrentOperationCount = -1;
    @ObjCEnumValue(enumname="NSMachPortRights") public static final int NSMachPortDeallocateNone = 0;
    @ObjCEnumValue(enumname="NSMachPortRights") public static final int NSMachPortDeallocateSendRight = 1;
    @ObjCEnumValue(enumname="NSMachPortRights") public static final int NSMachPortDeallocateReceiveRight = 2;
    @ObjCEnumValue(enumname="NSOperatingSystem") public static final int NSWindowsNTOperatingSystem = 1;
    @ObjCEnumValue(enumname="NSOperatingSystem") public static final int NSWindows95OperatingSystem = 2;
    @ObjCEnumValue(enumname="NSOperatingSystem") public static final int NSSolarisOperatingSystem = 3;
    @ObjCEnumValue(enumname="NSOperatingSystem") public static final int NSHPUXOperatingSystem = 4;
    @ObjCEnumValue(enumname="NSOperatingSystem") public static final int NSMACHOperatingSystem = 5;
    @ObjCEnumValue(enumname="NSOperatingSystem") public static final int NSSunOSOperatingSystem = 6;
    @ObjCEnumValue(enumname="NSOperatingSystem") public static final int NSOSF1OperatingSystem = 7;
    @ObjCEnumValue(enumname="NSActivityOptions") public static final long NSActivityIdleDisplaySleepDisabled = 1099511627776L;
    @ObjCEnumValue(enumname="NSActivityOptions") public static final long NSActivityIdleSystemSleepDisabled = 1048576L;
    @ObjCEnumValue(enumname="NSActivityOptions") public static final long NSActivitySuddenTerminationDisabled = 16384L;
    @ObjCEnumValue(enumname="NSActivityOptions") public static final long NSActivityAutomaticTerminationDisabled = 32768L;
    @ObjCEnumValue(enumname="NSActivityOptions") public static final long NSActivityUserInitiated = 16777215L;
    @ObjCEnumValue(enumname="NSActivityOptions") public static final long NSActivityUserInitiatedAllowingIdleSystemSleep = 15728639L;
    @ObjCEnumValue(enumname="NSActivityOptions") public static final long NSActivityBackground = 255L;
    @ObjCEnumValue(enumname="NSActivityOptions") public static final long NSActivityLatencyCritical = 1095216660480L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeOrthography = 1L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeSpelling = 2L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeGrammar = 4L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeDate = 8L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeAddress = 16L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeLink = 32L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeQuote = 64L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeDash = 128L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeReplacement = 256L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeCorrection = 512L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeRegularExpression = 1024L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypePhoneNumber = 2048L;
    @ObjCEnumValue(enumname="NSTextCheckingType") public static final long NSTextCheckingTypeTransitInformation = 4096L;
    @ObjCEnumValue(enumname="") public static final long NSTextCheckingAllSystemTypes = 4294967295L;
    @ObjCEnumValue(enumname="") public static final long NSTextCheckingAllCustomTypes = -4294967296L;
    @ObjCEnumValue(enumname="") public static final long NSTextCheckingAllTypes = -1L;
    @ObjCEnumValue(enumname="NSRegularExpressionOptions") public static final long NSRegularExpressionCaseInsensitive = 1L;
    @ObjCEnumValue(enumname="NSRegularExpressionOptions") public static final long NSRegularExpressionAllowCommentsAndWhitespace = 2L;
    @ObjCEnumValue(enumname="NSRegularExpressionOptions") public static final long NSRegularExpressionIgnoreMetacharacters = 4L;
    @ObjCEnumValue(enumname="NSRegularExpressionOptions") public static final long NSRegularExpressionDotMatchesLineSeparators = 8L;
    @ObjCEnumValue(enumname="NSRegularExpressionOptions") public static final long NSRegularExpressionAnchorsMatchLines = 16L;
    @ObjCEnumValue(enumname="NSRegularExpressionOptions") public static final long NSRegularExpressionUseUnixLineSeparators = 32L;
    @ObjCEnumValue(enumname="NSRegularExpressionOptions") public static final long NSRegularExpressionUseUnicodeWordBoundaries = 64L;
    @ObjCEnumValue(enumname="NSMatchingOptions") public static final long NSMatchingReportProgress = 1L;
    @ObjCEnumValue(enumname="NSMatchingOptions") public static final long NSMatchingReportCompletion = 2L;
    @ObjCEnumValue(enumname="NSMatchingOptions") public static final long NSMatchingAnchored = 4L;
    @ObjCEnumValue(enumname="NSMatchingOptions") public static final long NSMatchingWithTransparentBounds = 8L;
    @ObjCEnumValue(enumname="NSMatchingOptions") public static final long NSMatchingWithoutAnchoringBounds = 16L;
    @ObjCEnumValue(enumname="NSMatchingFlags") public static final long NSMatchingProgress = 1L;
    @ObjCEnumValue(enumname="NSMatchingFlags") public static final long NSMatchingCompleted = 2L;
    @ObjCEnumValue(enumname="NSMatchingFlags") public static final long NSMatchingHitEnd = 4L;
    @ObjCEnumValue(enumname="NSMatchingFlags") public static final long NSMatchingRequiredEnd = 8L;
    @ObjCEnumValue(enumname="NSMatchingFlags") public static final long NSMatchingInternalError = 16L;
    @ObjCEnumValue(enumname="NSStreamStatus") public static final long NSStreamStatusNotOpen = 0L;
    @ObjCEnumValue(enumname="NSStreamStatus") public static final long NSStreamStatusOpening = 1L;
    @ObjCEnumValue(enumname="NSStreamStatus") public static final long NSStreamStatusOpen = 2L;
    @ObjCEnumValue(enumname="NSStreamStatus") public static final long NSStreamStatusReading = 3L;
    @ObjCEnumValue(enumname="NSStreamStatus") public static final long NSStreamStatusWriting = 4L;
    @ObjCEnumValue(enumname="NSStreamStatus") public static final long NSStreamStatusAtEnd = 5L;
    @ObjCEnumValue(enumname="NSStreamStatus") public static final long NSStreamStatusClosed = 6L;
    @ObjCEnumValue(enumname="NSStreamStatus") public static final long NSStreamStatusError = 7L;
    @ObjCEnumValue(enumname="NSStreamEvent") public static final long NSStreamEventNone = 0L;
    @ObjCEnumValue(enumname="NSStreamEvent") public static final long NSStreamEventOpenCompleted = 1L;
    @ObjCEnumValue(enumname="NSStreamEvent") public static final long NSStreamEventHasBytesAvailable = 2L;
    @ObjCEnumValue(enumname="NSStreamEvent") public static final long NSStreamEventHasSpaceAvailable = 4L;
    @ObjCEnumValue(enumname="NSStreamEvent") public static final long NSStreamEventErrorOccurred = 8L;
    @ObjCEnumValue(enumname="NSStreamEvent") public static final long NSStreamEventEndEncountered = 16L;
    @ObjCEnumValue(enumname="NSTimeZoneNameStyle") public static final long NSTimeZoneNameStyleStandard = 0L;
    @ObjCEnumValue(enumname="NSTimeZoneNameStyle") public static final long NSTimeZoneNameStyleShortStandard = 1L;
    @ObjCEnumValue(enumname="NSTimeZoneNameStyle") public static final long NSTimeZoneNameStyleDaylightSaving = 2L;
    @ObjCEnumValue(enumname="NSTimeZoneNameStyle") public static final long NSTimeZoneNameStyleShortDaylightSaving = 3L;
    @ObjCEnumValue(enumname="NSTimeZoneNameStyle") public static final long NSTimeZoneNameStyleGeneric = 4L;
    @ObjCEnumValue(enumname="NSTimeZoneNameStyle") public static final long NSTimeZoneNameStyleShortGeneric = 5L;
    @ObjCEnumValue(enumname="NSURLBookmarkCreationOptions") public static final long NSURLBookmarkCreationPreferFileIDResolution = 256L;
    @ObjCEnumValue(enumname="NSURLBookmarkCreationOptions") public static final long NSURLBookmarkCreationMinimalBookmark = 512L;
    @ObjCEnumValue(enumname="NSURLBookmarkCreationOptions") public static final long NSURLBookmarkCreationSuitableForBookmarkFile = 1024L;
    @ObjCEnumValue(enumname="NSURLBookmarkCreationOptions") public static final long NSURLBookmarkCreationWithSecurityScope = 2048L;
    @ObjCEnumValue(enumname="NSURLBookmarkCreationOptions") public static final long NSURLBookmarkCreationSecurityScopeAllowOnlyReadAccess = 4096L;
    @ObjCEnumValue(enumname="NSURLBookmarkResolutionOptions") public static final long NSURLBookmarkResolutionWithoutUI = 256L;
    @ObjCEnumValue(enumname="NSURLBookmarkResolutionOptions") public static final long NSURLBookmarkResolutionWithoutMounting = 512L;
    @ObjCEnumValue(enumname="NSURLBookmarkResolutionOptions") public static final long NSURLBookmarkResolutionWithSecurityScope = 1024L;
    @ObjCEnumValue(enumname="NSURLCacheStoragePolicy") public static final int NSURLCacheStorageAllowed = 0;
    @ObjCEnumValue(enumname="NSURLCacheStoragePolicy") public static final int NSURLCacheStorageAllowedInMemoryOnly = 1;
    @ObjCEnumValue(enumname="NSURLCacheStoragePolicy") public static final int NSURLCacheStorageNotAllowed = 2;
    @ObjCEnumValue(enumname="NSURLCredentialPersistence") public static final long NSURLCredentialPersistenceNone = 0L;
    @ObjCEnumValue(enumname="NSURLCredentialPersistence") public static final long NSURLCredentialPersistenceForSession = 1L;
    @ObjCEnumValue(enumname="NSURLCredentialPersistence") public static final long NSURLCredentialPersistencePermanent = 2L;
    @ObjCEnumValue(enumname="NSURLCredentialPersistence") public static final long NSURLCredentialPersistenceSynchronizable = 3L;
    @ObjCEnumValue(enumname="NSURLErrorCancelledReason") public static final int NSURLErrorCancelledReasonUserForceQuitApplication = 0;
    @ObjCEnumValue(enumname="NSURLErrorCancelledReason") public static final int NSURLErrorCancelledReasonBackgroundUpdatesDisabled = 1;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorUnknown = -1;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCancelled = -999;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorBadURL = -1000;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorTimedOut = -1001;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorUnsupportedURL = -1002;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotFindHost = -1003;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotConnectToHost = -1004;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorNetworkConnectionLost = -1005;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorDNSLookupFailed = -1006;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorHTTPTooManyRedirects = -1007;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorResourceUnavailable = -1008;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorNotConnectedToInternet = -1009;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorRedirectToNonExistentLocation = -1010;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorBadServerResponse = -1011;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorUserCancelledAuthentication = -1012;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorUserAuthenticationRequired = -1013;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorZeroByteResource = -1014;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotDecodeRawData = -1015;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotDecodeContentData = -1016;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotParseResponse = -1017;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorFileDoesNotExist = -1100;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorFileIsDirectory = -1101;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorNoPermissionsToReadFile = -1102;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorDataLengthExceedsMaximum = -1103;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorSecureConnectionFailed = -1200;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorServerCertificateHasBadDate = -1201;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorServerCertificateUntrusted = -1202;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorServerCertificateHasUnknownRoot = -1203;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorServerCertificateNotYetValid = -1204;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorClientCertificateRejected = -1205;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorClientCertificateRequired = -1206;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotLoadFromNetwork = -2000;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotCreateFile = -3000;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotOpenFile = -3001;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotCloseFile = -3002;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotWriteToFile = -3003;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotRemoveFile = -3004;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCannotMoveFile = -3005;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorDownloadDecodingFailedMidStream = -3006;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorDownloadDecodingFailedToComplete = -3007;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorInternationalRoamingOff = -1018;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorCallIsActive = -1019;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorDataNotAllowed = -1020;
    @ObjCEnumValue(enumname="NSURLError") public static final int NSURLErrorRequestBodyStreamExhausted = -1021;
    @ObjCEnumValue(enumname="NSURLRequestCachePolicy") public static final int NSURLRequestUseProtocolCachePolicy = 0;
    @ObjCEnumValue(enumname="NSURLRequestCachePolicy") public static final int NSURLRequestReloadIgnoringLocalCacheData = 1;
    @ObjCEnumValue(enumname="NSURLRequestCachePolicy") public static final int NSURLRequestReloadIgnoringLocalAndRemoteCacheData = 4;
    @ObjCEnumValue(enumname="NSURLRequestCachePolicy") public static final int NSURLRequestReloadIgnoringCacheData = 1;
    @ObjCEnumValue(enumname="NSURLRequestCachePolicy") public static final int NSURLRequestReturnCacheDataElseLoad = 2;
    @ObjCEnumValue(enumname="NSURLRequestCachePolicy") public static final int NSURLRequestReturnCacheDataDontLoad = 3;
    @ObjCEnumValue(enumname="NSURLRequestCachePolicy") public static final int NSURLRequestReloadRevalidatingCacheData = 5;
    @ObjCEnumValue(enumname="NSURLRequestNetworkServiceType") public static final int NSURLNetworkServiceTypeDefault = 0;
    @ObjCEnumValue(enumname="NSURLRequestNetworkServiceType") public static final int NSURLNetworkServiceTypeVoIP = 1;
    @ObjCEnumValue(enumname="NSURLRequestNetworkServiceType") public static final int NSURLNetworkServiceTypeVideo = 2;
    @ObjCEnumValue(enumname="NSURLRequestNetworkServiceType") public static final int NSURLNetworkServiceTypeBackground = 3;
    @ObjCEnumValue(enumname="NSURLRequestNetworkServiceType") public static final int NSURLNetworkServiceTypeVoice = 4;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserInternalError = 1L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserOutOfMemoryError = 2L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserDocumentStartError = 3L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEmptyDocumentError = 4L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserPrematureDocumentEndError = 5L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserInvalidHexCharacterRefError = 6L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserInvalidDecimalCharacterRefError = 7L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserInvalidCharacterRefError = 8L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserInvalidCharacterError = 9L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserCharacterRefAtEOFError = 10L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserCharacterRefInPrologError = 11L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserCharacterRefInEpilogError = 12L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserCharacterRefInDTDError = 13L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityRefAtEOFError = 14L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityRefInPrologError = 15L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityRefInEpilogError = 16L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityRefInDTDError = 17L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserParsedEntityRefAtEOFError = 18L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserParsedEntityRefInPrologError = 19L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserParsedEntityRefInEpilogError = 20L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserParsedEntityRefInInternalSubsetError = 21L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityReferenceWithoutNameError = 22L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityReferenceMissingSemiError = 23L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserParsedEntityRefNoNameError = 24L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserParsedEntityRefMissingSemiError = 25L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserUndeclaredEntityError = 26L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserUnparsedEntityError = 28L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityIsExternalError = 29L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityIsParameterError = 30L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserUnknownEncodingError = 31L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEncodingNotSupportedError = 32L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserStringNotStartedError = 33L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserStringNotClosedError = 34L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserNamespaceDeclarationError = 35L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityNotStartedError = 36L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityNotFinishedError = 37L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserLessThanSymbolInAttributeError = 38L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserAttributeNotStartedError = 39L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserAttributeNotFinishedError = 40L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserAttributeHasNoValueError = 41L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserAttributeRedefinedError = 42L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserLiteralNotStartedError = 43L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserLiteralNotFinishedError = 44L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserCommentNotFinishedError = 45L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserProcessingInstructionNotStartedError = 46L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserProcessingInstructionNotFinishedError = 47L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserNotationNotStartedError = 48L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserNotationNotFinishedError = 49L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserAttributeListNotStartedError = 50L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserAttributeListNotFinishedError = 51L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserMixedContentDeclNotStartedError = 52L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserMixedContentDeclNotFinishedError = 53L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserElementContentDeclNotStartedError = 54L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserElementContentDeclNotFinishedError = 55L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserXMLDeclNotStartedError = 56L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserXMLDeclNotFinishedError = 57L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserConditionalSectionNotStartedError = 58L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserConditionalSectionNotFinishedError = 59L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserExternalSubsetNotFinishedError = 60L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserDOCTYPEDeclNotFinishedError = 61L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserMisplacedCDATAEndStringError = 62L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserCDATANotFinishedError = 63L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserMisplacedXMLDeclarationError = 64L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserSpaceRequiredError = 65L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserSeparatorRequiredError = 66L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserNMTOKENRequiredError = 67L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserNAMERequiredError = 68L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserPCDATARequiredError = 69L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserURIRequiredError = 70L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserPublicIdentifierRequiredError = 71L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserLTRequiredError = 72L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserGTRequiredError = 73L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserLTSlashRequiredError = 74L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEqualExpectedError = 75L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserTagNameMismatchError = 76L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserUnfinishedTagError = 77L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserStandaloneValueError = 78L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserInvalidEncodingNameError = 79L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserCommentContainsDoubleHyphenError = 80L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserInvalidEncodingError = 81L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserExternalStandaloneEntityError = 82L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserInvalidConditionalSectionError = 83L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityValueRequiredError = 84L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserNotWellBalancedError = 85L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserExtraContentError = 86L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserInvalidCharacterInEntityError = 87L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserParsedEntityRefInInternalError = 88L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityRefLoopError = 89L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserEntityBoundaryError = 90L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserInvalidURIError = 91L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserURIFragmentError = 92L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserNoDTDError = 94L;
    @ObjCEnumValue(enumname="NSXMLParserError") public static final long NSXMLParserDelegateAbortedParseError = 512L;
    @ObjCEnumValue(enumname="") public static final int NSFileNoSuchFileError = 4;
    @ObjCEnumValue(enumname="") public static final int NSFileLockingError = 255;
    @ObjCEnumValue(enumname="") public static final int NSFileReadUnknownError = 256;
    @ObjCEnumValue(enumname="") public static final int NSFileReadNoPermissionError = 257;
    @ObjCEnumValue(enumname="") public static final int NSFileReadInvalidFileNameError = 258;
    @ObjCEnumValue(enumname="") public static final int NSFileReadCorruptFileError = 259;
    @ObjCEnumValue(enumname="") public static final int NSFileReadNoSuchFileError = 260;
    @ObjCEnumValue(enumname="") public static final int NSFileReadInapplicableStringEncodingError = 261;
    @ObjCEnumValue(enumname="") public static final int NSFileReadUnsupportedSchemeError = 262;
    @ObjCEnumValue(enumname="") public static final int NSFileReadTooLargeError = 263;
    @ObjCEnumValue(enumname="") public static final int NSFileReadUnknownStringEncodingError = 264;
    @ObjCEnumValue(enumname="") public static final int NSFileWriteUnknownError = 512;
    @ObjCEnumValue(enumname="") public static final int NSFileWriteNoPermissionError = 513;
    @ObjCEnumValue(enumname="") public static final int NSFileWriteInvalidFileNameError = 514;
    @ObjCEnumValue(enumname="") public static final int NSFileWriteFileExistsError = 516;
    @ObjCEnumValue(enumname="") public static final int NSFileWriteInapplicableStringEncodingError = 517;
    @ObjCEnumValue(enumname="") public static final int NSFileWriteUnsupportedSchemeError = 518;
    @ObjCEnumValue(enumname="") public static final int NSFileWriteOutOfSpaceError = 640;
    @ObjCEnumValue(enumname="") public static final int NSFileWriteVolumeReadOnlyError = 642;
    @ObjCEnumValue(enumname="") public static final int NSKeyValueValidationError = 1024;
    @ObjCEnumValue(enumname="") public static final int NSFormattingError = 2048;
    @ObjCEnumValue(enumname="") public static final int NSUserCancelledError = 3072;
    @ObjCEnumValue(enumname="") public static final int NSFeatureUnsupportedError = 3328;
    @ObjCEnumValue(enumname="") public static final int NSExecutableNotLoadableError = 3584;
    @ObjCEnumValue(enumname="") public static final int NSExecutableArchitectureMismatchError = 3585;
    @ObjCEnumValue(enumname="") public static final int NSExecutableRuntimeMismatchError = 3586;
    @ObjCEnumValue(enumname="") public static final int NSExecutableLoadError = 3587;
    @ObjCEnumValue(enumname="") public static final int NSExecutableLinkError = 3588;
    @ObjCEnumValue(enumname="") public static final int NSFileErrorMinimum = 0;
    @ObjCEnumValue(enumname="") public static final int NSFileErrorMaximum = 1023;
    @ObjCEnumValue(enumname="") public static final int NSValidationErrorMinimum = 1024;
    @ObjCEnumValue(enumname="") public static final int NSValidationErrorMaximum = 2047;
    @ObjCEnumValue(enumname="") public static final int NSExecutableErrorMinimum = 3584;
    @ObjCEnumValue(enumname="") public static final int NSExecutableErrorMaximum = 3839;
    @ObjCEnumValue(enumname="") public static final int NSFormattingErrorMinimum = 2048;
    @ObjCEnumValue(enumname="") public static final int NSFormattingErrorMaximum = 2559;
    @ObjCEnumValue(enumname="") public static final int NSPropertyListReadCorruptError = 3840;
    @ObjCEnumValue(enumname="") public static final int NSPropertyListReadUnknownVersionError = 3841;
    @ObjCEnumValue(enumname="") public static final int NSPropertyListReadStreamError = 3842;
    @ObjCEnumValue(enumname="") public static final int NSPropertyListWriteStreamError = 3851;
    @ObjCEnumValue(enumname="") public static final int NSPropertyListErrorMinimum = 3840;
    @ObjCEnumValue(enumname="") public static final int NSPropertyListErrorMaximum = 4095;
    @ObjCEnumValue(enumname="") public static final int NSXPCConnectionInterrupted = 4097;
    @ObjCEnumValue(enumname="") public static final int NSXPCConnectionInvalid = 4099;
    @ObjCEnumValue(enumname="") public static final int NSXPCConnectionReplyInvalid = 4101;
    @ObjCEnumValue(enumname="") public static final int NSXPCConnectionErrorMinimum = 4096;
    @ObjCEnumValue(enumname="") public static final int NSXPCConnectionErrorMaximum = 4224;
    @ObjCEnumValue(enumname="") public static final int NSUbiquitousFileUnavailableError = 4353;
    @ObjCEnumValue(enumname="") public static final int NSUbiquitousFileNotUploadedDueToQuotaError = 4354;
    @ObjCEnumValue(enumname="") public static final int NSUbiquitousFileUbiquityServerNotAvailable = 4355;
    @ObjCEnumValue(enumname="") public static final int NSUbiquitousFileErrorMinimum = 4352;
    @ObjCEnumValue(enumname="") public static final int NSUbiquitousFileErrorMaximum = 4607;
    @ObjCEnumValue(enumname="NSAttributedStringEnumerationOptions") public static final long NSAttributedStringEnumerationReverse = 2L;
    @ObjCEnumValue(enumname="NSAttributedStringEnumerationOptions") public static final long NSAttributedStringEnumerationLongestEffectiveRangeNotRequired = 1048576L;
    @ObjCEnumValue(enumname="NSByteCountFormatterUnits") public static final long NSByteCountFormatterUseDefault = 0L;
    @ObjCEnumValue(enumname="NSByteCountFormatterUnits") public static final long NSByteCountFormatterUseBytes = 1L;
    @ObjCEnumValue(enumname="NSByteCountFormatterUnits") public static final long NSByteCountFormatterUseKB = 2L;
    @ObjCEnumValue(enumname="NSByteCountFormatterUnits") public static final long NSByteCountFormatterUseMB = 4L;
    @ObjCEnumValue(enumname="NSByteCountFormatterUnits") public static final long NSByteCountFormatterUseGB = 8L;
    @ObjCEnumValue(enumname="NSByteCountFormatterUnits") public static final long NSByteCountFormatterUseTB = 16L;
    @ObjCEnumValue(enumname="NSByteCountFormatterUnits") public static final long NSByteCountFormatterUsePB = 32L;
    @ObjCEnumValue(enumname="NSByteCountFormatterUnits") public static final long NSByteCountFormatterUseEB = 64L;
    @ObjCEnumValue(enumname="NSByteCountFormatterUnits") public static final long NSByteCountFormatterUseZB = 128L;
    @ObjCEnumValue(enumname="NSByteCountFormatterUnits") public static final long NSByteCountFormatterUseYBOrHigher = 65280L;
    @ObjCEnumValue(enumname="NSByteCountFormatterUnits") public static final long NSByteCountFormatterUseAll = 65535L;
    @ObjCEnumValue(enumname="NSByteCountFormatterCountStyle") public static final long NSByteCountFormatterCountStyleFile = 0L;
    @ObjCEnumValue(enumname="NSByteCountFormatterCountStyle") public static final long NSByteCountFormatterCountStyleMemory = 1L;
    @ObjCEnumValue(enumname="NSByteCountFormatterCountStyle") public static final long NSByteCountFormatterCountStyleDecimal = 2L;
    @ObjCEnumValue(enumname="NSByteCountFormatterCountStyle") public static final long NSByteCountFormatterCountStyleBinary = 3L;
    @ObjCEnumValue(enumname="NSComparisonPredicateOptions") public static final long NSCaseInsensitivePredicateOption = 1L;
    @ObjCEnumValue(enumname="NSComparisonPredicateOptions") public static final long NSDiacriticInsensitivePredicateOption = 2L;
    @ObjCEnumValue(enumname="NSComparisonPredicateOptions") public static final long NSNormalizedPredicateOption = 4L;
    @ObjCEnumValue(enumname="NSComparisonPredicateModifier") public static final long NSDirectPredicateModifier = 0L;
    @ObjCEnumValue(enumname="NSComparisonPredicateModifier") public static final long NSAllPredicateModifier = 1L;
    @ObjCEnumValue(enumname="NSComparisonPredicateModifier") public static final long NSAnyPredicateModifier = 2L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSLessThanPredicateOperatorType = 0L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSLessThanOrEqualToPredicateOperatorType = 1L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSGreaterThanPredicateOperatorType = 2L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSGreaterThanOrEqualToPredicateOperatorType = 3L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSEqualToPredicateOperatorType = 4L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSNotEqualToPredicateOperatorType = 5L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSMatchesPredicateOperatorType = 6L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSLikePredicateOperatorType = 7L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSBeginsWithPredicateOperatorType = 8L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSEndsWithPredicateOperatorType = 9L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSInPredicateOperatorType = 10L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSCustomSelectorPredicateOperatorType = 11L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSContainsPredicateOperatorType = 99L;
    @ObjCEnumValue(enumname="NSPredicateOperatorType") public static final long NSBetweenPredicateOperatorType = 100L;
    @ObjCEnumValue(enumname="NSCompoundPredicateType") public static final long NSNotPredicateType = 0L;
    @ObjCEnumValue(enumname="NSCompoundPredicateType") public static final long NSAndPredicateType = 1L;
    @ObjCEnumValue(enumname="NSCompoundPredicateType") public static final long NSOrPredicateType = 2L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSConstantValueExpressionType = 0L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSEvaluatedObjectExpressionType = 1L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSVariableExpressionType = 2L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSKeyPathExpressionType = 3L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSFunctionExpressionType = 4L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSUnionSetExpressionType = 5L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSIntersectSetExpressionType = 6L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSMinusSetExpressionType = 7L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSSubqueryExpressionType = 13L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSAggregateExpressionType = 14L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSAnyKeyExpressionType = 15L;
    @ObjCEnumValue(enumname="NSExpressionType") public static final long NSBlockExpressionType = 19L;
    @ObjCEnumValue(enumname="NSFileCoordinatorReadingOptions") public static final long NSFileCoordinatorReadingWithoutChanges = 1L;
    @ObjCEnumValue(enumname="NSFileCoordinatorReadingOptions") public static final long NSFileCoordinatorReadingResolvesSymbolicLink = 2L;
    @ObjCEnumValue(enumname="NSFileCoordinatorWritingOptions") public static final long NSFileCoordinatorWritingForDeleting = 1L;
    @ObjCEnumValue(enumname="NSFileCoordinatorWritingOptions") public static final long NSFileCoordinatorWritingForMoving = 2L;
    @ObjCEnumValue(enumname="NSFileCoordinatorWritingOptions") public static final long NSFileCoordinatorWritingForMerging = 4L;
    @ObjCEnumValue(enumname="NSFileCoordinatorWritingOptions") public static final long NSFileCoordinatorWritingForReplacing = 8L;
    @ObjCEnumValue(enumname="NSFileVersionAddingOptions") public static final long NSFileVersionAddingByMoving = 1L;
    @ObjCEnumValue(enumname="NSFileVersionReplacingOptions") public static final long NSFileVersionReplacingByMoving = 1L;
    @ObjCEnumValue(enumname="NSFileWrapperReadingOptions") public static final long NSFileWrapperReadingImmediate = 1L;
    @ObjCEnumValue(enumname="NSFileWrapperReadingOptions") public static final long NSFileWrapperReadingWithoutMapping = 2L;
    @ObjCEnumValue(enumname="NSFileWrapperWritingOptions") public static final long NSFileWrapperWritingAtomic = 1L;
    @ObjCEnumValue(enumname="NSFileWrapperWritingOptions") public static final long NSFileWrapperWritingWithNameUpdating = 2L;
    @ObjCEnumValue(enumname="NSLinguisticTaggerOptions") public static final long NSLinguisticTaggerOmitWords = 1L;
    @ObjCEnumValue(enumname="NSLinguisticTaggerOptions") public static final long NSLinguisticTaggerOmitPunctuation = 2L;
    @ObjCEnumValue(enumname="NSLinguisticTaggerOptions") public static final long NSLinguisticTaggerOmitWhitespace = 4L;
    @ObjCEnumValue(enumname="NSLinguisticTaggerOptions") public static final long NSLinguisticTaggerOmitOther = 8L;
    @ObjCEnumValue(enumname="NSLinguisticTaggerOptions") public static final long NSLinguisticTaggerJoinNames = 16L;
    @ObjCEnumValue(enumname="NSNetServicesError") public static final long NSNetServicesUnknownError = -72000L;
    @ObjCEnumValue(enumname="NSNetServicesError") public static final long NSNetServicesCollisionError = -72001L;
    @ObjCEnumValue(enumname="NSNetServicesError") public static final long NSNetServicesNotFoundError = -72002L;
    @ObjCEnumValue(enumname="NSNetServicesError") public static final long NSNetServicesActivityInProgress = -72003L;
    @ObjCEnumValue(enumname="NSNetServicesError") public static final long NSNetServicesBadArgumentError = -72004L;
    @ObjCEnumValue(enumname="NSNetServicesError") public static final long NSNetServicesCancelledError = -72005L;
    @ObjCEnumValue(enumname="NSNetServicesError") public static final long NSNetServicesInvalidError = -72006L;
    @ObjCEnumValue(enumname="NSNetServicesError") public static final long NSNetServicesTimeoutError = -72007L;
    @ObjCEnumValue(enumname="NSNetServiceOptions") public static final long NSNetServiceNoAutoRename = 1L;
    @ObjCEnumValue(enumname="NSNetServiceOptions") public static final long NSNetServiceListenForConnections = 2L;
    @ObjCEnumValue(enumname="NSUbiquitousKeyValueStoreChangeReason") public static final int NSUbiquitousKeyValueStoreServerChange = 0;
    @ObjCEnumValue(enumname="NSUbiquitousKeyValueStoreChangeReason") public static final int NSUbiquitousKeyValueStoreInitialSyncChange = 1;
    @ObjCEnumValue(enumname="NSUbiquitousKeyValueStoreChangeReason") public static final int NSUbiquitousKeyValueStoreQuotaViolationChange = 2;
    @ObjCEnumValue(enumname="NSUbiquitousKeyValueStoreChangeReason") public static final int NSUbiquitousKeyValueStoreAccountChange = 3;
    @ObjCEnumValue(enumname="") public static final int NSUndoCloseGroupingRunLoopOrdering = 350000;
    @ObjCEnumValue(enumname="NSURLSessionTaskState") public static final long NSURLSessionTaskStateRunning = 0L;
    @ObjCEnumValue(enumname="NSURLSessionTaskState") public static final long NSURLSessionTaskStateSuspended = 1L;
    @ObjCEnumValue(enumname="NSURLSessionTaskState") public static final long NSURLSessionTaskStateCanceling = 2L;
    @ObjCEnumValue(enumname="NSURLSessionTaskState") public static final long NSURLSessionTaskStateCompleted = 3L;
    @ObjCEnumValue(enumname="NSURLSessionAuthChallengeDisposition") public static final long NSURLSessionAuthChallengeUseCredential = 0L;
    @ObjCEnumValue(enumname="NSURLSessionAuthChallengeDisposition") public static final long NSURLSessionAuthChallengePerformDefaultHandling = 1L;
    @ObjCEnumValue(enumname="NSURLSessionAuthChallengeDisposition") public static final long NSURLSessionAuthChallengeCancelAuthenticationChallenge = 2L;
    @ObjCEnumValue(enumname="NSURLSessionAuthChallengeDisposition") public static final long NSURLSessionAuthChallengeRejectProtectionSpace = 3L;
    @ObjCEnumValue(enumname="NSURLSessionResponseDisposition") public static final long NSURLSessionResponseCancel = 0L;
    @ObjCEnumValue(enumname="NSURLSessionResponseDisposition") public static final long NSURLSessionResponseAllow = 1L;
    @ObjCEnumValue(enumname="NSURLSessionResponseDisposition") public static final long NSURLSessionResponseBecomeDownload = 2L;
    
    
    
    @GlobalVariable(name="NSFoundationVersionNumber")
    public static double NSFoundationVersionNumber;

    @GlobalVariable(name="NSBundleDidLoadNotification")
    public static NSString NSBundleDidLoadNotification;

    @GlobalVariable(name="NSLoadedClasses")
    public static NSString NSLoadedClasses;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSSystemClockDidChangeNotification")
    public static NSString NSSystemClockDidChangeNotification;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierGregorian")
    public static NSString NSCalendarIdentifierGregorian;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierBuddhist")
    public static NSString NSCalendarIdentifierBuddhist;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierChinese")
    public static NSString NSCalendarIdentifierChinese;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierCoptic")
    public static NSString NSCalendarIdentifierCoptic;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierEthiopicAmeteMihret")
    public static NSString NSCalendarIdentifierEthiopicAmeteMihret;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierEthiopicAmeteAlem")
    public static NSString NSCalendarIdentifierEthiopicAmeteAlem;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierHebrew")
    public static NSString NSCalendarIdentifierHebrew;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierISO8601")
    public static NSString NSCalendarIdentifierISO8601;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierIndian")
    public static NSString NSCalendarIdentifierIndian;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierIslamic")
    public static NSString NSCalendarIdentifierIslamic;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierIslamicCivil")
    public static NSString NSCalendarIdentifierIslamicCivil;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierJapanese")
    public static NSString NSCalendarIdentifierJapanese;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierPersian")
    public static NSString NSCalendarIdentifierPersian;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSCalendarIdentifierRepublicOfChina")
    public static NSString NSCalendarIdentifierRepublicOfChina;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSCalendarDayChangedNotification")
    public static NSString NSCalendarDayChangedNotification;

    @GlobalVariable(name="NSParseErrorException")
    public static NSString NSParseErrorException;

    @GlobalVariable(name="NSCharacterConversionException")
    public static NSString NSCharacterConversionException;

    @GlobalVariable(name="NSDecimalNumberExactnessException")
    public static NSString NSDecimalNumberExactnessException;

    @GlobalVariable(name="NSDecimalNumberOverflowException")
    public static NSString NSDecimalNumberOverflowException;

    @GlobalVariable(name="NSDecimalNumberUnderflowException")
    public static NSString NSDecimalNumberUnderflowException;

    @GlobalVariable(name="NSDecimalNumberDivideByZeroException")
    public static NSString NSDecimalNumberDivideByZeroException;

    @GlobalVariable(name="NSCocoaErrorDomain")
    public static NSString NSCocoaErrorDomain;

    @GlobalVariable(name="NSPOSIXErrorDomain")
    public static NSString NSPOSIXErrorDomain;

    @GlobalVariable(name="NSOSStatusErrorDomain")
    public static NSString NSOSStatusErrorDomain;

    @GlobalVariable(name="NSMachErrorDomain")
    public static NSString NSMachErrorDomain;

    @GlobalVariable(name="NSUnderlyingErrorKey")
    public static NSString NSUnderlyingErrorKey;

    @GlobalVariable(name="NSLocalizedDescriptionKey")
    public static NSString NSLocalizedDescriptionKey;

    @GlobalVariable(name="NSLocalizedFailureReasonErrorKey")
    public static NSString NSLocalizedFailureReasonErrorKey;

    @GlobalVariable(name="NSLocalizedRecoverySuggestionErrorKey")
    public static NSString NSLocalizedRecoverySuggestionErrorKey;

    @GlobalVariable(name="NSLocalizedRecoveryOptionsErrorKey")
    public static NSString NSLocalizedRecoveryOptionsErrorKey;

    @GlobalVariable(name="NSRecoveryAttempterErrorKey")
    public static NSString NSRecoveryAttempterErrorKey;

    @GlobalVariable(name="NSHelpAnchorErrorKey")
    public static NSString NSHelpAnchorErrorKey;

    @GlobalVariable(name="NSStringEncodingErrorKey")
    public static NSString NSStringEncodingErrorKey;

    @GlobalVariable(name="NSURLErrorKey")
    public static NSString NSURLErrorKey;

    @GlobalVariable(name="NSFilePathErrorKey")
    public static NSString NSFilePathErrorKey;

    @GlobalVariable(name="NSGenericException")
    public static NSString NSGenericException;

    @GlobalVariable(name="NSRangeException")
    public static NSString NSRangeException;

    @GlobalVariable(name="NSInvalidArgumentException")
    public static NSString NSInvalidArgumentException;

    @GlobalVariable(name="NSInternalInconsistencyException")
    public static NSString NSInternalInconsistencyException;

    @GlobalVariable(name="NSMallocException")
    public static NSString NSMallocException;

    @GlobalVariable(name="NSObjectInaccessibleException")
    public static NSString NSObjectInaccessibleException;

    @GlobalVariable(name="NSObjectNotAvailableException")
    public static NSString NSObjectNotAvailableException;

    @GlobalVariable(name="NSDestinationInvalidException")
    public static NSString NSDestinationInvalidException;

    @GlobalVariable(name="NSPortTimeoutException")
    public static NSString NSPortTimeoutException;

    @GlobalVariable(name="NSInvalidSendPortException")
    public static NSString NSInvalidSendPortException;

    @GlobalVariable(name="NSInvalidReceivePortException")
    public static NSString NSInvalidReceivePortException;

    @GlobalVariable(name="NSPortSendException")
    public static NSString NSPortSendException;

    @GlobalVariable(name="NSPortReceiveException")
    public static NSString NSPortReceiveException;

    @GlobalVariable(name="NSOldStyleException")
    public static NSString NSOldStyleException;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSAssertionHandlerKey")
    public static NSString NSAssertionHandlerKey;

    @GlobalVariable(name="NSFileHandleOperationException")
    public static NSString NSFileHandleOperationException;

    @GlobalVariable(name="NSFileHandleReadCompletionNotification")
    public static NSString NSFileHandleReadCompletionNotification;

    @GlobalVariable(name="NSFileHandleReadToEndOfFileCompletionNotification")
    public static NSString NSFileHandleReadToEndOfFileCompletionNotification;

    @GlobalVariable(name="NSFileHandleConnectionAcceptedNotification")
    public static NSString NSFileHandleConnectionAcceptedNotification;

    @GlobalVariable(name="NSFileHandleDataAvailableNotification")
    public static NSString NSFileHandleDataAvailableNotification;

    @GlobalVariable(name="NSFileHandleNotificationDataItem")
    public static NSString NSFileHandleNotificationDataItem;

    @GlobalVariable(name="NSFileHandleNotificationFileHandleItem")
    public static NSString NSFileHandleNotificationFileHandleItem;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 5.0.
     */
    @Deprecated
    @GlobalVariable(name="NSFileHandleNotificationMonitorModes")
    public static NSString NSFileHandleNotificationMonitorModes;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSUbiquityIdentityDidChangeNotification")
    public static NSString NSUbiquityIdentityDidChangeNotification;

    @GlobalVariable(name="NSFileType")
    public static NSString NSFileType;

    @GlobalVariable(name="NSFileTypeDirectory")
    public static NSString NSFileTypeDirectory;

    @GlobalVariable(name="NSFileTypeRegular")
    public static NSString NSFileTypeRegular;

    @GlobalVariable(name="NSFileTypeSymbolicLink")
    public static NSString NSFileTypeSymbolicLink;

    @GlobalVariable(name="NSFileTypeSocket")
    public static NSString NSFileTypeSocket;

    @GlobalVariable(name="NSFileTypeCharacterSpecial")
    public static NSString NSFileTypeCharacterSpecial;

    @GlobalVariable(name="NSFileTypeBlockSpecial")
    public static NSString NSFileTypeBlockSpecial;

    @GlobalVariable(name="NSFileTypeUnknown")
    public static NSString NSFileTypeUnknown;

    @GlobalVariable(name="NSFileSize")
    public static NSString NSFileSize;

    @GlobalVariable(name="NSFileModificationDate")
    public static NSString NSFileModificationDate;

    @GlobalVariable(name="NSFileReferenceCount")
    public static NSString NSFileReferenceCount;

    @GlobalVariable(name="NSFileDeviceIdentifier")
    public static NSString NSFileDeviceIdentifier;

    @GlobalVariable(name="NSFileOwnerAccountName")
    public static NSString NSFileOwnerAccountName;

    @GlobalVariable(name="NSFileGroupOwnerAccountName")
    public static NSString NSFileGroupOwnerAccountName;

    @GlobalVariable(name="NSFilePosixPermissions")
    public static NSString NSFilePosixPermissions;

    @GlobalVariable(name="NSFileSystemNumber")
    public static NSString NSFileSystemNumber;

    @GlobalVariable(name="NSFileSystemFileNumber")
    public static NSString NSFileSystemFileNumber;

    @GlobalVariable(name="NSFileExtensionHidden")
    public static NSString NSFileExtensionHidden;

    @GlobalVariable(name="NSFileHFSCreatorCode")
    public static NSString NSFileHFSCreatorCode;

    @GlobalVariable(name="NSFileHFSTypeCode")
    public static NSString NSFileHFSTypeCode;

    @GlobalVariable(name="NSFileImmutable")
    public static NSString NSFileImmutable;

    @GlobalVariable(name="NSFileAppendOnly")
    public static NSString NSFileAppendOnly;

    @GlobalVariable(name="NSFileCreationDate")
    public static NSString NSFileCreationDate;

    @GlobalVariable(name="NSFileOwnerAccountID")
    public static NSString NSFileOwnerAccountID;

    @GlobalVariable(name="NSFileGroupOwnerAccountID")
    public static NSString NSFileGroupOwnerAccountID;

    @GlobalVariable(name="NSFileBusy")
    public static NSString NSFileBusy;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSFileProtectionKey")
    public static NSString NSFileProtectionKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSFileProtectionNone")
    public static NSString NSFileProtectionNone;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSFileProtectionComplete")
    public static NSString NSFileProtectionComplete;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSFileProtectionCompleteUnlessOpen")
    public static NSString NSFileProtectionCompleteUnlessOpen;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSFileProtectionCompleteUntilFirstUserAuthentication")
    public static NSString NSFileProtectionCompleteUntilFirstUserAuthentication;

    @GlobalVariable(name="NSFileSystemSize")
    public static NSString NSFileSystemSize;

    @GlobalVariable(name="NSFileSystemFreeSize")
    public static NSString NSFileSystemFreeSize;

    @GlobalVariable(name="NSFileSystemNodes")
    public static NSString NSFileSystemNodes;

    @GlobalVariable(name="NSFileSystemFreeNodes")
    public static NSString NSFileSystemFreeNodes;

    @GlobalVariable(name="NSHTTPCookieName")
    public static NSString NSHTTPCookieName;

    @GlobalVariable(name="NSHTTPCookieValue")
    public static NSString NSHTTPCookieValue;

    @GlobalVariable(name="NSHTTPCookieOriginURL")
    public static NSString NSHTTPCookieOriginURL;

    @GlobalVariable(name="NSHTTPCookieVersion")
    public static NSString NSHTTPCookieVersion;

    @GlobalVariable(name="NSHTTPCookieDomain")
    public static NSString NSHTTPCookieDomain;

    @GlobalVariable(name="NSHTTPCookiePath")
    public static NSString NSHTTPCookiePath;

    @GlobalVariable(name="NSHTTPCookieSecure")
    public static NSString NSHTTPCookieSecure;

    @GlobalVariable(name="NSHTTPCookieExpires")
    public static NSString NSHTTPCookieExpires;

    @GlobalVariable(name="NSHTTPCookieComment")
    public static NSString NSHTTPCookieComment;

    @GlobalVariable(name="NSHTTPCookieCommentURL")
    public static NSString NSHTTPCookieCommentURL;

    @GlobalVariable(name="NSHTTPCookieDiscard")
    public static NSString NSHTTPCookieDiscard;

    @GlobalVariable(name="NSHTTPCookieMaximumAge")
    public static NSString NSHTTPCookieMaximumAge;

    @GlobalVariable(name="NSHTTPCookiePort")
    public static NSString NSHTTPCookiePort;

    @GlobalVariable(name="NSHTTPCookieManagerAcceptPolicyChangedNotification")
    public static NSString NSHTTPCookieManagerAcceptPolicyChangedNotification;

    @GlobalVariable(name="NSHTTPCookieManagerCookiesChangedNotification")
    public static NSString NSHTTPCookieManagerCookiesChangedNotification;

    @GlobalVariable(name="NSUndefinedKeyException")
    public static NSString NSUndefinedKeyException;

    @GlobalVariable(name="NSAverageKeyValueOperator")
    public static NSString NSAverageKeyValueOperator;

    @GlobalVariable(name="NSCountKeyValueOperator")
    public static NSString NSCountKeyValueOperator;

    @GlobalVariable(name="NSDistinctUnionOfArraysKeyValueOperator")
    public static NSString NSDistinctUnionOfArraysKeyValueOperator;

    @GlobalVariable(name="NSDistinctUnionOfObjectsKeyValueOperator")
    public static NSString NSDistinctUnionOfObjectsKeyValueOperator;

    @GlobalVariable(name="NSDistinctUnionOfSetsKeyValueOperator")
    public static NSString NSDistinctUnionOfSetsKeyValueOperator;

    @GlobalVariable(name="NSMaximumKeyValueOperator")
    public static NSString NSMaximumKeyValueOperator;

    @GlobalVariable(name="NSMinimumKeyValueOperator")
    public static NSString NSMinimumKeyValueOperator;

    @GlobalVariable(name="NSSumKeyValueOperator")
    public static NSString NSSumKeyValueOperator;

    @GlobalVariable(name="NSUnionOfArraysKeyValueOperator")
    public static NSString NSUnionOfArraysKeyValueOperator;

    @GlobalVariable(name="NSUnionOfObjectsKeyValueOperator")
    public static NSString NSUnionOfObjectsKeyValueOperator;

    @GlobalVariable(name="NSUnionOfSetsKeyValueOperator")
    public static NSString NSUnionOfSetsKeyValueOperator;

    @GlobalVariable(name="NSKeyValueChangeKindKey")
    public static NSString NSKeyValueChangeKindKey;

    @GlobalVariable(name="NSKeyValueChangeNewKey")
    public static NSString NSKeyValueChangeNewKey;

    @GlobalVariable(name="NSKeyValueChangeOldKey")
    public static NSString NSKeyValueChangeOldKey;

    @GlobalVariable(name="NSKeyValueChangeIndexesKey")
    public static NSString NSKeyValueChangeIndexesKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSKeyValueChangeNotificationIsPriorKey")
    public static NSString NSKeyValueChangeNotificationIsPriorKey;

    @GlobalVariable(name="NSInvalidArchiveOperationException")
    public static NSString NSInvalidArchiveOperationException;

    @GlobalVariable(name="NSInvalidUnarchiveOperationException")
    public static NSString NSInvalidUnarchiveOperationException;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSKeyedArchiveRootObjectKey")
    public static NSString NSKeyedArchiveRootObjectKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSCurrentLocaleDidChangeNotification")
    public static NSString NSCurrentLocaleDidChangeNotification;

    @GlobalVariable(name="NSLocaleIdentifier")
    public static NSString NSLocaleIdentifier;

    @GlobalVariable(name="NSLocaleLanguageCode")
    public static NSString NSLocaleLanguageCode;

    @GlobalVariable(name="NSLocaleCountryCode")
    public static NSString NSLocaleCountryCode;

    @GlobalVariable(name="NSLocaleScriptCode")
    public static NSString NSLocaleScriptCode;

    @GlobalVariable(name="NSLocaleVariantCode")
    public static NSString NSLocaleVariantCode;

    @GlobalVariable(name="NSLocaleExemplarCharacterSet")
    public static NSString NSLocaleExemplarCharacterSet;

    @GlobalVariable(name="NSLocaleCalendar")
    public static NSString NSLocaleCalendar;

    @GlobalVariable(name="NSLocaleCollationIdentifier")
    public static NSString NSLocaleCollationIdentifier;

    @GlobalVariable(name="NSLocaleUsesMetricSystem")
    public static NSString NSLocaleUsesMetricSystem;

    @GlobalVariable(name="NSLocaleMeasurementSystem")
    public static NSString NSLocaleMeasurementSystem;

    @GlobalVariable(name="NSLocaleDecimalSeparator")
    public static NSString NSLocaleDecimalSeparator;

    @GlobalVariable(name="NSLocaleGroupingSeparator")
    public static NSString NSLocaleGroupingSeparator;

    @GlobalVariable(name="NSLocaleCurrencySymbol")
    public static NSString NSLocaleCurrencySymbol;

    @GlobalVariable(name="NSLocaleCurrencyCode")
    public static NSString NSLocaleCurrencyCode;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSLocaleCollatorIdentifier")
    public static NSString NSLocaleCollatorIdentifier;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSLocaleQuotationBeginDelimiterKey")
    public static NSString NSLocaleQuotationBeginDelimiterKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSLocaleQuotationEndDelimiterKey")
    public static NSString NSLocaleQuotationEndDelimiterKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSLocaleAlternateQuotationBeginDelimiterKey")
    public static NSString NSLocaleAlternateQuotationBeginDelimiterKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSLocaleAlternateQuotationEndDelimiterKey")
    public static NSString NSLocaleAlternateQuotationEndDelimiterKey;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSGregorianCalendar")
    public static NSString NSGregorianCalendar;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSBuddhistCalendar")
    public static NSString NSBuddhistCalendar;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSChineseCalendar")
    public static NSString NSChineseCalendar;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSHebrewCalendar")
    public static NSString NSHebrewCalendar;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSIslamicCalendar")
    public static NSString NSIslamicCalendar;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSIslamicCivilCalendar")
    public static NSString NSIslamicCivilCalendar;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSJapaneseCalendar")
    public static NSString NSJapaneseCalendar;

    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSRepublicOfChinaCalendar")
    public static NSString NSRepublicOfChinaCalendar;

    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSPersianCalendar")
    public static NSString NSPersianCalendar;

    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSIndianCalendar")
    public static NSString NSIndianCalendar;

    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSISO8601Calendar")
    public static NSString NSISO8601Calendar;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSInvocationOperationVoidResultException")
    public static NSString NSInvocationOperationVoidResultException;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSInvocationOperationCancelledException")
    public static NSString NSInvocationOperationCancelledException;

    @GlobalVariable(name="NSPortDidBecomeInvalidNotification")
    public static NSString NSPortDidBecomeInvalidNotification;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSTextCheckingNameKey")
    public static NSString NSTextCheckingNameKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSTextCheckingJobTitleKey")
    public static NSString NSTextCheckingJobTitleKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSTextCheckingOrganizationKey")
    public static NSString NSTextCheckingOrganizationKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSTextCheckingStreetKey")
    public static NSString NSTextCheckingStreetKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSTextCheckingCityKey")
    public static NSString NSTextCheckingCityKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSTextCheckingStateKey")
    public static NSString NSTextCheckingStateKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSTextCheckingZIPKey")
    public static NSString NSTextCheckingZIPKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSTextCheckingCountryKey")
    public static NSString NSTextCheckingCountryKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSTextCheckingPhoneKey")
    public static NSString NSTextCheckingPhoneKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSTextCheckingAirlineKey")
    public static NSString NSTextCheckingAirlineKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSTextCheckingFlightKey")
    public static NSString NSTextCheckingFlightKey;

    @GlobalVariable(name="NSDefaultRunLoopMode")
    public static NSString NSDefaultRunLoopMode;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSRunLoopCommonModes")
    public static NSString NSRunLoopCommonModes;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSocketSecurityLevelKey")
    public static NSString NSStreamSocketSecurityLevelKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSocketSecurityLevelNone")
    public static NSString NSStreamSocketSecurityLevelNone;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSocketSecurityLevelSSLv2")
    public static NSString NSStreamSocketSecurityLevelSSLv2;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSocketSecurityLevelSSLv3")
    public static NSString NSStreamSocketSecurityLevelSSLv3;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSocketSecurityLevelTLSv1")
    public static NSString NSStreamSocketSecurityLevelTLSv1;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSocketSecurityLevelNegotiatedSSL")
    public static NSString NSStreamSocketSecurityLevelNegotiatedSSL;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSOCKSProxyConfigurationKey")
    public static NSString NSStreamSOCKSProxyConfigurationKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSOCKSProxyHostKey")
    public static NSString NSStreamSOCKSProxyHostKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSOCKSProxyPortKey")
    public static NSString NSStreamSOCKSProxyPortKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSOCKSProxyVersionKey")
    public static NSString NSStreamSOCKSProxyVersionKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSOCKSProxyUserKey")
    public static NSString NSStreamSOCKSProxyUserKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSOCKSProxyPasswordKey")
    public static NSString NSStreamSOCKSProxyPasswordKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSOCKSProxyVersion4")
    public static NSString NSStreamSOCKSProxyVersion4;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSOCKSProxyVersion5")
    public static NSString NSStreamSOCKSProxyVersion5;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamDataWrittenToMemoryStreamKey")
    public static NSString NSStreamDataWrittenToMemoryStreamKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamFileCurrentOffsetKey")
    public static NSString NSStreamFileCurrentOffsetKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSocketSSLErrorDomain")
    public static NSString NSStreamSocketSSLErrorDomain;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSStreamSOCKSErrorDomain")
    public static NSString NSStreamSOCKSErrorDomain;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSStreamNetworkServiceType")
    public static NSString NSStreamNetworkServiceType;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSStreamNetworkServiceTypeVoIP")
    public static NSString NSStreamNetworkServiceTypeVoIP;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSStreamNetworkServiceTypeVideo")
    public static NSString NSStreamNetworkServiceTypeVideo;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSStreamNetworkServiceTypeBackground")
    public static NSString NSStreamNetworkServiceTypeBackground;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSStreamNetworkServiceTypeVoice")
    public static NSString NSStreamNetworkServiceTypeVoice;

    @GlobalVariable(name="NSWillBecomeMultiThreadedNotification")
    public static NSString NSWillBecomeMultiThreadedNotification;

    @GlobalVariable(name="NSDidBecomeSingleThreadedNotification")
    public static NSString NSDidBecomeSingleThreadedNotification;

    @GlobalVariable(name="NSThreadWillExitNotification")
    public static NSString NSThreadWillExitNotification;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSSystemTimeZoneDidChangeNotification")
    public static NSString NSSystemTimeZoneDidChangeNotification;

    @GlobalVariable(name="NSURLFileScheme")
    public static NSString NSURLFileScheme;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLKeysOfUnsetValuesKey")
    public static NSString NSURLKeysOfUnsetValuesKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLNameKey")
    public static NSString NSURLNameKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLLocalizedNameKey")
    public static NSString NSURLLocalizedNameKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLIsRegularFileKey")
    public static NSString NSURLIsRegularFileKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLIsDirectoryKey")
    public static NSString NSURLIsDirectoryKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLIsSymbolicLinkKey")
    public static NSString NSURLIsSymbolicLinkKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLIsVolumeKey")
    public static NSString NSURLIsVolumeKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLIsPackageKey")
    public static NSString NSURLIsPackageKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLIsSystemImmutableKey")
    public static NSString NSURLIsSystemImmutableKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLIsUserImmutableKey")
    public static NSString NSURLIsUserImmutableKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLIsHiddenKey")
    public static NSString NSURLIsHiddenKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLHasHiddenExtensionKey")
    public static NSString NSURLHasHiddenExtensionKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLCreationDateKey")
    public static NSString NSURLCreationDateKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLContentAccessDateKey")
    public static NSString NSURLContentAccessDateKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLContentModificationDateKey")
    public static NSString NSURLContentModificationDateKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLAttributeModificationDateKey")
    public static NSString NSURLAttributeModificationDateKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLLinkCountKey")
    public static NSString NSURLLinkCountKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLParentDirectoryURLKey")
    public static NSString NSURLParentDirectoryURLKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeURLKey")
    public static NSString NSURLVolumeURLKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLTypeIdentifierKey")
    public static NSString NSURLTypeIdentifierKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLLocalizedTypeDescriptionKey")
    public static NSString NSURLLocalizedTypeDescriptionKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLLabelNumberKey")
    public static NSString NSURLLabelNumberKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLLabelColorKey")
    public static NSString NSURLLabelColorKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLLocalizedLabelKey")
    public static NSString NSURLLocalizedLabelKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLEffectiveIconKey")
    public static NSString NSURLEffectiveIconKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLCustomIconKey")
    public static NSString NSURLCustomIconKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLFileResourceIdentifierKey")
    public static NSString NSURLFileResourceIdentifierKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeIdentifierKey")
    public static NSString NSURLVolumeIdentifierKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLPreferredIOBlockSizeKey")
    public static NSString NSURLPreferredIOBlockSizeKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLIsReadableKey")
    public static NSString NSURLIsReadableKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLIsWritableKey")
    public static NSString NSURLIsWritableKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLIsExecutableKey")
    public static NSString NSURLIsExecutableKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLFileSecurityKey")
    public static NSString NSURLFileSecurityKey;

    /**
     * @since Available in iOS 5.1 and later.
     */
    @GlobalVariable(name="NSURLIsExcludedFromBackupKey")
    public static NSString NSURLIsExcludedFromBackupKey;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalVariable(name="NSURLPathKey")
    public static NSString NSURLPathKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLIsMountTriggerKey")
    public static NSString NSURLIsMountTriggerKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLFileResourceTypeKey")
    public static NSString NSURLFileResourceTypeKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLFileResourceTypeNamedPipe")
    public static NSString NSURLFileResourceTypeNamedPipe;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLFileResourceTypeCharacterSpecial")
    public static NSString NSURLFileResourceTypeCharacterSpecial;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLFileResourceTypeDirectory")
    public static NSString NSURLFileResourceTypeDirectory;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLFileResourceTypeBlockSpecial")
    public static NSString NSURLFileResourceTypeBlockSpecial;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLFileResourceTypeRegular")
    public static NSString NSURLFileResourceTypeRegular;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLFileResourceTypeSymbolicLink")
    public static NSString NSURLFileResourceTypeSymbolicLink;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLFileResourceTypeSocket")
    public static NSString NSURLFileResourceTypeSocket;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLFileResourceTypeUnknown")
    public static NSString NSURLFileResourceTypeUnknown;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLFileSizeKey")
    public static NSString NSURLFileSizeKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLFileAllocatedSizeKey")
    public static NSString NSURLFileAllocatedSizeKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLTotalFileSizeKey")
    public static NSString NSURLTotalFileSizeKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLTotalFileAllocatedSizeKey")
    public static NSString NSURLTotalFileAllocatedSizeKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLIsAliasFileKey")
    public static NSString NSURLIsAliasFileKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeLocalizedFormatDescriptionKey")
    public static NSString NSURLVolumeLocalizedFormatDescriptionKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeTotalCapacityKey")
    public static NSString NSURLVolumeTotalCapacityKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeAvailableCapacityKey")
    public static NSString NSURLVolumeAvailableCapacityKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeResourceCountKey")
    public static NSString NSURLVolumeResourceCountKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsPersistentIDsKey")
    public static NSString NSURLVolumeSupportsPersistentIDsKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsSymbolicLinksKey")
    public static NSString NSURLVolumeSupportsSymbolicLinksKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsHardLinksKey")
    public static NSString NSURLVolumeSupportsHardLinksKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsJournalingKey")
    public static NSString NSURLVolumeSupportsJournalingKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeIsJournalingKey")
    public static NSString NSURLVolumeIsJournalingKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsSparseFilesKey")
    public static NSString NSURLVolumeSupportsSparseFilesKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsZeroRunsKey")
    public static NSString NSURLVolumeSupportsZeroRunsKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsCaseSensitiveNamesKey")
    public static NSString NSURLVolumeSupportsCaseSensitiveNamesKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsCasePreservedNamesKey")
    public static NSString NSURLVolumeSupportsCasePreservedNamesKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsRootDirectoryDatesKey")
    public static NSString NSURLVolumeSupportsRootDirectoryDatesKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsVolumeSizesKey")
    public static NSString NSURLVolumeSupportsVolumeSizesKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsRenamingKey")
    public static NSString NSURLVolumeSupportsRenamingKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsAdvisoryFileLockingKey")
    public static NSString NSURLVolumeSupportsAdvisoryFileLockingKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeSupportsExtendedSecurityKey")
    public static NSString NSURLVolumeSupportsExtendedSecurityKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeIsBrowsableKey")
    public static NSString NSURLVolumeIsBrowsableKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeMaximumFileSizeKey")
    public static NSString NSURLVolumeMaximumFileSizeKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeIsEjectableKey")
    public static NSString NSURLVolumeIsEjectableKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeIsRemovableKey")
    public static NSString NSURLVolumeIsRemovableKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeIsInternalKey")
    public static NSString NSURLVolumeIsInternalKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeIsAutomountedKey")
    public static NSString NSURLVolumeIsAutomountedKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeIsLocalKey")
    public static NSString NSURLVolumeIsLocalKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeIsReadOnlyKey")
    public static NSString NSURLVolumeIsReadOnlyKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeCreationDateKey")
    public static NSString NSURLVolumeCreationDateKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeURLForRemountingKey")
    public static NSString NSURLVolumeURLForRemountingKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeUUIDStringKey")
    public static NSString NSURLVolumeUUIDStringKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeNameKey")
    public static NSString NSURLVolumeNameKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLVolumeLocalizedNameKey")
    public static NSString NSURLVolumeLocalizedNameKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLIsUbiquitousItemKey")
    public static NSString NSURLIsUbiquitousItemKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLUbiquitousItemHasUnresolvedConflictsKey")
    public static NSString NSURLUbiquitousItemHasUnresolvedConflictsKey;

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSURLUbiquitousItemIsDownloadedKey")
    public static NSString NSURLUbiquitousItemIsDownloadedKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLUbiquitousItemIsDownloadingKey")
    public static NSString NSURLUbiquitousItemIsDownloadingKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLUbiquitousItemIsUploadedKey")
    public static NSString NSURLUbiquitousItemIsUploadedKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSURLUbiquitousItemIsUploadingKey")
    public static NSString NSURLUbiquitousItemIsUploadingKey;

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalVariable(name="NSURLUbiquitousItemPercentDownloadedKey")
    public static NSString NSURLUbiquitousItemPercentDownloadedKey;

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalVariable(name="NSURLUbiquitousItemPercentUploadedKey")
    public static NSString NSURLUbiquitousItemPercentUploadedKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSURLUbiquitousItemDownloadingStatusKey")
    public static NSString NSURLUbiquitousItemDownloadingStatusKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSURLUbiquitousItemDownloadingErrorKey")
    public static NSString NSURLUbiquitousItemDownloadingErrorKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSURLUbiquitousItemUploadingErrorKey")
    public static NSString NSURLUbiquitousItemUploadingErrorKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSURLUbiquitousItemDownloadingStatusNotDownloaded")
    public static NSString NSURLUbiquitousItemDownloadingStatusNotDownloaded;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSURLUbiquitousItemDownloadingStatusDownloaded")
    public static NSString NSURLUbiquitousItemDownloadingStatusDownloaded;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSURLUbiquitousItemDownloadingStatusCurrent")
    public static NSString NSURLUbiquitousItemDownloadingStatusCurrent;

    @GlobalVariable(name="NSURLCredentialStorageChangedNotification")
    public static NSString NSURLCredentialStorageChangedNotification;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSURLCredentialStorageRemoveSynchronizableCredentials")
    public static NSString NSURLCredentialStorageRemoveSynchronizableCredentials;

    @GlobalVariable(name="NSURLErrorDomain")
    public static NSString NSURLErrorDomain;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLErrorFailingURLErrorKey")
    public static NSString NSURLErrorFailingURLErrorKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLErrorFailingURLStringErrorKey")
    public static NSString NSURLErrorFailingURLStringErrorKey;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 4.0.
     */
    @Deprecated
    @GlobalVariable(name="NSErrorFailingURLStringKey")
    public static NSString NSErrorFailingURLStringKey;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalVariable(name="NSURLErrorFailingURLPeerTrustErrorKey")
    public static NSString NSURLErrorFailingURLPeerTrustErrorKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSURLErrorBackgroundTaskCancelledReasonKey")
    public static NSString NSURLErrorBackgroundTaskCancelledReasonKey;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSURLProtectionSpaceHTTP")
    public static NSString NSURLProtectionSpaceHTTP;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSURLProtectionSpaceHTTPS")
    public static NSString NSURLProtectionSpaceHTTPS;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSURLProtectionSpaceFTP")
    public static NSString NSURLProtectionSpaceFTP;

    @GlobalVariable(name="NSURLProtectionSpaceHTTPProxy")
    public static NSString NSURLProtectionSpaceHTTPProxy;

    @GlobalVariable(name="NSURLProtectionSpaceHTTPSProxy")
    public static NSString NSURLProtectionSpaceHTTPSProxy;

    @GlobalVariable(name="NSURLProtectionSpaceFTPProxy")
    public static NSString NSURLProtectionSpaceFTPProxy;

    @GlobalVariable(name="NSURLProtectionSpaceSOCKSProxy")
    public static NSString NSURLProtectionSpaceSOCKSProxy;

    @GlobalVariable(name="NSURLAuthenticationMethodDefault")
    public static NSString NSURLAuthenticationMethodDefault;

    @GlobalVariable(name="NSURLAuthenticationMethodHTTPBasic")
    public static NSString NSURLAuthenticationMethodHTTPBasic;

    @GlobalVariable(name="NSURLAuthenticationMethodHTTPDigest")
    public static NSString NSURLAuthenticationMethodHTTPDigest;

    @GlobalVariable(name="NSURLAuthenticationMethodHTMLForm")
    public static NSString NSURLAuthenticationMethodHTMLForm;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSURLAuthenticationMethodNTLM")
    public static NSString NSURLAuthenticationMethodNTLM;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSURLAuthenticationMethodNegotiate")
    public static NSString NSURLAuthenticationMethodNegotiate;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSURLAuthenticationMethodClientCertificate")
    public static NSString NSURLAuthenticationMethodClientCertificate;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSURLAuthenticationMethodServerTrust")
    public static NSString NSURLAuthenticationMethodServerTrust;

    @GlobalVariable(name="NSGlobalDomain")
    public static NSString NSGlobalDomain;

    @GlobalVariable(name="NSArgumentDomain")
    public static NSString NSArgumentDomain;

    @GlobalVariable(name="NSRegistrationDomain")
    public static NSString NSRegistrationDomain;

    @GlobalVariable(name="NSUserDefaultsDidChangeNotification")
    public static NSString NSUserDefaultsDidChangeNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSNegateBooleanTransformerName")
    public static NSString NSNegateBooleanTransformerName;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSIsNilTransformerName")
    public static NSString NSIsNilTransformerName;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSIsNotNilTransformerName")
    public static NSString NSIsNotNilTransformerName;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSUnarchiveFromDataTransformerName")
    public static NSString NSUnarchiveFromDataTransformerName;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSKeyedUnarchiveFromDataTransformerName")
    public static NSString NSKeyedUnarchiveFromDataTransformerName;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalVariable(name="NSXMLParserErrorDomain")
    public static NSString NSXMLParserErrorDomain;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagSchemeTokenType")
    public static NSString NSLinguisticTagSchemeTokenType;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagSchemeLexicalClass")
    public static NSString NSLinguisticTagSchemeLexicalClass;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagSchemeNameType")
    public static NSString NSLinguisticTagSchemeNameType;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagSchemeNameTypeOrLexicalClass")
    public static NSString NSLinguisticTagSchemeNameTypeOrLexicalClass;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagSchemeLemma")
    public static NSString NSLinguisticTagSchemeLemma;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagSchemeLanguage")
    public static NSString NSLinguisticTagSchemeLanguage;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagSchemeScript")
    public static NSString NSLinguisticTagSchemeScript;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagWord")
    public static NSString NSLinguisticTagWord;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagPunctuation")
    public static NSString NSLinguisticTagPunctuation;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagWhitespace")
    public static NSString NSLinguisticTagWhitespace;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagOther")
    public static NSString NSLinguisticTagOther;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagNoun")
    public static NSString NSLinguisticTagNoun;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagVerb")
    public static NSString NSLinguisticTagVerb;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagAdjective")
    public static NSString NSLinguisticTagAdjective;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagAdverb")
    public static NSString NSLinguisticTagAdverb;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagPronoun")
    public static NSString NSLinguisticTagPronoun;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagDeterminer")
    public static NSString NSLinguisticTagDeterminer;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagParticle")
    public static NSString NSLinguisticTagParticle;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagPreposition")
    public static NSString NSLinguisticTagPreposition;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagNumber")
    public static NSString NSLinguisticTagNumber;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagConjunction")
    public static NSString NSLinguisticTagConjunction;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagInterjection")
    public static NSString NSLinguisticTagInterjection;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagClassifier")
    public static NSString NSLinguisticTagClassifier;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagIdiom")
    public static NSString NSLinguisticTagIdiom;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagOtherWord")
    public static NSString NSLinguisticTagOtherWord;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagSentenceTerminator")
    public static NSString NSLinguisticTagSentenceTerminator;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagOpenQuote")
    public static NSString NSLinguisticTagOpenQuote;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagCloseQuote")
    public static NSString NSLinguisticTagCloseQuote;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagOpenParenthesis")
    public static NSString NSLinguisticTagOpenParenthesis;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagCloseParenthesis")
    public static NSString NSLinguisticTagCloseParenthesis;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagWordJoiner")
    public static NSString NSLinguisticTagWordJoiner;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagDash")
    public static NSString NSLinguisticTagDash;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagOtherPunctuation")
    public static NSString NSLinguisticTagOtherPunctuation;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagParagraphBreak")
    public static NSString NSLinguisticTagParagraphBreak;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagOtherWhitespace")
    public static NSString NSLinguisticTagOtherWhitespace;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagPersonalName")
    public static NSString NSLinguisticTagPersonalName;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagPlaceName")
    public static NSString NSLinguisticTagPlaceName;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSLinguisticTagOrganizationName")
    public static NSString NSLinguisticTagOrganizationName;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataItemFSNameKey")
    public static NSString NSMetadataItemFSNameKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataItemDisplayNameKey")
    public static NSString NSMetadataItemDisplayNameKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataItemURLKey")
    public static NSString NSMetadataItemURLKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataItemPathKey")
    public static NSString NSMetadataItemPathKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataItemFSSizeKey")
    public static NSString NSMetadataItemFSSizeKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataItemFSCreationDateKey")
    public static NSString NSMetadataItemFSCreationDateKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataItemFSContentChangeDateKey")
    public static NSString NSMetadataItemFSContentChangeDateKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataItemIsUbiquitousKey")
    public static NSString NSMetadataItemIsUbiquitousKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemHasUnresolvedConflictsKey")
    public static NSString NSMetadataUbiquitousItemHasUnresolvedConflictsKey;

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalVariable(name="NSMetadataUbiquitousItemIsDownloadedKey")
    public static NSString NSMetadataUbiquitousItemIsDownloadedKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemDownloadingStatusKey")
    public static NSString NSMetadataUbiquitousItemDownloadingStatusKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemDownloadingStatusNotDownloaded")
    public static NSString NSMetadataUbiquitousItemDownloadingStatusNotDownloaded;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemDownloadingStatusDownloaded")
    public static NSString NSMetadataUbiquitousItemDownloadingStatusDownloaded;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemDownloadingStatusCurrent")
    public static NSString NSMetadataUbiquitousItemDownloadingStatusCurrent;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemIsDownloadingKey")
    public static NSString NSMetadataUbiquitousItemIsDownloadingKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemIsUploadedKey")
    public static NSString NSMetadataUbiquitousItemIsUploadedKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemIsUploadingKey")
    public static NSString NSMetadataUbiquitousItemIsUploadingKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemPercentDownloadedKey")
    public static NSString NSMetadataUbiquitousItemPercentDownloadedKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemPercentUploadedKey")
    public static NSString NSMetadataUbiquitousItemPercentUploadedKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemDownloadingErrorKey")
    public static NSString NSMetadataUbiquitousItemDownloadingErrorKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSMetadataUbiquitousItemUploadingErrorKey")
    public static NSString NSMetadataUbiquitousItemUploadingErrorKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataQueryDidStartGatheringNotification")
    public static NSString NSMetadataQueryDidStartGatheringNotification;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataQueryGatheringProgressNotification")
    public static NSString NSMetadataQueryGatheringProgressNotification;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataQueryDidFinishGatheringNotification")
    public static NSString NSMetadataQueryDidFinishGatheringNotification;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataQueryDidUpdateNotification")
    public static NSString NSMetadataQueryDidUpdateNotification;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSMetadataQueryUpdateAddedItemsKey")
    public static NSString NSMetadataQueryUpdateAddedItemsKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSMetadataQueryUpdateChangedItemsKey")
    public static NSString NSMetadataQueryUpdateChangedItemsKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSMetadataQueryUpdateRemovedItemsKey")
    public static NSString NSMetadataQueryUpdateRemovedItemsKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataQueryResultContentRelevanceAttribute")
    public static NSString NSMetadataQueryResultContentRelevanceAttribute;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataQueryUbiquitousDocumentsScope")
    public static NSString NSMetadataQueryUbiquitousDocumentsScope;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSMetadataQueryUbiquitousDataScope")
    public static NSString NSMetadataQueryUbiquitousDataScope;

    @GlobalVariable(name="NSNetServicesErrorCode")
    public static NSString NSNetServicesErrorCode;

    @GlobalVariable(name="NSNetServicesErrorDomain")
    public static NSString NSNetServicesErrorDomain;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSProgressEstimatedTimeRemainingKey")
    public static NSString NSProgressEstimatedTimeRemainingKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSProgressThroughputKey")
    public static NSString NSProgressThroughputKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSProgressKindFile")
    public static NSString NSProgressKindFile;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSProgressFileOperationKindKey")
    public static NSString NSProgressFileOperationKindKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSProgressFileOperationKindDownloading")
    public static NSString NSProgressFileOperationKindDownloading;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSProgressFileOperationKindDecompressingAfterDownloading")
    public static NSString NSProgressFileOperationKindDecompressingAfterDownloading;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSProgressFileOperationKindReceiving")
    public static NSString NSProgressFileOperationKindReceiving;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSProgressFileOperationKindCopying")
    public static NSString NSProgressFileOperationKindCopying;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSProgressFileURLKey")
    public static NSString NSProgressFileURLKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSProgressFileTotalCountKey")
    public static NSString NSProgressFileTotalCountKey;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSProgressFileCompletedCountKey")
    public static NSString NSProgressFileCompletedCountKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSUbiquitousKeyValueStoreDidChangeExternallyNotification")
    public static NSString NSUbiquitousKeyValueStoreDidChangeExternallyNotification;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSUbiquitousKeyValueStoreChangeReasonKey")
    public static NSString NSUbiquitousKeyValueStoreChangeReasonKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSUbiquitousKeyValueStoreChangedKeysKey")
    public static NSString NSUbiquitousKeyValueStoreChangedKeysKey;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSUndoManagerGroupIsDiscardableKey")
    public static NSString NSUndoManagerGroupIsDiscardableKey;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSUndoManagerCheckpointNotification")
    public static NSString NSUndoManagerCheckpointNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSUndoManagerWillUndoChangeNotification")
    public static NSString NSUndoManagerWillUndoChangeNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSUndoManagerWillRedoChangeNotification")
    public static NSString NSUndoManagerWillRedoChangeNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSUndoManagerDidUndoChangeNotification")
    public static NSString NSUndoManagerDidUndoChangeNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSUndoManagerDidRedoChangeNotification")
    public static NSString NSUndoManagerDidRedoChangeNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSUndoManagerDidOpenUndoGroupNotification")
    public static NSString NSUndoManagerDidOpenUndoGroupNotification;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalVariable(name="NSUndoManagerWillCloseUndoGroupNotification")
    public static NSString NSUndoManagerWillCloseUndoGroupNotification;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalVariable(name="NSUndoManagerDidCloseUndoGroupNotification")
    public static NSString NSUndoManagerDidCloseUndoGroupNotification;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSURLSessionTransferSizeUnknown")
    public static @LongLong long NSURLSessionTransferSizeUnknown;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalVariable(name="NSURLSessionDownloadTaskResumeData")
    public static NSString NSURLSessionDownloadTaskResumeData;

    
    @GlobalFunction(name="NSStringFromSelector")
    public static native NSString NSStringFromSelector(ObjCSelector aSelector);

    @GlobalFunction(name="NSSelectorFromString")
    public static native ObjCSelector NSSelectorFromString(NSString aSelectorName);

    @GlobalFunction(name="NSStringFromClass")
    public static native NSString NSStringFromClass(ObjCClass aClass);

    @GlobalFunction(name="NSClassFromString")
    public static native ObjCClass NSClassFromString(NSString aClassName);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction(name="NSStringFromProtocol")
    public static native NSString NSStringFromProtocol(ObjCProtocol proto);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction(name="NSProtocolFromString")
    public static native ObjCProtocol NSProtocolFromString(NSString namestr);

    @GlobalFunction(name="NSGetSizeAndAlignment")
    public static native byte[] NSGetSizeAndAlignment(byte[] typePtr, @NSUInteger long[] sizep, @NSUInteger long[] alignp);

    @GlobalFunction(name="NSLog")
    public static native void NSLog(NSString format);

    @GlobalFunction(name="NSLogv")
    public static native void NSLogv(NSString format, NSObject... args);

    @GlobalFunction(name="NSDefaultMallocZone")
    public static native NSZone NSDefaultMallocZone();

    @GlobalFunction(name="NSCreateZone")
    public static native NSZone NSCreateZone(@NSUInteger long startSize, @NSUInteger long granularity, boolean canFree);

    @GlobalFunction(name="NSRecycleZone")
    public static native void NSRecycleZone(NSZone zone);

    @GlobalFunction(name="NSSetZoneName")
    public static native void NSSetZoneName(NSZone zone, NSString name);

    @GlobalFunction(name="NSZoneName")
    public static native NSString NSZoneName(NSZone zone);

    @GlobalFunction(name="NSZoneFromPointer")
    public static native NSZone NSZoneFromPointer(@VoidPointer() Object ptr);

    @GlobalFunction(name="NSZoneMalloc")
    public static native @VoidPointer() Object NSZoneMalloc(NSZone zone, @NSUInteger long size);

    @GlobalFunction(name="NSZoneCalloc")
    public static native @VoidPointer() Object NSZoneCalloc(NSZone zone, @NSUInteger long numElems, @NSUInteger long byteSize);

    @GlobalFunction(name="NSZoneRealloc")
    public static native @VoidPointer() Object NSZoneRealloc(NSZone zone, @VoidPointer() Object ptr, @NSUInteger long size);

    @GlobalFunction(name="NSZoneFree")
    public static native void NSZoneFree(NSZone zone, @VoidPointer() Object ptr);

    @GlobalFunction(name="NSPageSize")
    public static native @NSUInteger long NSPageSize();

    @GlobalFunction(name="NSLogPageSize")
    public static native @NSUInteger long NSLogPageSize();

    @GlobalFunction(name="NSRoundUpToMultipleOfPageSize")
    public static native @NSUInteger long NSRoundUpToMultipleOfPageSize(@NSUInteger long bytes);

    @GlobalFunction(name="NSRoundDownToMultipleOfPageSize")
    public static native @NSUInteger long NSRoundDownToMultipleOfPageSize(@NSUInteger long bytes);

    @GlobalFunction(name="NSAllocateMemoryPages")
    public static native @VoidPointer() Object NSAllocateMemoryPages(@NSUInteger long bytes);

    @GlobalFunction(name="NSDeallocateMemoryPages")
    public static native void NSDeallocateMemoryPages(@VoidPointer() Object ptr, @NSUInteger long bytes);

    @GlobalFunction(name="NSCopyMemoryPages")
    public static native void NSCopyMemoryPages(@VoidPointer() Object source, @VoidPointer() Object dest, @NSUInteger long bytes);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalFunction(name="NSRealMemoryAvailable")
    public static native @NSUInteger long NSRealMemoryAvailable();

    @GlobalFunction(name="NSAllocateObject")
    public static native NSObject NSAllocateObject(ObjCClass aClass, @NSUInteger long extraBytes, NSZone zone);

    @GlobalFunction(name="NSDeallocateObject")
    public static native void NSDeallocateObject(NSObject object);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @GlobalFunction(name="NSCopyObject")
    public static native NSObject NSCopyObject(NSObject object, @NSUInteger long extraBytes, NSZone zone);

    @GlobalFunction(name="NSShouldRetainWithZone")
    public static native boolean NSShouldRetainWithZone(NSObject anObject, NSZone requestedZone);

    @GlobalFunction(name="NSIncrementExtraRefCount")
    public static native void NSIncrementExtraRefCount(NSObject object);

    @GlobalFunction(name="NSDecrementExtraRefCountWasZero")
    public static native boolean NSDecrementExtraRefCountWasZero(NSObject object);

    @GlobalFunction(name="NSExtraRefCount")
    public static native @NSUInteger long NSExtraRefCount(NSObject object);

    @InlineFunction(name="NSMakeRange")
    @GlobalFunction(name="NSMakeRange")
    public static native @ObjCByValue NSRange NSMakeRange(@NSUInteger long loc, @NSUInteger long len);

    @InlineFunction(name="NSMaxRange")
    @GlobalFunction(name="NSMaxRange")
    public static native @NSUInteger long NSMaxRange(@ObjCByValue NSRange range);

    @InlineFunction(name="NSLocationInRange")
    @GlobalFunction(name="NSLocationInRange")
    public static native boolean NSLocationInRange(@NSUInteger long loc, @ObjCByValue NSRange range);

    @InlineFunction(name="NSEqualRanges")
    @GlobalFunction(name="NSEqualRanges")
    public static native boolean NSEqualRanges(@ObjCByValue NSRange range1, @ObjCByValue NSRange range2);

    @GlobalFunction(name="NSUnionRange")
    public static native @ObjCByValue NSRange NSUnionRange(@ObjCByValue NSRange range1, @ObjCByValue NSRange range2);

    @GlobalFunction(name="NSIntersectionRange")
    public static native @ObjCByValue NSRange NSIntersectionRange(@ObjCByValue NSRange range1, @ObjCByValue NSRange range2);

    @GlobalFunction(name="NSStringFromRange")
    public static native NSString NSStringFromRange(@ObjCByValue NSRange range);

    @GlobalFunction(name="NSRangeFromString")
    public static native @ObjCByValue NSRange NSRangeFromString(NSString aString);

    @InlineFunction(name="NSHostByteOrder")
    @GlobalFunction(name="NSHostByteOrder")
    public static native long NSHostByteOrder();

    @InlineFunction(name="NSSwapShort")
    @GlobalFunction(name="NSSwapShort")
    public static native @Unsigned short NSSwapShort(@Unsigned short inv);

    @InlineFunction(name="NSSwapInt")
    @GlobalFunction(name="NSSwapInt")
    public static native @Unsigned int NSSwapInt(@Unsigned int inv);

    @InlineFunction(name="NSSwapLong")
    @GlobalFunction(name="NSSwapLong")
    public static native @Unsigned long NSSwapLong(@Unsigned long inv);

    @InlineFunction(name="NSSwapLongLong")
    @GlobalFunction(name="NSSwapLongLong")
    public static native @Unsigned @LongLong long NSSwapLongLong(@Unsigned @LongLong long inv);

    @InlineFunction(name="NSSwapBigShortToHost")
    @GlobalFunction(name="NSSwapBigShortToHost")
    public static native @Unsigned short NSSwapBigShortToHost(@Unsigned short x);

    @InlineFunction(name="NSSwapBigIntToHost")
    @GlobalFunction(name="NSSwapBigIntToHost")
    public static native @Unsigned int NSSwapBigIntToHost(@Unsigned int x);

    @InlineFunction(name="NSSwapBigLongToHost")
    @GlobalFunction(name="NSSwapBigLongToHost")
    public static native @Unsigned long NSSwapBigLongToHost(@Unsigned long x);

    @InlineFunction(name="NSSwapBigLongLongToHost")
    @GlobalFunction(name="NSSwapBigLongLongToHost")
    public static native @Unsigned @LongLong long NSSwapBigLongLongToHost(@Unsigned @LongLong long x);

    @InlineFunction(name="NSSwapHostShortToBig")
    @GlobalFunction(name="NSSwapHostShortToBig")
    public static native @Unsigned short NSSwapHostShortToBig(@Unsigned short x);

    @InlineFunction(name="NSSwapHostIntToBig")
    @GlobalFunction(name="NSSwapHostIntToBig")
    public static native @Unsigned int NSSwapHostIntToBig(@Unsigned int x);

    @InlineFunction(name="NSSwapHostLongToBig")
    @GlobalFunction(name="NSSwapHostLongToBig")
    public static native @Unsigned long NSSwapHostLongToBig(@Unsigned long x);

    @InlineFunction(name="NSSwapHostLongLongToBig")
    @GlobalFunction(name="NSSwapHostLongLongToBig")
    public static native @Unsigned @LongLong long NSSwapHostLongLongToBig(@Unsigned @LongLong long x);

    @InlineFunction(name="NSSwapLittleShortToHost")
    @GlobalFunction(name="NSSwapLittleShortToHost")
    public static native @Unsigned short NSSwapLittleShortToHost(@Unsigned short x);

    @InlineFunction(name="NSSwapLittleIntToHost")
    @GlobalFunction(name="NSSwapLittleIntToHost")
    public static native @Unsigned int NSSwapLittleIntToHost(@Unsigned int x);

    @InlineFunction(name="NSSwapLittleLongToHost")
    @GlobalFunction(name="NSSwapLittleLongToHost")
    public static native @Unsigned long NSSwapLittleLongToHost(@Unsigned long x);

    @InlineFunction(name="NSSwapLittleLongLongToHost")
    @GlobalFunction(name="NSSwapLittleLongLongToHost")
    public static native @Unsigned @LongLong long NSSwapLittleLongLongToHost(@Unsigned @LongLong long x);

    @InlineFunction(name="NSSwapHostShortToLittle")
    @GlobalFunction(name="NSSwapHostShortToLittle")
    public static native @Unsigned short NSSwapHostShortToLittle(@Unsigned short x);

    @InlineFunction(name="NSSwapHostIntToLittle")
    @GlobalFunction(name="NSSwapHostIntToLittle")
    public static native @Unsigned int NSSwapHostIntToLittle(@Unsigned int x);

    @InlineFunction(name="NSSwapHostLongToLittle")
    @GlobalFunction(name="NSSwapHostLongToLittle")
    public static native @Unsigned long NSSwapHostLongToLittle(@Unsigned long x);

    @InlineFunction(name="NSSwapHostLongLongToLittle")
    @GlobalFunction(name="NSSwapHostLongLongToLittle")
    public static native @Unsigned @LongLong long NSSwapHostLongLongToLittle(@Unsigned @LongLong long x);

    @InlineFunction(name="NSConvertHostFloatToSwapped")
    @GlobalFunction(name="NSConvertHostFloatToSwapped")
    public static native @ObjCByValue NSSwappedFloat NSConvertHostFloatToSwapped(float x);

    @InlineFunction(name="NSConvertSwappedFloatToHost")
    @GlobalFunction(name="NSConvertSwappedFloatToHost")
    public static native float NSConvertSwappedFloatToHost(@ObjCByValue NSSwappedFloat x);

    @InlineFunction(name="NSConvertHostDoubleToSwapped")
    @GlobalFunction(name="NSConvertHostDoubleToSwapped")
    public static native @ObjCByValue NSSwappedDouble NSConvertHostDoubleToSwapped(double x);

    @InlineFunction(name="NSConvertSwappedDoubleToHost")
    @GlobalFunction(name="NSConvertSwappedDoubleToHost")
    public static native double NSConvertSwappedDoubleToHost(@ObjCByValue NSSwappedDouble x);

    @InlineFunction(name="NSSwapFloat")
    @GlobalFunction(name="NSSwapFloat")
    public static native @ObjCByValue NSSwappedFloat NSSwapFloat(@ObjCByValue NSSwappedFloat x);

    @InlineFunction(name="NSSwapDouble")
    @GlobalFunction(name="NSSwapDouble")
    public static native @ObjCByValue NSSwappedDouble NSSwapDouble(@ObjCByValue NSSwappedDouble x);

    @InlineFunction(name="NSSwapBigDoubleToHost")
    @GlobalFunction(name="NSSwapBigDoubleToHost")
    public static native double NSSwapBigDoubleToHost(@ObjCByValue NSSwappedDouble x);

    @InlineFunction(name="NSSwapBigFloatToHost")
    @GlobalFunction(name="NSSwapBigFloatToHost")
    public static native float NSSwapBigFloatToHost(@ObjCByValue NSSwappedFloat x);

    @InlineFunction(name="NSSwapHostDoubleToBig")
    @GlobalFunction(name="NSSwapHostDoubleToBig")
    public static native @ObjCByValue NSSwappedDouble NSSwapHostDoubleToBig(double x);

    @InlineFunction(name="NSSwapHostFloatToBig")
    @GlobalFunction(name="NSSwapHostFloatToBig")
    public static native @ObjCByValue NSSwappedFloat NSSwapHostFloatToBig(float x);

    @InlineFunction(name="NSSwapLittleDoubleToHost")
    @GlobalFunction(name="NSSwapLittleDoubleToHost")
    public static native double NSSwapLittleDoubleToHost(@ObjCByValue NSSwappedDouble x);

    @InlineFunction(name="NSSwapLittleFloatToHost")
    @GlobalFunction(name="NSSwapLittleFloatToHost")
    public static native float NSSwapLittleFloatToHost(@ObjCByValue NSSwappedFloat x);

    @InlineFunction(name="NSSwapHostDoubleToLittle")
    @GlobalFunction(name="NSSwapHostDoubleToLittle")
    public static native @ObjCByValue NSSwappedDouble NSSwapHostDoubleToLittle(double x);

    @InlineFunction(name="NSSwapHostFloatToLittle")
    @GlobalFunction(name="NSSwapHostFloatToLittle")
    public static native @ObjCByValue NSSwappedFloat NSSwapHostFloatToLittle(float x);

    @InlineFunction(name="NSDecimalIsNotANumber")
    @GlobalFunction(name="NSDecimalIsNotANumber")
    public static native boolean NSDecimalIsNotANumber(NSDecimal dcm);

    @GlobalFunction(name="NSDecimalCopy")
    public static native void NSDecimalCopy(NSDecimal destination, NSDecimal source);

    @GlobalFunction(name="NSDecimalCompact")
    public static native void NSDecimalCompact(NSDecimal number);

    @GlobalFunction(name="NSDecimalCompare")
    public static native NSComparisonResult NSDecimalCompare(NSDecimal leftOperand, NSDecimal rightOperand);

    @GlobalFunction(name="NSDecimalRound")
    public static native void NSDecimalRound(NSDecimal result, NSDecimal number, @NSInteger long scale, NSRoundingMode roundingMode);

    @GlobalFunction(name="NSDecimalNormalize")
    public static native NSCalculationError NSDecimalNormalize(NSDecimal number1, NSDecimal number2, NSRoundingMode roundingMode);

    @GlobalFunction(name="NSDecimalAdd")
    public static native NSCalculationError NSDecimalAdd(NSDecimal result, NSDecimal leftOperand, NSDecimal rightOperand, NSRoundingMode roundingMode);

    @GlobalFunction(name="NSDecimalSubtract")
    public static native NSCalculationError NSDecimalSubtract(NSDecimal result, NSDecimal leftOperand, NSDecimal rightOperand, NSRoundingMode roundingMode);

    @GlobalFunction(name="NSDecimalMultiply")
    public static native NSCalculationError NSDecimalMultiply(NSDecimal result, NSDecimal leftOperand, NSDecimal rightOperand, NSRoundingMode roundingMode);

    @GlobalFunction(name="NSDecimalDivide")
    public static native NSCalculationError NSDecimalDivide(NSDecimal result, NSDecimal leftOperand, NSDecimal rightOperand, NSRoundingMode roundingMode);

    @GlobalFunction(name="NSDecimalPower")
    public static native NSCalculationError NSDecimalPower(NSDecimal result, NSDecimal number, @NSUInteger long power, NSRoundingMode roundingMode);

    @GlobalFunction(name="NSDecimalMultiplyByPowerOf10")
    public static native NSCalculationError NSDecimalMultiplyByPowerOf10(NSDecimal result, NSDecimal number, short power, NSRoundingMode roundingMode);

    @GlobalFunction(name="NSDecimalString")
    public static native NSString NSDecimalString(NSDecimal dcm, NSObject locale);

    @GlobalFunction(name="NSGetUncaughtExceptionHandler")
    public static native ObjCFunctionPtr NSGetUncaughtExceptionHandler();

    @GlobalFunction(name="NSSetUncaughtExceptionHandler")
    public static native void NSSetUncaughtExceptionHandler(ObjCFunctionPtr p0);

    @GlobalFunction(name="NSUserName")
    public static native NSString NSUserName();

    @GlobalFunction(name="NSFullUserName")
    public static native NSString NSFullUserName();

    @GlobalFunction(name="NSHomeDirectory")
    public static native NSString NSHomeDirectory();

    @GlobalFunction(name="NSHomeDirectoryForUser")
    public static native NSString NSHomeDirectoryForUser(NSString userName);

    @GlobalFunction(name="NSTemporaryDirectory")
    public static native NSString NSTemporaryDirectory();

    @GlobalFunction(name="NSOpenStepRootDirectory")
    public static native NSString NSOpenStepRootDirectory();

    @GlobalFunction(name="NSSearchPathForDirectoriesInDomains")
    public static native NSArray NSSearchPathForDirectoriesInDomains(NSSearchPathDirectory directory, NSSearchPathDomainMask domainMask, boolean expandTilde);
}
