package com.facebook.react.fabric;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.ToLongFunction;

/* loaded from: classes.dex */
class LongStreamingStats {
    private final Queue<Long> minHeap = new PriorityQueue(11, Comparator.comparingLong(new ToLongFunction() { // from class: com.facebook.react.fabric.e
        @Override // java.util.function.ToLongFunction
        public final long applyAsLong(Object obj) {
            long longValue;
            longValue = ((Long) obj).longValue();
            return longValue;
        }
    }));
    private final Queue<Long> maxHeap = new PriorityQueue(11, new Comparator() { // from class: com.facebook.react.fabric.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int lambda$new$1;
            lambda$new$1 = LongStreamingStats.lambda$new$1((Long) obj, (Long) obj2);
            return lambda$new$1;
        }
    });
    private double streamingAverage = 0.0d;
    private int len = 0;
    private long max = 0;

    LongStreamingStats() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$new$1(Long l10, Long l11) {
        return Long.compare(l11.longValue(), l10.longValue());
    }

    public void add(long j10) {
        if (j10 != 0) {
            if (this.minHeap.size() == this.maxHeap.size()) {
                this.maxHeap.offer(Long.valueOf(j10));
                this.minHeap.offer(this.maxHeap.poll());
            } else {
                this.minHeap.offer(Long.valueOf(j10));
                this.maxHeap.offer(this.minHeap.poll());
            }
        }
        int i10 = this.len + 1;
        this.len = i10;
        if (i10 == 1) {
            this.streamingAverage = j10;
        } else {
            this.streamingAverage = (this.streamingAverage / (i10 / r0)) + (j10 / i10);
        }
        long j11 = this.max;
        if (j10 <= j11) {
            j10 = j11;
        }
        this.max = j10;
    }

    public double getAverage() {
        return this.streamingAverage;
    }

    public long getMax() {
        return this.max;
    }

    public double getMedian() {
        if (this.minHeap.size() == 0 && this.maxHeap.size() == 0) {
            return 0.0d;
        }
        return this.minHeap.size() > this.maxHeap.size() ? this.minHeap.peek().longValue() : (this.minHeap.peek().longValue() + this.maxHeap.peek().longValue()) / 2;
    }
}
