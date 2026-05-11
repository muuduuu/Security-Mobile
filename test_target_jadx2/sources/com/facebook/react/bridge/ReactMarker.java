package com.facebook.react.bridge;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class ReactMarker {
    private static Queue<ReactMarkerRecord> sNativeReactMarkerQueue = new ConcurrentLinkedQueue();
    private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList();
    private static final List<FabricMarkerListener> sFabricMarkerListeners = new CopyOnWriteArrayList();

    public interface FabricMarkerListener {
        void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10, long j10);

        default void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10, long j10, int i11) {
            logFabricMarker(reactMarkerConstants, str, i10, j10);
        }
    }

    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10);
    }

    private static class ReactMarkerRecord {
        private final String mMarkerName;
        private final long mMarkerTime;

        public ReactMarkerRecord(String str, long j10) {
            this.mMarkerName = str;
            this.mMarkerTime = j10;
        }

        public String getMarkerName() {
            return this.mMarkerName;
        }

        public long getMarkerTime() {
            return this.mMarkerTime;
        }
    }

    public static void addFabricListener(FabricMarkerListener fabricMarkerListener) {
        List<FabricMarkerListener> list = sFabricMarkerListeners;
        if (list.contains(fabricMarkerListener)) {
            return;
        }
        list.add(fabricMarkerListener);
    }

    public static void addListener(MarkerListener markerListener) {
        List<MarkerListener> list = sListeners;
        if (list.contains(markerListener)) {
            return;
        }
        list.add(markerListener);
    }

    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10, long j10, int i11) {
        Iterator<FabricMarkerListener> it = sFabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(reactMarkerConstants, str, i10, j10, i11);
        }
    }

    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    private static native void nativeLogMarker(String str, long j10);

    private static void notifyNativeMarker(ReactMarkerConstants reactMarkerConstants, Long l10) {
        if (!reactMarkerConstants.hasMatchingNameMarker()) {
            return;
        }
        if (l10 == null) {
            l10 = Long.valueOf(SystemClock.uptimeMillis());
        }
        if (!ReactBridge.isInitialized()) {
            sNativeReactMarkerQueue.add(new ReactMarkerRecord(reactMarkerConstants.name(), l10.longValue()));
            return;
        }
        nativeLogMarker(reactMarkerConstants.name(), l10.longValue());
        while (true) {
            ReactMarkerRecord poll = sNativeReactMarkerQueue.poll();
            if (poll == null) {
                return;
            } else {
                nativeLogMarker(poll.getMarkerName(), poll.getMarkerTime());
            }
        }
    }

    public static void removeFabricListener(FabricMarkerListener fabricMarkerListener) {
        sFabricMarkerListeners.remove(fabricMarkerListener);
    }

    public static void removeListener(MarkerListener markerListener) {
        sListeners.remove(markerListener);
    }

    public static void logMarker(String str, int i10) {
        logMarker(str, (String) null, i10);
    }

    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10, long j10) {
        Iterator<FabricMarkerListener> it = sFabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(reactMarkerConstants, str, i10, j10, 0);
        }
    }

    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    public static void logMarker(String str, String str2, int i10) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i10);
    }

    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        logFabricMarker(reactMarkerConstants, str, i10, SystemClock.uptimeMillis(), 0);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i10) {
        logMarker(reactMarkerConstants, (String) null, i10);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, long j10) {
        logMarker(reactMarkerConstants, null, 0, Long.valueOf(j10));
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10) {
        logMarker(reactMarkerConstants, str, i10, null);
    }

    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i10, Long l10) {
        logFabricMarker(reactMarkerConstants, str, i10);
        Iterator<MarkerListener> it = sListeners.iterator();
        while (it.hasNext()) {
            it.next().logMarker(reactMarkerConstants, str, i10);
        }
        notifyNativeMarker(reactMarkerConstants, l10);
    }
}
